
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adjustcallback_Scope0 {
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

class adjustcallback extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/adjustcallback.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="Adjust Callback Data" description=""></page-title>


<!--adjust callback data-->
<div id="adjustCallbackData">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Adjust Callback Data</h3>

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

      <table id="adjustCallbackDataTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th >User ID</th>
          <th >Activity Kind</th>
          <th >Success</th>
          <th >Will Retry</th>
          <th>Error</th>
          <th >Tracker Token</th>
          <th>Tracker Name</th>
          <th >Network</th>
          <th>Campaign</th>
          <th >Adgroup</th>
          <th >Creative</th>
          <th >CreatedAt (GMT)</th>
          <th >CreatedAt (UTC)</th>
        </tr>
        </thead>

        <tbody>

        </tbody>
      </table>

    </div>
  </div>
</div>

<!--export adjust callback data-->
<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Export Adjust Callback Data</h3>
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

      <!--body-->
      <div class="panel-body">
        <form role="form" class="form-horizontal validate" id="" name="" method="post">

          <div class="form-group">
            <label class="col-sm-2 control-label">From Date</label>
            <div class="col-sm-4">
              <div class="input-group">
                <input type="text" class="form-control datepicker" id="startDate" name="startDate" data-validate="required" data-format="yyyy-mm-dd">

                <div class="input-group-addon">
                  <a href=""><i class="linecons-calendar"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="form-group">
            <label class="col-sm-2 control-label">To Date</label>
            <div class="col-sm-4">
              <div class="input-group">
                <input type="text" class="form-control datepicker" id="endDate" name="endDate" data-validate="required" data-format="yyyy-mm-dd">
                <div class="input-group-addon">
                  <a href=""><i class="linecons-calendar"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="form-group">
            <label class="col-sm-2 control-label">Export to</label>
            <div class="col-sm-4">
              <select class="form-control" id="exportTypeSelect" name="exportTypeSelect" >
                <option value="0">Google Docs</option>
                <option value="1">Download CSV File</option>
              </select>
            </div>
          </div>

          <div class="form-group" style="margin-left:16%">
            <div class="col-sm-8">
              <button class="btn btn btn-turquoise" id="exportBtn" style="width: 59%;margin-left:0">Export Adjust Callback Data</button>
            </div>
          </div>
        </form>
      </div>


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
object adjustcallback extends adjustcallback_Scope0.adjustcallback
              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 14:15:10 ICT 2015
                  SOURCE: /Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/app/views/adjustcallback.scala.html
                  HASH: 7f1622a1aa652623eb992fb2acb9488c3bb31117
                  MATRIX: 845->0
                  LINES: 32->1
                  -- GENERATED --
              */
          