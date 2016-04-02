package models;

import com.mongodb.WriteResult;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import uk.co.panaxiom.playjongo.PlayJongo;

/**
 * Created by phuongdt1 on 8/21/15.
 */
public class AdminUser {
  public static MongoCollection admin() {
    return PlayJongo.getCollection("adminuser");
  }

  private int userId;
  private String username;
  private String email;
  private String password;
  private int role;
  private String timezone;

  public String getTimezone() {
    return timezone;
  }

  public int getRole() {
    return role;
  }

  public int getUserId() {
    return userId;
  }

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public static AdminUser checkLogin(String username, String password){
    return admin().findOne("{username: #,password: #}", username, password).as(AdminUser.class);
  }
  public static MongoCursor<AdminUser> getAllUsers(){
    return admin().find().as(AdminUser.class);
  }

  public static WriteResult addAccount(int userId, String username, String email, String password, int role) {
    return admin().insert("{userId: #, username: #, email: #, password: #, role: #, timezone:'GMT+7'}", userId, username, email, password, role);
  }

  public static AdminUser getUserInfoByName(String username) {
    return admin().findOne("{username: #}", username).as(AdminUser.class);
  }

  public static AdminUser getUserInfoByEmail(String email){
    return admin().findOne("{email: #}", email).as(AdminUser.class);
  }

  public static WriteResult updateTimeZone(String username, String newTimeZone) {
    return admin().update("{username: #}", username).with("{$set: {timezone: #}}", newTimeZone);
  }
}
