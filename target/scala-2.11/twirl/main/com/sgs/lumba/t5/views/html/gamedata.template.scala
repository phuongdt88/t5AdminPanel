
package com.sgs.lumba.t5.views.html

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

<!-- <page-title ng-if="layoutOptions.pageTitles" title="Game Data" description=""></page-title> -->

<nav class="navbar navbar-inverse" role="navigation">
  <!-- Brand and toggle get grouped for better mobile display -->

  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
    <ul class="nav navbar-nav">
      <li class="active">
        <a href="" id="arenaReferenceLink">Arena Reference</a>
      </li>
      <li>
        <a href="" id="cardBuildingLink">Card Buildings</a>
      </li>
      <li>
        <a href="" id="cardBuildingLevelLink">Card Building Level</a>
      </li>
      <li>
        <a href="" id="cardTroopLink">Card Troop</a>
      </li>
      <li>
        <a href="" id="cardTroopLevelLink">Card Troop Level</a>
      </li>
      <li>
        <a href="" id="cardSpellLink">Card Spell</a>
      </li>
      <li>
        <a href="" id="cardSpellLevelLink">Card Spell Level</a>
      </li>
      <li>
        <a href="" id="buildingLink">Buildings</a>
      </li>
      <li>
        <a href="" id="buildingLevelLink">Building Level</a>
      </li>
      <li>
        <a href="" id="troopLink">Troops</a>
      </li>
      <li>
        <a href="" id="troopLevelLink">Troop Level</a>
      </li>
      <li>
        <a href="" id="spellLink">Spells</a>
      </li>
      <li>
        <a href="" id="spellLevelLink">Spell Level</a>
      </li>
      <li>
        <a href="" id="chestSequenceLink">Chest Sequence</a>
      </li>
      <li>
        <a href="" id="achievementLink">Achievements</a>
      </li>
      <li>
        <a href="" id="donationLink">Donations</a>
      </li>
      <li>
        <a href="" id="requestLink">Requests</a>
      </li>
      <li>
        <a href="" id="chestDataLink">Chest Data</a>
      </li>
      <li>
        <a href="" id="tribeDaggerRankLink">Tribe Dagger Rank</a>
      </li>
      <li>
        <a href="" id="dataConstantLink">Data Constans</a>
      </li>
      <li>
        <a href="" id="chestProbabilityLink">Chest Probability</a>
      </li>
      <li>
        <a href="" id="loserDaggerModifierLink">Loser Dagger Modifier</a>
      </li>
      <li>
        <a href="" id="freeGemSequenceLink">Free Gems Sequence</a>
      </li>
      <li>
        <a href="" id="crownGemSequenceLink">Crown Gems Sequence</a>
      </li>
      <li>
        <a href="" id="tvRoyaleLink">TV Royale</a>
      </li>
      <li>
        <a href="" id="towerLevelLink">Tower Level</a>
      </li>
      <li>
        <a href="" id="shopCardPriceLink">Shop Card Prices</a>
      </li>
      <li>
        <a href="" id="unitEffectLink">Unit Effects</a>
      </li>
      <li>
        <a href="" id="unitSoundFXLink">Unit Sound FX</a>
      </li>
    </ul>

  </div>
  <!-- /.navbar-collapse -->
</nav>



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
          <form role="form" class="form-horizontal validate" id="ggssForm" name="ggssForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label">Google Spreadsheet URL</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" id="ggssUrl" name="ggssUrl" data-validate="required" data-message-required="Please enter a Google Spreadsheet URL" style="width:45%" value="https://docs.google.com/spreadsheets/d/1Gw0Z3L6rQ8qohUmkauHMmFxCmwfqgekJw6vFzqbpM8g/edit#gid=0">
              </div>
            </div>
            <button class="btn btn btn-turquoise" id="ggssViewBtn" style="width:17%;margin-left:17%;">View</button>
          </form>
        </div>
      </div>
    </div>
  </div>

<div id="arenaReferenceWrap">
  <div id = "currentArenaReference">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Arena Reference</h3>
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
        <table id="arenaReferenceTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Name</th>
            <th>Require Trophy</th>
            <th>Sprite Name</th>
            <th>Order Name</th>
            <th>Match Min</th>
            <th>Match Max</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="arenaRefExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="arenaRefExportBtn" name="exportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="arenaReferenceGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Arena Reference From Google Spreadsheet</h3>

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

        <table id="arenaReferenceGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Name</th>
            <th>Require Trophy</th>
            <th>Sprite Name</th>
            <th>Order Name</th>
            <th>Match Min</th>
            <th>Match Max</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="arenaReferenceGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="cardBuildingWrap">

  <div id="currentCardBuilding">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Card Buildings</h3>
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
        <table id="cardBuildingTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:10%">Type</th>
            <th>Card Name</th>
            <th style="width:15%">Sprite Name</th>
            <th>Unlock Arena</th>
            <th>Rarity</th>
            <th>Mana Cost</th>
            <th>Summon Troop Type</th>
            <th>Summon Troop Number</th>
            <th>Display Statistics</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="cardBuildingExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="cardBuildingExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="cardBuildingGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Card Buildings From Google Spreadsheet</h3>

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

        <table id="cardBuildingGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:10%">Type</th>
            <th>Card Name</th>
            <th style="width:15%">Sprite Name</th>
            <th>Unlock Arena</th>
            <th>Rarity</th>
            <th>Mana Cost</th>
            <th>Summon Troop Type</th>
            <th>Summon Troop Number</th>
            <th>Display Statistics</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="cardBuildingGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="cardBuildingLevelWrap">

  <div id="currentCardBuildingLevel">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Card Building Level</h3>
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
        <table id="cardBuildingLevelTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level</th>
            <th>Card Needed</th>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="cardBuildingLevelExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="cardBuildingLevelExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="cardBuildingLevelGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Card Building Level From Google Spreadsheet</h3>

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

        <table id="cardBuildingLevelGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level</th>
            <th>Card Needed</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="cardBuildingLevelGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="cardTroopWrap">

  <div id="currentCardTroop">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Card Troops</h3>
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
        <table id="cardTroopTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:10%">Type</th>
            <th>Card Name</th>
            <th style="width:15%">Sprite Name</th>
            <th>Unlock Arena</th>
            <th>Rarity</th>
            <th>Mana Cost</th>
            <th>Summon Troop Type</th>
            <th>Summon Troop Number</th>
            <th>Display Statistics</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="cardTroopExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="cardTroopExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="cardTroopGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Card Troops From Google Spreadsheet</h3>

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

        <table id="cardTroopGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:10%">Type</th>
            <th>Card Name</th>
            <th style="width:15%">Sprite Name</th>
            <th>Unlock Arena</th>
            <th>Rarity</th>
            <th>Mana Cost</th>
            <th>Summon Troop Type</th>
            <th>Summon Troop Number</th>
            <th>Display Statistics</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="cardTroopGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="cardTroopLevelWrap">

  <div id="currentCardTroopLevel">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Card Troop Level</h3>
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
        <table id="cardTroopLevelTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level</th>
            <th>Card Needed</th>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="cardTroopLevelExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="cardTroopLevelExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="cardTroopLevelGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Card Troop Level From Google Spreadsheet</h3>

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

        <table id="cardTroopLevelGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level</th>
            <th>Card Needed</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="cardTroopLevelGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="cardSpellWrap">

  <div id="currentCardSpell">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Card Spells</h3>
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
        <table id="cardSpellTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:10%">Type</th>
            <th>Card Name</th>
            <th style="width:15%">Sprite Name</th>
            <th>Unlock Arena</th>
            <th>Rarity</th>
            <th>Mana Cost</th>
            <th>Summon Troop Type</th>
            <th>Summon Troop Number</th>
            <th>Display Statistics</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div clas"""),
format.raw("""s="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="cardSpellExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="cardSpellExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="cardSpellGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Card Spell From Google Spreadsheet</h3>

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

        <table id="cardSpellGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:10%">Type</th>
            <th>Card Name</th>
            <th style="width:15%">Sprite Name</th>
            <th>Unlock Arena</th>
            <th>Rarity</th>
            <th>Mana Cost</th>
            <th>Summon Troop Type</th>
            <th>Summon Troop Number</th>
            <th>Display Statistics</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="cardSpellGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="cardSpellLevelWrap">

  <div id="currentCardSpellLevel">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Card Spell Level</h3>
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
        <table id="cardSpellLevelTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level</th>
            <th>Card Needed</th>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="cardSpellLevelExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="cardSpellLevelExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="cardSpellLevelGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Card Spell Level From Google Spreadsheet</h3>

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

        <table id="cardSpellLevelGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Level</th>
            <th>Card Needed</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="cardSpellLevelGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="buildingWrap">

  <div id="currentBuilding">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Buildings</h3>
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
        <table id="buildingTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:5%">Type</th>
            <th>Deploy Time</th>
            <th>Sight Range</th>
            <th>Range</th>
            <th>Charge Range</th>
            <th>Speed</th>
            <th>Hit Speed</th>
            <th>Load Time</th>
            <th>Attacks Ground</th>
            <th>Attacks Air</th>
            <th>Target Only Buildings</th>
            <th>Death Damage Radius</th>
            <th>Death Push Back</th>
            <th>Pushback</th>
            <th>Ignore Pushback</th>
            <th>Collision Radius</th>
            <th>Mass</th>
            <th>Spawn Start Time</th>
            <th>Spawn Interval</th>
            <th>Spawn Number</th>
            <th>Spawn Limit</th>
            <th>Spawn Pause Time</th>
            <th>Spawn Character Level Index</th>
            <th>Spawn Character</th>
            <th>Life Time</th>
            <th>Radius</th>
            <th>HealthBar Offset</th>
            <th>Deploy Effect</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="buildingExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="buildingExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="buildingGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Building From Google Spreadsheet</h3>

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

        <table id="buildingGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:5%">Type</th>
            <th>Deploy Time</th>
            <th>Sight Range</th>
            <th>Range</th>
            <th>Charge Range</th>
            <th>Speed</th>
            <th>Hit Speed</th>
            <th>Load Time</th>
            <th>Attacks Ground</th>
            <th>Attacks Air</th>
            <th>Target Only Buildings</th>
            <th>Death Damage Radius</th>
            <th>Death Push Back</th>
            <th>Pushback</th>
            <th>Ignore Pushback</th>
            <th>Collision Radius</th>
            <th>Mass</th>
            <th>Spawn Start Time</th>
            <th>Spawn Interval</th>
            <th>Spawn Number</th>
            <th>Spawn Limit</th>
            <th>Spawn Pause Time</th>
            <th>Spawn Character Level Index</th>
            <th>Spawn Character</th>
            <th>Life Time</th>
            <th>Radius</th>
            <th>HealthBar Offset</th>
            <th>Deploy Effect</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="buildingGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="troopWrap">

  <div id="currentTroop">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Troops</h3>
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
        <table id="troopTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:5%">Type</th>
            <th>Deploy Time</th>
            <th>Sight Range</th>
            <th>Range</th>
            <th>Charge Range</th>
            <th>Speed</th>
            <th>Hit Speed</th>
            <th>Load Time</th>
            <th>Attacks Ground</th>
            <th>Attacks Air</th>
            <th>Target Only Buildings</th>
            <th>Death Damage Radius</th>
            <th>Death Push Back</th>
            <th>Pushback</th>
            <th>Ignore Pushback</th>
            <th>Collision Radius</th>
            <th>Mass</th>
            <th>Spawn Start Time</th>
            <th>Spawn Interval</th>
            <th>Spawn Number</th>
            <th>Spawn Limit</th>
            <th>Spawn Pause Time</th>
            <th>Spawn Character Level Index</th>
            <th>Spawn Character</th>
            <th>Life Time</th>
            <th>Radius</th>
            <th>HealthBar Offset</th>
            <th>Deploy Effect</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="troopExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="troopExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="troopGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Troop From Google Spreadsheet</h3>

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

        <table id="troopGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:5%">Type</th>
            <th>Deploy Time</th>
            <th>Sight Range</th>
            <th>Range</th>
            <th>Charge Range</th>
            <th>Speed</th>
            <th>Hit Speed</th>
            <th>Load Time</th>
            <th>Attacks Ground</th>
            <th>Attacks Air</th>
            <th>Target Only Buildings</th>
            <th>Death Damage Radius</th>
            <th>Death Push Back</th>
            <th>Pushback</th>
            <th>Ignore Pushback</th>
            <th>Collision Radius</th>
            <th>Mass</th>
            <th>Spawn Start Time</th>
            <th>Spawn Interval</th>
            <th>Spawn Number</th>
            <th>Spawn Limit</th>
            <th>Spawn Pause Time</th>
            <th>Spawn Character Level Index</th>
            <th>Spawn Character</th>
            <th>Life Time</th>
            <th>Radius</th>
            <th>HealthBar Offset</th>
            <th>Deploy Effect</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="troopGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="spellWrap">

  <div id="currentSpell">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Spell</h3>
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
        <table id="spellTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:5%">Type</th>
            <th>Deploy Time</th>
            <th>Sight Range</th>
            <th>Range</th>
            <th>Charge Range</th>
            <th>Speed</th>
            <th>Hit Speed</th>
            <th>Load Time</th>
            <th>Attacks Ground</th>
            <th>Attacks Air</th>
            <th>Target Only Buildings</th>
            <th>Death Damage Radius</th>
            <th>Death Push Back</th>
            <th>Pushback</th>
            <th>Ignore Pushback</th>
            <th>Collision Radius</th>
            <th>Mass</th>
            <th>Spawn Start Time</th>
            <th>Spawn Interval</th>
            <th>Spawn Number</th>
            <th>Spawn Limit</th>
            <th>Spawn Pause Time</th>
            <th>Spawn Character Level Index</th>
            <th>Spawn Character</th>
            <th>Life Time</th>
            <th>Radius</th>
            <th>HealthBar Offset</th>
            <th>Deploy Effect</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="spellExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="spellExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="spellGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Spell From Google Spreadsheet</h3>

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

        <table id="spellGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:5%">Type</th>
            <th>Deploy Time</th>
            <th>Sight Range</th>
            <th>Range</th>
            <th>Charge Range</th>
            <th>Speed</th>
            <th>Hit Speed</th>
            <th>Load Time</th>
            <th>Attacks Ground</th>
            <th>Attacks Air</th>
            <th>Target Only Buildings</th>
            <th>Death Damage Radius</th>
            <th>Death Push Back</th>
            <th>Pushback</th>
            <th>Ignore Pushback</th>
            <th>Collision Radius</th>
            <th>Mass</th>
            <th>Spawn Start Time</th>
            <th>Spawn Interval</th>
            <th>Spawn Number</th>
            <th>Spawn Limit</th>
            <th>Spawn Pause Time</th>
            <th>Spawn Character Level Index</th>
            <th>Spawn Character</th>
            <th>Life Time</th>
            <th>Radius</th>
            <th>HealthBar Offset</th>
            <th>Deploy Effect</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="spellGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="buildingLevelWrap">

  <div id="currentBuildingLevel">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Building Level</h3>
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
        <table id="buildingLevelTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type Level</th>
            <th>Hitpoints</th>
            <th>Damage</th>
            <th>Damage per second</th>
            <th>Death Damage  </th>
            <th>Production Speed</th>
            <th>Duration</th>
            <th>Area Damage</th>
            <th>Crown Tower Damage</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="buildingLevelExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="buildingLevelExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="buildingLevelGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Building Level From Google Spreadsheet</h3>

        <div class="panel-options">
          <a href="" data-toggle="panel">
            <span class="collapse-icon">&ndash;</span>
            <span class="expand-icon">+</span>
          </a>
          <a href="" data-toggle="remove">
            &times;
          </a>
          <a href="" data-toggle="reload">
  """),
format.raw("""          <i class="fa-rotate-right"></i>
          </a>
        </div>
      </div>
      <div class="panel-body">

        <table id="buildingLevelGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type Level</th>
            <th>Hitpoints</th>
            <th>Damage</th>
            <th>Damage per second</th>
            <th>Death Damage  </th>
            <th>Production Speed</th>
            <th>Duration</th>
            <th>Area Damage</th>
            <th>Crown Tower Damage</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="buildingLevelGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="troopLevelWrap">

  <div id="currentTroopLevel">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Troop Level</h3>
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
        <table id="troopLevelTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type Level</th>
            <th>Hitpoints</th>
            <th>Damage</th>
            <th>Damage per second</th>
            <th>Death Damage  </th>
            <th>Production Speed</th>
            <th>Duration</th>
            <th>Area Damage</th>
            <th>Crown Tower Damage</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="troopLevelExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="troopLevelExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="troopLevelGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Troop Level From Google Spreadsheet</h3>

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

        <table id="troopLevelGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type Level</th>
            <th>Hitpoints</th>
            <th>Damage</th>
            <th>Damage per second</th>
            <th>Death Damage  </th>
            <th>Production Speed</th>
            <th>Duration</th>
            <th>Area Damage</th>
            <th>Crown Tower Damage</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="troopLevelGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="spellLevelWrap">

  <div id="currentSpellLevel">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Spell Level</h3>
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
        <table id="spellLevelTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type Level</th>
            <th>Hitpoints</th>
            <th>Damage</th>
            <th>Damage per second</th>
            <th>Death Damage  </th>
            <th>Production Speed</th>
            <th>Duration</th>
            <th>Area Damage</th>
            <th>Crown Tower Damage</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="spellLevelExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="spellLevelExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="spellLevelGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Spell Level From Google Spreadsheet</h3>

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

        <table id="spellLevelGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type Level</th>
            <th>Hitpoints</th>
            <th>Damage</th>
            <th>Damage per second</th>
            <th>Death Damage  </th>
            <th>Production Speed</th>
            <th>Duration</th>
            <th>Area Damage</th>
            <th>Crown Tower Damage</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="spellLevelGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="chestSequenceWrap">

  <div id = "currentChestSequence">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Chest Sequence</h3>
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
        <table id="chestSequenceTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Number</th>
            <th>Chest Type</th>
            <th>Description</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="chestSequenceExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="chestSequenceExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="chestSequenceGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Chest Sequence From Google Spreadsheet</h3>

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

        <table id="chestSequenceGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Number</th>
            <th>Chest Type</th>
            <th>Description</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="chestSequenceGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="achievementWrap">

  <div id = "currentAchievement">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Achievements</h3>
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
        <table id="achievementTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Star</th>
            <th>Name</th>
            <th>Description</th>
            <th>Exp Reward</th>
            <th>SG Gem Reward</th>
            <th>T5 Pearl Reward</th>
            <th>Required Quantity</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="achievementExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="achievementExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="achievementGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Achievements From Google Spreadsheet</h3>

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

        <table id="achievementGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Star</th>
            <th>Name</th>
            <th>Description</th>
            <th>Exp Reward</th>
            <th>SG Gem Reward</th>
            <th>T5 Pearl Reward</th>
            <th>Required Quantity</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="achievementGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="donationWrap">

  <div id = "currentDonation">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Donations</h3>
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
        <table id="donationTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Card Rarity</th>
            <th>Donation Limit</th>
            <th>SG Gold</th>
            <th>T5 Gold</th>
            <th>Exp Reward</th>
            <th>Max Donations per Request</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="donationExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="donationExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="donationGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Donations From Google Spreadsheet</h3>

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

        <table id="donationGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Card Rarity</th>
            <th>Donation Limit</th>
            <th>SG Gold</th>
            <th>T5 Gold</th>
            <th>Exp Reward</th>
            <th>Max Donations per Request</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="donationGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="requestWrap">

  <div id = "currentRequest">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Requests</h3>
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
        <table id="requestTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Arena</th>
            <th>Req. Limit Commons</th>
            <th>Req. Limit Rares</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="requestExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="requestExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="requestGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Requests From Google Spreadsheet</h3>

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

        <table id="requestGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Arena</th>
            <th>Req. Limit Commons</th>
            <th>Req. Limit Rares</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="requestGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>


<div id="chestDataWrap">

  <div id = "currentChestData">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Chest Data</h3>
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
        <table id="chestDataTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Chest Type</th>
            <th>Arena</th>
            <th>Total Cards</th>
            <th>SG Gold Min</th>
            <th>SG Gold Max</th>
            <th>T5 Gold Min</th>
            <th>T5 Gold Max</th>
            <th>Total Min</th>
            <th>Total Max</th>
            <th>C Min</th>
            <th>C Max</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="chestDataExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="chestDataExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="chestDataGGSS">
    <div cl"""),
format.raw("""ass="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Chest Data From Google Spreadsheet</h3>

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

        <table id="chestDataGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Chest Type</th>
            <th>Arena</th>
            <th>Total Cards</th>
            <th>SG Gold Min</th>
            <th>SG Gold Max</th>
            <th>T5 Gold Min</th>
            <th>T5 Gold Max</th>
            <th>Total Min</th>
            <th>Total Max</th>
            <th>C Min</th>
            <th>C Max</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="chestDataGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="tribeDaggerRankWrap">

  <div id = "currentTribeDaggerRank">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Tribe Dagger Rank</h3>
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
        <table id="tribeDaggerRankTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Rank Max</th>
            <th>Rank Min</th>
            <th>%Contribution to Tribe Daggers</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="tribeDaggerRankExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="tribeDaggerRankExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="tribeDaggerRankGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Tribe Dagger Rank From Google Spreadsheet</h3>

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

        <table id="tribeDaggerRankGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Rank Max</th>
            <th>Rank Min</th>
            <th>%Contribution to Tribe Daggers</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="tribeDaggerRankGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="dataConstantWrap">

  <div id = "currentDataConstant">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Data Constants</h3>
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
        <table id="dataConstantTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Description</th>
            <th>Value</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="dataConstantExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="dataConstantExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="dataConstantGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Data Constants From Google Spreadsheet</h3>

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

        <table id="dataConstantGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Description</th>
            <th>Value</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="dataConstantGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="chestProbabilityWrap">

  <div id = "currentChestProbability">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Chest Probalities</h3>
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
        <table id="chestProbabilityTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Chest</th>
            <th>Rare</th>
            <th>Epic</th>
            <th>Legendary</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="chestProbabilityExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="chestProbabilityExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="chestProbabilityGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Chest Probalities From Google Spreadsheet</h3>

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

        <table id="chestProbabilityGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Chest</th>
            <th>Rare</th>
            <th>Epic</th>
            <th>Legendary</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="chestProbabilityGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="loserDaggerModifierWrap">

  <div id = "currentLoserDaggerModifier">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Loser Dagger Modifier</h3>
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
        <table id="loserDaggerModifierTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Dagger Difference Min</th>
            <th>Dagger Difference Max</th>
            <th>Modifier</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="loserDaggerModifierExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="loserDaggerModifierExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="loserDaggerModifierGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Loser Dagger Modifier From Google Spreadsheet</h3>

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

        <table id="loserDaggerModifierGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Dagger Difference Min</th>
            <th>Dagger Difference Max</th>
            <th>Modifier</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="loserDaggerModifierGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="freeGemSequenceWrap">

  <div id = "currentFreeGemSequence">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Free Gems Sequence</h3>
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
        <table id="freeGemSequenceTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Sequence #</th>
            <th>SG # of Gems</th>
            <th>T5 # of Pearls</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="freeGemSequenceExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="freeGemSequenceExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="freeGemSequenceGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Free Gems Sequence From Google Spreadsheet</h3>

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

        <table id="freeGemSequenceGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Sequence #</th>
            <th>SG # of Gems</th>
            <th>T5 # of Pearls</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="freeGemSequenceGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="crownGemSequenceWrap">

  <div id = "currentCrownGemSequence">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Crown Gems Sequence</h3>
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
        <table id="crownGemSequenceTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Sequence #</th>
            <th>SG # of Gems</th>
            <th>T5 # of Pearls</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="crownGemSequenceExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="crownGemSequenceExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="crownGemSequenceGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Crown Gems Sequence From Google Spreadsheet</h3>

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

        <table id="crownGemSequenceGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Name</th>
            <th>value</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="crownGemSequenceGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="tvRoyaleWrap">

  <div id = "currentTVRoyale">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current TV Royale</h3>
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
        <table id="tvRoyaleTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Name</th>
            <th>Value</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="tvRoyaleExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="tvRoyaleExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="tvRoyaleGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">TV Royale From Google Spreadsheet</h3>

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

        <table id="tvRoyaleGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Name</th>
            <th>Value</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </tabl"""),
format.raw("""e>
        <button class="publishBtn btn btn-turquoise" id="tvRoyaleGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="towerLevelWrap">

  <div id = "currentTowerLevel">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Tower Level</h3>
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
        <table id="towerLevelTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Level</th>
            <th>Arena Tower HP</th>
            <th>Arena Tower Damage</th>
            <th>King's Tower HP</th>
            <th>King's Tower Damage</th>
            <th>Exp Needed for Next Lvl</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="towerLevelExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="towerLevelExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="towerLevelGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Tower Level From Google Spreadsheet</h3>

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

        <table id="towerLevelGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Level</th>
            <th>Arena Tower HP</th>
            <th>Arena Tower Damage</th>
            <th>King's Tower HP</th>
            <th>King's Tower Damage</th>
            <th>Exp Needed for Next Lvl</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="towerLevelGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="shopCardPriceWrap">

  <div id = "currentShopCardPrice">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Shop Card Prices</h3>
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
        <table id="shopCardPriceTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Quantity</th>
            <th>SG Common</th>
            <th>SG Rare</th>
            <th>SG Epic</th>
            <th>T5 Common</th>
            <th>T5 Rare</th>
            <th>T5 Epic</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="shopCardPriceExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="shopCardPriceExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="shopCardPriceGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Shop Card Prices From Google Spreadsheet</h3>

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

        <table id="shopCardPriceGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Quantity</th>
            <th>SG Common</th>
            <th>SG Rare</th>
            <th>SG Epic</th>
            <th>T5 Common</th>
            <th>T5 Rare</th>
            <th>T5 Epic</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="shopCardPriceGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="unitEffectWrap">

  <div id = "currentUnitEffect">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Unit Effects</h3>
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
        <table id="unitEffectTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Deploy Event</th>
            <th>Attack Event</th>
            <th>Die Event</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="unitEffectExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="unitEffectExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="unitEffectGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Unit Effects From Google Spreadsheet</h3>

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

        <table id="unitEffectGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Deploy Event</th>
            <th>Attack Event</th>
            <th>Die Event</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="unitEffectGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div id="unitSoundFXWrap">

  <div id = "currentUnitSoundFX">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Current Unit Sound FX</h3>
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
        <table id="unitSoundFXTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Deploy Event</th>
            <th>Attack Event</th>
            <th>Die Event</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <div class="form-group">
          <div class="col-sm-6">
            <select class="form-control" id="unitSoundFXExportSelect" name="exportSelect" style="width:30%;float:left">
              <option value="0">Download CSV File</option>
              <option value="1">Export To Google Spreadsheet</option>
              <option value="2">Export To HTML</option>
            </select>
            <button class="btn btn-turquoise" id="unitSoundFXExportBtn" name="exportBtn" style="width:25%;margin-left:1%">Export</button>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="unitSoundFXGGSS">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Unit Sound FX From Google Spreadsheet</h3>

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

        <table id="unitSoundFXGGSSTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th>Type</th>
            <th>Deploy Event</th>
            <th>Attack Event</th>
            <th>Die Event</th>
          </tr>
          </thead>
          <tbody>
          </tbody>
        </table>
        <button class="publishBtn btn btn-turquoise" id="unitSoundFXGGSSPublishBtn" style="width:10%;margin-left:45%;">Publish</button>
      </div>
    </div>
  </div>

</div>

<div class="row">
  <div class="col-sm-12">
    <div style="width: 100%;overflow:auto">
    <div id="CSVTable"> </div>
  </div>
</div>

<div id="publishConfirmDialog" title="Publish">
  Are you sure?
</div>​
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
object gamedata extends gamedata_Scope0.gamedata
              /*
                  -- GENERATED --
                  DATE: Tue May 10 17:17:26 ICT 2016
                  SOURCE: /Users/phuongdt1/Desktop/lumba/t5-admin-panel/app/com/sgs/lumba/t5/views/gamedata.scala.html
                  HASH: fd4daf3e421749b18053797fa87d9b79c6e736b6
                  MATRIX: 850->0
                  LINES: 32->1
                  -- GENERATED --
              */
          