package com.sgs.lumba.t5.controllers;

import models.GameVar;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.gamesettings;

public class GameSettingsController extends Controller {

  public Result getGameSettings() {
    return ok(gamesettings.render());
  }

  public Result getSettings() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String settings = gameVar.getSetting();
    return ok(settings);
  }

  public  Result saveSettingsData() {
    DynamicForm data = Form.form().bindFromRequest();
    String dataStr = data.get("dataStr");
    String section = data.get("section");
    System.out.println(section);
    System.out.println(dataStr);
    return ok("saved");
  }

  public Result addVersionSFS() {
    DynamicForm data = Form.form().bindFromRequest();
    String fromVersionSFS = data.get("fromVersionSFS");
    String toVersionSFS = data.get("toVersionSFS");
    String updateType = data.get("updateType");
    String description = data.get("description");
    String iosNewVersionUrl = data.get("iosNewVersionUrl");
    String androidNewVersionUrl = data.get("androidNewVersionUrl");
    System.out.println(fromVersionSFS);
    System.out.println(toVersionSFS);
    System.out.println(updateType);
    System.out.println(description);
    System.out.println(iosNewVersionUrl);
    System.out.println(androidNewVersionUrl);
    return ok("added version SFS");
  }

  public  Result deleteUnuseVersion() {
    DynamicForm data = Form.form().bindFromRequest();
    String unuseVersion = data.get("unuseVersion");
    System.out.println(unuseVersion);
    return ok("deleted");
  }

  public  Result changeGameSubVersion() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameSubVersion = data.get("gameSubVersion");
    System.out.println(gameSubVersion);
    return ok("changed");
  }
}
