
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tribe_Scope0 {
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

class tribe extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/tribe.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="Tribes" description="Tribes Description"></page-title>

<div class="row">
  <div class="col-sm-6">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Search Tribe</h3>
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

        <form role="form" class="form-horizontal" id="selectGameVersionForm" name="selectGameVersionForm" method="post">
          <div class="form-group">
            <div class="col-sm-10" style="margin-bottom:1%;width:65%">
              <select class="form-control" id="gameVersionSelect" >
                <option value ="0">Select game Version</option>
                <option value ="1" selected="selected">2014.4.10</option>
              </select>
            </div>
          </div>
        </form>

        <form role="form" class="form-horizontal validate" id="searchTribeByIdForm" name="searchTribeByIdForm" method="post">
          <div class="form-group">
            <div class="col-sm-10">
              <button class="btn btn-turquoise" type="submit" style="float:left">Search</button>
              <input type="text" class="form-control" id="tribeId" name="tribeId" placeholder="Search by TribeID" data-validate="required" data-message-required="Please enter a TribeID." style="width:70%" value="">
            </div>
          </div>
        </form>

        <form role="form" class="form-horizontal validate" id="searchTribeByNameForm" name="searchTribeByNameForm" method="post">
          <div class="form-group">
            <div class="col-sm-10">
              <button class="btn btn-turquoise" type="submit" style="float:left">Search</button>
              <input type="text" class="form-control" id="tribeName" name="tribeName" placeholder="Search by Tribe's Name" data-validate="required" data-message-required="Please enter a Tribe's name." style="width:70%;" value="">
            </div>
          </div>
        </form>

        <button class="btn btn-turquoise" id="showTribeList" style="width:70%;">Show All Tribes</button>

      </div>
    </div>
  </div>

  <div class="col-sm-6">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Download Tribes's Messages</h3>
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

          <div class="form-group" style="float:right;">
            <label class="col-sm-3 control-label">Start Date</label>

            <div class="col-sm-9">
              <div class="input-group">
                <input type="text" class="form-control datepicker" id="startDate" name="startDate">

                <div class="input-group-addon">
                  <a href=""><i class="linecons-calendar"></i></a>
                </div>
              </div>
            </div>
          </div>

        <div class="form-group" style="float:right;">
          <label class="col-sm-3 control-label">End Date</label>
          <div class="col-sm-9">
            <div class="input-group">
              <input type="text" class="form-control datepicker" id="endDate" name="endDate">

              <div class="input-group-addon">
                <a href=""><i class="linecons-calendar"></i></a>
              </div>
            </div>
          </div>
        </div>


        <button class="btn btn-turquoise" id="downloadTribeMsgBtn" style="width:70%;margin-top:5%;float:right;margin-right:3%">Download top 10 Tribes' chat messages</button>

      </div>
    </div>
  </div>
</div>

<!--Tribe list-->
<div id="tribeList">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Tribe List</h3>

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

      <table id="tribeListTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th style="width:5%">ID</th>
          <th style="width:15%">Tribe ID</th>
          <th style="width:35%">Tribe Name (Click on a name to edit)</th>
          <th style="width:10%">Member Count</th>
          <th style="width:15%">Total Daggers</th>
          <th style="width:5%">Rank</th>
          <th>Action</th>
        </tr>
        </thead>

        <tbody>

        </tbody>
      </table>

    </div>
  </div>
</div>

<!--Tribe Details-->
<div id="tribeDetails">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title" id="tribeNameTitle"></h3>
      <br />
      <p id="tribeInfo" style="margin-bottom:0"></p>
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

      <table id="tribeDetailsTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th style="width:5%">Rank</th>
          <th style="width:30%">User ID</th>
          <th style="width:20%">Name</th>
          <th>Level</th>
          <th>Daggers</th>
          <th>Clan Role</th>
        </tr>
        </thead>

        <tbody>

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
object tribe extends tribe_Scope0.tribe
              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 14:15:13 ICT 2015
                  SOURCE: /Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/app/views/tribe.scala.html
                  HASH: aff990ec4b62bdff2cd4961495e565fab3db8cc8
                  MATRIX: 827->0
                  LINES: 32->1
                  -- GENERATED --
              */
          