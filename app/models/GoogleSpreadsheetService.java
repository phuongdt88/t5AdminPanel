package models;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson.JacksonFactory;
import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.Link;
import com.google.gdata.data.PlainTextConstruct;
import com.google.gdata.data.batch.BatchOperationType;
import com.google.gdata.data.batch.BatchStatus;
import com.google.gdata.data.batch.BatchUtils;
import com.google.gdata.data.spreadsheet.SpreadsheetEntry;
import com.google.gdata.data.spreadsheet.WorksheetEntry;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.*;

import com.google.gdata.data.spreadsheet.*;
import com.sgs.lumba.t5.models.CSVReaderClass;

public class GoogleSpreadsheetService {


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
    URL SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/spreadsheets/private/full/"+spreadsheetId);

    SpreadsheetService service = getSpreadsheetService();

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
          String rowData = "";

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

  public static List<String[]> getWorksheetDataToList(String spreadsheetId, String worksheetName) throws IOException, GeneralSecurityException, ServiceException {
    URL SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/spreadsheets/private/full/"+spreadsheetId);

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
        List<String[]> worksheetData = new ArrayList<>();
        URL listFeedUrl = worksheet.getListFeedUrl();
        ListFeed listFeed = service.getFeed(listFeedUrl, ListFeed.class);
        for (ListEntry row : listFeed.getEntries()) {
          String rowData = "";
          String[] rowDataArr;
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
          rowDataArr = rowData.split("\t");
          worksheetData.add(rowDataArr);
        }
        return worksheetData;
      }
    }
    return null;
  }

  public static String[] getWorksheetHeader(String spreadsheetId, String worksheetName) throws IOException, GeneralSecurityException, ServiceException{
    URL SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/spreadsheets/private/full/"+spreadsheetId);

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
        URL listFeedUrl = worksheet.getListFeedUrl();
        ListFeed listFeed = service.getFeed(listFeedUrl, ListFeed.class);
        Set<String> header = listFeed.getEntries().get(0).getCustomElements().getTags();
        return header.toArray(new String[header.size()]);
      }
    }
    return null;
  }

  public static void createNewWorksheet(String spreadsheetId, String worksheetName) throws  GeneralSecurityException, IOException, ServiceException{
    URL SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/spreadsheets/private/full/"+spreadsheetId);

    SpreadsheetService service = getSpreadsheetService();


    SpreadsheetEntry spreadsheet = null;
    try {
      spreadsheet = service.getEntry(SPREADSHEET_FEED_URL, SpreadsheetEntry.class);
    } catch (IOException e){
      e.printStackTrace();
    }

    List<WorksheetEntry> worksheets = spreadsheet.getWorksheets();

    for (WorksheetEntry worksheet : worksheets) {
      String title = worksheet.getTitle().getPlainText();
      if(title.startsWith(worksheetName)) {
        return;
      }
    }
    // Create a local representation of the new worksheet.
    WorksheetEntry worksheet = new WorksheetEntry();
    worksheet.setTitle(new PlainTextConstruct(worksheetName));
    worksheet.setColCount(10);
    worksheet.setRowCount(20);

    // Send the local representation of the worksheet to the API for
    // creation.  The URL to use here is the worksheet feed URL of our
    // spreadsheet.
    URL worksheetFeedUrl = spreadsheet.getWorksheetFeedUrl();
    service.insert(worksheetFeedUrl, worksheet);
  }

  public static void writeSheetTest(String spreadsheetId) throws IOException, GeneralSecurityException, ServiceException {
    String worksheetName = "Phuong2 New Worksheet";
    URL SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/spreadsheets/private/full/" + spreadsheetId);

    SpreadsheetService service = GoogleSpreadsheetService.getSpreadsheetService();

    SpreadsheetEntry spreadsheet = null;
    try {
      spreadsheet = service.getEntry(SPREADSHEET_FEED_URL, SpreadsheetEntry.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
//     Make a request to the API to fetch information about all
//     worksheets in the spreadsheet.
    List<WorksheetEntry> worksheets = spreadsheet.getWorksheets();

    URL listFeedUrl = null;
    URL cellFeedUrl = null;
    for (WorksheetEntry worksheet : worksheets) {
      String title = worksheet.getTitle().getPlainText();
      if (title.startsWith(worksheetName)) {
        System.out.println("fondddd");
        listFeedUrl = worksheet.getListFeedUrl();
        cellFeedUrl = worksheet.getCellFeedUrl();
      }
    }

//    Map<String, Object> rowValues = new HashMap<String, Object>();
//    rowValues.put("key1", "test1");
//    rowValues.put("key2", "test2");


//    CellFeed cellFeed= service.getFeed (cellFeedUrl, CellFeed.class);
//    ListFeed listFeed = service.getFeed(listFeedUrl, ListFeed.class);
//
//    for (int i = 1; i < 10; i++) {
//     for (int j = 1; j < 10; j++) {
//       CellEntry cellEntry= new CellEntry (i, j, ""+i);
//       cellFeed.insert (cellEntry);
//     }
//    }


    ListEntry row = new ListEntry();
    row.getCustomElements().setValueLocal("firstname", "Joe");
    row.getCustomElements().setValueLocal("lastname", "Smith");
    row.getCustomElements().setValueLocal("age", "26");
    row.getCustomElements().setValueLocal("height", "176");

    // Send the new row to the API for insertion.
    row = service.insert(listFeedUrl, row);
  }

  /** The number of rows to fill in the destination workbook */
  private static final int MAX_ROWS = 10;

  /** The number of columns to fill in the destination workbook */
  private static final int MAX_COLS = 7;

  /**
   * A basic struct to store cell row/column information and the associated RnCn
   * identifier.
   */
  private static class CellAddress {
    public final int row;
    public final int col;
    public final String idString;
    public final String value;

    /**
     * Constructs a CellAddress representing the specified {@code row} and
     * {@code col}.  The idString will be set in 'RnCn' notation.
     */
    public CellAddress(int row, int col) throws IOException{
      this.row = row;
      this.col = col;
      this.idString = String.format("R%sC%s", row, col);
      this.value = getCellValue(row, col);
    }
  }

  public static void chayThu(String worksheetName, String spreadsheetId)
          throws AuthenticationException, MalformedURLException, IOException, ServiceException, GeneralSecurityException {

    long startTime = System.currentTimeMillis();

    worksheetName = "Phuong2 New Worksheet";
    URL SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/spreadsheets/private/full/" + spreadsheetId);

    SpreadsheetService service = GoogleSpreadsheetService.getSpreadsheetService();

    SpreadsheetEntry spreadsheet = null;
    try {
      spreadsheet = service.getEntry(SPREADSHEET_FEED_URL, SpreadsheetEntry.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
//     Make a request to the API to fetch information about all
//     worksheets in the spreadsheet.
    List<WorksheetEntry> worksheets = spreadsheet.getWorksheets();

    URL cellFeedUrl = null;
    for (WorksheetEntry worksheet : worksheets) {
      String title = worksheet.getTitle().getPlainText();
      if (title.startsWith(worksheetName)) {
        cellFeedUrl = worksheet.getCellFeedUrl();
      }
    }
    CellFeed cellFeed = service.getFeed(cellFeedUrl, CellFeed.class);

    // Build list of cell addresses to be filled in
    List<CellAddress> cellAddrs = new ArrayList<CellAddress>();
    for (int row = 1; row <= MAX_ROWS; row++) {
      for (int col = 1; col <= MAX_COLS; col++) {
        cellAddrs.add(new CellAddress(row, col));
      }
    }

    System.out.println();

    // Prepare the update
    // getCellEntryMap is what makes the update fast.
    Map<String, CellEntry> cellEntries = getCellEntryMap(service, cellFeedUrl, cellAddrs);

    CellFeed batchRequest = new CellFeed();
    for (CellAddress cellAddr : cellAddrs) {
      CellEntry batchEntry = new CellEntry(cellEntries.get(cellAddr.idString));
      batchEntry.changeInputValueLocal(cellAddr.value);
      BatchUtils.setBatchId(batchEntry, cellAddr.idString);
      BatchUtils.setBatchOperationType(batchEntry, BatchOperationType.UPDATE);
      batchRequest.getEntries().add(batchEntry);
    }

    // Submit the update
    Link batchLink = cellFeed.getLink(Link.Rel.FEED_BATCH, Link.Type.ATOM);
    CellFeed batchResponse = service.batch(new URL(batchLink.getHref()), batchRequest);

    // Check the results
    boolean isSuccess = true;
    for (CellEntry entry : batchResponse.getEntries()) {
      String batchId = BatchUtils.getBatchId(entry);
      if (!BatchUtils.isSuccess(entry)) {
        isSuccess = false;
        BatchStatus status = BatchUtils.getBatchStatus(entry);
        System.out.printf("%s failed (%s) %s", batchId, status.getReason(), status.getContent());
      }
    }

    System.out.println(isSuccess ? "\nBatch operations successful." : "\nBatch operations failed");
    System.out.printf("\n%s ms elapsed\n", System.currentTimeMillis() - startTime);
  }

  /**
   * Connects to the specified {@link SpreadsheetService} and uses a batch
   * request to retrieve a {@link CellEntry} for each cell enumerated in {@code
   * cellAddrs}. Each cell entry is placed into a map keyed by its RnCn
   * identifier.
   *
   * @param ssSvc the spreadsheet service to use.
   * @param cellFeedUrl url of the cell feed.
   * @param cellAddrs list of cell addresses to be retrieved.
   * @return a map consisting of one {@link CellEntry} for each address in {@code
   *         cellAddrs}
   */
  private static Map<String, CellEntry> getCellEntryMap(
          SpreadsheetService ssSvc, URL cellFeedUrl, List<CellAddress> cellAddrs)
          throws IOException, ServiceException {
    CellFeed batchRequest = new CellFeed();
    for (CellAddress cellId : cellAddrs) {
      CellEntry batchEntry = new CellEntry(cellId.row, cellId.col, cellId.idString);
      batchEntry.setId(String.format("%s/%s", cellFeedUrl.toString(), cellId.idString));
      BatchUtils.setBatchId(batchEntry, cellId.idString);
      BatchUtils.setBatchOperationType(batchEntry, BatchOperationType.QUERY);
      batchRequest.getEntries().add(batchEntry);
    }

    CellFeed cellFeed = ssSvc.getFeed(cellFeedUrl, CellFeed.class);
    CellFeed queryBatchResponse =
            ssSvc.batch(new URL(cellFeed.getLink(Link.Rel.FEED_BATCH, Link.Type.ATOM).getHref()),
                    batchRequest);

    Map<String, CellEntry> cellEntryMap = new HashMap<String, CellEntry>(cellAddrs.size());
    for (CellEntry entry : queryBatchResponse.getEntries()) {
      cellEntryMap.put(BatchUtils.getBatchId(entry), entry);
//      System.out.printf("batch %s {CellEntry: id=%s editLink=%s inputValue=%s\n",
//              BatchUtils.getBatchId(entry), entry.getId(), entry.getEditLink().getHref(),
//              entry.getCell().getInputValue());
    }

    return cellEntryMap;
  }

  private static String getCellValue(int row, int col) throws IOException{
    String [][] result = CSVReaderClass.readCSVToArray("DataFiles/Arena.csv");
    return result[row][col];
  }
}