
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="xenon-app">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta name="description" content="Tribal Rivals Admin Panel" />
        <meta name="author" content="" />

        <title>Tribal Rivals - Admin Panel</title>

        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Arimo:400,700,400italic">
        <link rel="stylesheet" href="assets/css/fonts/linecons/css/linecons.css">
        <link rel="stylesheet" href="assets/css/fonts/fontawesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/css/bootstrap.css">
        <link rel="stylesheet" href="assets/css/xenon-core.css">
        <link rel="stylesheet" href="assets/css/xenon-forms.css">
        <link rel="stylesheet" href="assets/css/xenon-components.css">
        <link rel="stylesheet" href="assets/css/xenon-skins.css">
        <link rel="stylesheet" href="assets/css/custom.css">
        <link rel="stylesheet" href="assets/css/jquery-ui.min.css">

        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/js/jquery.jeditable.js"></script>
        <script src="assets/js/jquery-ui.min.js"></script>
        <script src="assets/script/global.js"></script>
        <script>
	var appHelper = """),format.raw/*29.18*/("""{"""),format.raw/*29.19*/("""
		"""),format.raw/*30.3*/("""// Vars (paths without trailing slash)
		templatesDir: 'assets/app/tpls',
		assetsDir: 'assets',

		// Methods
		templatePath: function(view_name)
		"""),format.raw/*36.3*/("""{"""),format.raw/*36.4*/("""
			"""),format.raw/*37.4*/("""return this.templatesDir + '/' + view_name + '.html';
		"""),format.raw/*38.3*/("""}"""),format.raw/*38.4*/(""",

		assetPath: function(file_path)
		"""),format.raw/*41.3*/("""{"""),format.raw/*41.4*/("""
			"""),format.raw/*42.4*/("""return this.assetsDir + '/' + file_path;
		"""),format.raw/*43.3*/("""}"""),format.raw/*43.4*/("""
	"""),format.raw/*44.2*/("""}"""),format.raw/*44.3*/(""";
	</script>

            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<![endif]-->


    </head>
    <body class="page-body" ng-controller="MainCtrl" ng-class=""""),format.raw/*54.64*/("""{"""),format.raw/*54.65*/("""'settings-pane-open': layoutOptions.settingsPane.isOpen, 'chat-open': layoutOptions.chat.isOpen, 'login-page': isLoginPage && isMainPage == false, 'login-light': isLightLoginPage && isMainPage == false, 'lockscreen-page': isLockscreenPage && isMainPage == false, 'right-sidebar': layoutOptions.sidebar.isRight, 'boxed-container': layoutOptions.container.isBoxed"""),format.raw/*54.426*/("""}"""),format.raw/*54.427*/("""">


        <settings-pane></settings-pane>

        <horizontal-menu ng-if="layoutOptions.horizontalMenu.isVisible"></horizontal-menu>

        <div class="page-container" ui-view></div>

            <!-- Remove this code if you want to disable Loading Overlay in the beginning of document loading -->
        <div class="page-loading-overlay">
            <div class="loader-2"></div>
        </div>


            <!-- Bottom Scripts -->
        <script src="assets/app/js/angular/angular.min.js"></script>
        <script src="assets/app/js/angular-ui/angular-ui-router.min.js"></script>
        <script src="assets/app/js/angular-ui/ui-bootstrap-tpls-0.11.2.min.js"></script>
        <script src="assets/app/js/angular/angular-cookies.min.js"></script>
        <script src="assets/app/js/oc-lazyload/ocLazyLoad.min.js"></script>
        <script src="assets/app/js/angular-fullscreen.js"></script>
        <script src="assets/js/TweenMax.min.js"></script>
        <script src="assets/js/joinable.js"></script>
        <script src="assets/js/resizeable.js"></script>


            <!-- App -->
        <script src="assets/app/js/app.js"></script>
        <script src="assets/app/js/controllers.js"></script>
        <script src="assets/app/js/directives.js"></script>
        <script src="assets/app/js/factory.js"></script>
        <script src="assets/app/js/services.js"></script>


            <!-- JavaScripts initializations and stuff -->
        <script src="assets/app/js/xenon-custom.js"></script>

    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Sep 21 14:15:12 ICT 2015
                  SOURCE: /Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/app/views/index.scala.html
                  HASH: 05cb6294761d1b244cf393802f05c07bf6c4a0c4
                  MATRIX: 827->0|2273->1418|2302->1419|2332->1422|2508->1571|2536->1572|2567->1576|2650->1632|2678->1633|2743->1671|2771->1672|2802->1676|2872->1719|2900->1720|2929->1722|2957->1723|3297->2035|3326->2036|3716->2397|3746->2398
                  LINES: 32->1|60->29|60->29|61->30|67->36|67->36|68->37|69->38|69->38|72->41|72->41|73->42|74->43|74->43|75->44|75->44|85->54|85->54|85->54|85->54
                  -- GENERATED --
              */
          