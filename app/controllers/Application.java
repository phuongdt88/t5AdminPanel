package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mongodb.DBObject;
import models.User;
import play.*;
import play.libs.Json;
import play.mvc.*;
import org.jongo.MongoCursor;

import scala.Int;
import scala.util.parsing.json.JSONObject;
import views.html.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result inprogress() {
        return ok(inprogress.render());
    }

    public Result gamestate() {
        return ok(gamestate.render());
    }

    public Result tribes() {
        return ok(tribe.render());
    }

    public Result login() {
        return ok(login.render());
    }

    public Result getUser() {
        Logger.info("vao get user");
        MongoCursor<User> abc = User.getUser();
        int count = abc.count();
        String a = " aaa" + count;

        ObjectNode resp = Json.newObject();
        ArrayList arr = new ArrayList();
        abc.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                arr.add("{\"name\":\""+user.getName()+"\"}");
            }
        });
        Logger.info(arr.toString());
        return ok(test.render(arr));
    }




}
