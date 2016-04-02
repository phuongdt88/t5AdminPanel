package controllers;

import models.AdminUser;
import org.json.JSONObject;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.gamestate;
import views.html.login;


/**
 * Created by phuongdt1 on 8/7/15.
 */
public class LoginController extends Controller{

  public Result login() {
//    String isLoggedIn = session("isLoggedIn");
//    Logger.info(isLoggedIn);
//    if(isLoggedIn != null) {
//      return ok(login.render());
//    }
//    else {
      return ok(login.render());
//    }
  }

  public Result checklogin() {
    DynamicForm data = Form.form().bindFromRequest();
    String username = data.get("username");
    String password = data.get("password");
    Logger.info(username);
    Logger.info(password);

    JSONObject resData = new JSONObject();

    AdminUser user = AdminUser.checkLogin(username, password);
    if(user != null) {
      resData.put("result",true);
//      session("isLoggedIn", "true");
    }
    else {
      resData.put("result",false);
    }
//    String isLoggedIn = session("isLoggedIn");

    return ok(resData.toString());
  }

}
