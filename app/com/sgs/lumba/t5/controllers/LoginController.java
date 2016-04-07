package com.sgs.lumba.t5.controllers;

import com.sgs.lumba.t5.models.Admin;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.login;

import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginController extends Controller{

  public Result Login() {
      return ok(login.render());
  }

  public Result CheckLogin() {
    DynamicForm data = Form.form().bindFromRequest();
    String username = data.get("username");
    String password = data.get("password");
    JSONObject resData = new JSONObject();
    try {
      ResultSet results = Admin.GetUser(username, password);
      if(results.first()) {
        resData.put("result", true);
      }
      else {
        resData.put("result", false);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ok(resData.toString());
  }

}
