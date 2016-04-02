package models;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson.JacksonFactory;
import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.spreadsheet.SpreadsheetEntry;
import com.google.gdata.data.spreadsheet.SpreadsheetFeed;
import com.google.gdata.data.spreadsheet.WorksheetEntry;
import com.google.gdata.util.ServiceException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;
import com.google.gdata.data.spreadsheet.*;

public class GoogleSpreadsheetService{


  public static SpreadsheetService getSpreadsheetService() throws  GeneralSecurityException, IOException {


    File p12 = new File("app/phuong12345.p12");

    HttpTransport httpTransport = new NetHttpTransport();
    JacksonFactory jsonFactory = new JacksonFactory();
    String[] SCOPESArray = {"https://spreadsheets.google.com/feeds", "https://spreadsheets.google.com/feeds/spreadsheets/private/full", "https://docs.google.com/feeds"};
    final List SCOPES = Arrays.asList(SCOPESArray);
    GoogleCredential credential = new GoogleCredential.Builder()
            .setTransport(httpTransport)
            .setJsonFactory(jsonFactory)
            .setServiceAccountId("464306262395-97uhi3f0jnj3466pim99vmq8sudsnhs0@developer.gserviceaccount.com")
            .setServiceAccountScopes(SCOPES)
            .setServiceAccountPrivateKeyFromP12File(p12)
            .build();
    SpreadsheetService service = new SpreadsheetService("Test");
    service.setOAuth2Credentials(credential);
    return  service;
  }

  public static String getWorksheetData(String spreadsheetId, String worksheetName) throws IOException, GeneralSecurityException, ServiceException {

    URL SPREADSHEET_FEED_URL;
    SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/spreadsheets/private/full/"+spreadsheetId);

    SpreadsheetService service = GoogleSpreadsheetService.getSpreadsheetService();

    SpreadsheetEntry spreadsheet = null;
    try {
      spreadsheet = service.getEntry(SPREADSHEET_FEED_URL, SpreadsheetEntry.class);
    } catch (IOException e){
      e.printStackTrace();
    }

    // Make a request to the API to fetch information about all
    // worksheets in the spreadsheet.
    List<WorksheetEntry> worksheets = spreadsheet.getWorksheets();

    for (WorksheetEntry worksheet : worksheets) {
      String title = worksheet.getTitle().getPlainText();
      if(title.startsWith(worksheetName)) {
        String worksheetData = "";
        URL listFeedUrl = worksheet.getListFeedUrl();
        ListFeed listFeed = service.getFeed(listFeedUrl, ListFeed.class);
        for (ListEntry row : listFeed.getEntries()) {

          String rowData ="";

          // Iterate over the remaining columns, and print each cell value
          int index = 0;
          String cellData;
          for (String tag : row.getCustomElements().getTags()) {
            cellData = row.getCustomElements().getValue(tag);
            if(cellData == null) {
              cellData = "";
            } else {
              cellData = row.getCustomElements().getValue(tag);
            }
            cellData = cellData.replace("\n","\\n");
            if(index < row.getCustomElements().getTags().size() - 1) {
              rowData += cellData + "\t";
            } else {
              rowData += cellData;
            }
            index++;
          }
          worksheetData += rowData + "\n";
        }
        return worksheetData;
      }
    }
    return null;
  }
}