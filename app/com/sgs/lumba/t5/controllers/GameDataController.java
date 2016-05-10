package com.sgs.lumba.t5.controllers;

import com.google.gdata.util.ServiceException;
import com.sgs.lumba.t5.models.CSVReaderClass;
import models.GoogleDrive;
import models.GoogleSpreadsheetService;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.GeneralSecurityException;
import com.sgs.lumba.t5.views.html.gamedata;


public class GameDataController extends Controller{

  private String DATA_FILE_PATH = "DataFiles/";
  private String TEMP_DATA_FILE_PATH = "NewDataFiles/";

  public Result gameData() {
    return ok(gamedata.render());
  }

  public Result getData(String section) throws IOException{
    String fileName = getCSVFileName(section);
    String output = CSVReaderClass.readCSVToString(DATA_FILE_PATH + fileName);
    JSONObject resData = new JSONObject();
    resData.put("data", output);
    return  ok(resData.toString());
  }

  public Result exportGameData(String section) throws IOException, ServiceException {
    DynamicForm data = Form.form().bindFromRequest();
    int exportType = Integer.parseInt(data.get("exportType"));
    String fileName = getCSVFileName(section);
    if (exportType == 0 || exportType == 2) {
      File file = new File(DATA_FILE_PATH + fileName);
      return ok(file).as("text/csv");
    } else if (exportType == 1) {
      return ok(exportToGoogleSpreadsheet(section));
    }
    return  ok("1");
  }

  public Result getSpreadsheetData(String section) throws IOException, ServiceException, GeneralSecurityException {
    DynamicForm data = Form.form().bindFromRequest();

    String url = data.get("spreadsheetUrl");
    String worksheetName = getWorkSheetName(section);

    String spreadsheetId = url.split("/edit")[0].split("https://docs.google.com/spreadsheets/d/")[1];
//    String content = GoogleSpreadsheetService.getWorksheetData(spreadsheetId, worksheetName);
    String filePath = TEMP_DATA_FILE_PATH + worksheetName + ".csv";
    CSVReaderClass.WriteToCSVFile(spreadsheetId, worksheetName, filePath);
    String output = CSVReaderClass.readCSVToString(filePath);
    return ok(output);
  }

  private String getCSVFileName (String section) {
    String fileName = "";
    switch (section) {
      case "arenareference":
        fileName = "Arena.csv";
        break;
      case "cardbuilding":
        fileName = "CardBuildings.csv";
        break;
      case "cardbuildinglevel":
        fileName = "CardBuildingLevel.csv";
        break;
      case "cardtroop":
        fileName = "CardCharacters.csv";
        break;
      case "cardtrooplevel":
        fileName = "CardCharacterLevel.csv";
        break;
      case "cardspell":
        fileName = "CardSpells.csv";
        break;
      case "cardspelllevel":
        fileName = "CardSpellLevel.csv";
        break;
      case "building":
        fileName = "Buildings.csv";
        break;
      case "troop":
        fileName = "Characters.csv";
        break;
      case "spell":
        fileName = "Spells.csv";
        break;
      case "buildinglevel":
        fileName = "BuildingLevel.csv";
        break;
      case "trooplevel":
        fileName = "CharacterLevel.csv";
        break;
      case "spelllevel":
        fileName = "SpellLevel.csv";
        break;
      case "chestsequence":
        fileName = "ChestSequence.csv";
        break;
      case "achievement":
        fileName = "Achievements.csv";
        break;
      case "donation":
        fileName = "Donations.csv";
        break;
      case "request":
        fileName = "Requests.csv";
        break;
      case "chestdata":
        fileName = "ChestData.csv";
        break;
      case "tribedaggerrank":
        fileName = "TribeDaggerRank.csv";
        break;
      case "dataconstant":
        fileName = "DataConstants.csv";
        break;
      case "chestprobability":
        fileName = "ChestProbabilities.csv";
        break;
      case "loserdaggermodifier":
        fileName = "LoserDaggerModifier.csv";
        break;
      case "freegemsequence":
        fileName = "FreeGems.csv";
        break;
      case "crowngemsequence":
        fileName = "CrownGems.csv";
        break;
      case "tvroyale":
        fileName = "TVRoyale.csv";
        break;
      case "towerlevel":
        fileName = "TowerLevel.csv";
        break;
      case "shopcardprice":
        fileName = "ShopCardPrices.csv";
        break;
      case "uniteffect":
        fileName = "UnitEffects.csv";
        break;
      case "unitsoundfx":
        fileName = "UnitSoundFX.csv";
        break;
    }
    return fileName;
  }

  private String getWorkSheetName (String section) {
    String worksheetName = "";

    switch (section) {
      case "arenareference":
        worksheetName = "Arena";
        break;
      case "cardbuilding":
        worksheetName = "CardBuildings";
        break;
      case "cardbuildinglevel":
        worksheetName = "CardBuildingLevel";
        break;
      case "cardtroop":
        worksheetName = "CardCharacters";
        break;
      case "cardtrooplevel":
        worksheetName = "CardCharacterLevel";
        break;
      case "cardspell":
        worksheetName = "CardSpells";
        break;
      case "cardspelllevel":
        worksheetName = "CardSpellLevel";
        break;
      case "building":
        worksheetName = "Buildings";
        break;
      case "buildinglevel":
        worksheetName = "BuildingLevel";
        break;
      case "troop":
        worksheetName = "Characters";
        break;
      case "trooplevel":
        worksheetName = "CharacterLevel";
        break;
      case "spell":
        worksheetName = "Spells";
        break;
      case "spelllevel":
        worksheetName = "SpellLevel";
        break;
      case "chestsequence":
        worksheetName = "ChestSequence";
        break;
      case "achievement":
        worksheetName = "Achievements";
        break;
      case "donation":
        worksheetName = "Donations";
        break;
      case "request":
        worksheetName = "Requests";
        break;
      case "chestdata":
        worksheetName = "ChestData";
        break;
      case "tribedaggerrank":
        worksheetName = "TribeDaggerRank";
        break;
      case "dataconstant":
        worksheetName = "DataConstants";
        break;
      case "chestprobability":
        worksheetName = "ChestProbabilities";
        break;
      case "loserdaggermodifier":
        worksheetName = "LoserDaggerModifier";
        break;
      case "freegemsequence":
        worksheetName = "FreeGems";
        break;
      case "crowngemsequence":
        worksheetName = "CrownGems";
        break;
      case "tvroyale":
        worksheetName = "TVRoyale";
        break;
      case "towerlevel":
        worksheetName = "TowerLevel";
        break;
      case "shopcardprice":
        worksheetName = "ShopCardPrices";
        break;
      case "uniteffect":
        worksheetName = "UnitEffects";
        break;
      case "unitsoundfx":
        worksheetName = "UnitSoundFX";
        break;
    }

    return worksheetName;
  }
  public Result publishSpreadsheet(String section) throws IOException{
    String fileName = getCSVFileName(section);
    File spreadsheetFile = new File(TEMP_DATA_FILE_PATH + fileName);
    Path from = spreadsheetFile.toPath(); //convert from File to Path
    Path to = Paths.get(DATA_FILE_PATH + fileName); //convert from String to Path
    Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
    return ok("0");
  }

  private String exportToGoogleSpreadsheet(String section) throws IOException, ServiceException {
    String fileName = getCSVFileName(section);
    String worksheetName = getWorkSheetName(section);

    File file = new File("DataFiles/" + fileName);
    String fileId = GoogleDrive.uploadFile(file, worksheetName, "text/csv");
/*    if (fileId != null) {
      System.out.println(fileId);
    } else {
      System.out.println("error");
    }*/
    return fileId;
  }
}
