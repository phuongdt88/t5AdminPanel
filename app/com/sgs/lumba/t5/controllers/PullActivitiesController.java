package com.sgs.lumba.t5.controllers;


import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import com.sgs.lumba.t5.views.html.pullactivities;

public class PullActivitiesController extends Controller{
  public Result PullActivities() {
    return  ok(pullactivities.render());
  }

  public Result CreateReport() {
    DynamicForm data = Form.form().bindFromRequest();
    int platform = Integer.parseInt(data.get("platform"));
    int metric = Integer.parseInt(data.get("metric"));
    String fromDate = data.get("fromDate");
    String toDate = data.get("toDate");
    int exportType = Integer.parseInt(data.get("exportType"));

    JSONObject resData = new JSONObject();

    resData.put("platform", platform);
    resData.put("metric", metric);
    resData.put("fromDate", fromDate);
    resData.put("toDate", toDate);
    resData.put("exportType", exportType);

    return ok(resData.toString());
  }
 }
