
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script src="assets/script/profile.js"></script>

<page-title ng-if="layoutOptions.pageTitles" title="User Profile" description=""></page-title>

<div class="row">
  <div class="col-sm-12">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h3 class="panel-title">Edit Your Information</h3>
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
        <form role="form" class="form-horizontal validate" id="editProfileForm" name="editProfileForm" method="post">
          <div class="form-group">
            <label class="col-sm-2 control-label" for="username">Username</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="username" name="username" data-validate="required" data-message-required="Please enter an username">
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="email">Email</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="email" name="email" data-validate="email,required" data-message-required="Please enter a valid Email" >
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="password">Password</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="password" name="password" data-validate="required,minlength[6]" data-message-required="Please enter a password">
            </div>
          </div>
          <div class="form-group">
            <label class="col-sm-2 control-label" for="Role">Role</label>
            <div class="col-sm-5">
              <input type="text" class="form-control" id="role" name="role" readonly="readonly">
            </div>
          </div>

          <button class="btn btn-turquoise" id="updateProfileBtn" type="submit" style="width:17%;margin-left:17%">Update</button>
        </form>

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
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Thu Sep 24 14:06:56 ICT 2015
                  SOURCE: /Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/app/views/profile.scala.html
                  HASH: 0728ddb2e6d5587f4c1abad87fdfa22fe321bf95
                  MATRIX: 831->0
                  LINES: 32->1
                  -- GENERATED --
              */
          