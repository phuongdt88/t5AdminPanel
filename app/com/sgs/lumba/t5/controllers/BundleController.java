package com.sgs.lumba.t5.controllers;

import models.GameVar;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.bundle;

public class BundleController extends Controller{
  public Result bundle() {
    return ok(bundle.render());
  }

  public Result getBundle() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String bundle = gameVar.getBundles();
    return ok(bundle);
  }

  public Result saveBundle() {
    DynamicForm data = Form.form().bindFromRequest();
    String dataStr = data.get("dataStr");
    System.out.println(dataStr);
    return ok("done");
  }
}
