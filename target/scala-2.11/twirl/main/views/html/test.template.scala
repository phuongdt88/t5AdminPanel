
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object test_Scope0 {
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

class test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ArrayList[ArrayList[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(arr: ArrayList[ArrayList[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*2.1*/("""<div class="dx-warning ng-scope">
  <div>
    <h2>User List</h2>
    <div ng-init="users = """),_display_(/*5.28*/arr),format.raw/*5.31*/("""">
      Have """),format.raw/*6.12*/("""{"""),format.raw/*6.13*/("""{"""),format.raw/*6.14*/("""users.length"""),format.raw/*6.26*/("""}"""),format.raw/*6.27*/("""}"""),format.raw/*6.28*/(""" """),format.raw/*6.29*/("""users.
      <ul class="example-animate-container">
        <li class="animate-repeat" ng-repeat="user in users">
          ["""),format.raw/*9.12*/("""{"""),format.raw/*9.13*/("""{"""),format.raw/*9.14*/("""$index + 1"""),format.raw/*9.24*/("""}"""),format.raw/*9.25*/("""}"""),format.raw/*9.26*/("""] """),format.raw/*9.28*/("""{"""),format.raw/*9.29*/("""{"""),format.raw/*9.30*/("""user.name"""),format.raw/*9.39*/("""}"""),format.raw/*9.40*/("""}"""),format.raw/*9.41*/("""
        """),format.raw/*10.9*/("""</li>
        <li class="animate-repeat" ng-if="results.length == 0">
          <strong>No results found...</strong>
        </li>
      </ul>
    </div>
  </div>
</div>"""))
      }
    }
  }

  def render(arr:ArrayList[ArrayList[String]]): play.twirl.api.HtmlFormat.Appendable = apply(arr)

  def f:((ArrayList[ArrayList[String]]) => play.twirl.api.HtmlFormat.Appendable) = (arr) => apply(arr)

  def ref: this.type = this

}


}

/**/
object test extends test_Scope0.test
              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 14:15:13 ICT 2015
                  SOURCE: /Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/app/views/test.scala.html
                  HASH: 50e2d2209c78abac6aba93ba9e84c8af1a793b2d
                  MATRIX: 765->1|895->36|922->37|1040->129|1063->132|1104->146|1132->147|1160->148|1199->160|1227->161|1255->162|1283->163|1435->288|1463->289|1491->290|1528->300|1556->301|1584->302|1613->304|1641->305|1669->306|1705->315|1733->316|1761->317|1797->326
                  LINES: 27->1|32->1|33->2|36->5|36->5|37->6|37->6|37->6|37->6|37->6|37->6|37->6|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|40->9|41->10
                  -- GENERATED --
              */
          