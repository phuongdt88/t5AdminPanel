package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import models.User;
import play.*;
import play.libs.Json;
import play.mvc.*;
import org.jongo.MongoCursor;


import views.html.*;


import java.util.ArrayList;
import java.util.function.Consumer;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result inprogress() {
        return ok(inprogress.render());
    }

    public Result getUser() {
        MongoCursor<User> abc = User.getUser();
        int count = abc.count();
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
