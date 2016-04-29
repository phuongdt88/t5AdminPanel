package com.sgs.lumba.t5.controllers;

import com.sgs.lumba.t5.models.Admin;
import com.sgs.lumba.t5.models.CSVReaderClass;
import models.GoogleSpreadsheetService;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import com.sgs.lumba.t5.views.html.login;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginController extends Controller{

  public Result Login() throws IOException, GeneralSecurityException{
    return ok(login.render());
  }

  public Result CheckLogin() throws SQLException{
    DynamicForm data = Form.form().bindFromRequest();
    String username = data.get("username");
    String password = data.get("password");
    JSONObject resData = new JSONObject();
    ResultSet results = null;
    try {
      results = Admin.GetUser(username, password);
      if(results.first()) {
        resData.put("result", true);
      }
      else {
        resData.put("result", false);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    finally {
      results.close();;
      Admin.CloseStatement();
    }
    return ok(resData.toString());
  }

}
