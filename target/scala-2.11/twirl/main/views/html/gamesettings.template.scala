
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object gamesettings_Scope0 {
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

class gamesettings extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/gamesettings.js"></script>

<nav class="navbar navbar-inverse" role="navigation">
  <!-- Brand and toggle get grouped for better mobile display -->

  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
    <ul class="nav navbar-nav">
      <li class="active">
        <a href="" id="settingsInfoLink">Settings Info</a>
      </li>
      <li>
        <a href="" id="versionLoadBalancersLink">Version Load Balancers</a>
      </li>
      <li>
        <a href="" id="versionSmartfoxLink">Version Smartfox</a>
      </li>
      <li>
        <a href="" id="tournamentDurationLink">Tournament Duration</a>
      </li>
      <li>
        <a href="" id="daggerSearchRangesLink">Dagger Search Ranges</a>
      </li>
      <li>
        <a href="" id="matchLimitLink">Match Limit</a>
      </li>
      <li>
        <a href="" id="purchasesLink">Purchases</a>
      </li>
      <li>
        <a href="" id="otherActionsLink">Other Actions</a>
      </li>
    </ul>

  </div>
  <!-- /.navbar-collapse -->
</nav>

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

<!--Settings Info-->
<div id="settingsInfoWrap">
 <div class="row">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Settings Info</h3>

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
        <table id="settingsInfoDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:30%">Key ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
            <th style="width:30%">Value ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
            <th>English Version ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
            <th>Arabic Version ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
          </tr>
          </thead>
          <tbody>

          </tbody>
        </table>

      </div>
      <div style="width:100%;text-align:center;">
        <button class="btn btn-turquoise" type="submit" id="saveSettingsInfoBtn">Save</button>
        <button class="btn btn-turquoise" type="submit" id="publishSettingsInfoBtn">Publish Development</button>
      </div>
      </form>
    </div>
  </div>
</div>

<!--Version Load Balancers-->
<div id="versionLoadBalancersWrap">
  <div class="row">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Version Load Balancers</h3>

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

        <table id="vlbDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:50%">Key ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
            <th>Value ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
          </tr>
          </thead>
          <tbody>

          </tbody>
        </table>

      </div>
      <div style="width:100%;text-align:center;">
        <button class="btn btn-turquoise" type="submit" id="saveVersionLoadBalancersBtn">Save</button>
        <button class="btn btn-turquoise" type="submit" id="publishVerionLoadBalancersBtn">Publish Development</button>
      </div>
      </form>
    </div>
  </div>
</div>

<!--Version Smartfox-->
<div id="versionSmartfoxWrap">
  <div class="row">
    <div class="col-sm-12">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h3 class="panel-title">Version Smartfox</h3>
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
          <form role="form" class="form-horizontal validate" id="addVersionSFSForm" name="addVersionSFSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label" for="fromVersionSFS">From Version</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="fromVersionSFS" name="fromVersionSFS" data-validate="required" data-message-required="Please enter a version" style="width:50%;">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label" for="toVersionSFS">To Version</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="toVersionSFS" name="toVersionSFS" data-validate="required" data-message-required="Please enter a version" style="width:50%;" >
              </div>
            </div><div class="form-group">
            <label class="col-sm-2 control-label" for="updateType">Update Type</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="updateType" name="updateType" data-validate="required" data-message-required="" style="width:50%;" >
            </div>
          </div><div class="form-group">
            <label class="col-sm-2 control-label" for="description">Description</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="description" name="description"  style="width:50%;" >
            </div>
          </div><div class="form-group">
            <label class="col-sm-2 control-label" for="iosNewVersionUrl">iOS New Version URL</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="iosNewVersionUrl" name="iosNewVersionUrl" data-validate="required" data-message-required="Please enter a version" style="width:50%;" >
            </div>
          </div><div class="form-group">
            <label class="col-sm-2 control-label" for="androidNewVersionUrl">Android New Version URL</label>
            <div class="col-sm-10">
              <input type="text" class="form-control" id="androidNewVersionUrl" name="androidNewVersionUrl" data-validate="required" data-message-required="Please enter a version" style="width:50%;" >
            </div>
          </div>
            <button class="btn btn-turquoise" type = "submit" id="addVersionSFSBtn" style="width:17%;margin-left:17%">Add Version SFS</button>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>

<!--Tournament Duration-->
<div id="tournamentDurationWrap">
  <div class="row">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Tournament Duration</h3>

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

        <table id="tournamentDurationDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:50%">Key ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
            <th>Value ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
          </tr>
          </thead>
          <tbody>

          </tbody>
        </table>

      </div>
      <div style="width:100%;text-align:center;">
        <button class="btn btn-turquoise" type="submit" id="saveTournamentDurationBtn">Save</button>
        <button class="btn btn-turquoise" type="submit" id="publishTournamentDuration">Publish Server</button>
      </div>
      </form>
    </div>
  </div>
</div>
<!--Dagger Search Ranges-->
<div id="daggerSearchRangesWrap">
  <div class="row">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Dagger Search Ranges</h3>

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

        <table id="daggerSearchRangesDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:50%">Key ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
            <th>Value ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>

      </div>
      <div style="width:100%;text-align:center;">
        <button class="btn btn-turquoise" type="submit" id="saveDaggerSearchRangesBtn">Save</button>
        <button class="btn btn-turquoise" type="submit" id="publishDaggerSearchRangeBtn">Publish Server</button>
      </div>
      </form>
    </div>
  </div>
</div>

<!--Match Limit-->
<div id="matchLimitWrap">
  <div class="row">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Match Limit</h3>

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

        <table id="matchLimitDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:50%">Key ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
            <th>Value ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>

      </div>
      <div style="width:100%;text-align:center;">
        <button class="btn btn-turquoise" type="submit" id="saveMatchLimitBtn">Save</button>
        <button class="btn btn-turquoise" type="submit" id="publishMatchLimitBtn">Publish Server</button>
      </div>
      </form>
    </div>
  </div>
</div>

<!--Purchases-->
<div id="purchasesWrap">
  <div class="row">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Purchases</h3>

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

        <table id="purchasesDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:30%">Key ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
            <th>Value ( <i class='jeditable-activate fa fa-pencil'></i> )</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>

      </div>
      <div style="width:100%;text-align:center;">
        <button class="btn btn-turquoise" type="submit" id="savePurchasesBtn">Save</button>
        <button class="btn btn-turquoise" type="submit" id="publishPurchasesBtn">Publish Server</button>
      </div>
      </form>
    </div>
  </div>
</div>
<!--Other Actions-->
<div id="otherActionsWrap">
  <div class="row">
    <div class="col-sm-6">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h3 class="panel-title">Delete Unuse Version</h3>
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
          <form role="form" class="form-horizontal validate" id="deleteUnuseVersionForm" name="deleteUnuseVersionForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label" for="unuseVersionVal">Unuse Version</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="unuseVersionVal" name="unuseVersionVal" data-validate="required" data-message-required="Please enter a version">
              </div>
            </div>
            <button class="btn btn-turquoise" id="deleteUnuseVersionBtn" style="margin-left:17%">Delete Unuse Version</button>
          </form>
        </div>
      </div>
    </div>

    <div class="col-sm-6">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h3 class="panel-title">Change Game Sub Version</h3>
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
          <form role="form" class="form-horizontal validate" id="changeGameSubVersionForm" name="changeGameSubVersionForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label" for="changeGameSubVersionVal">Change to game Sub_Version</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="changeGameSubVersionVal" name="changeGameSubVersionVal" data-validate="required" data-message-required="Please enter a version">
              </div>
            </div>
            <button class="btn btn-turquoise" id="changeGameSubVersionBtn" style="margin-left:17%">Change Game Sub-version</button>
          </form>
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
object gamesettings extends gamesettings_Scope0.gamesettings
              /*
                  -- GENERATED --
                  DATE: Thu Sep 24 10:33:03 ICT 2015
                  SOURCE: /Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/app/views/gamesettings.scala.html
                  HASH: dd2bb52cff887cd210c4caf6642c4e905f4c760c
                  MATRIX: 841->0
                  LINES: 32->1
                  -- GENERATED --
              */
          