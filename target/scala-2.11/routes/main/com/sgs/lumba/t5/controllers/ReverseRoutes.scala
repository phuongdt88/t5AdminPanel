
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phuongdt1/Desktop/lumba/t5-admin-panel/conf/routes
// @DATE:Tue May 10 17:17:25 ICT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:11
package com.sgs.lumba.t5.controllers {

  // @LINE:105
  class ReverseGameVersionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:105
    def getGameVersion(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gameversion")
    }
  
  }

  // @LINE:97
  class ReverseGameSettingsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:99
    def saveSettingsData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "savesettingsdata")
    }
  
    // @LINE:98
    def getSettings(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "settings")
    }
  
    // @LINE:100
    def addVersionSFS(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addversionsfs")
    }
  
    // @LINE:101
    def deleteUnuseVersion(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deleteunuseversion")
    }
  
    // @LINE:102
    def changeGameSubVersion(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "changegamesubversion")
    }
  
    // @LINE:97
    def getGameSettings(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gamesettings")
    }
  
  }

  // @LINE:73
  class ReverseProfanityController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def getProfanityText(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getprofanitytext")
    }
  
    // @LINE:73
    def profanity(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profanity")
    }
  
    // @LINE:75
    def exportProfanity(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "exportprofanity")
    }
  
  }

  // @LINE:111
  class ReverseiapController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:112
    def iapIOS(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "iapios")
    }
  
    // @LINE:114
    def iapValid(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "iapvalid")
    }
  
    // @LINE:113
    def iapAndroid(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "iapandroid")
    }
  
    // @LINE:117
    def getNewPayingUsers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "newpayingusers")
    }
  
    // @LINE:115
    def testDate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "testdate")
    }
  
    // @LINE:111
    def iapData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "iapdata")
    }
  
    // @LINE:116
    def getUniquePayingUsers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "uniquepayingusers")
    }
  
  }

  // @LINE:20
  class ReverseGameStateController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def blockLeaderBoard(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockLeaderBoard")
    }
  
    // @LINE:29
    def fakeUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "fakeUser")
    }
  
    // @LINE:37
    def blockAttack(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockAttack")
    }
  
    // @LINE:28
    def deleteUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deleteUser")
    }
  
    // @LINE:30
    def downloadBattleLog(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "downloadBattleLog")
    }
  
    // @LINE:22
    def getUserList(): Call = {
    
      () match {
      
        // @LINE:22
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "searchUserByName")
      
      }
    
    }
  
    // @LINE:34
    def blockTribe(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockTribe")
    }
  
    // @LINE:35
    def blockSearching(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockSearching")
    }
  
    // @LINE:21
    def getUserById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "searchByUserId")
    }
  
    // @LINE:26
    def updateUserData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateUserData")
    }
  
    // @LINE:31
    def turnOffShield(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "turnOffShield")
    }
  
    // @LINE:27
    def noteForUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "noteForUser")
    }
  
    // @LINE:36
    def blockGlobalChat(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockGlobalChat")
    }
  
    // @LINE:20
    def gamestate(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gamestate")
    }
  
    // @LINE:32
    def turnOnShield(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "turnOnShield")
    }
  
  }

  // @LINE:14
  class ReverseLTVCalculatorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def LTVCalculator(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ltvcalculator")
    }
  
    // @LINE:15
    def GetLTVValue(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getltvvalue")
    }
  
  }

  // @LINE:77
  class ReverseNewsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:79
    def addArabNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addarabnews")
    }
  
    // @LINE:77
    def getNews(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "news")
    }
  
    // @LINE:81
    def updateEnglishNewsImage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewsimage")
    }
  
    // @LINE:85
    def updateArabNewsTitle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatearabnewstitle")
    }
  
    // @LINE:89
    def deleteArabNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deletearabnews")
    }
  
    // @LINE:88
    def updateArabNewsContent(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatearabnewscontent")
    }
  
    // @LINE:84
    def deleteEnglishNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deleteenglishnews")
    }
  
    // @LINE:83
    def updateEnglishNewsContent(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewscontent")
    }
  
    // @LINE:82
    def updateEnglishNewsVideo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewsvideo")
    }
  
    // @LINE:80
    def updateEnglishNewsTitle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewstitle")
    }
  
    // @LINE:87
    def updateArabNewsVideo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatearabnewsvideo")
    }
  
    // @LINE:78
    def addEnglishNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addenglishnews")
    }
  
    // @LINE:86
    def updateArabNewsImage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatearabnewsimage")
    }
  
  }

  // @LINE:17
  class ReversePullActivitiesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def CreateReport(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "createreport")
    }
  
    // @LINE:17
    def PullActivities(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pullactivities")
    }
  
  }

  // @LINE:11
  class ReverseDashBoardController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def Dashboard(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:12
    def GetDashboardData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getDashboardData")
    }
  
  }

  // @LINE:49
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def CheckLogin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "checklogin")
    }
  
    // @LINE:49
    def Login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:129
  class ReverseAdjustCallbackController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:131
    def getAdjustCallbackData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getadjustcallbackdata")
    }
  
    // @LINE:130
    def getAllAdjustCallbackData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getalladjustcallbackdata")
    }
  
    // @LINE:129
    def AdjustCallback(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adjustcallback")
    }
  
  }

  // @LINE:69
  class ReverseTextStringController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def textString(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "textstring")
    }
  
    // @LINE:70
    def getTextString(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getTextString")
    }
  
    // @LINE:71
    def exportTextString(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "exporttextstring")
    }
  
  }

  // @LINE:39
  class ReverseTribeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def getAllTribes(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getTribeList")
    }
  
    // @LINE:45
    def getTribeMessage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "downloadTribeMessage")
    }
  
    // @LINE:46
    def blockTribe(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockTribe")
    }
  
    // @LINE:39
    def tribes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tribes")
    }
  
    // @LINE:43
    def getTribeByName(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "searchTribeByName")
    }
  
    // @LINE:41
    def getTribeDetails(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getTribeDetails")
    }
  
    // @LINE:42
    def getTribeById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "searchTribeById")
    }
  
    // @LINE:44
    def updateTribeName(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateTribeName")
    }
  
  }

  // @LINE:91
  class ReverseGameDataController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:93
    def exportGameData(section:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "exportgamedata/" + implicitly[PathBindable[String]].unbind("section", dynamicString(section)))
    }
  
    // @LINE:92
    def getData(section:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "getdata/" + implicitly[PathBindable[String]].unbind("section", dynamicString(section)))
    }
  
    // @LINE:94
    def getSpreadsheetData(section:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewspreadsheetdata/" + implicitly[PathBindable[String]].unbind("section", dynamicString(section)))
    }
  
    // @LINE:91
    def gameData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gamedata")
    }
  
    // @LINE:95
    def publishSpreadsheet(section:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "publishspreadsheet/" + implicitly[PathBindable[String]].unbind("section", dynamicString(section)))
    }
  
  }

  // @LINE:107
  class ReverseBundleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:108
    def getBundle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getbundle")
    }
  
    // @LINE:109
    def saveBundle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "savebundledata")
    }
  
    // @LINE:107
    def bundle(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bundle")
    }
  
  }

  // @LINE:119
  class ReversePlayersDataController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:124
    def getGlobalChat(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "globalchat")
    }
  
    // @LINE:120
    def getDAU(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dau")
    }
  
    // @LINE:127
    def getUniqueUsersNumber(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "uniqueusersnumber")
    }
  
    // @LINE:123
    def getCCU(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getccu")
    }
  
    // @LINE:125
    def getTribeChat(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "tribechat")
    }
  
    // @LINE:122
    def getNewPlayingUsers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "newplayingusers")
    }
  
    // @LINE:121
    def getMAU(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mau")
    }
  
    // @LINE:126
    def getLoginLogoutTime(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "loginlogout")
    }
  
    // @LINE:119
    def playersData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "playersdata")
    }
  
  }

  // @LINE:66
  class ReverseTimeZoneController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:67
    def updateTimeZone(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatetimezone")
    }
  
    // @LINE:66
    def timeZone(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "timezone")
    }
  
  }


}