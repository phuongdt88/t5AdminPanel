
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phuongdt1/Desktop/lumba/t5-admin-panel/conf/routes
// @DATE:Thu Apr 07 16:26:35 ICT 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:11
package com.sgs.lumba.t5.controllers {

  // @LINE:117
  class ReverseGameVersionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:117
    def getGameVersion(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gameversion")
    }
  
  }

  // @LINE:109
  class ReverseGameSettingsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:111
    def saveSettingsData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "savesettingsdata")
    }
  
    // @LINE:110
    def getSettings(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "settings")
    }
  
    // @LINE:112
    def addVersionSFS(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addversionsfs")
    }
  
    // @LINE:113
    def deleteUnuseVersion(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deleteunuseversion")
    }
  
    // @LINE:114
    def changeGameSubVersion(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "changegamesubversion")
    }
  
    // @LINE:109
    def getGameSettings(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gamesettings")
    }
  
  }

  // @LINE:72
  class ReverseProfanityController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def getProfanityText(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getprofanitytext")
    }
  
    // @LINE:72
    def profanity(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profanity")
    }
  
    // @LINE:74
    def exportProfanity(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "exportprofanity")
    }
  
  }

  // @LINE:123
  class ReverseiapController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:124
    def iapIOS(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "iapios")
    }
  
    // @LINE:126
    def iapValid(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "iapvalid")
    }
  
    // @LINE:125
    def iapAndroid(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "iapandroid")
    }
  
    // @LINE:129
    def getNewPayingUsers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "newpayingusers")
    }
  
    // @LINE:127
    def testDate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "testdate")
    }
  
    // @LINE:123
    def iapData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "iapdata")
    }
  
    // @LINE:128
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

  // @LINE:76
  class ReverseNewsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:78
    def addArabNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addarabnews")
    }
  
    // @LINE:76
    def getNews(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "news")
    }
  
    // @LINE:80
    def updateEnglishNewsImage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewsimage")
    }
  
    // @LINE:84
    def updateArabNewsTitle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatearabnewstitle")
    }
  
    // @LINE:88
    def deleteArabNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deletearabnews")
    }
  
    // @LINE:87
    def updateArabNewsContent(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatearabnewscontent")
    }
  
    // @LINE:83
    def deleteEnglishNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deleteenglishnews")
    }
  
    // @LINE:82
    def updateEnglishNewsContent(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewscontent")
    }
  
    // @LINE:81
    def updateEnglishNewsVideo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewsvideo")
    }
  
    // @LINE:79
    def updateEnglishNewsTitle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewstitle")
    }
  
    // @LINE:86
    def updateArabNewsVideo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatearabnewsvideo")
    }
  
    // @LINE:77
    def addEnglishNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addenglishnews")
    }
  
    // @LINE:85
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

  // @LINE:141
  class ReverseAdjustCallbackController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:143
    def getAdjustCallbackData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getadjustcallbackdata")
    }
  
    // @LINE:142
    def getAllAdjustCallbackData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getalladjustcallbackdata")
    }
  
    // @LINE:141
    def AdjustCallback(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adjustcallback")
    }
  
  }

  // @LINE:68
  class ReverseTextStringController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def textString(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "textstring")
    }
  
    // @LINE:69
    def getTextString(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getTextString")
    }
  
    // @LINE:70
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

  // @LINE:90
  class ReverseGameDataController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:94
    def getDefensiveBuildings(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "defensivebuildings")
    }
  
    // @LINE:95
    def getDefensiveBuildingLevel(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "defensivebuildinglevel")
    }
  
    // @LINE:101
    def getSpells(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "spells")
    }
  
    // @LINE:107
    def publishSpreadsheet(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "publishspeadsheet")
    }
  
    // @LINE:99
    def getTownHallLevel(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "townhalllevel")
    }
  
    // @LINE:98
    def getOtherBuildings(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "otherbuildings")
    }
  
    // @LINE:105
    def getAchievements(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "achievements")
    }
  
    // @LINE:103
    def getObstacles(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "obstacles")
    }
  
    // @LINE:102
    def getSpellLevels(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "spelllevels")
    }
  
    // @LINE:93
    def getCombatUnits(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "combatunits")
    }
  
    // @LINE:100
    def getDecorations(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "decorations")
    }
  
    // @LINE:104
    def getTrophy(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "trophy")
    }
  
    // @LINE:90
    def gameData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gamedata")
    }
  
    // @LINE:91
    def getCampaignReference(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "campaignreference")
    }
  
    // @LINE:96
    def getResourceBuildings(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "resourcebuildings")
    }
  
    // @LINE:92
    def getUnitLevel(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "unitlevels")
    }
  
    // @LINE:97
    def getArmyBuildings(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "armybuildings")
    }
  
    // @LINE:106
    def getSpreadsheetData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "viewspreadsheetdata")
    }
  
  }

  // @LINE:119
  class ReverseBundleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:120
    def getBundle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getbundle")
    }
  
    // @LINE:121
    def saveBundle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "savebundledata")
    }
  
    // @LINE:119
    def bundle(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bundle")
    }
  
  }

  // @LINE:131
  class ReversePlayersDataController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:136
    def getGlobalChat(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "globalchat")
    }
  
    // @LINE:132
    def getDAU(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dau")
    }
  
    // @LINE:139
    def getUniqueUsersNumber(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "uniqueusersnumber")
    }
  
    // @LINE:135
    def getCCU(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getccu")
    }
  
    // @LINE:137
    def getTribeChat(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "tribechat")
    }
  
    // @LINE:134
    def getNewPlayingUsers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "newplayingusers")
    }
  
    // @LINE:133
    def getMAU(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mau")
    }
  
    // @LINE:138
    def getLoginLogoutTime(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "loginlogout")
    }
  
    // @LINE:131
    def playersData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "playersdata")
    }
  
  }

  // @LINE:65
  class ReverseTimeZoneController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def getTimeZone(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "timezone")
    }
  
    // @LINE:66
    def updateTimeZone(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatetimezone")
    }
  
  }


}