package controllers;

import models.GameVersion;
import org.jongo.MongoCursor;
import org.json.JSONObject;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.gameversion;

import java.util.function.Consumer;

/**
 * Created by phuongdt1 on 9/9/15.
 */
public class GameVersionController extends Controller{

  public Result getGameVersion() {
    MongoCursor<GameVersion> gameVer = GameVersion.getAllGameVersion();
    JSONObject resData = new JSONObject();
    gameVer.forEach(new Consumer<GameVersion>() {
      @Override
      public void accept(GameVersion gameVersion) {
        int id = gameVersion.getId();
        String version = gameVersion.getGameVersion();
        JSONObject gameVersionInfo = new JSONObject();
        gameVersionInfo.put("id", id);
        gameVersionInfo.put("gameVersion", version);
        resData.append("gameVersionInfo", gameVersionInfo);
      }
    });
    return ok(gameversion.render(resData.toString()));
  }
}
