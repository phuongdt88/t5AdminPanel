package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Tribe;
import models.User;
import org.jongo.MongoCursor;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.*;

import java.util.function.Consumer;

public class GameStateController extends Controller{

  public Result getUserById() {
    DynamicForm data = Form.form().bindFromRequest();
    String userId = data.get("userId");
    Logger.info(userId);
    ObjectNode resData = Json.newObject();
    ObjectNode resp = Json.newObject();
    ObjectNode userData = Json.newObject();
    ObjectNode tribe = Json.newObject();
//    try{
      String name = "";
      String email = "";
      String locale = "";
      String createdAt = "";
      String password = "";
      int isFake = -1;
      int sfsVersion = -1;
      int trophies = -1;

      User result = User.getUserById(userId);
      if(result != null) {
        name = result.getName();
        email = result.getEmail();
        password = result.getPassword();
        locale = result.getLocale();
        createdAt = result.getCreatedAt();
        isFake = result.getIsFake();
        sfsVersion = result.getSfsVersion();
        resp.put("result", true);
      } else {
        resp.put("result", false);
      }
      userData.put("userId", userId);
      userData.put("name", name);
      userData.put("email", email);
      userData.put("password", password);
      userData.put("locale", locale);
      userData.put("createdAt", createdAt);
      userData.put("isFake", isFake);
      userData.put("sfsVersion", sfsVersion);

      int level = -1;
      int lastOnlineTime = -1;
      int lastOfflineTime = -1;
      String battleLog = "";
      String inboxMessages = "";
      User userMeta = User.getUserMetaInfoByUserId(userId);
      if(userMeta != null) {
        level = userMeta.getLevel();
        trophies = userMeta.getTrophies();
        lastOnlineTime = userMeta.getLastOnlineTime();
        lastOfflineTime = userMeta.getLastOfflineTime();
        battleLog = userMeta.getBattleLog();
        inboxMessages = userMeta.getInboxMessages();
      }
      userData.put("level", level);
      userData.put("dagger", trophies);
      userData.put("lastOnlineTime", lastOnlineTime);
      userData.put("lastOfflineTime", lastOfflineTime);
      userData.put("battleLog", battleLog);
      userData.put("inboxMessages", inboxMessages);
      User userGameState = User.getUserGameStateById(userId);
      JsonNode userGameStateObj;
      if(userGameState != null) {
        userGameStateObj = Json.parse(userGameState.getGameState());
      }
      else {
        Logger.info("userGameState null");
        userGameStateObj = Json.parse("{}");
      }
//      Logger.info(userGameStateObj.toString());
//      JsonNode HUD = userGameStateObj.get("HUD");
//      JsonNode hInfo = HUD.get("hInfo");

      String clanId = "";
      String clanName = "";
      Tribe userClanLookup = Tribe.getClanByUserId(userId);
      if(userClanLookup != null) {
        clanId = userClanLookup.getClanId();
        Tribe userClan = Tribe.getClanByClanId(clanId);
        if (userClan != null) {
          clanName = userClan.getName();
        }
      }
      tribe.put("clanId", clanId);
      tribe.put("clanName", clanName);



      resData.set("resp", resp);
      resData.set("userData", userData);
      resData.set("userGameStateObj", userGameStateObj);
      resData.set("tribe", tribe);

//      Logger.info(resData.toString());
      return ok(resData);
//    } catch (Exception e) {
//      resp.put("result", false);
//      resData.set("resp", resp);
//      Logger.info(resp.toString());
//      return ok(resData);
//    }
  }

  public Result getUserList() {
    DynamicForm data = Form.form().bindFromRequest();
    String searchType = data.get("searchType");
    ObjectNode resData = Json.newObject();
    ObjectNode resp = Json.newObject();
    ObjectNode userInfo = Json.newObject();
    MongoCursor<User> result = null;

    if(searchType.equals("1")) {
      String name = data.get("name");
      result = User.getUserByName(name);
      Logger.info("search by name");
    }
    else  if(searchType.equals("2")) {
      String email = data.get("email");
      result = User.getUserByEmail(email);
      Logger.info("search by email");
    }
    else  if(searchType.equals("3")) {
      int dagger = Integer.parseInt(data.get("dagger"));
      result = User.getUserByDagger(dagger);
      Logger.info("search by dagger");
      if (result.count() != 0) {
        result.forEach(new Consumer<User>() {
          String userIdFromUserMeta;
          String userName;
          String userEmail;
          int dagger = Integer.parseInt(data.get("dagger"));
          ObjectNode userData;
          @Override
          public void accept(User user) {
            userIdFromUserMeta = user.getUserId();
            User userInfo1 = User.getUserById(userIdFromUserMeta);
            if(userInfo1 != null) {
              userName = userInfo1.getName();
              userEmail = userInfo1.getEmail();
            }
            userData = Json.newObject();
            userData.put("userId", userIdFromUserMeta);
            userData.put("name", userName);
            userData.put("email", userEmail);
            userData.put("dagger", dagger);
            userInfo.set(userIdFromUserMeta, userData);
          }
        });
        resp.put("result", true);
      } else {
        resp.put("result", false);
      }
    }
    if(searchType.equals("1") || searchType.equals("2")) {
      Logger.info("vao foreach");
      if (result.count() != 0) {
        result.forEach(new Consumer<User>() {
                         String userIdResult;
                         String nameResult;
                         String emailResult;
                         int trophies = -1;
                         ObjectNode userData;
                         @Override
                         public void accept(User user) {
                           userIdResult = user.getUserId();
                           nameResult = user.getName();
                           emailResult = user.getEmail();
                           User userMeta = User.getUserMetaInfoByUserId(userIdResult);
                           if(userMeta != null) {
                             trophies = userMeta.getTrophies();
                           }
                           userData = Json.newObject();
                           userData.put("userId", userIdResult);
                           userData.put("name", nameResult);
                           userData.put("email", emailResult);
                           userData.put("dagger", trophies);
                           userInfo.set(userIdResult, userData);
                         }
                       }
        );
        resp.put("result", true);
      } else {
        resp.put("result", false);
      }
    }
    Logger.info(resData.toString());
    resData.set("userInfo", userInfo);
    resData.set("resp", resp);
    return ok(resData);
  }

  public Result updateUserData() {
    DynamicForm data = Form.form().bindFromRequest();
    String newName = data.get("newName");
    String newEmail = data.get("newEmail");
    String newPassword = data.get("newPassword");
    String newLocale = data.get("newLocale");
    String newFacebookID = data.get("newFacebookID");
    String newLevel = data.get("newLevel");
    String newExp = data.get("newExp");
    String newGold = data.get("newGold");
    String newWater = data.get("newWater");
    String newOil = data.get("newOil");
    String newPearls = data.get("newPearls");
    String newDagger = data.get("newDagger");
    String newIsFake = data.get("newIsFake");
    String levelReason = data.get("levelReason");
    String expReason = data.get("expReason");
    String goldReason = data.get("goldReason");
    String waterReason = data.get("waterReason");
    String oilReason = data.get("oilReason");
    String pearlsReason = data.get("pearlsReason");
    String daggerReason = data.get("daggerReason");
    Logger.info(newName);
    Logger.info(newPassword);
    Logger.info(data.toString());
    return ok(data.toString());
  }

  public Result noteForUser() {
    DynamicForm data = Form.form().bindFromRequest();
    String comment = data.get("comment");
    Logger.info(comment);
    return ok(data.toString());
  }

  public Result deleteUser() {
    DynamicForm data = Form.form().bindFromRequest();
    String userId = data.get("userId");
    Logger.info(userId);
    return ok(data.toString());
  }

  public Result fakeUser() {
    DynamicForm data = Form.form().bindFromRequest();
    String userId = data.get("userId");
    Logger.info(userId);
    return ok(data.toString());
  }

  public Result downloadBattleLog() {
    DynamicForm data = Form.form().bindFromRequest();
    String userId = data.get("userId");
    Logger.info(userId);
    return ok(data.toString());
  }

  public Result turnOffShield() {
    DynamicForm data = Form.form().bindFromRequest();
    String userId = data.get("userId");
    Logger.info(userId);
    return ok(data.toString());
  }

  public Result turnOnShield() {
    DynamicForm data = Form.form().bindFromRequest();
    String userId = data.get("userId");
    String time = data.get("time");
    Logger.info(userId);
    Logger.info(time);
    return ok(data.toString());
  }

  public Result blockLeaderBoard() {
    DynamicForm data = Form.form().bindFromRequest();
    String userId = data.get("userId");
    Logger.info(userId);
    return ok(data.toString());
  }

  public Result blockTribe() {
    DynamicForm data = Form.form().bindFromRequest();
    String userId = data.get("userId");
    Logger.info(userId);
    return ok(data.toString());
  }

  public Result blockSearching() {
    DynamicForm data = Form.form().bindFromRequest();
    String userId = data.get("userId");
    Logger.info(userId);
    return ok(data.toString());
  }

  public Result blockGlobalChat() {
    DynamicForm data = Form.form().bindFromRequest();
    String userId = data.get("userId");
    Logger.info(userId);
    return ok(data.toString());
  }

  public Result blockAttack() {
    DynamicForm data = Form.form().bindFromRequest();
    String userId = data.get("userId");
    Logger.info(userId);
    return ok(data.toString());
  }

}


