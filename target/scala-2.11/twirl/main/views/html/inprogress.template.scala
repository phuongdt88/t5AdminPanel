
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inprogress_Scope0 {
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

class inprogress extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<div class="dx-warning ng-scope">
  <div>
    <h2>WORK IN PROGRESS </h2>
  </div>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object inprogress extends inprogress_Scope0.inprogress
              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 14:15:12 ICT 2015
                  SOURCE: /Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/app/views/inprogress.scala.html
                  HASH: 56ea4402c97e6eea5fd8951ade65fdfcd95c3eea
                  MATRIX: 837->0
                  LINES: 32->1
                  -- GENERATED --
              */
          