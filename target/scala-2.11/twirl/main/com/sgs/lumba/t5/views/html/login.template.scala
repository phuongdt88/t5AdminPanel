
package com.sgs.lumba.t5.views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<div class="login-container">

	<div class="row">

		<div class="col-sm-6">

			<script src="assets/script/login.js"></script>

			<!-- Errors container -->
			<div class="errors-container">


			</div>

			<!-- Add class "fade-in-effect" for login form effect -->
			<form method="post" role="form" id="login" class="login-form fade-in-effect" style="background-color:white" ng-submit="login()">

				<div class="login-header" style="margin-bottom:5%;">
						<h3>Log in</h3>
				</div>


				<div class="form-group">
					<label class="control-label" for="username">Username</label>
					<input type="text" class="form-control" name="username" id="username" ng-model="username1" autocomplete="off" placeholder="Username"/>
				</div>

				<div class="form-group">
					<label class="control-label" for="password">Password</label>
					<input type="password" class="form-control" name="password" id="password" ng-model="password1" autocomplete="off" placeholder="Password"/>
				</div>

				<div class="form-group">
					<button type="submit" class="btn btn-primary  btn-block text-left">
						<i class="fa-lock"></i>
						Log In
					</button>
				</div>

			</form>


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
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Apr 05 11:35:57 ICT 2016
                  SOURCE: /Users/phuongdt1/Desktop/lumba/t5-admin-panel/app/com/sgs/lumba/t5/views/login.scala.html
                  HASH: 078cbb2e58e1a6471e6cf5fd503b3be45c0e657e
                  MATRIX: 844->1
                  LINES: 32->2
                  -- GENERATED --
              */
          