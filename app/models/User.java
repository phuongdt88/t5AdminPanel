package models;

import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import play.Logger;
import uk.co.panaxiom.playjongo.PlayJongo;

import java.util.regex.Pattern;


/**
 * Created by phuongdt1 on 8/7/15.
 */
public class User {
  public static MongoCollection users() {
    return PlayJongo.getCollection("user_v54");
  }

  public static MongoCollection userGameState() {
    return PlayJongo.getCollection("userGameState_v54");
  }

  public static MongoCollection userMeta() {
    return PlayJongo.getCollection("userMeta_v54");
  }

  private String name;
  private String userId;
  private String email;
  private String password;
  private String locale;
  private String createdAt;
  private int isFake;
  private int sfsVersion;
  private String gameState;
  private String clanId;
  private int level;
  private int trophies;
  private int lastOnlineTime;
  private int lastOfflineTime;
  private String battleLog;
  private String inboxMessages;

  public String getInboxMessages() {
    return inboxMessages;
  }

  public String getBattleLog() {
    return battleLog;
  }

  public String getPassword() {
    return password;
  }

  public int getLastOfflineTime() {
    return lastOfflineTime;
  }

  public int getLastOnlineTime() {
    return lastOnlineTime;
  }

  public Integer getTrophies() {
    return trophies;
  }

  public Integer getLevel() {
    return level;
  }

  public String getClanId() {
    return clanId;
  }

  public String getGameState() {
    return gameState;
  }

  public String getLocale() {
    return locale;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public Integer getIsFake() {
    return isFake;
  }

  public Integer getSfsVersion() {
    return sfsVersion;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }
  public String getUserId() {
    return  userId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static MongoCursor<User> getUser() {
    MongoCursor<User> hehe = users().find().as(User.class);
    return hehe;
  }

  public static User getUserById(String id) {
    return users().findOne("{userId: #}", id).as(User.class);
  }

  public static User getUserGameStateById(String id) {
    return userGameState().findOne("{userId: #}", id).as(User.class);
  }

  public static User getUserMetaInfoByUserId(String id) {
    return userMeta().findOne("{userId: #}", id).as(User.class);
  }

  public static MongoCursor<User> getUserByName(String name) {
    return users().find("{name: {$regex: #, $options:'i'}}", name).as(User.class);
  }

  public static MongoCursor<User> getUserByEmail(String email) {
    return users().find("{email: #}", email).as(User.class);
  }
  public static MongoCursor<User> getUserByDagger(int dagger) {
    return userMeta().find("{trophies: #}", dagger).as(User.class);
  }

  public static MongoCursor<User> getActiveUserByMonth(String month) {
    return users().find("{createdAt: {$regex: #}}", month).as(User.class);
  }

  public static long getUniqueUsersNumber(String endDate) {
    System.out.println(endDate);
    return users().count("{createdAt:{$lt:#}}", endDate);
  }
}
