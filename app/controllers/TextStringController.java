package controllers;

import au.com.bytecode.opencsv.CSVWriter;
import models.GameVar;
import models.GoogleDrive;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.textstring;

import java.io.FileWriter;
import java.util.Date;

/**
 * Created by phuongdt1 on 8/27/15.
 */
public class TextStringController extends Controller{
  public Result textString() {
    return ok(textstring.render());
  }

  public Result getTextString() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    JSONObject resData = new JSONObject();
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String englishTextStr = gameVar.getEnglish();
    String arabTextStr = gameVar.getArab();
    resData.put("englishTextStr", englishTextStr);
    resData.put("arabTextStr", arabTextStr);
    return ok(resData.toString());
  }

  public Result exportTextString() {
    DynamicForm data = Form.form().bindFromRequest();
    String tableData = data.get("tableData");
    int exportType = Integer.parseInt(data.get("exportType"));
    String[] tableDataArr = tableData.split("\\\\n");


    String csv = null;
    try {
      csv = "Text String_" + new Date().getTime() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "Code Reference, English, Arabic".split(",");
      //Write the header to file
      writer.writeNext(header);


      for (int i = 0; i < tableDataArr.length; i++) {
        String[] rowData = tableDataArr[i].split("\\\\t");
        String codeReference;
        try {
          codeReference = rowData[0];
        } catch (Exception e) {
          codeReference = "";
        }
        String arab;
        try {
          arab = rowData[1];
        } catch (Exception e) {
          arab = "";
        }
        String english;
        try {
          english = rowData[2];
        } catch (Exception e) {
          english = "";
        }
        String [] row = new String[]{codeReference, arab, english};
        writer.writeNext(row);
      }
      writer.close();
      System.out.println("write csv done");
      java.io.File file = new java.io.File(csv);
      if(exportType == 0) {
        String fileId = GoogleDrive.uploadFile(file, csv, "text/csv");
        if (fileId != null){
          System.out.println(fileId);
        } else {
          System.out.println("error");
        }
        return ok(fileId);
      } else {
        response().setHeader("Content-Lenght", String.valueOf(file.length()));
        response().setHeader("Content-Disposition", "attachment; filename=" + csv);
        return ok(file).as("text/csv");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
