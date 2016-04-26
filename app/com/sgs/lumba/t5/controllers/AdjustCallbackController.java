package com.sgs.lumba.t5.controllers;
import au.com.bytecode.opencsv.CSVWriter;
import models.AdjustCallbackData;
import models.GoogleDrive;
import org.jongo.MongoCursor;
import org.json.JSONArray;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import java.io.FileWriter;
import java.util.Date;
import java.util.function.Consumer;
import com.sgs.lumba.t5.views.html.adjustcallback;

public class AdjustCallbackController extends Controller{

  public Result AdjustCallback() {
    return ok(adjustcallback.render());
  }

  public Result getAllAdjustCallbackData() {
    MongoCursor<AdjustCallbackData> data = AdjustCallbackData.getAdjustCallbackData();

    JSONObject resData = new JSONObject();
    data.forEach(new Consumer<AdjustCallbackData>() {
      @Override
      public void accept(AdjustCallbackData adjustCallbackData) {
        JSONArray acData = new JSONArray();
        String userId = adjustCallbackData.getUserId();
        String activityKind = adjustCallbackData.getActivityKind();
        int success = adjustCallbackData.getSuccess();
        int willRetry = adjustCallbackData.getWillRetry();
        String error = adjustCallbackData.getError();
        String trackerToken = adjustCallbackData.getTrackerToken();
        String trackerName = adjustCallbackData.getTrackerName();
        String network = adjustCallbackData.getNetwork();
        String campaign = adjustCallbackData.getCampaign();
        String adgroup = adjustCallbackData.getAdgroup();
        String creative = adjustCallbackData.getCreative();
        String createdAt = adjustCallbackData.getCreatedAt();
        String createdAtUTC = "";
        acData.put(userId);
        acData.put(activityKind);
        acData.put(success);
        acData.put(willRetry);
        acData.put(error);
        acData.put(trackerToken);
        acData.put(trackerName);
        acData.put(network);
        acData.put(campaign);
        acData.put(adgroup);
        acData.put(creative);
        acData.put(createdAt);
        acData.put(createdAtUTC);
        resData.append("acData", acData);
      }
    });
    return ok(resData.toString());
  }

  public Result getAdjustCallbackData() {
    DynamicForm data = Form.form().bindFromRequest();
    String startDate = data.get("startDate");
    String endDate = data.get("endDate");
    String startDate1 = startDate + " 00:00:00";
    String endDate1 = endDate + " 23:59:59";
    int exportType = Integer.parseInt(data.get("exportType"));

    String csv = null;
    try {
      csv = "Adjust Callback Data_" + new Date().getTime() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "User ID, Activity Kind, Success, Will Retry, Error, Tracker Token, Tracker Name, Network, Campaign, Adgroup, Creative, Created At (GMT), Created At (UTC)".split(",");
      //Write the header to file
      writer.writeNext(header);

      MongoCursor<AdjustCallbackData> adjData = AdjustCallbackData.getAdjustCallbackDataByRange(startDate1, endDate1);
      adjData.forEach(new Consumer<AdjustCallbackData>() {
        @Override
        public void accept(AdjustCallbackData adjustCallbackData) {
          String userId = adjustCallbackData.getUserId();
          String activityKind = adjustCallbackData.getActivityKind();
          String success = adjustCallbackData.getSuccess() + "";
          String willRetry = adjustCallbackData.getWillRetry() + "";
          String error = adjustCallbackData.getError();
          String trackerToken = adjustCallbackData.getTrackerToken();
          String trackerName = adjustCallbackData.getTrackerName();
          String network = adjustCallbackData.getNetwork();
          String campaign = adjustCallbackData.getCampaign();
          String adgroup = adjustCallbackData.getAdgroup();
          String creative = adjustCallbackData.getCreative();
          String createdAt = adjustCallbackData.getCreatedAt();
          String createdAtUTC = "";
          String [] row = new String[]{userId, activityKind, success, willRetry, error, trackerToken, trackerName, network, campaign, adgroup, creative, createdAt, createdAtUTC};
          writer.writeNext(row);
        }
      });
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
