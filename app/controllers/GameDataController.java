package controllers;

import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.spreadsheet.*;
import com.google.gdata.util.ServiceException;
import models.GameVar;
import models.GoogleSpreadsheetService;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.gamedata;

import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.List;

/**
 * Created by phuongdt1 on 8/31/15.
 */
public class GameDataController extends Controller{
  public Result gameData() {
    return ok(gamedata.render());
  }


  public Result getCampaignReference() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String campaignReference = gameVar.getCampaignReference();
    return ok(campaignReference);
  }

  public Result getUnitLevel() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String unitLevels = gameVar.getUnitLevels();
    return ok(unitLevels);
  }

  public Result getCombatUnits() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String combatUnits = gameVar.getCombatUnits();
    return ok(combatUnits);
  }

  public Result getDefensiveBuildings() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String defensiveBuildings = gameVar.getDefensiveBuildings();
    return ok(defensiveBuildings);
  }

  public Result getDefensiveBuildingLevel() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String defensiveBuildingLevel = gameVar.getDefensiveBuildingLevel();
    return ok(defensiveBuildingLevel);
  }

  public Result getResourceBuildings() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String resourceBuildings = gameVar.getResourceBuildings();
    return ok(resourceBuildings);
  }

  public Result getArmyBuildings() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String armyBuildings = gameVar.getArmyBuildings();
    return ok(armyBuildings);
  }

  public Result getOtherBuildings() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String otherBuildings = gameVar.getOtherBuildings();
    return ok(otherBuildings);
  }

  public Result getTownHallLevel() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String townHallLevel = gameVar.getTownHallLevel();
    return ok(townHallLevel);
  }

  public Result getDecorations() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String decorations = gameVar.getDecorations();
    return ok(decorations);
  }

  public Result getSpells() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String spells = gameVar.getSpells();
    return ok(spells);
  }

  public Result getSpellLevels() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String spellLevels = gameVar.getSpellLevels();
    return ok(spellLevels);
  }

  public Result getObstacles() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String obstacles = gameVar.getObstacles();
    return ok(obstacles);
  }

  public Result getTrophy() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String trophy = gameVar.getTrophy();
    return ok(trophy);
  }

  public Result getAchievements() {
    DynamicForm data = Form.form().bindFromRequest();
    String gameVersion = data.get("gameVersion");
    GameVar gameVar = GameVar.getGameVar(gameVersion);
    String achievements = gameVar.getAchievements();
    return ok(achievements);
  }


  public Result getSpreadsheetData() throws IOException, ServiceException, GeneralSecurityException{
    System.out.println("vao get spreadsheet");
    DynamicForm data = Form.form().bindFromRequest();

    String url = data.get("spreadsheetUrl");
    String worksheetName = data.get("sectionName");
    String spreadsheetId = url.split("/edit")[0].split("https://docs.google.com/spreadsheets/d/")[1];
    String content = GoogleSpreadsheetService.getWorksheetData(spreadsheetId, worksheetName);
    return ok(content);
  }

  public Result publishSpreadsheet() {
    DynamicForm data = Form.form().bindFromRequest();
    String section = data.get("section");
    String spreadsheetData = data.get("tableData");
    System.out.println(section);
    System.out.println(spreadsheetData);
    return ok("abc");
  }
}
