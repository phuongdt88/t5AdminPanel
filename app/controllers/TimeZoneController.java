package controllers;

import com.mongodb.WriteResult;
import models.AdminUser;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.timezone;


/**
 * Created by phuongdt1 on 8/26/15.
 */
public class TimeZoneController extends Controller{

  public Result getTimeZone()
  {
    return ok(timezone.render());
  }

  public Result updateTimeZone() {
    DynamicForm data = Form.form().bindFromRequest();
    String username = data.get("username");
    String newTimeZone = data.get("newTimeZone");
    Logger.info(username);
    Logger.info(newTimeZone);

    WriteResult update = AdminUser.updateTimeZone(username, newTimeZone);

    if(update.getN() == 0){
      return ok("username does not exists");
    }
    return ok("updated");
  }
}
