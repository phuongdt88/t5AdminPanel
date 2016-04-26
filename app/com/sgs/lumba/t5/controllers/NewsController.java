package com.sgs.lumba.t5.controllers;

import models.GameVar;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import com.sgs.lumba.t5.views.html.news;


public class NewsController extends Controller {
  public Result getNews(){

    GameVar gameVar = GameVar.getGameVarNonVersion();
    String englishNews = gameVar.getEnglishnews();
    String arabNews = gameVar.getArabnews();

    JSONObject resData = new JSONObject();

    resData.put("englishNews", englishNews);
    resData.put("arabNews", arabNews);
    return ok(news.render(resData.toString()));
  }

  public Result addEnglishNews() {
    DynamicForm data = Form.form().bindFromRequest();
    String title = data.get("title");
    String image = data.get("image");
    String content = data.get("content");
    String video = data.get("video");
    System.out.println(title);
    System.out.println(image);
    System.out.println(content);
    System.out.println(video);
    return ok("added english news");
  }

  public Result addArabNews() {
    DynamicForm data = Form.form().bindFromRequest();
    String title = data.get("title");
    String image = data.get("image");
    String content = data.get("content");
    String video = data.get("video");
    System.out.println(title);
    System.out.println(image);
    System.out.println(content);
    System.out.println(video);
    return ok("added arab news");
  }

  public Result updateEnglishNewsTitle() {
    DynamicForm data = Form.form().bindFromRequest();
    String newTitle = data.get("newETitle");
    int    newsId = Integer.parseInt(data.get("newsId"));
    System.out.println(newTitle);
    System.out.println(newsId);
    return ok("edit title done");
  }

  public Result updateEnglishNewsImage() {
    DynamicForm data = Form.form().bindFromRequest();
    String newImage = data.get("newImage");
    int    newsId = Integer.parseInt(data.get("newsId"));
    System.out.println(newImage);
    System.out.println(newsId);
    return ok("edit image done");
  }

  public Result updateEnglishNewsVideo() {
    DynamicForm data = Form.form().bindFromRequest();
    String newVideo = data.get("newVideo");
    int    newsId = Integer.parseInt(data.get("newsId"));
    System.out.println(newVideo);
    System.out.println(newsId);
    return ok("edit video done");
  }

  public Result updateEnglishNewsContent() {
    DynamicForm data = Form.form().bindFromRequest();
    String newContent = data.get("newContent");
    int    newsId = Integer.parseInt(data.get("newsId"));
    System.out.println(newContent);
    System.out.println(newsId);
    return ok("edit content done");
  }

  public Result deleteEnglishNews() {
    DynamicForm data = Form.form().bindFromRequest();
    int    newsId = Integer.parseInt(data.get("newsId"));
    System.out.println(newsId);
    return ok("deleted this news");
  }

  public Result updateArabNewsTitle() {
    DynamicForm data = Form.form().bindFromRequest();
    String newTitle = data.get("newATitle");
    int    newsId = Integer.parseInt(data.get("newsId"));
    System.out.println(newTitle);
    System.out.println(newsId);
    return ok("edit title done");
  }

  public Result updateArabNewsImage() {
    DynamicForm data = Form.form().bindFromRequest();
    String newImage = data.get("newImage");
    int    newsId = Integer.parseInt(data.get("newsId"));
    System.out.println(newImage);
    System.out.println(newsId);
    return ok("edit image done");
  }

  public Result updateArabNewsVideo() {
    DynamicForm data = Form.form().bindFromRequest();
    String newVideo = data.get("newVideo");
    int    newsId = Integer.parseInt(data.get("newsId"));
    System.out.println(newVideo);
    System.out.println(newsId);
    return ok("edit video done");
  }

  public Result updateArabNewsContent() {
    DynamicForm data = Form.form().bindFromRequest();
    String newContent = data.get("newContent");
    int    newsId = Integer.parseInt(data.get("newsId"));
    System.out.println(newContent);
    System.out.println(newsId);
    return ok("edit content done");
  }

  public Result deleteArabNews() {
    DynamicForm data = Form.form().bindFromRequest();
    int    newsId = Integer.parseInt(data.get("newsId"));
    System.out.println(newsId);
    return ok("deleted this news");
  }
}
