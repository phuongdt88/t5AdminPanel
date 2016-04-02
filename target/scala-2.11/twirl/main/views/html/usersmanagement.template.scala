
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usersmanagement_Scope0 {
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

class usersmanagement extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resData: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*3.1*/("""<script src="assets/script/usersmanagement.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="User Management" description="User Management Description"></page-title>

<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Add Admin Account</h3>
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
        <input type="hidden" id="resDataInput" name="resDataInput" value=""""),_display_(/*23.76*/resData),format.raw/*23.83*/("""">

        <form role="form" class="form-horizontal validate" id="addAdminAccForm" name="addAdminAccForm" method="post">
          <div class="form-group">
            <label class="col-sm-2 control-label" for="username">Username</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="username" name="username" data-validate="required" data-message-required="Please enter an username" >
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="email">Email</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="email" name="email" data-validate="email,required" data-message-required="Please enter a valid Email"  >
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="password">Password</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="password" name="password" data-validate="required,minlength[6]" data-message-required="Please enter a password" >
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" >Role</label>
            <div class="col-sm-10">
              <select class="form-control" id="roleSelect" name="roleSelect" data-validate="number" style="width:20%">
                <option value="0">Root Admin</option>
                <option value="1">Customer Agent</option>
                <option value="2">Investigating QA</option>
                <option value="3">Analysis</option>
                <option value="4">Designer</option>
                <option value="5">Engineer</option>
              </select>
            </div>
          </div>

          <button class="btn btn-turquoise" id="createAcc" style="width:17%;margin-left:17%">Create</button>
        </form>

      </div>
    </div>
  </div>
</div>

<!--Account list-->
<div class="row">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h3 class="panel-title">Admin Accounts List</h3>

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

      <table id="adminAccountTbl" class="table table-striped table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
          <th style="width:10%">ID</th>
          <th style="width:15%">Name</th>
          <th style="width:25%">Email</th>
          <th style="width:20%">Password</th>
          <th style="width:10%">Role</th>
          <th style="width:25%">Action</th>
        </tr>
        </thead>

        <tbody>

        </tbody>
      </table>

    </div>
  </div>
</div>

<div id="sendEmailSection">
  <div class="row">
    <div class="col-sm-12">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h3 class="panel-title">Send Email</h3>
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
          <form role="form" class="form-horizontal validate" id="sendEmailForm" name="sendEmailForm" method="post">
            <div class="form-group">
              <label class="col-sm-2 control-label" for="receiverEmail">Send To</label>
              <div class="col-sm-4">
                <input type="text" class="form-control" id="receiverEmail" name="receiverEmail" data-validate="required" data-message-required="Please enter an email">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label" for="emailSubject">Subject</label>
              <div class="col-sm-4">
                <input type="text" class="form-control" id="emailSubject" name="emailSubject" data-validate="required" data-message-required="Please enter a subject">
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-2 control-label" for="message">Message</label>
              <div class="col-sm-8">
                <textarea class="form-control" id="message" name="message"></textarea>
              </div>
            </div>
            <button class="btn btn-success" id="sendEmailBtn" style="margin-left:17%">Send</button>
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

  def render(resData:String): play.twirl.api.HtmlFormat.Appendable = apply(resData)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (resData) => apply(resData)

  def ref: this.type = this

}


}

/**/
object usersmanagement extends usersmanagement_Scope0.usersmanagement
              /*
                  -- GENERATED --
                  DATE: Thu Sep 24 11:23:10 ICT 2015
                  SOURCE: /Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/app/views/usersmanagement.scala.html
                  HASH: e7d93f5db6b3018874c04588c56aecf225c210ee
                  MATRIX: 765->1|877->18|905->20|1694->782|1722->789
                  LINES: 27->1|32->1|34->3|54->23|54->23
                  -- GENERATED --
              */
          