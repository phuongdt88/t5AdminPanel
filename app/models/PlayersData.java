package models;

import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import play.Play;
import uk.co.panaxiom.playjongo.PlayJongo;

import java.util.List;

/**
 * Created by phuongdt1 on 9/15/15.
 */
public class PlayersData {
  public static MongoCollection playersData() {
    return PlayJongo.getCollection("activeUsers");
  }

  public static MongoCollection usersAndroid() {
    return PlayJongo.getCollection("usersAndroid");
  }

  public static MongoCollection stats() {
    return PlayJongo.getCollection("stats");
  }

  public static MongoCollection globalChat() {
    return PlayJongo.getCollection("globalChat");
  }

  public static MongoCollection tribeChat() {
    return PlayJongo.getCollection("clanChat");
  }

  private int id;
  private String userId;
  private String login;
  private String logout;
  private String createdAt;
  private int isBlueBox;
  private String clientIp;
  private String ISP;

  private int ccu;

  private String roomName;
  private String message;

  private String clanId;

  public String getClanId() {
    return clanId;
  }

  public String getRoomName() {
    return roomName;
  }

  public String getMessage() {
    return message;
  }

  public int getCcu() {
    return ccu;
  }

  public int getId() {
    return id;
  }

  public String getUserId() {
    return userId;
  }

  public String getLogin() {
    return login;
  }

  public String getLogout() {
    return logout;
  }

  public int getIsBlueBox() {
    return isBlueBox;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getISP() {
    return ISP;
  }

  public String getClientIp() {
    return clientIp;
  }

  public static List<String> getDAU(String date) {
    return playersData().distinct("userId").query("{login:{$regex:#}}", date).as(String.class);
  }

  public static PlayersData findUserAndroidByUserId(String userId) {
    return usersAndroid().findOne("{userId:#}", userId).as(PlayersData.class);
  }

  public static List<String> getDistinctActiveUsersByMonth(String month) {
    return playersData().distinct("userId").query("{login:{$regex:#}}", month).as(String.class);
  }

  public static MongoCursor<PlayersData> getCcuByDateRange(String startDate, String endDate) {
    return stats().find("{createdAt:{$gte:#,$lt:#}}", startDate, endDate).as(PlayersData.class);
  }

  public static MongoCursor<PlayersData> getGlobalChatByDateRange(String startDate, String endDate) {
    return globalChat().find("{createdAt:{$gte:#,$lt:#}}", startDate, endDate).as(PlayersData.class);
  }

  public static MongoCursor<PlayersData> getTribeChatByDateRange(String startDate, String endDate) {
    return tribeChat().find("{createdAt:{$gte:#,$lt:#}}", startDate, endDate).as(PlayersData.class);
  }

  public static MongoCursor<PlayersData> getActiveUsersByDateRange(String startDate, String endDate) {
    return playersData().find("{createdAt:{$gte:#,$lt:#}}", startDate, endDate).as(PlayersData.class);
  }
}
