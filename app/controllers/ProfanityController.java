package controllers;

import au.com.bytecode.opencsv.CSVWriter;
import models.GameVar;
import models.GoogleDrive;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.profanity;

import java.io.FileWriter;
import java.util.Date;

/**
 * Created by phuongdt1 on 8/28/15.
 */
public class ProfanityController extends Controller{
  public Result profanity() {
    return ok(profanity.render());
  }

  public Result getProfanityText() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    JSONObject resData = new JSONObject();
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String englishProfanityText = gameVar.getEnglishFilterWords();
    String arabProfanityText = gameVar.getArabFilterWords();
    resData.put("englishProfanityText", englishProfanityText);
    resData.put("arabProfanityText", arabProfanityText);
    return ok(resData.toString());
  }

  public Result exportProfanity() {
    DynamicForm data = Form.form().bindFromRequest();
    String tableData = data.get("tableData");
    int exportType = Integer.parseInt(data.get("exportType"));
    String[] tableDataArr = tableData.split("\\\\n");


    String csv = null;
    try {
      csv = "Profanity Text_" + new Date().getTime() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "English, Arabic".split(",");
      //Write the header to file
      writer.writeNext(header);


      for (int i = 0; i < tableDataArr.length; i++) {
        String[] rowData = tableDataArr[i].split("\\\\t");
        String english;
        try {
          english = rowData[0];
        } catch (Exception e) {
          english = "";
        }
        String arab;
        try {
          arab = rowData[1];
        } catch (Exception e) {
          arab = "";
        }
        String [] row = new String[]{english, arab};
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
