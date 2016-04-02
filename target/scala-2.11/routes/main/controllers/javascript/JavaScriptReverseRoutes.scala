
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/conf/routes
// @DATE:Thu Sep 24 14:06:56 ICT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:141
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:141
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:111
  class ReverseGameVersionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:111
    def getGameVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameVersionController.getGameVersion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gameversion"})
        }
      """
    )
  
  }

  // @LINE:103
  class ReverseGameSettingsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:105
    def saveSettingsData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameSettingsController.saveSettingsData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savesettingsdata"})
        }
      """
    )
  
    // @LINE:104
    def getSettings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameSettingsController.getSettings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings"})
        }
      """
    )
  
    // @LINE:106
    def addVersionSFS: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameSettingsController.addVersionSFS",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addversionsfs"})
        }
      """
    )
  
    // @LINE:107
    def deleteUnuseVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameSettingsController.deleteUnuseVersion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteunuseversion"})
        }
      """
    )
  
    // @LINE:108
    def changeGameSubVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameSettingsController.changeGameSubVersion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "changegamesubversion"})
        }
      """
    )
  
    // @LINE:103
    def getGameSettings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameSettingsController.getGameSettings",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gamesettings"})
        }
      """
    )
  
  }

  // @LINE:65
  class ReverseProfanityController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def getProfanityText: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfanityController.getProfanityText",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getprofanitytext"})
        }
      """
    )
  
    // @LINE:65
    def profanity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfanityController.profanity",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profanity"})
        }
      """
    )
  
    // @LINE:67
    def exportProfanity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfanityController.exportProfanity",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "exportprofanity"})
        }
      """
    )
  
  }

  // @LINE:117
  class ReverseiapController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:118
    def iapIOS: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.iapController.iapIOS",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "iapios"})
        }
      """
    )
  
    // @LINE:120
    def iapValid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.iapController.iapValid",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "iapvalid"})
        }
      """
    )
  
    // @LINE:119
    def iapAndroid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.iapController.iapAndroid",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "iapandroid"})
        }
      """
    )
  
    // @LINE:123
    def getNewPayingUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.iapController.getNewPayingUsers",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newpayingusers"})
        }
      """
    )
  
    // @LINE:121
    def testDate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.iapController.testDate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "testdate"})
        }
      """
    )
  
    // @LINE:117
    def iapData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.iapController.iapData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "iapdata"})
        }
      """
    )
  
    // @LINE:122
    def getUniquePayingUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.iapController.getUniquePayingUsers",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uniquepayingusers"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseGameStateController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def blockLeaderBoard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.blockLeaderBoard",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockLeaderBoard"})
        }
      """
    )
  
    // @LINE:22
    def fakeUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.fakeUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fakeUser"})
        }
      """
    )
  
    // @LINE:30
    def blockAttack: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.blockAttack",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockAttack"})
        }
      """
    )
  
    // @LINE:21
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.deleteUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser"})
        }
      """
    )
  
    // @LINE:23
    def downloadBattleLog: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.downloadBattleLog",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "downloadBattleLog"})
        }
      """
    )
  
    // @LINE:15
    def getUserList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.getUserList",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchUserByName"})
          }
        
        }
      """
    )
  
    // @LINE:27
    def blockTribe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.blockTribe",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockTribe"})
        }
      """
    )
  
    // @LINE:28
    def blockSearching: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.blockSearching",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockSearching"})
        }
      """
    )
  
    // @LINE:14
    def getUserById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.getUserById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchByUserId"})
        }
      """
    )
  
    // @LINE:19
    def updateUserData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.updateUserData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateUserData"})
        }
      """
    )
  
    // @LINE:24
    def turnOffShield: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.turnOffShield",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "turnOffShield"})
        }
      """
    )
  
    // @LINE:20
    def noteForUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.noteForUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "noteForUser"})
        }
      """
    )
  
    // @LINE:29
    def blockGlobalChat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.blockGlobalChat",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockGlobalChat"})
        }
      """
    )
  
    // @LINE:25
    def turnOnShield: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameStateController.turnOnShield",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "turnOnShield"})
        }
      """
    )
  
  }

  // @LINE:69
  class ReverseNewsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def addArabNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.addArabNews",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addarabnews"})
        }
      """
    )
  
    // @LINE:69
    def getNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.getNews",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "news"})
        }
      """
    )
  
    // @LINE:73
    def updateEnglishNewsImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.updateEnglishNewsImage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateenglishnewsimage"})
        }
      """
    )
  
    // @LINE:77
    def updateArabNewsTitle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.updateArabNewsTitle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatearabnewstitle"})
        }
      """
    )
  
    // @LINE:81
    def deleteArabNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.deleteArabNews",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletearabnews"})
        }
      """
    )
  
    // @LINE:80
    def updateArabNewsContent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.updateArabNewsContent",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatearabnewscontent"})
        }
      """
    )
  
    // @LINE:76
    def deleteEnglishNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.deleteEnglishNews",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteenglishnews"})
        }
      """
    )
  
    // @LINE:75
    def updateEnglishNewsContent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.updateEnglishNewsContent",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateenglishnewscontent"})
        }
      """
    )
  
    // @LINE:74
    def updateEnglishNewsVideo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.updateEnglishNewsVideo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateenglishnewsvideo"})
        }
      """
    )
  
    // @LINE:72
    def updateEnglishNewsTitle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.updateEnglishNewsTitle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateenglishnewstitle"})
        }
      """
    )
  
    // @LINE:79
    def updateArabNewsVideo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.updateArabNewsVideo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatearabnewsvideo"})
        }
      """
    )
  
    // @LINE:70
    def addEnglishNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.addEnglishNews",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addenglishnews"})
        }
      """
    )
  
    // @LINE:78
    def updateArabNewsImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.updateArabNewsImage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatearabnewsimage"})
        }
      """
    )
  
  }

  // @LINE:45
  class ReverseUsersManagementController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def deleteAdminAcc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.deleteAdminAcc",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteadminacc"})
        }
      """
    )
  
    // @LINE:46
    def addAdminAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.addAdminAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addAdminAccount"})
        }
      """
    )
  
    // @LINE:53
    def sendEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.sendEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sendEmail"})
        }
      """
    )
  
    // @LINE:54
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:48
    def updateEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.updateEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateemail"})
        }
      """
    )
  
    // @LINE:55
    def getProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.getProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getprofile"})
        }
      """
    )
  
    // @LINE:45
    def getAdminUserList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.getAdminUserList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usersmanagement"})
        }
      """
    )
  
    // @LINE:50
    def updateRole: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.updateRole",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updaterole"})
        }
      """
    )
  
    // @LINE:47
    def updateUsername: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.updateUsername",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateusername"})
        }
      """
    )
  
    // @LINE:52
    def getUserData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.getUserData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getuserdata"})
        }
      """
    )
  
    // @LINE:49
    def updatePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.updatePassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepassword"})
        }
      """
    )
  
    // @LINE:56
    def updateProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsersManagementController.updateProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateprofile"})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def checklogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.checklogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checklogin"})
        }
      """
    )
  
    // @LINE:42
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def gamestate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.gamestate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gamestate"})
        }
      """
    )
  
    // @LINE:10
    def tribes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.tribes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tribes"})
        }
      """
    )
  
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

  // @LINE:135
  class ReverseAdjustCallbackController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:137
    def getAdjustCallbackData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdjustCallbackController.getAdjustCallbackData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getadjustcallbackdata"})
        }
      """
    )
  
    // @LINE:136
    def getAllAdjustCallbackData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdjustCallbackController.getAllAdjustCallbackData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getalladjustcallbackdata"})
        }
      """
    )
  
    // @LINE:135
    def AdjustCallback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdjustCallbackController.AdjustCallback",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adjustcallback"})
        }
      """
    )
  
  }

  // @LINE:61
  class ReverseTextStringController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def textString: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TextStringController.textString",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "textstring"})
        }
      """
    )
  
    // @LINE:62
    def getTextString: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TextStringController.getTextString",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getTextString"})
        }
      """
    )
  
    // @LINE:63
    def exportTextString: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TextStringController.exportTextString",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "exporttextstring"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseTribeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getAllTribes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TribeController.getAllTribes",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getTribeList"})
        }
      """
    )
  
    // @LINE:38
    def getTribeMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TribeController.getTribeMessage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "downloadTribeMessage"})
        }
      """
    )
  
    // @LINE:39
    def blockTribe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TribeController.blockTribe",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockTribe"})
        }
      """
    )
  
    // @LINE:35
    def getTribeByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TribeController.getTribeByName",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchTribeByName"})
        }
      """
    )
  
    // @LINE:33
    def getTribeDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TribeController.getTribeDetails",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getTribeDetails"})
        }
      """
    )
  
    // @LINE:34
    def getTribeById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TribeController.getTribeById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchTribeById"})
        }
      """
    )
  
    // @LINE:36
    def updateTribeName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TribeController.updateTribeName",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateTribeName"})
        }
      """
    )
  
  }

  // @LINE:83
  class ReverseGameDataController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
    def getDefensiveBuildings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getDefensiveBuildings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "defensivebuildings"})
        }
      """
    )
  
    // @LINE:89
    def getDefensiveBuildingLevel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getDefensiveBuildingLevel",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "defensivebuildinglevel"})
        }
      """
    )
  
    // @LINE:95
    def getSpells: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getSpells",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "spells"})
        }
      """
    )
  
    // @LINE:101
    def publishSpreadsheet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.publishSpreadsheet",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "publishspeadsheet"})
        }
      """
    )
  
    // @LINE:93
    def getTownHallLevel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getTownHallLevel",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "townhalllevel"})
        }
      """
    )
  
    // @LINE:92
    def getOtherBuildings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getOtherBuildings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "otherbuildings"})
        }
      """
    )
  
    // @LINE:99
    def getAchievements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getAchievements",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "achievements"})
        }
      """
    )
  
    // @LINE:97
    def getObstacles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getObstacles",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "obstacles"})
        }
      """
    )
  
    // @LINE:96
    def getSpellLevels: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getSpellLevels",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "spelllevels"})
        }
      """
    )
  
    // @LINE:87
    def getCombatUnits: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getCombatUnits",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "combatunits"})
        }
      """
    )
  
    // @LINE:94
    def getDecorations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getDecorations",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "decorations"})
        }
      """
    )
  
    // @LINE:98
    def getTrophy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getTrophy",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "trophy"})
        }
      """
    )
  
    // @LINE:83
    def gameData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.gameData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gamedata"})
        }
      """
    )
  
    // @LINE:85
    def getCampaignReference: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getCampaignReference",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "campaignreference"})
        }
      """
    )
  
    // @LINE:90
    def getResourceBuildings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getResourceBuildings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resourcebuildings"})
        }
      """
    )
  
    // @LINE:86
    def getUnitLevel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getUnitLevel",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unitlevels"})
        }
      """
    )
  
    // @LINE:91
    def getArmyBuildings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getArmyBuildings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "armybuildings"})
        }
      """
    )
  
    // @LINE:100
    def getSpreadsheetData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GameDataController.getSpreadsheetData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewspreadsheetdata"})
        }
      """
    )
  
  }

  // @LINE:113
  class ReverseBundleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:114
    def getBundle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BundleController.getBundle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getbundle"})
        }
      """
    )
  
    // @LINE:115
    def saveBundle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BundleController.saveBundle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savebundledata"})
        }
      """
    )
  
    // @LINE:113
    def bundle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BundleController.bundle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bundle"})
        }
      """
    )
  
  }

  // @LINE:125
  class ReversePlayersDataController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:130
    def getGlobalChat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayersDataController.getGlobalChat",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "globalchat"})
        }
      """
    )
  
    // @LINE:126
    def getDAU: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayersDataController.getDAU",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dau"})
        }
      """
    )
  
    // @LINE:133
    def getUniqueUsersNumber: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayersDataController.getUniqueUsersNumber",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uniqueusersnumber"})
        }
      """
    )
  
    // @LINE:129
    def getCCU: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayersDataController.getCCU",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getccu"})
        }
      """
    )
  
    // @LINE:131
    def getTribeChat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayersDataController.getTribeChat",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tribechat"})
        }
      """
    )
  
    // @LINE:128
    def getNewPlayingUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayersDataController.getNewPlayingUsers",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newplayingusers"})
        }
      """
    )
  
    // @LINE:127
    def getMAU: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayersDataController.getMAU",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mau"})
        }
      """
    )
  
    // @LINE:132
    def getLoginLogoutTime: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayersDataController.getLoginLogoutTime",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginlogout"})
        }
      """
    )
  
    // @LINE:125
    def playersData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayersDataController.playersData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "playersdata"})
        }
      """
    )
  
  }

  // @LINE:58
  class ReverseTimeZoneController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def getTimeZone: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TimeZoneController.getTimeZone",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timezone"})
        }
      """
    )
  
    // @LINE:59
    def updateTimeZone: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TimeZoneController.updateTimeZone",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatetimezone"})
        }
      """
    )
  
  }


}