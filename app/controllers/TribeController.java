package controllers;

import com.fasterxml.jackson.annotation.JsonValue;
import jdk.nashorn.internal.parser.JSONParser;
import models.Tribe;
import models.User;
import org.jongo.MongoCursor;
import org.json.JSONArray;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import org.json.JSONObject;
import views.html.tribe;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Created by phuongdt1 on 8/18/15.
 */
public class TribeController extends Controller {
  public Result getAllTribes() {
    JSONObject resData = new JSONObject();
    MongoCursor<Tribe> tribes = Tribe.getAllTribes();
    tribes.forEach(new Consumer<Tribe>() {
      String name = "";
      int id = -1;
      String tribeId = "";
      int membersCount = -1;
      int daggers = -1;

      @Override
      public void accept(Tribe tribe) {
        name = tribe.getName();
        id = tribe.getId();
        tribeId = tribe.getClanId();
        membersCount = tribe.getMembersCount();
        daggers = tribe.getTrophies();

        JSONObject tribeData = new JSONObject();
        tribeData.put("id", id);
        tribeData.put("tribeName", name);
        tribeData.put("tribeId", tribeId);
        tribeData.put("membersCount", membersCount);
        tribeData.put("daggers", daggers);
        resData.append("tribeData", tribeData);
      }
    });

    return ok(resData.toString());
  }

  public Result getTribeDetails() {
    DynamicForm data = Form.form().bindFromRequest();
    String tribeId = data.get("tribeId");

    int    joinPolicy;
    String description;
    JSONObject tribeData = new JSONObject();
    JSONObject resData = new JSONObject();

    Tribe tribe = Tribe.getTribeDetails(tribeId);
    String memberIds = tribe.getMemberIds();
    joinPolicy = tribe.getJoinPolicy();
    description = tribe.getDescription();

    tribeData.put("joinPolicy", joinPolicy);
    tribeData.put("description", description);
    resData.append("tribeData", tribeData);

    JSONObject memberIdsObj = new JSONObject(memberIds);
    JSONArray memberIdArr = memberIdsObj.getJSONArray("list");

    User user;
    User userMeta;
    String name;
    String userId;
    int level;
    int dagger;
    int clanRole;
    for (int i = 0; i < memberIdArr.length(); i++) {
      String memberId = memberIdArr.get(i).toString();
      user = User.getUserById(memberId);
      if (user != null) {
        name = user.getName();
        userId = memberId;
        userMeta = User.getUserMetaInfoByUserId(memberId);
        if (userMeta != null) {
          level = userMeta.getLevel();
          dagger = userMeta.getTrophies();
          Tribe clanLookup = Tribe.getInfoFromClanLookupByUserId(memberId);
          if (clanLookup != null) {
            clanRole = clanLookup.getClanRole();
            JSONObject userData = new JSONObject();
            userData.put("userId", userId);
            userData.put("name", name);
            userData.put("level", level);
            userData.put("dagger", dagger);
            userData.put("clanRole", clanRole);
            resData.append("userData", userData);
          }
        }
      }
    }
    Logger.info(resData.toString());
    return ok(resData.toString());
  }

  public Result getTribeById() {
    DynamicForm data = Form.form().bindFromRequest();
    String tribeId = data.get("tribeId").toString();

    JSONObject resData = new JSONObject();
    JSONObject tribeData = new JSONObject();
    JSONObject result = new JSONObject();

    int id;
    String tribeName;
    int membersCount;
    int daggers;
    int    joinPolicy;
    String description;

    Tribe tribe = Tribe.getTribeDetails(tribeId);
    if (tribe != null) {
      id = tribe.getId();
      tribeName = tribe.getName();
      membersCount = tribe.getMembersCount();
      daggers = tribe.getTrophies();
      joinPolicy = tribe.getJoinPolicy();
      description = tribe.getDescription();
      tribeData.put("id", id);
      tribeData.put("tribeId", tribeId);
      tribeData.put("tribeName", tribeName);
      tribeData.put("membersCount", membersCount);
      tribeData.put("daggers", daggers);
      tribeData.put("joinPolicy", joinPolicy);
      tribeData.put("description", description);
      resData.append("tribeData", tribeData);
      resData.append("result", true);
    } else {
      resData.append("result", false);
    }
    Logger.info(resData.toString());
    return ok(resData.toString());
  }

  public Result getTribeByName() {
    DynamicForm data = Form.form().bindFromRequest();
    String tribeName = data.get("tribeName").toString();
    Logger.info(tribeName);
    JSONObject resData = new JSONObject();
    JSONObject result = new JSONObject();

    MongoCursor<Tribe> tribe = Tribe.getTribeByName(tribeName);
    System.out.println(tribe.count());
    if (tribe.count() > 0) {
      tribe.forEach(new Consumer<Tribe>() {
        int id;
        String tribeId;
        String tribeNameGet;
        int membersCount;
        int daggers;

        @Override
        public void accept(Tribe tribe) {
          id = tribe.getId();
          tribeId = tribe.getClanId();
          membersCount = tribe.getMembersCount();
          daggers = tribe.getTrophies();
          tribeNameGet = tribe.getName();
          JSONObject tribeData = new JSONObject();
          tribeData.put("id", id);
          tribeData.put("tribeId", tribeId);
          tribeData.put("tribeName", tribeNameGet);
          tribeData.put("membersCount", membersCount);
          tribeData.put("daggers", daggers);
          resData.append("tribeData", tribeData);
        }
      });
      resData.append("result", true);
    } else {
      resData.append("result", false);
    }
    Logger.info(resData.toString());
    return ok(resData.toString());
  }


  public Result updateTribeName() {
    DynamicForm data = Form.form().bindFromRequest();
    String newTribeName = data.get("newTribeName");
    String tribeId = data.get("tribeId");
    Logger.info(newTribeName);
    Logger.info(tribeId);
    return ok(newTribeName);
  }

  public Result getTribeMessage() {
    DynamicForm data = Form.form().bindFromRequest();
    String startDate = data.get("startDate");
    String endDate = data.get("endDate");

    JSONObject resData = new JSONObject();
    resData.put("startDate", startDate);
    resData.put("endDate", endDate);
    return ok(resData.toString());
  }

  public Result blockTribe() {
    DynamicForm data = Form.form().bindFromRequest();
    String tribeId = data.get("tribeId");
    JSONObject resData = new JSONObject();
    resData.put("tribeId", tribeId);
    return ok("abc");
  }
}