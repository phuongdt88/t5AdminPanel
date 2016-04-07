
package com.sgs.lumba.t5.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object bundle_Scope0 {
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

class bundle extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/bundle.js"></script>

<!--Game Version-->
<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">GameVersion</h3>
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
        <span style="font-size:1.3em">Current Game Version:</span>
        <span style="font-size:1.3em" id="currentGameVersion"></span>
        <br />
        <br />
        <span>Click <a id="gameVersionLink" href="#/app/gameversion">here</a> to change Game Version</span>
      </div>
    </div>
  </div>
</div>

<!--Bundle-->
<div id="settingsInfoWrap">
  <div class="row">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Bundle</h3>

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
        <table id="bundleDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:40%">Key ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
            <th >Value ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
          </tr>
          </thead>
          <tbody>

          </tbody>
        </table>

      </div>
      <div style="width:100%;text-align:center;">
        <button class="btn btn-turquoise" type="submit" id="saveBundleBtn">Save</button>
        <button class="btn btn-turquoise" type="submit" id="publishBundleBtn">Publish Development</button>
      </div>
      </form>
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
object bundle extends bundle_Scope0.bundle
              /*
                  -- GENERATED --
                  DATE: Tue Apr 05 11:45:24 ICT 2016
                  SOURCE: /Users/phuongdt1/Desktop/lumba/t5-admin-panel/app/com/sgs/lumba/t5/views/bundle.scala.html
                  HASH: 490fbca8d64d19d7fe833e3e2160a76d2e57903f
                  MATRIX: 846->0
                  LINES: 32->1
                  -- GENERATED --
              */
          