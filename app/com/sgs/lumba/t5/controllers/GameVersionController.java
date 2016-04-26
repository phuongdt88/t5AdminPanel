package com.sgs.lumba.t5.controllers;

import models.GameVersion;
import org.jongo.MongoCursor;
import org.json.JSONObject;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.function.Consumer;
import com.sgs.lumba.t5.views.html.gameversion;

public class GameVersionController extends Controller{

  public Result getGameVersion() {
    JSONObject resData = new JSONObject();
    JSONObject gameVersionInfo = new JSONObject();
    gameVersionInfo.put("id", 1);
    gameVersionInfo.put("gameVersion", 1);
    resData.append("gameVersionInfo", gameVersionInfo);
    return ok(gameversion.render(resData.toString()));
  }
}
