
package com.sgs.lumba.t5.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object textstring_Scope0 {
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

class textstring extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/textstring.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="Text String" description=""></page-title>

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

<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Action</h3>
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

        <form role="form" class="form-horizontal validate" id="textStringGGSSForm" name="textStringGGSSForm" method="post">
          <div class="form-group">
            <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="textStringGGSSUrl" name="textStringGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
            </div>
          </div>
          <button class="btn btn btn-turquoise" id="viewGGSSBtn" style="width:17%;margin-left:17%">View</button>
        </form>

      </div>
    </div>
  </div>
</div>

<!--Text String from database table-->
<div id="textStringDB">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Text String From Database</h3>

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
      <button class="btn btn btn-turquoise" id="showTextStringBtn" style="width:15%">Show Text String</button>
      <span id="loadingSttLbl"></span>
      <table id="textStringDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th style="width:30%">Code Reference</th>
          <th >Arabic</th>
          <th >English</th>
        </tr>
        </thead>

        <tbody>

        </tbody>
      </table>
      <div id="exportBtnWrap">
        <button class="btn btn-turquoise" id="textStringExportGGSSBtn" style="width:20%;margin-left:35%;">Export To Google Spreadsheet</button>
        <button class="btn btn-turquoise" id="textStringExportCSVBtn" style="width:10%">Export To CSV</button>
      </div>
    </div>
  </div>
</div>

<!--Text String from Google Spreadsheet-->
<div id="textStringGGSS">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Text String From Google Spreadsheet</h3>

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

      <table id="textStringGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th style="width:30%">Code Reference</th>
          <th >Arabic</th>
          <th >English</th>
        </tr>
        </thead>

        <tbody>

        </tbody>
      </table>
      <button class="publishBtn btn btn btn-turquoise" id="textStringGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
    </div>
  </div>
</div>

<!--Result box-->
<div id="resultWrap">
  <div class="row">
    <div class="col-sm-12">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h3 class="panel-title">Result</h3>
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
          <span id="resultURL"></span>
        </div>
      </div>
    </div>

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
object textstring extends textstring_Scope0.textstring
              /*
                  -- GENERATED --
                  DATE: Tue Apr 05 11:45:24 ICT 2016
                  SOURCE: /Users/phuongdt1/Desktop/lumba/t5-admin-panel/app/com/sgs/lumba/t5/views/textstring.scala.html
                  HASH: ab2648c520e478bdf3f7a0730a20194ec6d97e67
                  MATRIX: 854->0
                  LINES: 32->1
                  -- GENERATED --
              */
          