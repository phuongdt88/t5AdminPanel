
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object gamedata_Scope0 {
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

class gamedata extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/gamedata.js"></script>


<nav class="navbar navbar-inverse" role="navigation">
  <!-- Brand and toggle get grouped for better mobile display -->

  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
    <ul class="nav navbar-nav">
      <li class="active">
        <a href="" id="campaignLink">Campaign Reference</a>
      </li>
      <li>
        <a href="" id="combatUnitsLink">Combat Units</a>
      </li>
      <li>
        <a href="" id="unitLevelsLink">Unit Levels</a>
      </li>
      <li>
        <a href="" id="defensiveBuildingsLink">Defensive Buildings</a>
      </li>
      <li>
        <a href="" id="defensiveBuildingLevelLink">Defensive Building Level</a>
      </li>
      <li>
        <a href="" id="resourceBuildingsLink">Resources Building Variables</a>
      </li>
      <li>
        <a href="" id="armyBuildingsLink">Army Buildings</a>
      </li>
      <li>
        <a href="" id="otherBuildingsLink">Other Buildings</a>
      </li>
      <li>
        <a href="" id="townHallLevelLink">Town Hall Level</a>
      </li>
      <li>
        <a href="" id="decorationsLink">Decoration</a>
      </li><li>
        <a href="" id="spellsLink">Spell</a>
      </li><li>
        <a href="" id="spellLevelsLink">Spell Level</a>
      </li><li>
        <a href="" id="obstaclesLink">Obstacles</a>
      </li><li>
        <a href="" id="trophyLink">Trophy</a>
      </li><li>
        <a href="" id="achievementsLink">Achievements</a>
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

<!--Campaign-->
<div id="campaignWrap">
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
          <form role="form" class="form-horizontal validate" id="campaignGGSSForm" name="campaignGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="campaignGGSSUrl" name="ggssUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="campaignViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="campaignDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Campaign from Database</h3>
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
        <table id="campaignDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Name</th>
            <th>Require Campaign ID to Unlock</th>
            <th>Lootable Gold</th>
            <th>Lootable Water</th>
            <th>Lootable Dar kWater</th>
            <th>Town Hall Prefab</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="campaignGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Campaign From Google Spreadsheet</h3>

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

        <table id="campaignGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Name</th>
            <th>Require Campaign ID to Unlock</th>
            <th>Lootable Gold</th>
            <th>Lootable Water</th>
            <th>Lootable Dar kWater</th>
            <th>Town Hall Prefab</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="campaignGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Unit Levels-->
<div id="unitLevelsWrap">
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

          <form role="form" class="form-horizontal validate" id="unitLevelsGGSSForm" name="unitLevelsGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="unitLevelsGGSSUrl" name="unitLevelsGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="unitLevelsViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="unitLevelsDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Unit Levels from Database</h3>

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

        <table id="unitLevelsDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:8%">Type</th>
            <th>Level</th>
            <th>Damage per Second</th>
            <th>Damage per Attack</th>
            <th>Hit Points</th>
            <th>Training Cost<br />(Elixir)</th>
            <th>Upgrade Cost<br />(Elixir)</th>
            <th>Laboratory Level Required</th>
            <th>Upgrade Time<br />(Hours)</th>
            <th>Town Hall Level Required</th>
            <th>Regeneration Time<br />(Minutes)</th>
            <th>Upgrade Cost<br />(Dark Elixir)</th>
            <th>Training Cost<br />(DarkElixir)</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="unitLevelsGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Unit Levels From Google Spreadsheet</h3>

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

        <table id="unitLevelsGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:8%">Type</th>
            <th>Level</th>
            <th>Damage per Second</th>
            <th>Damage per Attack</th>
            <th>Hit Points</th>
            <th>Training Cost<br />(Elixir)</th>
            <th>Upgrade Cost<br />(Elixir)</th>
            <th>Laboratory Level Required</th>
            <th>Upgrade Time<br />(Hours)</th>
            <th>Town Hall Level Required</th>
            <th>Regeneration Time<br />(Minutes)</th>
            <th>Upgrade Cost<br />(Dark Elixir)</th>
            <th>Training Cost<br />(DarkElixir)</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="unitLevelsGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Combat Units-->
<div id="combatUnitsWrap">
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

          <form role="form" class="form-horizontal validate" id="combatUnitsGGSSForm" name="combatUnitsGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="combatUnitsGGSSUrl" name="ggssUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="combatUnitsViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="combatUnitsDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Combat Units from Database</h3>

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

        <table id="combatUnitsDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:8%">Unit</th>
            <th>Unit Group</th>
            <th>Preferred Target</th>
            <th>Preferred Target Damage</th>
            <th>Attack Type</th>
            <th>Attack Target</th>
            <th>Damage Type</th>
            <th>Splash Radius</th>
            <th>Housing Space</th>
            <th>Training Time (s)</th>
            <th>Movement Speed</th>
            <th>Attack Speed (s)</th>
            <th>Barracks Level</th>
            <th>Range (tiles)</th>
            <th>Search Radius (tiles)</th>
            <th>Max Level</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="combatUnitsGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Combat Units From Google Spreadsheet</h3>

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

        <table id="combatUnitsGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:8%">Unit</th>
            <th>Unit Group</th>
            <th>Preferred Target</th>
            <th>Preferred Target Damage</th>
            <th>Attack Type</th>
            <th>Attack Target</th>
            <th>Damage Type</th>
            <th>Splash Radius</th>
            <th>Housing Space</th>
            <th>Training Time (s)</th>
            <th>Movement Speed</th>
            <th>Attack Speed (s)</th>
            <th>Barracks Level</th>
            <th>Range (tiles)</th>
            <th>Search Radius (tiles)</th>
            <th>Max Level</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="combatUnitsGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Defensive Buildings-->
<div id="defensiveBuildingsWrap">
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

          <form role="form" class="form-horizontal validate" id="defensiveBuildingsGGSSForm" name="defensiveBuildingsGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="defensiveBuildingsGGSSUrl" name="defensiveBuildingsGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="defensiveBuildingsViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>

        </div>
      </div>
    </div>
  </div>

  <div id="defensiveBuildingsDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Defensive Buildings from Database</h3>

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

        <table id="defensiveBuildingsDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:6%">Unit</th>
            <th>Range Start</th>
            <th>Range End</th>
            <th>Explode Time</th>
            <th>Attack Speed (s)</th>
            <th>Damage Type</th>
            <th>Damage Radius</th>
            <th>Unit Type Targeted</th>
            <th>Preferred Target</th>
            <th>Preferred Target Bonus</th>
            <th>Number of Rounds</th>
            <th>Max Level</th>
            <th>Size Limit</th>
            <th>Air Range</th>
            <th>Unit Type</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="defensiveBuildingsGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Defensive Buildings From Google Spreadsheet</h3>

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

        <table id="defensiveBuildingsGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:6%">Unit</th>
            <th>Range Start</th>
            <th>Range End</th>
            <th>Explode Time</th>
            <th>Attack Speed (s)</th>
            <th>Damage Type</th>
            <th>Damage Radius</th>
            <th>Unit Type Targeted</th>
            <th>Preferred Target</th>
            <th>Preferred Target Bonus</th>
            <th>Number of Rounds</th>
            <th>Max Level</th>
            <th>Size Limit</th>
            <th>Air Range</th>
            <th>Unit Type</th>
            <th style="width:6%">Note</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="defensiveBuildingsGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Defensive Building Level-->
<div id="defensiveBuildingLevelWrap">
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

          <form role="form" class="form-horizontal validate" id="defensiveBuildingLevelGGSSForm" name="defensiveBuildingLevelGGSSForm" method="post">
            <div class="form-group">
        """),
format.raw("""      <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="defensiveBuildingLevelGGSSUrl" name="defensiveBuildingLevelGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="defensiveBuildingLevelViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="defensiveBuildingLevelDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Defensive Building Level from Database</h3>

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

        <table id="defensiveBuildingLevelDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level</th>
            <th>Damage per Second</th>
            <th>Damage per Shot</th>
            <th>Damage Radius</th>
            <th>Hit Points</th>
            <th>Cost Gold</th>
            <th>Cost Elixir</th>
            <th>Cost Dark Elixir</th>
            <th>Sell Gold</th>
            <th>Sell Dark Elixir</th>
            <th>Upgrade Time</th>
            <th>Experience Gained</th>
            <th>Town Hall Level Required</th>
            <th>Object Type</th>
            <th>Cost To Load</th>
            <th>Prefab Name</th>
            <th>Display Name</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>

          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="defensiveBuildingLevelGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Defensive Buildings From Google Spreadsheet</h3>

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

        <table id="defensiveBuildingLevelGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level</th>
            <th>Damage per Second</th>
            <th>Damage per Shot</th>
            <th>Damage Radius</th>
            <th>Hit Points</th>
            <th>Cost Gold</th>
            <th>Cost Elixir</th>
            <th>Cost Dark Elixir</th>
            <th>Sell Gold</th>
            <th>Sell Dark Elixir</th>
            <th>Upgrade Time</th>
            <th>Experience Gained</th>
            <th>Town Hall Level Required</th>
            <th>Object Type</th>
            <th>Cost To Load</th>
            <th>Prefab Name</th>
            <th>Display Name</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="defensiveBuildingLevelGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Resource Buildings-->
<div id="resourceBuildingsWrap">
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

          <form role="form" class="form-horizontal validate" id="resourceBuildingsGGSSForm" name="resourceBuildingsGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="resourceBuildingsGGSSUrl" name="resourceBuildingsGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="resourceBuildingsViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="resourceBuildingsDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Resource Buildings from Database</h3>

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

        <table id="resourceBuildingsDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Note</th>
            <th>Type</th>
            <th>Level</th>
            <th>Build Cost Elixir</th>
            <th>Build Cost Gold</th>
            <th>Build Cost Gem</th>
            <th>Build Time<br />(minutes)</th>
            <th>Experience Gained</th>
            <th>Capacity</th>
            <th>Production Rates</th>
            <th>Hit Points</th>
            <th>Town Hall Level Required</th>
            <th>Boost Cost (Gems)</th>
            <th>Max Level</th>
            <th>Object Type</th>
            <th>Collectable Point</th>
            <th>PrefabName</th>
            <th>Display Name</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="resourceBuildingsGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Resource Buildings From Google Spreadsheet</h3>

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

        <table id="resourceBuildingsGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Note</th>
            <th>Type</th>
            <th>Level</th>
            <th>Build Cost Elixir</th>
            <th>Build Cost Gold</th>
            <th>Build Cost Gem</th>
            <th>Build Time<br />(minutes)</th>
            <th>Experience Gained</th>
            <th>Capacity</th>
            <th>Production Rates</th>
            <th>Hit Points</th>
            <th>Town Hall Level Required</th>
            <th>Boost Cost (Gems)</th>
            <th>Max Level</th>
            <th>Object Type</th>
            <th>Collectable Point</th>
            <th>PrefabName</th>
            <th>Display Name</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>
            <th>Note</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="resourceBuildingsGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Army Buildings-->
<div id="armyBuildingsWrap">
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

          <form role="form" class="form-horizontal validate" id="armyBuildingsGGSSForm" name="armyBuildingsGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="armyBuildingsGGSSUrl" name="ggssUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="armyBuildingsViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="armyBuildingsDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Army Building Level from Database</h3>

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

        <table id="armyBuildingsDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Note</th>
            <th>Type</th>
            <th>Level</th>
            <th>Build Cost Elixir</th>
            <th>Build Cost Dark Elixir</th>
            <th>Build Time<br />(minutes)</th>
            <th>Experience Gained</th>
            <th>Capacity</th>
            <th>Hit Points</th>
            <th>Maximum Unit Queue</th>
            <th>Unlock Unit</th>
            <th>Unlock Spell</th>
            <th>Town Hall Level Required</th>
            <th>Max Level</th>
            <th>Object Type</th>
            <th>Boost Cost<br />(Gems)</th>
            <th>PrefabName</th>
            <th>Display Name</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="armyBuildingsGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Army Buildings From Google Spreadsheet</h3>

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

        <table id="armyBuildingsGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Note</th>
            <th>Type</th>
            <th>Level</th>
            <th>Build Cost Elixir</th>
            <th>Build Cost Dark Elixir</th>
            <th>Build Time<br />(minutes)</th>
            <th>Experience Gained</th>
            <th>Capacity</th>
            <th>Hit Points</th>
            <th>Maximum Unit Queue</th>
            <th>Unlock Unit</th>
            <th>Unlock Spell</th>
            <th>Town Hall Level Required</th>
            <th>Max Level</th>
            <th>Object Type</th>
            <th>Boost Cost<br />(Gems)</th>
            <th>PrefabName</th>
            <th>Display Name</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>
            <th>Note</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="armyBuildingsGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Other Buildings-->
<div id="otherBuildingsWrap">
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

          <form role="form" class="form-horizontal validate" id="otherBuildingsGGSSForm" name="otherBuildingsGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="otherBuildingsGGSSUrl" name="otherBuildingsGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="otherBuildingsViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="otherBuildingsDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Other Buildings from Database</h3>

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

        <table id="otherBuildingsDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Note</th>
            <th>Type</th>
            <th>Level</th>
            <th>Build Cost Gold</th>
            <th>Build Cost Gem</th>
            <th>Build Time<br />(minutes)</th>
            <th>Experience Gained</th>
            <th>Capacity</th>
            <th>Hit Points</th>
            <th>Town Hall Level Required</th>
            <th>Max Level</th>
            <th>Object Type</th>
            <th>PrefabName</th>
            <th>Display Name</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="otherBuildingsGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Other Buildings From Google Spreadsheet</h3>

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

        <table id="otherBuildingsGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Note</th>
            <th>Type</th>
            <th>Level</th>
            <th>Build Cost Gold</th>
            <th>Build Cost Gem</th>
            <th>Build Time<br />(minutes)</th>
            <th>Experience Gained</th>
            <th>Capacity</th>
            <th>Hit Points</th>
            <th>Town Hall Level Required</th>
            <th>Max Level</th>
            <th>Object Type</th>
            <th>PrefabName</th>
            <th>Display Name</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>
            <th>Note</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="otherBuildingsGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Town Hall Level-->
<div id="townHallLevelWrap">
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

          <form role="form" class="form-horizontal validate" id="townHallLevelGGSSForm" name="townHallLevelGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="townHallLevelGGSSUrl" name="townHallLevelGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="townHallLevelViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="townHallLevelDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Town Hall Level from Database</h3>

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

        <table id="townHallLevelDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level 1</th>
            <th>Level 2</th>
            <th>Level 3</th>
            <th>Level 4</th>
            <th>Level 5</th>
            <th>Level 6</th>
            <th>Level 7</th>
            <th>Level 8</th>
            <th>Level 9</th>
          </tr>
          """),
format.raw("""</thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="townHallLevelGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Town Hall Level From Google Spreadsheet</h3>

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

        <table id="townHallLevelGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level 1</th>
            <th>Level 2</th>
            <th>Level 3</th>
            <th>Level 4</th>
            <th>Level 5</th>
            <th>Level 6</th>
            <th>Level 7</th>
            <th>Level 8</th>
            <th>Level 9</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="townHallLevelGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Decorations-->
<div id="decorationsWrap">
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

          <form role="form" class="form-horizontal validate" id="decorationsGGSSForm" name="decorationsGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="decorationsGGSSUrl" name="decorationsGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="decorationsViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="decorationsDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Decorations from Database</h3>

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

        <table id="decorationsDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Note</th>
            <th>Type</th>
            <th>Build Cost Elixir</th>
            <th>Build Cost Dark Elixir</th>
            <th>Build Cost Gold</th>
            <th>Build Cost Gem</th>
            <th>Level Require</th>
            <th>Object Type</th>
            <th>PrefabName</th>
            <th>DisplayName</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="decorationsGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Decorations From Google Spreadsheet</h3>

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

        <table id="decorationsGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Note</th>
            <th>Type</th>
            <th>Build Cost Elixir</th>
            <th>Build Cost Dark Elixir</th>
            <th>Build Cost Gold</th>
            <th>Build Cost Gem</th>
            <th>Level Require</th>
            <th>Object Type</th>
            <th>PrefabName</th>
            <th>DisplayName</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>
            <th>Note</th>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="decorationsGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Spells-->
<div id="spellsWrap">
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

          <form role="form" class="form-horizontal validate" id="spellsGGSSForm" name="spellsGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="spellsGGSSUrl" name="spellsGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="spellsViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>

        </div>
      </div>
    </div>
  </div>

  <div id="spellsDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Spells from Database</h3>

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

        <table id="spellsDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type Name</th>
            <th>Type</th>
            <th>Radius</th>
            <th>Strike Area</th>
            <th>Numb of Strike</th>
            <th>Time between strikes(s)</th>
            <th>Time to create(min)</th>
            <th>Boost Time</th>
            <th>Spell Factory level require</th>
            <th>Max Level</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="spellsGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Spells From Google Spreadsheet</h3>

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

        <table id="spellsGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type Name</th>
            <th>Type</th>
            <th>Radius</th>
            <th>Strike Area</th>
            <th>Numb of Strike</th>
            <th>Time between strikes(s)</th>
            <th>Time to create(min)</th>
            <th>Boost Time</th>
            <th>Spell Factory level require</th>
            <th>Max Level</th>
            <th>Note</th>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="spellsGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Spell Levels-->
<div id="spellLevelsWrap">
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
          <form role="form" class="form-horizontal validate" id="spellLevelsGGSSForm" name="spellLevelsGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="spellLevelsGGSSUrl" name="spellLevelsGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="spellLevelsViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="spellLevelsDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Spell Levels from Database</h3>

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

        <table id="spellLevelsDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level</th>
            <th>Build Cost Gold</th>
            <th>Upgrade Cost Water</th>
            <th>Upgrade Time(hours)</th>
            <th>Lab Level Require</th>
            <th>Total Damage</th>
            <th>Damage Per Strike</th>
            <th>Damage Boost(%)</th>
            <th>Speed Boost</th>
            <th>Size Limit</th>
            <th>Duration</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="spellLevelsGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Spell Levels From Google Spreadsheet</h3>

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

        <table id="spellLevelsGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level</th>
            <th>Build Cost Gold</th>
            <th>Upgrade Cost Water</th>
            <th>Upgrade Time(hours)</th>
            <th>Lab Level Require</th>
            <th>Total Damage</th>
            <th>Damage Per Strike</th>
            <th>Damage Boost(%)</th>
            <th>Speed Boost</th>
            <th>Size Limit</th>
            <th>Duration</th>
            <th>Note</th>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="spellLevelsGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Obstacles-->
<div id="obstaclesWrap">
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
          <form role="form" class="form-horizontal validate" id="obstaclesGGSSForm" name="obstaclesGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="obstaclesGGSSUrl" name="obstaclesGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="obstaclesViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="obstaclesDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Obstacles from Database</h3>

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

        <table id="obstaclesDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type Name</th>
            <th>Type</th>
            <th>Removal time</th>
            <th>Experience Gained</th>
            <th>Removal Cost Gold</th>
            <th>Removal Cost Elixir</th>
            <th>Respawn Weight</th>
            <th>Removal Benefit Elixir</th>
            <th>Removal Benefit Dark Elixir</th>
            <th>Init Position</th>
            <th>Object Type</th>
            <th>PrefabName</th>
            <th>DisplayName</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="obstaclesGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Obstacles From Google Spreadsheet</h3>

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

        <table id="obstaclesGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type Name</th>
            <th>Type</th>
            <th>Removal time</th>
            <th>Experience Gained</th>
            <th>Removal Cost Gold</th>
            <th>Removal Cost Elixir</th>
            <th>Respawn Weight</th>
            <th>Removal Benefit Elixir</th>
            <th>Removal Benefit Dark Elixir</th>
            <th>Init Position</th>
            <th>Object Type</th>
            <th>PrefabName</th>
            <th>DisplayName</th>
            <th>NumTileOneSide</th>
            <th>HasBase</th>
            <th>Note</th>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="obstaclesGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--Trophy-->
<div id="trophyWrap">
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
          <form role="form" class="form-horizontal validate" id="trophyGGSSForm" name="trophyGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="trophyGGSSUrl" name="ggssUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="trophyViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="trophyDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Trophy from Database</h3>

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

        <table id="trophyDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Trophy difference</th>
            <th>High</th>
            <th>Low</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="trophyGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Trophy Google Spreadsheet</h3>

        <div class="panel-options">
          <a href="" data-toggle="panel">
   """),
format.raw("""         <span class="collapse-icon">&ndash;</span>
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

        <table id="trophyGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Trophy difference</th>
            <th>High</th>
            <th>Low</th>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="trophyGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>
</div>

<!--achievements-->
<div id="achievementsWrap">
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

          <form role="form" class="form-horizontal validate" id="achievementsGGSSForm" name="achievementsGGSSForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="achievementsGGSSUrl" name="achievementsGGSSUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="achievementsViewGGSSBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

  <div id="achievementsDB">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Achievements from Database</h3>

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

        <table id="achievementsDBTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Star</th>
            <th>Name</th>
            <th>Description</th>
            <th>Exp reward</th>
            <th>Gem reward</th>
            <th>Required quantity</th>
          </tr>
          </thead>

          <tbody>

          </tbody>
        </table>

      </div>
    </div>
  </div>

  <div id="achievementsGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Achievements Google Spreadsheet</h3>

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

        <table id="achievementsGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Star</th>
            <th>Name</th>
            <th>Description</th>
            <th>Exp reward</th>
            <th>Gem reward</th>
            <th>Required quantity</th>
            <th>Note</th>
          </thead>

          <tbody>

          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="achievementsGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
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
object gamedata extends gamedata_Scope0.gamedata
              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 14:15:11 ICT 2015
                  SOURCE: /Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/app/views/gamedata.scala.html
                  HASH: 67c0c69bab63bfc6b8801cafaab8d4ca56bee58b
                  MATRIX: 833->0
                  LINES: 32->1
                  -- GENERATED --
              */
          