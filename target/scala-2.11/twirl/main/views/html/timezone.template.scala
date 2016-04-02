
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object timezone_Scope0 {
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

class timezone extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!--<script src="assets/script/timezone.js"></script>-->

<page-title ng-if="layoutOptions.pageTitles" title="Time Zone" description=""></page-title>

<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Time Zone: """),format.raw/*9.52*/("""{"""),format.raw/*9.53*/("""{"""),format.raw/*9.54*/("""timeZone"""),format.raw/*9.62*/("""}"""),format.raw/*9.63*/("""}"""),format.raw/*9.64*/("""</h3>
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

        <form role="form" class="form-horizontal" id="timeZoneForm" name="timeZoneForm" method="post" ng-submit="updateTimeZone()">
          <div class="form-group">
            <div class="col-sm-10">
              <select class="form-control" id="timeZoneSelect" name="timeZoneSelect" ng-model="timeZoneSelect" style="width:20%;float:left">
               <option ng-repeat="option in timeZoneData.availableOptions" value=""""),format.raw/*26.83*/("""{"""),format.raw/*26.84*/("""{"""),format.raw/*26.85*/("""option.id"""),format.raw/*26.94*/("""}"""),format.raw/*26.95*/("""}"""),format.raw/*26.96*/("""">"""),format.raw/*26.98*/("""{"""),format.raw/*26.99*/("""{"""),format.raw/*26.100*/("""option.name"""),format.raw/*26.111*/("""}"""),format.raw/*26.112*/("""}"""),format.raw/*26.113*/("""</option>
              </select>
              <button class="btn btn-turquoise" id="updateTimeZone" style="width:17%;margin-left:1%">Update</button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</div>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object timezone extends timezone_Scope0.timezone
              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 14:15:13 ICT 2015
                  SOURCE: /Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/app/views/timezone.scala.html
                  HASH: 7e61fe6c28837fe287ab57a3f65cd2bb4c6bfa08
                  MATRIX: 833->0|1178->318|1206->319|1234->320|1269->328|1297->329|1325->330|2118->1095|2147->1096|2176->1097|2213->1106|2242->1107|2271->1108|2301->1110|2330->1111|2360->1112|2400->1123|2430->1124|2460->1125
                  LINES: 32->1|40->9|40->9|40->9|40->9|40->9|40->9|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26
                  -- GENERATED --
              */
          