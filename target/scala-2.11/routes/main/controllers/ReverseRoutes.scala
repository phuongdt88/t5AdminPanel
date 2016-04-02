
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/conf/routes
// @DATE:Thu Sep 24 14:06:56 ICT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:141
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:141
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:111
  class ReverseGameVersionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:111
    def getGameVersion(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gameversion")
    }
  
  }

  // @LINE:103
  class ReverseGameSettingsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:105
    def saveSettingsData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "savesettingsdata")
    }
  
    // @LINE:104
    def getSettings(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "settings")
    }
  
    // @LINE:106
    def addVersionSFS(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addversionsfs")
    }
  
    // @LINE:107
    def deleteUnuseVersion(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deleteunuseversion")
    }
  
    // @LINE:108
    def changeGameSubVersion(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "changegamesubversion")
    }
  
    // @LINE:103
    def getGameSettings(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gamesettings")
    }
  
  }

  // @LINE:65
  class ReverseProfanityController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def getProfanityText(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getprofanitytext")
    }
  
    // @LINE:65
    def profanity(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profanity")
    }
  
    // @LINE:67
    def exportProfanity(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "exportprofanity")
    }
  
  }

  // @LINE:117
  class ReverseiapController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:118
    def iapIOS(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "iapios")
    }
  
    // @LINE:120
    def iapValid(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "iapvalid")
    }
  
    // @LINE:119
    def iapAndroid(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "iapandroid")
    }
  
    // @LINE:123
    def getNewPayingUsers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "newpayingusers")
    }
  
    // @LINE:121
    def testDate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "testdate")
    }
  
    // @LINE:117
    def iapData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "iapdata")
    }
  
    // @LINE:122
    def getUniquePayingUsers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "uniquepayingusers")
    }
  
  }

  // @LINE:14
  class ReverseGameStateController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def blockLeaderBoard(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockLeaderBoard")
    }
  
    // @LINE:22
    def fakeUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "fakeUser")
    }
  
    // @LINE:30
    def blockAttack(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockAttack")
    }
  
    // @LINE:21
    def deleteUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deleteUser")
    }
  
    // @LINE:23
    def downloadBattleLog(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "downloadBattleLog")
    }
  
    // @LINE:15
    def getUserList(): Call = {
    
      () match {
      
        // @LINE:15
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "searchUserByName")
      
      }
    
    }
  
    // @LINE:27
    def blockTribe(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockTribe")
    }
  
    // @LINE:28
    def blockSearching(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockSearching")
    }
  
    // @LINE:14
    def getUserById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "searchByUserId")
    }
  
    // @LINE:19
    def updateUserData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateUserData")
    }
  
    // @LINE:24
    def turnOffShield(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "turnOffShield")
    }
  
    // @LINE:20
    def noteForUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "noteForUser")
    }
  
    // @LINE:29
    def blockGlobalChat(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockGlobalChat")
    }
  
    // @LINE:25
    def turnOnShield(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "turnOnShield")
    }
  
  }

  // @LINE:69
  class ReverseNewsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def addArabNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addarabnews")
    }
  
    // @LINE:69
    def getNews(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "news")
    }
  
    // @LINE:73
    def updateEnglishNewsImage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewsimage")
    }
  
    // @LINE:77
    def updateArabNewsTitle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatearabnewstitle")
    }
  
    // @LINE:81
    def deleteArabNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deletearabnews")
    }
  
    // @LINE:80
    def updateArabNewsContent(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatearabnewscontent")
    }
  
    // @LINE:76
    def deleteEnglishNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deleteenglishnews")
    }
  
    // @LINE:75
    def updateEnglishNewsContent(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewscontent")
    }
  
    // @LINE:74
    def updateEnglishNewsVideo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewsvideo")
    }
  
    // @LINE:72
    def updateEnglishNewsTitle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateenglishnewstitle")
    }
  
    // @LINE:79
    def updateArabNewsVideo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatearabnewsvideo")
    }
  
    // @LINE:70
    def addEnglishNews(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addenglishnews")
    }
  
    // @LINE:78
    def updateArabNewsImage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatearabnewsimage")
    }
  
  }

  // @LINE:45
  class ReverseUsersManagementController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def deleteAdminAcc(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deleteadminacc")
    }
  
    // @LINE:46
    def addAdminAccount(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addAdminAccount")
    }
  
    // @LINE:53
    def sendEmail(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "sendEmail")
    }
  
    // @LINE:54
    def profile(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:48
    def updateEmail(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateemail")
    }
  
    // @LINE:55
    def getProfile(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getprofile")
    }
  
    // @LINE:45
    def getAdminUserList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "usersmanagement")
    }
  
    // @LINE:50
    def updateRole(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updaterole")
    }
  
    // @LINE:47
    def updateUsername(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateusername")
    }
  
    // @LINE:52
    def getUserData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getuserdata")
    }
  
    // @LINE:49
    def updatePassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatepassword")
    }
  
    // @LINE:56
    def updateProfile(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateprofile")
    }
  
  }

  // @LINE:42
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def checklogin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "checklogin")
    }
  
    // @LINE:42
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def gamestate(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gamestate")
    }
  
    // @LINE:10
    def tribes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tribes")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def inprogress(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "inprogress")
    }
  
  }

  // @LINE:135
  class ReverseAdjustCallbackController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:137
    def getAdjustCallbackData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getadjustcallbackdata")
    }
  
    // @LINE:136
    def getAllAdjustCallbackData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getalladjustcallbackdata")
    }
  
    // @LINE:135
    def AdjustCallback(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adjustcallback")
    }
  
  }

  // @LINE:61
  class ReverseTextStringController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def textString(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "textstring")
    }
  
    // @LINE:62
    def getTextString(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getTextString")
    }
  
    // @LINE:63
    def exportTextString(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "exporttextstring")
    }
  
  }

  // @LINE:32
  class ReverseTribeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def getAllTribes(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getTribeList")
    }
  
    // @LINE:38
    def getTribeMessage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "downloadTribeMessage")
    }
  
    // @LINE:39
    def blockTribe(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blockTribe")
    }
  
    // @LINE:35
    def getTribeByName(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "searchTribeByName")
    }
  
    // @LINE:33
    def getTribeDetails(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getTribeDetails")
    }
  
    // @LINE:34
    def getTribeById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "searchTribeById")
    }
  
    // @LINE:36
    def updateTribeName(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateTribeName")
    }
  
  }

  // @LINE:83
  class ReverseGameDataController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
    def getDefensiveBuildings(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "defensivebuildings")
    }
  
    // @LINE:89
    def getDefensiveBuildingLevel(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "defensivebuildinglevel")
    }
  
    // @LINE:95
    def getSpells(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "spells")
    }
  
    // @LINE:101
    def publishSpreadsheet(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "publishspeadsheet")
    }
  
    // @LINE:93
    def getTownHallLevel(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "townhalllevel")
    }
  
    // @LINE:92
    def getOtherBuildings(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "otherbuildings")
    }
  
    // @LINE:99
    def getAchievements(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "achievements")
    }
  
    // @LINE:97
    def getObstacles(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "obstacles")
    }
  
    // @LINE:96
    def getSpellLevels(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "spelllevels")
    }
  
    // @LINE:87
    def getCombatUnits(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "combatunits")
    }
  
    // @LINE:94
    def getDecorations(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "decorations")
    }
  
    // @LINE:98
    def getTrophy(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "trophy")
    }
  
    // @LINE:83
    def gameData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "gamedata")
    }
  
    // @LINE:85
    def getCampaignReference(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "campaignreference")
    }
  
    // @LINE:90
    def getResourceBuildings(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "resourcebuildings")
    }
  
    // @LINE:86
    def getUnitLevel(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "unitlevels")
    }
  
    // @LINE:91
    def getArmyBuildings(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "armybuildings")
    }
  
    // @LINE:100
    def getSpreadsheetData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "viewspreadsheetdata")
    }
  
  }

  // @LINE:113
  class ReverseBundleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:114
    def getBundle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getbundle")
    }
  
    // @LINE:115
    def saveBundle(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "savebundledata")
    }
  
    // @LINE:113
    def bundle(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bundle")
    }
  
  }

  // @LINE:125
  class ReversePlayersDataController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:130
    def getGlobalChat(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "globalchat")
    }
  
    // @LINE:126
    def getDAU(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "dau")
    }
  
    // @LINE:133
    def getUniqueUsersNumber(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "uniqueusersnumber")
    }
  
    // @LINE:129
    def getCCU(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "getccu")
    }
  
    // @LINE:131
    def getTribeChat(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "tribechat")
    }
  
    // @LINE:128
    def getNewPlayingUsers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "newplayingusers")
    }
  
    // @LINE:127
    def getMAU(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mau")
    }
  
    // @LINE:132
    def getLoginLogoutTime(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "loginlogout")
    }
  
    // @LINE:125
    def playersData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "playersdata")
    }
  
  }

  // @LINE:58
  class ReverseTimeZoneController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def getTimeZone(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "timezone")
    }
  
    // @LINE:59
    def updateTimeZone(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updatetimezone")
    }
  
  }


}