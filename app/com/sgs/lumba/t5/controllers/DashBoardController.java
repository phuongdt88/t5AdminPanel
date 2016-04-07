package com.sgs.lumba.t5.controllers;


import models.GameVar;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import com.sgs.lumba.t5.views.html.dashboard;



public class DashBoardController extends Controller {
  public Result Dashboard() {
    return ok(dashboard.render());
  }

  public Result GetDashboardData() {
    DynamicForm data = Form.form().bindFromRequest();
    int platform = Integer.parseInt(data.get("platform"));
    return ok(platform + "");
  }
}
