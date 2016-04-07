
package com.sgs.lumba.t5.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object pullactivities_Scope0 {
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

class pullactivities extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/pullactivities.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="Pull Activities" description=""></page-title>

<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Pull Activities</h3>
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

            <div class="col-sm-3">
              <div class="form-group">
                <h4 style="margin-left:5%">Platform:</h4>
                <div class="col-sm-10">
                  <select class="form-control" id="platformSelect" name="platformSelect">
                    <option value="0">Both</option>
                    <option value="1">iOS</option>
                    <option value="2">Android</option>
                  </select>
                </div>
              </div>
            </div>

            <div class="col-sm-3">
              <div class="form-group">
                <h4 style="margin-left:5%">Metric:</h4>
                <div class="col-sm-10">
                  <select class="form-control" id="metricSelect" name="metricSelect">
                    <option value="0">DAU</option>
                    <option value="1">MAU</option>
                    <option value="2">Daily New Installs</option>
                    <option value="3">Returning Users</option>
                    <option value="4">Max CCU</option>
                    <option value="5">Min CCU</option>
                    <option value="6">New Paying Users</option>
                    <option value="7">ARPU</option>
                    <option value="8">ARPPU</option>
                    <option value="9">ARPDAU</option>
                    <option value="10">Daily Spend (All Users)</option>
                    <option value="11">Daily Spend (In Top Tribes)</option>
                    <option value="12">Total Spend (Top 25 Spenders)</option>
                    <option value="13">IAP (each IAP bundle purchased by all users)</option>
                    <option value="14">IAP (count for all users)</option>
                    <option value="15">LTVs</option>
                  </select>
                </div>
              </div>
            </div>

            <div class="col-sm-3">
              <div class="form-group">
                <h4 style="margin-left:5%">From:</h4>
                <div class="col-sm-10">
                  <div class="input-group">
                    <input type="text" class="form-control datepicker" id="fromDate" name="fromDate" data-validate="required" data-format="yyyy-mm-dd">

                    <div class="input-group-addon">
                      <a href=""><i class="linecons-calendar"></i></a>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-sm-3">
              <div class="form-group">
                <h4 style="margin-left:5%">To:</h4>
                <div class="col-sm-10">
                  <div class="input-group">
                    <input type="text" class="form-control datepicker" id="toDate" name="toDate" data-validate="required" data-format="yyyy-mm-dd">

                    <div class="input-group-addon">
                      <a href=""><i class="linecons-calendar"></i></a>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <div class="form-group">
            <!-- <label class="col-sm-4 control-label">Export to</label> -->
              <h4 style="margin-left:41%;margin-top:8%">Export to:</h4>
              <div class="col-sm-12">
                <select class="form-control" id="exportTypeSelect" name="exportTypeSelect" style="width:20%; margin-left:40%">
                  <option value="0">HTML Report</option>
                  <option value="1">Google Docs</option>
                  <option value="2">CSV File</option>
                </select>
              </div>
            </div>

            <div class="form-group" style="margin-left:39%">
              <div class="col-sm-12">
                <button class="btn btn btn-turquoise" id="generateReportButton" style="width: 33%">Generate Report</button>
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
object pullactivities extends pullactivities_Scope0.pullactivities
              /*
                  -- GENERATED --
                  DATE: Thu Apr 07 16:26:36 ICT 2016
                  SOURCE: /Users/phuongdt1/Desktop/lumba/t5-admin-panel/app/com/sgs/lumba/t5/views/pullactivities.scala.html
                  HASH: c4b710b7fa5e1a7e9c956df23b01364eb005f4fc
                  MATRIX: 862->0
                  LINES: 32->1
                  -- GENERATED --
              */
          