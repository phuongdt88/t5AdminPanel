package controllers;

import com.mongodb.WriteResult;
import models.AdminUser;
import org.jongo.MongoCursor;
import org.json.JSONObject;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import java.text.DecimalFormat;
import java.util.function.Consumer;
import views.html.*;

import org.apache.commons.mail.*;

/**
 * Created by phuongdt1 on 8/24/15.
 */
public class UsersManagementController extends Controller{

  public Result getAdminUserList() {
    Logger.info("vao function");
    JSONObject resData = new JSONObject();
    MongoCursor<AdminUser> users = AdminUser.getAllUsers();
    if(users.count() > 0) {
      users.forEach(new Consumer<AdminUser>() {
        int userId;
        String username;
        String email;
        String password;
        int role;

        @Override
        public void accept(AdminUser adminUser) {
          userId = adminUser.getUserId();
          username = adminUser.getUsername();
          email = adminUser.getEmail();
          password = adminUser.getPassword();
          role = adminUser.getRole();
          JSONObject userInfo = new JSONObject();
          userInfo.put("userId", userId);
          userInfo.put("username", username);
          userInfo.put("email", email);
          userInfo.put("password", password);
          userInfo.put("role", role);
          resData.append("userInfo", userInfo);
        }
      });
    }
    Logger.info(resData.toString());
    return ok(usersmanagement.render(resData.toString()));
  }

  public Result addAdminAccount() {
    DynamicForm data = Form.form().bindFromRequest();
    String username = data.get("username");
    String email = data.get("email");
    String password = data.get("password");
    int role = Integer.parseInt(data.get("role"));

    DecimalFormat fmt = new DecimalFormat("00000000");
    int userId = Integer.parseInt(fmt.format((int) (Math.random() * (99999999 - 3) + 3)));

    AdminUser findUsername = AdminUser.getUserInfoByName(username);
    AdminUser findEmail = AdminUser.getUserInfoByEmail(email);
    if(findUsername != null)
    {
      return ok("0");
    } else if(findEmail != null) {
      return ok("1");
    } else {
      WriteResult adminUser = AdminUser.addAccount(userId, username, email, password, role);
      return ok("2");
    }
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
    AdminUser adminUser = AdminUser.getUserInfoByName(username);
    JSONObject resData = new JSONObject();
    JSONObject userInfo = new JSONObject();
    if(adminUser != null) {
      userInfo.put("role", adminUser.getRole());
      userInfo.put("timezone", adminUser.getTimezone());
      resData.put("userInfo", userInfo);
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
