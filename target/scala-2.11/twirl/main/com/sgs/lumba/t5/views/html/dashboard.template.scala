
package com.sgs.lumba.t5.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_Scope0 {
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

class dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/dashboard.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="Dashboard" description=""></page-title>

<!--Dashboard-->
<div id="dashboardInfoWrap">
  <div class="row">
    <div class="col-sm-12">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h3 class="panel-title">Select Platform</h3>

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
          <div class="form-group">
            <label class="col-sm-12 control-label" ><h4>Platform</h4></label>
            <div class="col-sm-12">
              <select class="form-control" id="platformSelect" name="platformSelect" style="width:20%;">
                <option value="0">Both</option>
                <option value="1">iOS</option>
                <option value="2">Android</option>
              </select>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>

<!--Dasbboard table-->
<div id="dashboardTable">
  <div class="panel panel-default">
    <div class="panel-heading">
      <!-- <h3 class="panel-title">Enter title here</h3> -->

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
      <table id="dasbboardDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th >Period</th>
          <th >Today</th>
          <th >Last 30 days</th>
          <th >Lifetime</th>
        </tr>
        </thead>

        <tbody>
          <tr>
            <td>New Users</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
            <td>Returning Users</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
            <td>DAU</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
            <td>IAP Spend in $</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
            <td>Number of IAP</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
            <td>Number of Overall Paying Users</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
            <td>N/A</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
          <td>Max CCU</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
            <td>Min CCU</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
            <td>ARPU</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
            <td>ARPPU</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
            <td>N/A</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
          <tr>
            <td>Top 3 Spenders</td>
            <td>390</td>
            <td>2500</td>
            <td>N/A</td>
          </tr>
        </tbody>
      </table>
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
object dashboard extends dashboard_Scope0.dashboard
              /*
                  -- GENERATED --
                  DATE: Thu Apr 07 14:23:04 ICT 2016
                  SOURCE: /Users/phuongdt1/Desktop/lumba/t5-admin-panel/app/com/sgs/lumba/t5/views/dashboard.scala.html
                  HASH: 386f4fa626b0ab8dd3fa3583ec90c501a65eb6b8
                  MATRIX: 852->0
                  LINES: 32->1
                  -- GENERATED --
              */
          