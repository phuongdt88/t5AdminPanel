
package com.sgs.lumba.t5.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object news_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class news extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resData: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<script src="assets/script/news.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="News" description=""></page-title>

<!--English News table-->
<div id="englishNews">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">English News</h3>
      <textarea id="resData" style="display:none"> """),_display_(/*11.53*/resData),format.raw/*11.60*/("""</textarea>
      <div id="arabNewsDiv"> </div>
      <div class="panel-options">
        <a href="" data-toggle="panel">
          <span class="collapse-icon">&ndash;</span>
          <span class="expand-icon">+</span>
        </a>
        <a href="" data-toggle="remove">
          &times;
        </a>
        <a href="" data-toggle="reload">
          <i class="fa-rotate-right"></i>
        </a>
      </div>
    </div>
    <div class="panel-body">
      <table id="englishNewsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th >Time</th>
          <th >Title</th>
          <th >Image Link</th>
          <th >Content</th>
          <th >Video Link</th>
          <th >Action</th>
        </tr>
        </thead>

        <tbody>


        </tbody>
      </table>
      <button class="btn btn-turquoise" id="publishEngNewsBtn" style="width:20%;margin-left:40%;">Publish to server</button>
    </div>
  </div>
</div>

<!--Arab News table-->
<div id="arabNews">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Arab News</h3>
      <div class="panel-options">
        <a href="" data-toggle="panel">
          <span class="collapse-icon">&ndash;</span>
          <span class="expand-icon">+</span>
        </a>
        <a href="" data-toggle="remove">
          &times;
        </a>
        <a href="" data-toggle="reload">
          <i class="fa-rotate-right"></i>
        </a>
      </div>
    </div>
    <div class="panel-body">
      <table id="arabNewsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th >Time</th>
          <th >Title</th>
          <th >Image Link</th>
          <th >Content</th>
          <th >Video Link</th>
          <th >Action</th>
        </tr>
        </thead>
        <tbody>

        </tbody>
      </table>
      <button class="btn btn-turquoise" id="publishArNewsBtn" style="width:20%;margin-left:40%;">Publish to server</button>
    </div>
  </div>
</div>


<!--Add English News Form-->

<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Add English News</h3>
        <div class="panel-options">
          <a href="" data-toggle="panel">
            <span class="collapse-icon">&ndash;</span>
            <span class="expand-icon">+</span>
          </a>
          <a href="" data-toggle="remove">
            &times;
          </a>
        </div>
      </div>
      <div class="panel-body">

        <form role="form" class="form-horizontal validate" id="addEnglishNewsForm" name="addEnglishNewsForm" method="post">
          <div class="form-group">
            <label class="col-sm-2 control-label" for="englishNewsTitle">Title</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="englishNewsTitle" name="englishNewsTitle" data-validate="required" data-message-required="Please enter a title" style="width:50%;">
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="englishNewsImage">Image</label>
            <div class="col-sm-10">
              <input type="file" class="form-control" id="englishNewsImage">
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="englishNewsContent">Content</label>
            <div class="col-sm-10">
              <textarea class="form-control" cols="5" rows ="12" id="englishNewsContent" data-validate="required" data-message-required="Please enter the news' content"></textarea>
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="englishNewsVideo">Video Link</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="englishNewsVideo" name="englishNewsVideo"  style="width:50%;">
            </div>
          </div>
          <button class="btn btn-turquoise" type ="submit" id="addEnglishNewsBtn" style="width:17%;margin-left:17%">Add</button>
        </form>
      </div>
    </div>
  </div>
</div>

<!--Add Arab News Form-->

<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Add Arab News</h3>
        <div class="panel-options">
          <a href="" data-toggle="panel">
            <span class="collapse-icon">&ndash;</span>
            <span class="expand-icon">+</span>
          </a>
          <a href="" data-toggle="remove">
            &times;
          </a>
        </div>
      </div>
      <div class="panel-body">

        <form role="form" class="form-horizontal validate" id="addArabNewsForm" name="addArabNewsForm" method="post">
          <div class="form-group">
            <label class="col-sm-2 control-label" for="arabNewsTitle">Title</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="arabNewsTitle" name="arabNewsTitle" data-validate="required" data-message-required="Please enter a title" style="width:50%;">
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="arabNewsImage">Image</label>
            <div class="col-sm-10">
              <input type="file" class="form-control" id="arabNewsImage">
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="arabNewsContent">Content</label>
            <div class="col-sm-10">
              <textarea class="form-control" cols="5" rows ="12" id="arabNewsContent" data-validate="required" data-message-required="Please enter the news' content"></textarea>
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="arabNewsVideo">Video Link</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="arabNewsVideo" name="englishNewsVideo"  style="width:50%;">
            </div>
          </div>
          <button class="btn btn-turquoise" type ="submit" id="addArabNewsBtn" style="width:17%;margin-left:17%">Add</button>
        </form>

      </div>
    </div>
  </div>
</div>"""))
      }
    }
  }

  def render(resData:String): play.twirl.api.HtmlFormat.Appendable = apply(resData)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (resData) => apply(resData)

  def ref: this.type = this

}


}

/**/
object news extends news_Scope0.news
              /*
                  -- GENERATED --
                  DATE: Tue Apr 05 11:45:24 ICT 2016
                  SOURCE: /Users/phuongdt1/Desktop/lumba/t5-admin-panel/app/com/sgs/lumba/t5/views/news.scala.html
                  HASH: 2f953842f87c78b1c59e5b8dc09baf4002e031b3
                  MATRIX: 760->1|872->18|899->19|1278->371|1306->378
                  LINES: 27->1|32->1|33->2|42->11|42->11
                  -- GENERATED --
              */
          