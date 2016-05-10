package com.sgs.lumba.t5.controllers;

import com.sgs.lumba.t5.models.Admin;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import com.sgs.lumba.t5.views.html.timezone;
import java.sql.SQLException;

public class TimeZoneController extends Controller{

  public Result timeZone()
  {
    return ok(timezone.render());
  }

  public Result updateTimeZone() throws SQLException{
    DynamicForm data = Form.form().bindFromRequest();
    String username = data.get("username");
    JSONObject resData = new JSONObject();
    int newTimeZone = Integer.parseInt(data.get("newTimeZone"));
    int rs = Admin.UpdateTimeZone(username, newTimeZone);

    if (rs == 0){
      resData.put("result", false);
    } else {
      resData.put("result", true);
    }
    Admin.CloseStatement();
    return ok(resData.toString());
  }

}
