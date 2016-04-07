
package com.sgs.lumba.t5.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object iapdata_Scope0 {
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

class iapdata extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/iap.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="IAP Data" description="Purchases Data"></page-title>

<div class="row">
 <!--Filter box -->
  <div class="col-sm-6">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Filter</h3>
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
        <form role="form" class="form-horizontal validate" id="" name="" method="post">
          <div class="form-group">
            <label class="col-sm-3 control-label">Start Date</label>

            <div class="col-sm-9">
              <div class="input-group">
                <input type="text" class="form-control datepicker" id="startDate" name="startDate" data-validate="required" data-format="yyyy-mm-dd">

                <div class="input-group-addon">
                  <a href=""><i class="linecons-calendar"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="form-group">
            <label class="col-sm-3 control-label">End Date</label>
            <div class="col-sm-9">
              <div class="input-group">
                <input type="text" class="form-control datepicker" id="endDate" name="endDate" data-validate="required" data-format="yyyy-mm-dd">

                <div class="input-group-addon">
                  <a href=""><i class="linecons-calendar"></i></a>
                </div>
              </div>
            </div>
          </div>

          <div class="form-group">
            <label class="col-sm-3 control-label">Export to</label>
            <div class="col-sm-9">
              <select class="form-control" id="exportTypeSelect" name="exportTypeSelect" >
                <option value="0">Google Docs</option>
                <option value="1">Download CSV File</option>
              </select>
            </div>
          </div>

          <div class="form-group">
            <label class="col-sm-3 control-label"></label>
              <div class="col-sm-9">
                <select class="form-control" id="purchaseTypeSelect" name="purchaseTypeSelect" >
                  <option value="0">Valid Purchases</option>
                  <option value="1">All Purchases</option>
                </select>
              </div>
          </div>
        </form>
      </div>
    </div>
  </div>
 <!--Action box -->
  <div class="col-sm-6">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Actions</h3>
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
        <form role="form" class="form-horizontal validate" id="iapActionForm" name="iapActionForm" method="post">
          <div class="form-group">
            <div class="col-sm-9">
              <button class="btn btn btn-turquoise" id="iapIOSBtn" style="width: 40%">In-App Purchase iOS</button>
              <button class="btn btn btn-turquoise" id="iapAndroidBtn" style="width: 40%">In-App Purchase Android</button>
              <button class="btn btn btn-turquoise" id="newPayingUserBtn" style="width: 40%;margin-left:0">New Paying Users</button>
              <button class="btn btn btn-turquoise" id="uniquePayingUserBtn" style="width: 40%">Unique Paying Users</button>
              <button class="btn btn btn-turquoise" id="totalValidPurchaseBtn" style="width: 82%;margin-left:0">Total Valid Purchases</button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>

</div>

<div id="resultWrap">
  <div class="row">

    <!--Result box -->
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
object iapdata extends iapdata_Scope0.iapdata
              /*
                  -- GENERATED --
                  DATE: Tue Apr 05 11:45:24 ICT 2016
                  SOURCE: /Users/phuongdt1/Desktop/lumba/t5-admin-panel/app/com/sgs/lumba/t5/views/iapdata.scala.html
                  HASH: 6e42f3e571beb5c6a951058efc8a8416b037790b
                  MATRIX: 848->0
                  LINES: 32->1
                  -- GENERATED --
              */
          