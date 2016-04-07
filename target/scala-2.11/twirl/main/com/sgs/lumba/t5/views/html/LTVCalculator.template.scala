
package com.sgs.lumba.t5.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object LTVCalculator_Scope0 {
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

class LTVCalculator extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/ltvcalculator.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="LTV Calculator" description=""></page-title>

<!--DAU/MAU-->
<div class="row">
  <div class="col-sm-8">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">LTV Calculator</h3>
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

          <div class="col-sm-6">

            <div class="form-group">
              <h4 style="margin-left:37%">ARPDAU:</h4>
              <div class="col-sm-6" style="margin-left:33%">
                <select class="form-control" id="ARPDAUSelect" name="ARPDAUSelect" >
                  <option value="0">Lifetime</option>
                  <option value="1">12 months</option>
                  <option value="2">6 months</option>
                  <option value="3">3 months</option>
                  <option value="4">1 month</option>
                  <option value="5">15 days</option>
                  <option value="6">7 days</option>
                </select>
              </div>
            </div>

            <div class="form-group" style="text-align:center">
              <h4>or</h4>
            </div>

            <div class="form-group">
              <label class="col-sm-4 control-label">From:</label>
              <div class="col-sm-6">
                <div class="input-group">
                  <input type="text" class="form-control datepicker" id="ARPDAUFromInput" name="ARPDAUFromInput" data-validate="" data-format="yyyy-mm-dd">

                  <div class="input-group-addon">
                    <a href=""><i class="linecons-calendar"></i></a>
                  </div>
                </div>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-4 control-label">To:</label>
              <div class="col-sm-6">
                <div class="input-group">
                  <input type="text" class="form-control datepicker" id="ARPDAUToInput" name="ARPDAUToInput" data-validate="" data-format="yyyy-mm-dd">

                  <div class="input-group-addon">
                    <a href=""><i class="linecons-calendar"></i></a>
                  </div>
                </div>
              </div>
            </div>

          </div>

          <div class="col-sm-6">

            <div class="form-group">
              <h4 style="margin-left:37%">Retention %:</h4>
              <div class="col-sm-6" style="margin-left:33%">
                <select class="form-control" id="retentionSelect" name="retentionSelect" >
                  <option value="0">Lifetime</option>
                  <option value="1">12 months</option>
                  <option value="2">6 months</option>
                  <option value="3">3 months</option>
                  <option value="4">1 month</option>
                  <option value="5">15 days</option>
                  <option value="6">7 days</option>
                </select>
              </div>
            </div>

            <div class="form-group" style="text-align:center">
              <h4>or</h4>
            </div>

            <div class="form-group">
              <label class="col-sm-4 control-label">From:</label>
              <div class="col-sm-6">
                <div class="input-group">
                  <input type="text" class="form-control datepicker" id="retentionFromInput" name="retentionFromInput" data-validate="" data-format="yyyy-mm-dd">

                  <div class="input-group-addon">
                    <a href=""><i class="linecons-calendar"></i></a>
                  </div>
                </div>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-4 control-label">To:</label>
              <div class="col-sm-6">
                <div class="input-group">
                  <input type="text" class="form-control datepicker" id="retentionToInput" name="retentionToInput" data-validate="" data-format="yyyy-mm-dd">

                  <div class="input-group-addon">
                    <a href=""><i class="linecons-calendar"></i></a>
                  </div>
                </div>
              </div>
            </div>

          </div>

          <div class="form-group">
           
          </div>

          <div class="form-group">
            <!-- <label class="col-sm-4 control-label">Export to</label> -->
            <h4 style="margin-left:41%">Platform</h4>
            <div class="col-sm-12">
              <select class="form-control" id="platformSelect" name="platformSelect" style="width:20%; margin-left:40%">
                <option value="0">Both</option>
                <option value="1">iOS</option>
                <option value="2">Android</option>
              </select>
            </div>
          </div>

          <div class="form-group" style="margin-left:39%">
            <div class="col-sm-12">
              <button class="btn btn btn-turquoise" id="calculateButton" style="width: 33%">Calculator</button>
            </div>
          </div>

          <div class="form-group" style="margin-left:43%">
            <div class="col-sm-12">
              <h4>LTV = 5.27$</h4>
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
object LTVCalculator extends LTVCalculator_Scope0.LTVCalculator
              /*
                  -- GENERATED --
                  DATE: Thu Apr 07 16:03:18 ICT 2016
                  SOURCE: /Users/phuongdt1/Desktop/lumba/t5-admin-panel/app/com/sgs/lumba/t5/views/LTVCalculator.scala.html
                  HASH: e070d07da229ad1737cd38fd6995931a971685c5
                  MATRIX: 860->0
                  LINES: 32->1
                  -- GENERATED --
              */
          