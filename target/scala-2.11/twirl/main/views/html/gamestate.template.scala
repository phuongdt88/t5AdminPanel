
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object gamestate_Scope0 {
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

class gamestate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/gamestate.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="Player Game State" description="Game State"></page-title>

<div class="row">
  <div class="col-sm-12">

    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Search Player</h3>
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

        <form role="form" class="form-horizontal validate" id="searchByUserIdForm" name="searchByUserIdForm" method="post">

          <div class="form-group">
            <div class="col-sm-10">
              <button class="btn btn-turquoise" type="submit" style="float:left;">Search</button>
              <input type="text" class="form-control" id="userId" name="userId" placeholder="Search by UserID" data-validate="required" data-message-required="Please enter an UserID."  style="width:50%" value="">
            </div>
          </div>
        </form>

        <form role="form" class="form-horizontal validate" id="searchUserByNameForm" name="searchUserByNameForm" method="post">

          <div class="form-group">
            <div class="col-sm-10">
              <button class="btn btn-turquoise" type="submit" style="float:left;">Search</button>
              <input type="text" class="form-control" id="name" name="name" placeholder="Search by Player's Name" data-validate="required" data-message-required="Please enter a player's name."  style="width:50%;" value="">
            </div>
          </div>
        </form>

        <form role="form" class="form-horizontal validate" id="searchUserByEmailForm" name="searchUserByEmailForm" method="post">

          <div class="form-group">
            <div class="col-sm-10">
              <button class="btn btn-turquoise" type="submit" style="float:left;">Search</button>
              <input type="text" class="form-control" id="email" name="email" placeholder="Search by Player's Email" data-validate="required" data-message-required="Please enter an email."  style="width:50%;" value="">
            </div>
          </div>
        </form>

        <form role="form" class="form-horizontal validate" id="searchUserByDaggerForm" name="searchUserByDaggerForm" method="post">

          <div class="form-group">
            <div class="col-sm-10">
              <button class="btn btn-turquoise" type="submit" style="float:left;">Search</button>
              <input type="text" class="form-control" id="dagger" name="dagger" placeholder="Search by Player's Daggers" data-validate="required,number" data-message-required="Please enter a dagger number."  style="width:50%;" value="">
            </div>
          </div>
        </form>

      </div>
    </div>
  </div>
</div>

<!--User list-->
<div id="userList">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Results</h3>

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

      <table id="userListTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th>User ID</th>
          <th>Name</th>
          <th>Email</th>
          <th>Daggers</th>
          <th>Detail</th>
        </tr>
        </thead>

        <tbody id="userListResult">

        </tbody>
      </table>

    </div>
  </div>
</div>

<!--result-->
<div id="gameStateResult">
  <div class="row">
    <div class="col-sm-12">

      <div class="panel panel-default">
        <div class="panel-heading">Action</div>
        <div class="panel-body">
          <button class="btn btn-turquoise" id="deleteUser">Delete Player</button>
          <button class="btn btn-turquoise" id="fakeUser">Fake User</button>
          <button class="btn btn-turquoise" id="downloadBattleLog">Download Battle Log</button>
          <br />
          <button class="btn btn-turquoise" id="turnOffShield" style="float:left;">Turn off Shield</button>
          <button class="btn btn-turquoise" id="turnOnShield" style="float:left;">Turn on Shield</button>
          <select class="form-control" id="turnOnShieldTime" style="width:9%;margin-left:18%"></select>
          <br />
          <button class="btn btn-turquoise" id="blockLeaderBoard">Block from Leaderboard</button>
          <button class="btn btn-turquoise" id="blockTribe">Block from Tribe</button>
          <button class="btn btn-turquoise" id="blockSearching">Block from Searching Opponent</button>
          <button class="btn btn-turquoise" id="blockGlobalChat">Block from Global Chat</button>
          <button class="btn btn-turquoise" id="blockAttack">Block from Being Attacked</button>
        </div>
      </div>

    </div>
  </div>

  <!-- Basic Setup -->
  <div class="panel panel-default">
    <form role="form" id="form1" method="post" class="validate">
      <div class="panel-heading">
        <!--<h3 class="panel-title">Basic Setup</h3>-->

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

        <table id="userData" class="table table-striped table-bordered" cellspacing="0" width="100%">
          <thead>
          <tr>
            <th style="width:10%">Game Item</th>
            <th style="width:15%">Player Value</th>
            <th style="width:17%">New Value</th>
            <th style="width:10%">Pending</th>
            <th style="width:17%">Reason</th>
            <th>Note</th>
          </tr>
          </thead>

          <tbody>

          <tr>
            <th>Online Status</th>
            <td><span id="onlineStatusVal"></span></td>
            <td></td>
            <td></td>
            <td></td>
            <td rowspan="10">Write a Note about this user:
              <br />
              <textarea style="width:100%;height:25%;margin-top:2%;margin-bottom:2%;" id="noteForUserTextarea" name="noteForUserTextarea" placeholder="Comment here"></textarea>
              <br />
              <button class="btn-orange btn" id="noteForUserBtn">Write</button>
            </td>
          </tr>
          <tr>
            <th>User ID</th>
            <td><span id="userIdVal"></span></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <th>Name</th>
            <td><span id="nameVal"></span></td>
            <td ><input type="text" class="newValueInput form-control" id="newName" name="newName" placeholder=""></td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <th>Old Names</th>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <th>Email</th>
            <td><span id="emailVal"></span></td>
            <td><input type="text" class="newValueInput form-control" id="newEmail" name="newEmail" placeholder=""></td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <th>Password</th>
            <td><span id="passwordVal"></span></td>
            <td><input type="text" class="newValueInput form-control" id="newPassword" name="newPassword" placeholder=""></td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <th>Locale</th>
            <td><span id="localeVal"></span></td>
            <td><input type="text" class="newValueInput form-control" id="newLocale" name="newLocale" placeholder=""></td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <th>Facebook ID</th>
            <td></td>
            <td ><input type="text" class="newValueInput form-control" id="newFacebookID" name="newFacebookID" placeholder="Insert Facebook ID"></td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <th>Level</th>
            <td><span id="levelVal"></span></td>
            <td >
              <div class="form-group">
                <input type="text" class="newValueInput form-control" id="newLevel" name="newLevel" data-validate="number" placeholder="Add/Subtract. Ex: -1 or 1" />
              </div>
            </td>
            <td></td>
            <td ><input type="text" class="changeReasonInput form-control" id="levelReason" name="levelReason" placeholder="Level Change Reason"></td>
          </tr>
          <tr>
            <th>Exp Points</th>
            <td><span id="expPointsVal"></span></td>
            <td>
              <div class="form-group">
                <input type="text" class="newValueInput form-control" data-validate="number" id="newExp" name="newExp" placeholder="Add/Subtract. Ex: -1 or 1">
              </div>
            </td>
            <td></td>
            <td><input type="text" class="changeReasonInput form-control" id="expReason" name="expReason" placeholder="Exp Change Reason"></td>
          </tr>
          <tr>
            <th>Gold</th>
            <td><span id="goldVal"></span></td>
            <td >
              <div class="form-group">
                <input type="text" class="newValueInput form-control" data-validate="number" id="newGold" name="newGold" placeholder="Add/Subtract. Ex: -1 or 1">
              </div>
            </td>
            <td></td>
            <td ><input type="text" class="changeReasonInput form-control" id="goldReason" name="goldReason" placeholder="Gold Change Reason"></td>
            <td></td>
          </tr>
          <tr>
            <th>Water</th>
            <td><span id="waterVal"></span></td>
            <td >
              <div class="form-group">
                <input type="text" class="newValueInput form-control" data-validate="number" id="newWater" name="newWater" placeholder="Add/Subtract. Ex: -1 or 1">
              </div>
            </td>
            <td></td>
            <td ><input type="text" class="changeReasonInput form-control" id="waterReason" name="waterReason" placeholder="Water Change Reason"></td>
            <td></td>
          </tr>
          <tr>
            <th>Oil</th>
            <td><span id="oilVal"></span></td>
            <td >
              <div class="form-group">
                <input type="text" class="newValueInput form-control" data-validate="number" id="newOil" name="newOil" placeholder="Add/Subtract. Ex: -1 or 1">
              </div>
            </td>
            <td></td>
            <td ><input type="text" class="changeReasonInput form-control" id="oilReason" name="oilReason" placeholder="Oil Change Reason"></td>
            <td></td>
          </tr>
          <tr>
            <th>Pearls</th>
            <td><span id="pearlsVal"></span></td>
            <td >
              <div class="form-group">
                <input type="text" class="newValueInput form-control" data-validate="number"  id="newPearls" name="newPearls" placeholder="Add/Subtract. Ex: -1 or 1">
              </div>
            </td>
            <td></td>
            <td ><input type="text" class="changeReasonInput form-control" id="pearlsReason" name="pearlsReason" placeholder="Pearls Change Reason"></td>
            <td></td>
          </tr>
          <tr>
            <th>Diwan Level</th>
            <td><span id="diwanLvlVal"></span></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <th>Dagger</th>
            <td><span id="daggerVal"></span></td>
            <td>
              <div class="form-group">
                <input type="text" class="newValueInput form-control" data-validate="number" id="newDagger" name="newDagger" placeholder="Add/Subtract. Ex: -1 or 1">
              </div>
            </td>
            <td></td>
            <td ><input type="text" class="changeReasonInput form-control" id="daggerReason" name="daggerReason" placeholder="Dagger Change Reason"></td>
            <td></td>
          </tr>
          <tr>
            <th>Shield</th>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <div>
            <th>isFake</th>
            <td><span id="isFakeVal"></span></td>
            <td>
              <div class="form-group">
                <input type="text" class="newValueInput form-control" data-validate="number" id="newIsFake" name="newIsFake" placeholder="Insert 0 or 1">
              </div>
            </td>
            <td></td>
            <td></td>
            <td></td>
            </tr>
            <tr>
              <th>Belong in Tribe</th>
              <td><span id="tribeVal"></span></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <th>Tribe ID</th>
              <td><span id="tribeIdVal"></span></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <th>Position in Tribe</th>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <th>Version</th>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <th>Is BlueBox</th>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <th>Last Login Time</th>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <th>SFS Version</th>
              <td><span id="sfsVersionVal"></span></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <th>Balancer Version</th>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <th>Created At (GMT+7)</th>
              <td><span id="createdAtVal"></span></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
          </tbody>
        </table>

      </div>
      <div style="width:100%;text-align:center; margin-top:2%">
        <button class="btn btn-turquoise" type="submit" id="userDataSaveBtn">Save</button>
      </div>
    </form>
  </div>

  <!-- Settings -->
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Settings</h3>

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
    <div class="panel-body" style="width:20%">

      <table id="settings" class="table table-striped table-bordered" cellspacing="0" width="100%">

        <tbody>
        <tr>
          <th>Music</th>
          <td><span id="musicVal"></span></td>
        </tr>
        <tr>
          <th>Sound</th>
          <td><span id="soundVal"></span></td>
        </tr>
        </tbody>
      </table>

    </div>
  </div>

  <!-- User's Inbox -->
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">User's Inbox</h3>

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

      <table id="example-2" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th>From User</th>
          <th>User ID</th>
          <th>Clan Name</th>
          <th>Message</th>
          <th>Create At</th>
        </tr>
        </thead>

        <tbody id="inboxMessage">
        </tbody>
      </table>

    </div>
  </div>

  <!-- Purchase History -->
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Purchase History</h3>

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

      <table id="purchaseHistoryTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th>From User</th>
          <th>Diwan Level</th>
          <th>Coins</th>
          <th>Water</th>
          <th>Oil</th>
          <th>Pearls</th>
          <th>Daggers</th>
          <th>Status</th>
          <th>Purchased Pearls</th>
          <th>Purchased Item Id</th>
          <th>Paid Amount</th>
          <th>Currency</th>
          <th>Paid Amount (USD)</th>
          <th>Create At (GMT+7)</th>
          <th>Create At (UTC)</th>
        </tr>
        </thead>

        <tbody>
        <tr>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
        </tr>
        <tr>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
          <td>Demo</td>
        </tr>
        </tbody>
      </table>

    </div>
  </div>

  <!-- Defense Log -->
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Defense Log</h3>

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

      <table id="defenseLogTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th>Attacker</th>
          <th>Attacker UserID</th>
          <th>Gained Trophy</th>
          <th>Defender</th>
          <th>Loot Trophy</th>
          <th>Stars</th>
          <th>Percent Damage</th>
          <th>User Clan ID</th>
          <th>User Clan Name</th>
          <th>Opponent Clan ID</th>
          <th>Opponent Clan Name</th>
          <th>Create At (GMT+7)</th>
          <th>Defender Gained Shield</th>
        </tr>
        </thead>

        <tbody id="defenseLogResult">
        </tbody>
      </table>

    </div>
  </div>

  <!-- """),
format.raw("""Attack Log -->
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Attack Log</h3>

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

      <table id="attackLogTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th>Attacker</th>
          <th>Opponent UserID</th>
          <th>Gained Trophy</th>
          <th>Defender</th>
          <th>Loot Trophy</th>
          <th>Stars</th>
          <th>Percent Damage</th>
          <th>User Clan ID</th>
          <th>User Clan Name</th>
          <th>Opponent Clan ID</th>
          <th>Opponent Clan Name</th>
          <th>Create At (GMT+7)</th>
          <th>Defender Gained Shield</th>
        </tr>
        </thead>

        <tbody id="attackLogResult">
        </tbody>
      </table>

    </div>
  </div>

  <!-- Lumba History -->
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Lumba History</h3>

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

      <table id="lumbaLogTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th>User Char</th>
          <th>Action</th>
          <th>From Email</th>
          <th>To Email</th>
          <th>Pwd Change</th>
          <th>From Name</th>
          <th>Name Change</th>
          <th>Name Change Reason</th>
          <th>From Local</th>
          <th>Local Change</th>
          <th>Local Change Reason</th>
          <th>From Level</th>
          <th>Level Change</th>
          <th>Level Change Reason</th>
          <th>From ExPoint</th>
          <th>ExPoint Change</th>
          <th>ExPoint Change Reason</th>
          <th>From Gold</th>
          <th>Gold Change</th>
          <th>Gold Change Reason</th>
          <th>From Water</th>
          <th>Water Change</th>
          <th>Water Change Reason</th>
          <th>From Oil</th>
          <th>Oil Change</th>
          <th>Oil Change Reason</th>
          <th>From Pearls</th>
          <th>Pearls Change</th>
          <th>Pearls Change Reason</th>
          <th>From Diwan</th>
          <th>Diwan Change</th>
          <th>Diwan Change Reason</th>
          <th>From Dagger</th>
          <th>Dagger Change</th>
          <th>Dagger Change Reason</th>
          <th>From Sheild</th>
          <th>Sheild Change</th>
          <th>Last Mod</th>
          <th>Last Mod (GMT+7)</th>
        </tr>
        </thead>

        <tbody>
        <tr>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>14.81 (2.54%)</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>14.81 (2.54%)</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>14.81 (2.54%)</td>
        </tr>
        <tr>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>14.81 (2.54%)</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>14.81 (2.54%)</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>14.81 (2.54%)</td>
        </tr>
        </tbody>
      </table>

    </div>
  </div>

  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Pearls History</h3>

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

      <table id="example-3" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th>Action Change</th>
          <th>Resource Type</th>
          <th>Amounts</th>
          <th>Rest</th>
          <th>Info</th>
          <th>Create At</th>
          <th>Create At (GMT+7)</th>
        </tr>
        </thead>

        <tbody>
        <tr>
          <th>GOOG <span class="co-name">Google Inc.</span></th>
          <td>597.74</td>
          <td>12:12PM</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
        </tr>
        <tr>
          <th>AAPL <span class="co-name">Apple Inc.</span></th>
          <td>378.94</td>
          <td>12:22PM</td>
          <td>5.74 (1.54%)</td>
          <td>373.20</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
        </tr>
        <tr>
          <th>AMZN <span class="co-name">Amazon.com Inc.</span></th>
          <td>191.55</td>
          <td>12:23PM</td>
          <td>3.16 (1.68%)</td>
          <td>188.39</td>
          <td>14.81 (2.54%)</td>
          <td>582.93</td>
        </tr>
        </tbody>
      </table>

    </div>
  </div>
</div>
<script>
	;(function($)
	"""),format.raw/*869.2*/("""{"""),format.raw/*869.3*/("""
		"""),format.raw/*870.3*/("""$('.table-responsive').responsiveTable();
	"""),format.raw/*871.2*/("""}"""),format.raw/*871.3*/(""")(jQuery);
</script>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object gamestate extends gamestate_Scope0.gamestate
              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 14:15:11 ICT 2015
                  SOURCE: /Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/app/views/gamestate.scala.html
                  HASH: 7ecc2ee4f4df6bbd468bb37f59284c950bf35e61
                  MATRIX: 835->0|27940->27057|27969->27058|28000->27061|28071->27104|28100->27105
                  LINES: 32->1|901->869|901->869|902->870|903->871|903->871
                  -- GENERATED --
              */
          