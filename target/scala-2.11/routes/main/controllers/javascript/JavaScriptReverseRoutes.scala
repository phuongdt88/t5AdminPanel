
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phuongdt1/Desktop/lumba/t5-admin-panel/conf/routes
// @DATE:Tue May 10 17:17:25 ICT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:52
  class ReverseUsersManagementController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def deleteAdminAcc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.deleteAdminAcc",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteadminacc"})
        }
      """
    )
  
    // @LINE:53
    def addAdminAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.addAdminAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addadminaccount"})
        }
      """
    )
  
    // @LINE:61
    def sendEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.sendEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sendEmail"})
        }
      """
    )
  
    // @LINE:62
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:56
    def updateEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.updateEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateemail"})
        }
      """
    )
  
    // @LINE:54
    def updateAdminAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.updateAdminAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateadminacc"})
        }
      """
    )
  
    // @LINE:52
    def getAdminUserInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.getAdminUserInfo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usersmanagement"})
        }
      """
    )
  
    // @LINE:63
    def getProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.getProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getprofile"})
        }
      """
    )
  
    // @LINE:58
    def updateRole: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.updateRole",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updaterole"})
        }
      """
    )
  
    // @LINE:55
    def updateUsername: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.updateUsername",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateusername"})
        }
      """
    )
  
    // @LINE:60
    def getUserData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.getUserData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getuserdata"})
        }
      """
    )
  
    // @LINE:57
    def updatePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.updatePassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepassword"})
        }
      """
    )
  
    // @LINE:64
    def updateProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.updateProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateprofile"})
        }
      """
    )
  
  }

  // @LINE:135
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:135
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def inprogress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.inprogress",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inprogress"})
        }
      """
    )
  
  }


}