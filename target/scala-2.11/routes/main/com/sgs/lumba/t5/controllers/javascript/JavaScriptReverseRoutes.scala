
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phuongdt1/Desktop/lumba/t5-admin-panel/conf/routes
// @DATE:Thu Apr 07 16:26:35 ICT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:11
package com.sgs.lumba.t5.controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:117
  class ReverseGameVersionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:117
    def getGameVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameVersionController.getGameVersion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gameversion"})
        }
      """
    )
  
  }

  // @LINE:109
  class ReverseGameSettingsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:111
    def saveSettingsData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameSettingsController.saveSettingsData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savesettingsdata"})
        }
      """
    )
  
    // @LINE:110
    def getSettings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameSettingsController.getSettings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "settings"})
        }
      """
    )
  
    // @LINE:112
    def addVersionSFS: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameSettingsController.addVersionSFS",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addversionsfs"})
        }
      """
    )
  
    // @LINE:113
    def deleteUnuseVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameSettingsController.deleteUnuseVersion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteunuseversion"})
        }
      """
    )
  
    // @LINE:114
    def changeGameSubVersion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameSettingsController.changeGameSubVersion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "changegamesubversion"})
        }
      """
    )
  
    // @LINE:109
    def getGameSettings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameSettingsController.getGameSettings",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gamesettings"})
        }
      """
    )
  
  }

  // @LINE:72
  class ReverseProfanityController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def getProfanityText: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.ProfanityController.getProfanityText",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getprofanitytext"})
        }
      """
    )
  
    // @LINE:72
    def profanity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.ProfanityController.profanity",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profanity"})
        }
      """
    )
  
    // @LINE:74
    def exportProfanity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.ProfanityController.exportProfanity",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "exportprofanity"})
        }
      """
    )
  
  }

  // @LINE:123
  class ReverseiapController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:124
    def iapIOS: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.iapController.iapIOS",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "iapios"})
        }
      """
    )
  
    // @LINE:126
    def iapValid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.iapController.iapValid",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "iapvalid"})
        }
      """
    )
  
    // @LINE:125
    def iapAndroid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.iapController.iapAndroid",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "iapandroid"})
        }
      """
    )
  
    // @LINE:129
    def getNewPayingUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.iapController.getNewPayingUsers",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newpayingusers"})
        }
      """
    )
  
    // @LINE:127
    def testDate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.iapController.testDate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "testdate"})
        }
      """
    )
  
    // @LINE:123
    def iapData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.iapController.iapData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "iapdata"})
        }
      """
    )
  
    // @LINE:128
    def getUniquePayingUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.iapController.getUniquePayingUsers",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uniquepayingusers"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseGameStateController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def blockLeaderBoard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.blockLeaderBoard",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockLeaderBoard"})
        }
      """
    )
  
    // @LINE:29
    def fakeUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.fakeUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fakeUser"})
        }
      """
    )
  
    // @LINE:37
    def blockAttack: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.blockAttack",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockAttack"})
        }
      """
    )
  
    // @LINE:28
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.deleteUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser"})
        }
      """
    )
  
    // @LINE:30
    def downloadBattleLog: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.downloadBattleLog",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "downloadBattleLog"})
        }
      """
    )
  
    // @LINE:22
    def getUserList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.getUserList",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchUserByName"})
          }
        
        }
      """
    )
  
    // @LINE:34
    def blockTribe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.blockTribe",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockTribe"})
        }
      """
    )
  
    // @LINE:35
    def blockSearching: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.blockSearching",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockSearching"})
        }
      """
    )
  
    // @LINE:21
    def getUserById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.getUserById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchByUserId"})
        }
      """
    )
  
    // @LINE:26
    def updateUserData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.updateUserData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateUserData"})
        }
      """
    )
  
    // @LINE:31
    def turnOffShield: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.turnOffShield",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "turnOffShield"})
        }
      """
    )
  
    // @LINE:27
    def noteForUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.noteForUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "noteForUser"})
        }
      """
    )
  
    // @LINE:36
    def blockGlobalChat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.blockGlobalChat",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockGlobalChat"})
        }
      """
    )
  
    // @LINE:20
    def gamestate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.gamestate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gamestate"})
        }
      """
    )
  
    // @LINE:32
    def turnOnShield: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameStateController.turnOnShield",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "turnOnShield"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseLTVCalculatorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def LTVCalculator: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.LTVCalculatorController.LTVCalculator",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ltvcalculator"})
        }
      """
    )
  
    // @LINE:15
    def GetLTVValue: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.LTVCalculatorController.GetLTVValue",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getltvvalue"})
        }
      """
    )
  
  }

  // @LINE:76
  class ReverseNewsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def addArabNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.addArabNews",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addarabnews"})
        }
      """
    )
  
    // @LINE:76
    def getNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.getNews",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "news"})
        }
      """
    )
  
    // @LINE:80
    def updateEnglishNewsImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.updateEnglishNewsImage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateenglishnewsimage"})
        }
      """
    )
  
    // @LINE:84
    def updateArabNewsTitle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.updateArabNewsTitle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatearabnewstitle"})
        }
      """
    )
  
    // @LINE:88
    def deleteArabNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.deleteArabNews",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletearabnews"})
        }
      """
    )
  
    // @LINE:87
    def updateArabNewsContent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.updateArabNewsContent",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatearabnewscontent"})
        }
      """
    )
  
    // @LINE:83
    def deleteEnglishNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.deleteEnglishNews",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteenglishnews"})
        }
      """
    )
  
    // @LINE:82
    def updateEnglishNewsContent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.updateEnglishNewsContent",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateenglishnewscontent"})
        }
      """
    )
  
    // @LINE:81
    def updateEnglishNewsVideo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.updateEnglishNewsVideo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateenglishnewsvideo"})
        }
      """
    )
  
    // @LINE:79
    def updateEnglishNewsTitle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.updateEnglishNewsTitle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateenglishnewstitle"})
        }
      """
    )
  
    // @LINE:86
    def updateArabNewsVideo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.updateArabNewsVideo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatearabnewsvideo"})
        }
      """
    )
  
    // @LINE:77
    def addEnglishNews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.addEnglishNews",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addenglishnews"})
        }
      """
    )
  
    // @LINE:85
    def updateArabNewsImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.NewsController.updateArabNewsImage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatearabnewsimage"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReversePullActivitiesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def CreateReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.PullActivitiesController.CreateReport",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createreport"})
        }
      """
    )
  
    // @LINE:17
    def PullActivities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.PullActivitiesController.PullActivities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pullactivities"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseDashBoardController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def Dashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.DashBoardController.Dashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
    // @LINE:12
    def GetDashboardData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.DashBoardController.GetDashboardData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getDashboardData"})
        }
      """
    )
  
  }

  // @LINE:49
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def CheckLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.LoginController.CheckLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "checklogin"})
        }
      """
    )
  
    // @LINE:49
    def Login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.LoginController.Login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:141
  class ReverseAdjustCallbackController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:143
    def getAdjustCallbackData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.AdjustCallbackController.getAdjustCallbackData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getadjustcallbackdata"})
        }
      """
    )
  
    // @LINE:142
    def getAllAdjustCallbackData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.AdjustCallbackController.getAllAdjustCallbackData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getalladjustcallbackdata"})
        }
      """
    )
  
    // @LINE:141
    def AdjustCallback: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.AdjustCallbackController.AdjustCallback",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adjustcallback"})
        }
      """
    )
  
  }

  // @LINE:68
  class ReverseTextStringController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def textString: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TextStringController.textString",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "textstring"})
        }
      """
    )
  
    // @LINE:69
    def getTextString: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TextStringController.getTextString",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getTextString"})
        }
      """
    )
  
    // @LINE:70
    def exportTextString: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TextStringController.exportTextString",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "exporttextstring"})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseTribeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def getAllTribes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TribeController.getAllTribes",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getTribeList"})
        }
      """
    )
  
    // @LINE:45
    def getTribeMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TribeController.getTribeMessage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "downloadTribeMessage"})
        }
      """
    )
  
    // @LINE:46
    def blockTribe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TribeController.blockTribe",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blockTribe"})
        }
      """
    )
  
    // @LINE:39
    def tribes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TribeController.tribes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tribes"})
        }
      """
    )
  
    // @LINE:43
    def getTribeByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TribeController.getTribeByName",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchTribeByName"})
        }
      """
    )
  
    // @LINE:41
    def getTribeDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TribeController.getTribeDetails",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getTribeDetails"})
        }
      """
    )
  
    // @LINE:42
    def getTribeById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TribeController.getTribeById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "searchTribeById"})
        }
      """
    )
  
    // @LINE:44
    def updateTribeName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TribeController.updateTribeName",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateTribeName"})
        }
      """
    )
  
  }

  // @LINE:90
  class ReverseGameDataController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:94
    def getDefensiveBuildings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getDefensiveBuildings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "defensivebuildings"})
        }
      """
    )
  
    // @LINE:95
    def getDefensiveBuildingLevel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getDefensiveBuildingLevel",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "defensivebuildinglevel"})
        }
      """
    )
  
    // @LINE:101
    def getSpells: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getSpells",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "spells"})
        }
      """
    )
  
    // @LINE:107
    def publishSpreadsheet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.publishSpreadsheet",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "publishspeadsheet"})
        }
      """
    )
  
    // @LINE:99
    def getTownHallLevel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getTownHallLevel",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "townhalllevel"})
        }
      """
    )
  
    // @LINE:98
    def getOtherBuildings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getOtherBuildings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "otherbuildings"})
        }
      """
    )
  
    // @LINE:105
    def getAchievements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getAchievements",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "achievements"})
        }
      """
    )
  
    // @LINE:103
    def getObstacles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getObstacles",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "obstacles"})
        }
      """
    )
  
    // @LINE:102
    def getSpellLevels: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getSpellLevels",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "spelllevels"})
        }
      """
    )
  
    // @LINE:93
    def getCombatUnits: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getCombatUnits",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "combatunits"})
        }
      """
    )
  
    // @LINE:100
    def getDecorations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getDecorations",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "decorations"})
        }
      """
    )
  
    // @LINE:104
    def getTrophy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getTrophy",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "trophy"})
        }
      """
    )
  
    // @LINE:90
    def gameData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.gameData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gamedata"})
        }
      """
    )
  
    // @LINE:91
    def getCampaignReference: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getCampaignReference",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "campaignreference"})
        }
      """
    )
  
    // @LINE:96
    def getResourceBuildings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getResourceBuildings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resourcebuildings"})
        }
      """
    )
  
    // @LINE:92
    def getUnitLevel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getUnitLevel",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "unitlevels"})
        }
      """
    )
  
    // @LINE:97
    def getArmyBuildings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getArmyBuildings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "armybuildings"})
        }
      """
    )
  
    // @LINE:106
    def getSpreadsheetData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.GameDataController.getSpreadsheetData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewspreadsheetdata"})
        }
      """
    )
  
  }

  // @LINE:119
  class ReverseBundleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:120
    def getBundle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.BundleController.getBundle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getbundle"})
        }
      """
    )
  
    // @LINE:121
    def saveBundle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.BundleController.saveBundle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savebundledata"})
        }
      """
    )
  
    // @LINE:119
    def bundle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.BundleController.bundle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bundle"})
        }
      """
    )
  
  }

  // @LINE:131
  class ReversePlayersDataController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:136
    def getGlobalChat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.PlayersDataController.getGlobalChat",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "globalchat"})
        }
      """
    )
  
    // @LINE:132
    def getDAU: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.PlayersDataController.getDAU",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dau"})
        }
      """
    )
  
    // @LINE:139
    def getUniqueUsersNumber: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.PlayersDataController.getUniqueUsersNumber",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uniqueusersnumber"})
        }
      """
    )
  
    // @LINE:135
    def getCCU: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.PlayersDataController.getCCU",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getccu"})
        }
      """
    )
  
    // @LINE:137
    def getTribeChat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.PlayersDataController.getTribeChat",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tribechat"})
        }
      """
    )
  
    // @LINE:134
    def getNewPlayingUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.PlayersDataController.getNewPlayingUsers",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newplayingusers"})
        }
      """
    )
  
    // @LINE:133
    def getMAU: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.PlayersDataController.getMAU",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mau"})
        }
      """
    )
  
    // @LINE:138
    def getLoginLogoutTime: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.PlayersDataController.getLoginLogoutTime",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginlogout"})
        }
      """
    )
  
    // @LINE:131
    def playersData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.PlayersDataController.playersData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "playersdata"})
        }
      """
    )
  
  }

  // @LINE:65
  class ReverseTimeZoneController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def getTimeZone: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TimeZoneController.getTimeZone",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timezone"})
        }
      """
    )
  
    // @LINE:66
    def updateTimeZone: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.sgs.lumba.t5.controllers.TimeZoneController.updateTimeZone",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatetimezone"})
        }
      """
    )
  
  }


}