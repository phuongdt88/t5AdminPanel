package models;

import org.jongo.MongoCollection;
import uk.co.panaxiom.playjongo.PlayJongo;

/**
 * Created by phuongdt1 on 8/27/15.
 */
public class GameVar {

  public static MongoCollection gameVar() {
    return PlayJongo.getCollection("gameVars");
  }

  public static MongoCollection exGameVar() {
    return PlayJongo.getCollection("gamevar");
  }

  private String english;
  private String arab;
  private String arabFilterWords;
  private String englishFilterWords;
  private String englishnews;
  private String arabnews;
  private String campaignReference;
  private String unitLevels;
  private String combatUnits;
  private String defensiveBuildings;
  private String defensiveBuildingLevel;
  private String resourceBuildings;
  private String armyBuildings;
  private String otherBuildings;
  private String townHallLevel;
  private String decorations;
  private String spells;
  private String spellLevels;
  private String obstacles;
  private String trophy;
  private String achievements;
  private String setting;
  private String bundles;

  public String getEnglishFilterWords() {
    return englishFilterWords;
  }

  public String getBundles() {
    return bundles;
  }

  public String getArabFilterWords() {
    return arabFilterWords;
  }

  public String getSetting() {
    return setting;
  }

  public String getAchievements() {
    return achievements;
  }

  public String getTrophy() {
    return trophy;
  }

  public String getObstacles() {
    return obstacles;
  }

  public String getSpellLevels() {
    return spellLevels;
  }

  public String getSpells() {
    return spells;
  }

  public String getDecorations() {
    return decorations;
  }

  public String getTownHallLevel() {
    return townHallLevel;
  }

  public String getOtherBuildings() {
    return otherBuildings;
  }

  public String getArmyBuildings() {
    return armyBuildings;
  }

  public String getResourceBuildings() {
    return resourceBuildings;
  }

  public String getDefensiveBuildingLevel() {
    return defensiveBuildingLevel;
  }

  public String getDefensiveBuildings() {
    return defensiveBuildings;
  }

  public String getCombatUnits() {
    return combatUnits;
  }
  public String getUnitLevels() {
    return unitLevels;
  }

  public String getCampaignReference() {
    return campaignReference;
  }

  public String getEnglishnews() {
    return englishnews;
  }

  public String getArabnews() {
    return arabnews;
  }

  public String getArab() {
    return arab;
  }

  public String getEnglish() {
    return english;
  }

  public static GameVar getGameVar(String gameVersion) {
    System.out.println("game version: "+gameVersion);
    return  gameVar().findOne("{_id: #}", gameVersion).as(GameVar.class);
  }

  public static GameVar getGameVarNonVersion() {
    return  exGameVar().findOne().as(GameVar.class);
  }

}
