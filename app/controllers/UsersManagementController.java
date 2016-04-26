package controllers;

import models.AdminUser;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.sgs.lumba.t5.models.Admin;

import java.text.DecimalFormat;
import views.html.*;

import org.apache.commons.mail.*;


public class UsersManagementController extends Controller{

  public Result GetAdminUserInfo() throws SQLException{
    JSONObject resData = new JSONObject();
    ResultSet rs = Admin.GetUsersInfo();
//    if (rs.first()) {
    while (rs.next()) {
      JSONObject userInfo = new JSONObject();
      userInfo.put("userId", rs.getInt("id"));
      userInfo.put("username", rs.getString("username"));
      userInfo.put("email", rs.getString("email"));
      userInfo.put("password", rs.getString("password"));
      userInfo.put("role", rs.getString("role"));
      userInfo.put("timezone", rs.getString("timezone"));
      resData.append("userInfo", userInfo);
    }
//    }

    rs.close();
    Admin.CloseStatement();
    return ok(usersmanagement.render(resData.toString()));
  }

  public Result AddAdminAccount() throws SQLException {
    DynamicForm data = Form.form().bindFromRequest();
    String username = data.get("username");
    String email = data.get("email");
    String password = data.get("password");
    int role = Integer.parseInt(data.get("role"));
    int timezone = Integer.parseInt(data.get("timezone"));

//    DecimalFormat fmt = new DecimalFormat("00000000");
//    int userId = Integer.parseInt(fmt.format((int) (Math.random() * (99999999 - 3) + 3)));

    ResultSet findUsername = Admin.GetUserInfoByName(username);
    ResultSet findEmail = Admin.GetUserInfoByEmail(email);
    if (findUsername.first())
    {
      return ok("0");
    } else if (findEmail.first()) {
      return ok("1");
    } else {
      int rs = Admin.AddAdminAccount(username, password, email, role, timezone);
      if (rs != 0) {
        return ok("2");
      }
      return ok ("3");
    }
  }

  public Result UpdateAdminAccount() throws SQLException{
    DynamicForm data = Form.form().bindFromRequest();
    int id = Integer.parseInt(data.get("id"));
    String username = data.get("username");
    String email = data.get("email");
    int role = Integer.parseInt(data.get("role"));
    int rs = Admin.UpdateAccountInfo(id, username, email, role);

    JSONObject resData = new JSONObject();
    if (rs == 0){
      resData.put("result", false);
    } else {
      resData.put("result", true);
    }
    return ok(resData.toString());
  }

  public Result updateUsername() {
    DynamicForm data = Form.form().bindFromRequest();
    String newUsername = data.get("newUsername");
    int userId = Integer.parseInt(data.get("userId"));
    System.out.println(newUsername);
    System.out.println(userId);
    return ok("update username done");
  }

  public Result updateEmail() {
    DynamicForm data = Form.form().bindFromRequest();
    String newEmail = data.get("newEmail");
    int userId = Integer.parseInt(data.get("userId"));
    System.out.println(newEmail);
    System.out.println(userId);
    return ok("update email done");
  }

  public Result updatePassword() {
    DynamicForm data = Form.form().bindFromRequest();
    String newPassword = data.get("newPassword");
    int userId = Integer.parseInt(data.get("userId"));
    System.out.println(newPassword);
    System.out.println(userId);
    return ok("update password done");
  }

  public Result updateRole() {
    DynamicForm data = Form.form().bindFromRequest();
    String newRole = data.get("newRole");
    int userId = Integer.parseInt(data.get("userId"));
    System.out.println(newRole);
    System.out.println(userId);
    return ok("update role done");
  }

  public Result deleteAdminAcc() {
    DynamicForm data = Form.form().bindFromRequest();
    int userId = Integer.parseInt(data.get("userId"));
    System.out.println(userId);
    return ok("deleted");
  }

  public Result getUserData() {
    DynamicForm data = Form.form().bindFromRequest();
    String username = data.get("username");
    // AdminUser adminUser = AdminUser.getUserInfoByName(username);
    JSONObject resData = new JSONObject();
    JSONObject userInfo = new JSONObject();
    try {
      ResultSet results = Admin.GetUser(username);
      if(results.first()) {
        userInfo.put("role", results.getInt("role"));
        userInfo.put("timezone", results.getInt("timezone"));
        resData.put("userInfo", userInfo);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ok(resData.toString());
  }

  public Result sendEmail() throws EmailException{
    DynamicForm data = Form.form().bindFromRequest();
    String receiverEmail = data.get("receiverEmail");
    String subject = data.get("subject");
    String message = data.get("message");
//    Email email = new SimpleEmail();
//    email.setHostName("smtp.googlemail.com");
//    email.setSmtpPort(465);
//    email.setAuthenticator(new DefaultAuthenticator("xxx", "xxx"));
//    email.setSSLOnConnect(true);
//    email.setFrom("xxx@gmail.com");
//    email.setSubject(subject);
//    email.setMsg(message);
//    email.addTo(receiverEmail);
//    email.send();
    System.out.println("send email");
    return ok("sent");
  }

  public Result profile() {
    return ok(profile.render());
  }

  public Result getProfile() {
    DynamicForm data = Form.form().bindFromRequest();
    String username = data.get("username");
    AdminUser adminUser = AdminUser.getUserInfoByName(username);
    JSONObject resData = new JSONObject();
    JSONObject userInfo = new JSONObject();
    if(adminUser != null) {
      userInfo.put("username", adminUser.getUsername());
      userInfo.put("email", adminUser.getEmail());
      userInfo.put("password", adminUser.getPassword());
      userInfo.put("role", adminUser.getRole());
      resData.put("userInfo", userInfo);
    }
    return ok(resData.toString());
  }

  public Result updateProfile() {
    DynamicForm data = Form.form().bindFromRequest();
    String username = data.get("username");
    String password = data.get("password");
    String email = data.get("email");
    AdminUser uname = AdminUser.getUserInfoByName(username);
    AdminUser mail = AdminUser.getUserInfoByEmail(email);
    if(uname != null) {
      // username existed
      return ok("0");
    }
    else if(mail != null) {
      // email existed
      return ok("1");
    } else {
      //code update username
      return ok("2");
    }
  }
}
