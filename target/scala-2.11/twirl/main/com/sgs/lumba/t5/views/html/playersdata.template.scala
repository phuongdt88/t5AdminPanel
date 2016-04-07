
package com.sgs.lumba.t5.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object playersdata_Scope0 {
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

class playersdata extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/playersdata.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="Players Data" description=""></page-title>

<!--DAU/MAU-->
<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">DAU/MAU</h3>
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
                <input type="text" class="form-control datepicker" id="auStartDate" name="auStartDate" data-validate="required" data-format="yyyy-mm-dd">

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
                <input type="text" class="form-control datepicker" id="auEndDate" name="auEndDate" data-validate="required" data-format="yyyy-mm-dd">
                <div class="input-group-addon">
                  <a href=""><i class="linecons-calendar"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="form-group">
            <label class="col-sm-2 control-label"></label>
            <div class="col-sm-4">
              <select class="form-control" id="platformSelect" name="platformSelect" >
                <option value="0">iOS</option>
                <option value="1">Android</option>
                <option value="2">All</option>
              </select>
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
              <button class="btn btn btn-turquoise" id="dauBtn" style="width: 29%">Daily Active Users</button>
              <button class="btn btn btn-turquoise" id="mauBtn" style="width: 29%">Monthly Active Users</button>
              <button class="btn btn btn-turquoise" id="newPlayingUserBtn" style="width: 59%;margin-left:0">New Playing Users</button>
            </div>
          </div>
        </form>
      </div>


    </div>
  </div>

</div>

<!--CCU-->
<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Concurrent Users</h3>
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
                <input type="text" class="form-control datepicker" id="ccuStartDate" name="ccuStartDate" data-validate="required" data-format="yyyy-mm-dd">

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
                <input type="text" class="form-control datepicker" id="ccuEndDate" name="ccuEndDate" data-validate="required" data-format="yyyy-mm-dd">
                <div class="input-group-addon">
                  <a href=""><i class="linecons-calendar"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="form-group">
            <label class="col-sm-2 control-label">Export to</label>
            <div class="col-sm-4">
              <select class="form-control" id="ccuExportTypeSelect" name="ccuExportTypeSelect" >
                <option value="0">Google Docs</option>
                <option value="1">Download CSV File</option>
              </select>
            </div>
          </div>

          <div class="form-group" style="margin-left:16%">
            <div class="col-sm-8">
              <button class="btn btn btn-turquoise" id="ccuBtn" style="width: 59%;margin-left:0">CCU</button>
            </div>
          </div>
        </form>
      </div>


    </div>
  </div>

</div>

<!--Global Chat - Tribe Chat-->
<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Global/Tribe Chat</h3>
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
                <input type="text" class="form-control datepicker" id="chatStartDate" name="chatStartDate" data-validate="required" data-format="yyyy-mm-dd">

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
                <input type="text" class="form-control datepicker" id="chatEndDate" name="chatEndDate" data-validate="required" data-format="yyyy-mm-dd">
                <div class="input-group-addon">
                  <a href=""><i class="linecons-calendar"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="form-group">
            <label class="col-sm-2 control-label">Export to</label>
            <div class="col-sm-4">
              <select class="form-control" id="chatExportTypeSelect" name="chatExportTypeSelect" >
                <option value="0">Google Docs</option>
                <option value="1">Download CSV File</option>
              </select>
            </div>
          </div>

          <div class="form-group" style="margin-left:16%">
            <div class="col-sm-8">
              <button class="btn btn btn-turquoise" id="globalChatBtn" style="width: 29%;margin-left:0">Global Chat</button>
              <button class="btn btn btn-turquoise" id="tribeChatBtn" style="width: 29%;margin-left:0">Tribe Chat</button>
            </div>
          </div>
        </form>
      </div>


    </div>
  </div>

</div>


<!--Login / Logut Time-->
<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Login/Logout Time</h3>
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
                <input type="text" class="form-control datepicker" id="inoutStartDate" name="inoutStartDate" data-validate="required" data-format="yyyy-mm-dd">

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
                <input type="text" class="form-control datepicker" id="inoutEndDate" name="inoutEndDate" data-validate="required" data-format="yyyy-mm-dd">
                <div class="input-group-addon">
                  <a href=""><i class="linecons-calendar"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="form-group">
            <label class="col-sm-2 control-label">Export to</label>
            <div class="col-sm-4">
              <select class="form-control" id="inoutExportTypeSelect" name="inoutExportTypeSelect" >
                <option value="0">Google Docs</option>
                <option value="1">Download CSV File</option>
              </select>
            </div>
          </div>

          <div class="form-group" style="margin-left:16%">
            <div class="col-sm-8">
              <button class="btn btn btn-turquoise" id="inoutBtn" style="width: 59%;margin-left:0">Login / Logout Time</button>
            </div>
          </div>
        </form>
      </div>


    </div>
  </div>

</div>

<!--Unique Users-->
<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Number of Unique Users</h3>
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
            <label class="col-sm-2 control-label">To Date</label>
            <div class="col-sm-4">
              <div class="input-group">
                <input type="text" class="form-control datepicker" id="uniqueUsersEndDate" name="uniqueUsersEndDate" data-validate="required" data-format="yyyy-mm-dd">
                <div class="input-group-addon">
                  <a href=""><i class="linecons-calendar"></i></a>
                </div>

              </div>
              <p class="help-block">Count the number of unique users from the beginning to this day (23:59:59)</p>
            </div>
          </div>

          <div class="form-group">
            <label class="col-sm-2 control-label">Export to</label>
            <div class="col-sm-4">
              <select class="form-control" id="uniqueUsersExportTypeSelect" name="uniqueUsersExportTypeSelect" >
                <option value="0">Google Docs</option>
                <option value="1">Download CSV File</option>
              </select>
            </div>
          </div>

          <div class="form-group" style="margin-left:16%">
            <div class="col-sm-8">
              <button class="btn btn btn-turquoise" id="uniqueUsersBtn" style="width: 59%;margin-left:0">Number of Unique Users</button>
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
object playersdata extends playersdata_Scope0.playersdata
              /*
                  -- GENERATED --
                  DATE: Tue Apr 05 11:45:24 ICT 2016
                  SOURCE: /Users/phuongdt1/Desktop/lumba/t5-admin-panel/app/com/sgs/lumba/t5/views/playersdata.scala.html
                  HASH: 0bc8f16683afb913a0227942ba442d1b0adaf87f
                  MATRIX: 856->0
                  LINES: 32->1
                  -- GENERATED --
              */
          