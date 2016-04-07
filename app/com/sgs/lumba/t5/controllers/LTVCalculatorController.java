package com.sgs.lumba.t5.controllers;


import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import com.sgs.lumba.t5.views.html.LTVCalculator;


public class LTVCalculatorController extends Controller{
  public Result LTVCalculator() {
    return  ok(LTVCalculator.render());
  }

  public Result GetLTVValue() {
    DynamicForm data = Form.form().bindFromRequest();
    String arpdauTime = data.get("arpdauTime");
    String retentionTime = data.get("retentionTime");
    String arpdauFromDate = data.get("arpdauFromDate");
    String arpdauToDate = data.get("arpdauToDate");
    String retentionFromDate = data.get("retentionFromDate");
    String retentionToDate = data.get("retentionToDate");
    int platform = Integer.parseInt(data.get("platform"));

    System.out.println("platform: " + platform);

    JSONObject resData = new JSONObject();

    if ((arpdauFromDate.isEmpty()  || arpdauFromDate == null) || (arpdauToDate.isEmpty() || arpdauToDate == null)) {
      resData.put("arpdauTime", true);
      System.out.println(arpdauTime);
    } else  {
      resData.put("arpdauTime", false);
      System.out.println("arpdau date: " + arpdauFromDate + "___" + arpdauToDate);
    }

    if ((retentionFromDate.isEmpty()  || retentionFromDate == null) || (retentionToDate.isEmpty() || retentionToDate == null)) {
      resData.put("retentionTime", true);
      System.out.println(retentionTime);
    } else  {
      resData.put("retentionTime", false);
      System.out.println("retention date: " + retentionFromDate + "___" + retentionToDate);
    }
    return ok(resData.toString());
  }
}
