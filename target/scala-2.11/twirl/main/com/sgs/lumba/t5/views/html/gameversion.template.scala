
package com.sgs.lumba.t5.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object gameversion_Scope0 {
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

class gameversion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(gameVersionInfo: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<script src="assets/script/gameversion.js"></script>

<!--Select game version-->
<div class="row">
  <textarea id="gameVersionInfo" style="display:none">"""),_display_(/*6.56*/gameVersionInfo),format.raw/*6.71*/("""</textarea>
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Select Game Version</h3>
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
        <form role="form" class="form-horizontal validate" id="selectGameVersionForm" name="selectGameVersionForm" method="post">
          <div class="form-group">
            <label class="col-sm-2 control-label" for="gameVersionSelect">Select a version</label>
            <div class="col-sm-10">
              <select class="form-control" id="gameVersionSelect" name="gameVersionSelect" data-validate="required" style="width:20%">
              </select>
            </div>
          </div>
          <button class="btn btn-turquoise" id="createAcc" style="width:16%;margin-left:17%">Select</button>
        </form>

      </div>
    </div>
  </div>
</div>"""))
      }
    }
  }

  def render(gameVersionInfo:String): play.twirl.api.HtmlFormat.Appendable = apply(gameVersionInfo)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (gameVersionInfo) => apply(gameVersionInfo)

  def ref: this.type = this

}


}

/**/
object gameversion extends gameversion_Scope0.gameversion
              /*
                  -- GENERATED --
                  DATE: Tue Apr 05 11:45:24 ICT 2016
                  SOURCE: /Users/phuongdt1/Desktop/lumba/t5-admin-panel/app/com/sgs/lumba/t5/views/gameversion.scala.html
                  HASH: 829ce8aea9e2141f72680289944db251924c97d6
                  MATRIX: 774->1|894->26|921->27|1101->181|1136->196
                  LINES: 27->1|32->1|33->2|37->6|37->6
                  -- GENERATED --
              */
          