
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phuongdt1/Desktop/lumba/lumba-play-admin-panel/conf/routes
// @DATE:Thu Sep 24 14:06:56 ICT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_16: controllers.Application,
  // @LINE:14
  GameStateController_2: controllers.GameStateController,
  // @LINE:32
  TribeController_4: controllers.TribeController,
  // @LINE:42
  LoginController_15: controllers.LoginController,
  // @LINE:45
  UsersManagementController_1: controllers.UsersManagementController,
  // @LINE:58
  TimeZoneController_9: controllers.TimeZoneController,
  // @LINE:61
  TextStringController_10: controllers.TextStringController,
  // @LINE:65
  ProfanityController_13: controllers.ProfanityController,
  // @LINE:69
  NewsController_5: controllers.NewsController,
  // @LINE:83
  GameDataController_11: controllers.GameDataController,
  // @LINE:103
  GameSettingsController_6: controllers.GameSettingsController,
  // @LINE:111
  GameVersionController_12: controllers.GameVersionController,
  // @LINE:113
  BundleController_8: controllers.BundleController,
  // @LINE:117
  iapController_3: controllers.iapController,
  // @LINE:125
  PlayersDataController_0: controllers.PlayersDataController,
  // @LINE:135
  AdjustCallbackController_7: controllers.AdjustCallbackController,
  // @LINE:141
  Assets_14: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_16: controllers.Application,
    // @LINE:14
    GameStateController_2: controllers.GameStateController,
    // @LINE:32
    TribeController_4: controllers.TribeController,
    // @LINE:42
    LoginController_15: controllers.LoginController,
    // @LINE:45
    UsersManagementController_1: controllers.UsersManagementController,
    // @LINE:58
    TimeZoneController_9: controllers.TimeZoneController,
    // @LINE:61
    TextStringController_10: controllers.TextStringController,
    // @LINE:65
    ProfanityController_13: controllers.ProfanityController,
    // @LINE:69
    NewsController_5: controllers.NewsController,
    // @LINE:83
    GameDataController_11: controllers.GameDataController,
    // @LINE:103
    GameSettingsController_6: controllers.GameSettingsController,
    // @LINE:111
    GameVersionController_12: controllers.GameVersionController,
    // @LINE:113
    BundleController_8: controllers.BundleController,
    // @LINE:117
    iapController_3: controllers.iapController,
    // @LINE:125
    PlayersDataController_0: controllers.PlayersDataController,
    // @LINE:135
    AdjustCallbackController_7: controllers.AdjustCallbackController,
    // @LINE:141
    Assets_14: controllers.Assets
  ) = this(errorHandler, Application_16, GameStateController_2, TribeController_4, LoginController_15, UsersManagementController_1, TimeZoneController_9, TextStringController_10, ProfanityController_13, NewsController_5, GameDataController_11, GameSettingsController_6, GameVersionController_12, BundleController_8, iapController_3, PlayersDataController_0, AdjustCallbackController_7, Assets_14, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_16, GameStateController_2, TribeController_4, LoginController_15, UsersManagementController_1, TimeZoneController_9, TextStringController_10, ProfanityController_13, NewsController_5, GameDataController_11, GameSettingsController_6, GameVersionController_12, BundleController_8, iapController_3, PlayersDataController_0, AdjustCallbackController_7, Assets_14, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inprogress""", """controllers.Application.inprogress()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gamestate""", """controllers.Application.gamestate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tribes""", """controllers.Application.tribes()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchByUserId""", """controllers.GameStateController.getUserById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchUserByName""", """controllers.GameStateController.getUserList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchUserByEmail""", """controllers.GameStateController.getUserList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchUserByDagger""", """controllers.GameStateController.getUserList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUserData""", """controllers.GameStateController.updateUserData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noteForUser""", """controllers.GameStateController.noteForUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteUser""", """controllers.GameStateController.deleteUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fakeUser""", """controllers.GameStateController.fakeUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """downloadBattleLog""", """controllers.GameStateController.downloadBattleLog()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """turnOffShield""", """controllers.GameStateController.turnOffShield()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """turnOnShield""", """controllers.GameStateController.turnOnShield()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockLeaderBoard""", """controllers.GameStateController.blockLeaderBoard()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockTribe""", """controllers.GameStateController.blockTribe()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockSearching""", """controllers.GameStateController.blockSearching()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockGlobalChat""", """controllers.GameStateController.blockGlobalChat()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockAttack""", """controllers.GameStateController.blockAttack()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTribeList""", """controllers.TribeController.getAllTribes()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTribeDetails""", """controllers.TribeController.getTribeDetails()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchTribeById""", """controllers.TribeController.getTribeById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchTribeByName""", """controllers.TribeController.getTribeByName()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateTribeName""", """controllers.TribeController.updateTribeName()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """downloadTribeMessage""", """controllers.TribeController.getTribeMessage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockTribe""", """controllers.TribeController.blockTribe()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checklogin""", """controllers.LoginController.checklogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usersmanagement""", """controllers.UsersManagementController.getAdminUserList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAdminAccount""", """controllers.UsersManagementController.addAdminAccount()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateusername""", """controllers.UsersManagementController.updateUsername()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateemail""", """controllers.UsersManagementController.updateEmail()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatepassword""", """controllers.UsersManagementController.updatePassword()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updaterole""", """controllers.UsersManagementController.updateRole()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteadminacc""", """controllers.UsersManagementController.deleteAdminAcc()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getuserdata""", """controllers.UsersManagementController.getUserData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendEmail""", """controllers.UsersManagementController.sendEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.UsersManagementController.profile()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getprofile""", """controllers.UsersManagementController.getProfile()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateprofile""", """controllers.UsersManagementController.updateProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """timezone""", """controllers.TimeZoneController.getTimeZone()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatetimezone""", """controllers.TimeZoneController.updateTimeZone()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """textstring""", """controllers.TextStringController.textString()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTextString""", """controllers.TextStringController.getTextString()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exporttextstring""", """controllers.TextStringController.exportTextString()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profanity""", """controllers.ProfanityController.profanity()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getprofanitytext""", """controllers.ProfanityController.getProfanityText()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exportprofanity""", """controllers.ProfanityController.exportProfanity()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """news""", """controllers.NewsController.getNews()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addenglishnews""", """controllers.NewsController.addEnglishNews()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addarabnews""", """controllers.NewsController.addArabNews()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateenglishnewstitle""", """controllers.NewsController.updateEnglishNewsTitle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateenglishnewsimage""", """controllers.NewsController.updateEnglishNewsImage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateenglishnewsvideo""", """controllers.NewsController.updateEnglishNewsVideo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateenglishnewscontent""", """controllers.NewsController.updateEnglishNewsContent()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteenglishnews""", """controllers.NewsController.deleteEnglishNews()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatearabnewstitle""", """controllers.NewsController.updateArabNewsTitle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatearabnewsimage""", """controllers.NewsController.updateArabNewsImage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatearabnewsvideo""", """controllers.NewsController.updateArabNewsVideo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatearabnewscontent""", """controllers.NewsController.updateArabNewsContent()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletearabnews""", """controllers.NewsController.deleteArabNews()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gamedata""", """controllers.GameDataController.gameData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """campaignreference""", """controllers.GameDataController.getCampaignReference()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """unitlevels""", """controllers.GameDataController.getUnitLevel()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """combatunits""", """controllers.GameDataController.getCombatUnits()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """defensivebuildings""", """controllers.GameDataController.getDefensiveBuildings()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """defensivebuildinglevel""", """controllers.GameDataController.getDefensiveBuildingLevel()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resourcebuildings""", """controllers.GameDataController.getResourceBuildings()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """armybuildings""", """controllers.GameDataController.getArmyBuildings()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """otherbuildings""", """controllers.GameDataController.getOtherBuildings()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """townhalllevel""", """controllers.GameDataController.getTownHallLevel()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """decorations""", """controllers.GameDataController.getDecorations()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """spells""", """controllers.GameDataController.getSpells()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """spelllevels""", """controllers.GameDataController.getSpellLevels()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """obstacles""", """controllers.GameDataController.getObstacles()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """trophy""", """controllers.GameDataController.getTrophy()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """achievements""", """controllers.GameDataController.getAchievements()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewspreadsheetdata""", """controllers.GameDataController.getSpreadsheetData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publishspeadsheet""", """controllers.GameDataController.publishSpreadsheet()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gamesettings""", """controllers.GameSettingsController.getGameSettings()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings""", """controllers.GameSettingsController.getSettings()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """savesettingsdata""", """controllers.GameSettingsController.saveSettingsData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addversionsfs""", """controllers.GameSettingsController.addVersionSFS()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteunuseversion""", """controllers.GameSettingsController.deleteUnuseVersion()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changegamesubversion""", """controllers.GameSettingsController.changeGameSubVersion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gameversion""", """controllers.GameVersionController.getGameVersion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bundle""", """controllers.BundleController.bundle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbundle""", """controllers.BundleController.getBundle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """savebundledata""", """controllers.BundleController.saveBundle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """iapdata""", """controllers.iapController.iapData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """iapios""", """controllers.iapController.iapIOS()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """iapandroid""", """controllers.iapController.iapAndroid()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """iapvalid""", """controllers.iapController.iapValid()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testdate""", """controllers.iapController.testDate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uniquepayingusers""", """controllers.iapController.getUniquePayingUsers()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newpayingusers""", """controllers.iapController.getNewPayingUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """playersdata""", """controllers.PlayersDataController.playersData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dau""", """controllers.PlayersDataController.getDAU()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mau""", """controllers.PlayersDataController.getMAU()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newplayingusers""", """controllers.PlayersDataController.getNewPlayingUsers()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getccu""", """controllers.PlayersDataController.getCCU()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """globalchat""", """controllers.PlayersDataController.getGlobalChat()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tribechat""", """controllers.PlayersDataController.getTribeChat()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginlogout""", """controllers.PlayersDataController.getLoginLogoutTime()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uniqueusersnumber""", """controllers.PlayersDataController.getUniqueUsersNumber()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adjustcallback""", """controllers.AdjustCallbackController.AdjustCallback()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getalladjustcallbackdata""", """controllers.AdjustCallbackController.getAllAdjustCallbackData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getadjustcallbackdata""", """controllers.AdjustCallbackController.getAdjustCallbackData()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_16.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_inprogress1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("inprogress")))
  )
  private[this] lazy val controllers_Application_inprogress1_invoker = createInvoker(
    Application_16.inprogress(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "inprogress",
      Nil,
      "GET",
      """""",
      this.prefix + """inprogress"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_gamestate2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gamestate")))
  )
  private[this] lazy val controllers_Application_gamestate2_invoker = createInvoker(
    Application_16.gamestate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "gamestate",
      Nil,
      "GET",
      """""",
      this.prefix + """gamestate"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_tribes3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tribes")))
  )
  private[this] lazy val controllers_Application_tribes3_invoker = createInvoker(
    Application_16.tribes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "tribes",
      Nil,
      "GET",
      """""",
      this.prefix + """tribes"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_GameStateController_getUserById4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchByUserId")))
  )
  private[this] lazy val controllers_GameStateController_getUserById4_invoker = createInvoker(
    GameStateController_2.getUserById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "getUserById",
      Nil,
      "POST",
      """""",
      this.prefix + """searchByUserId"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_GameStateController_getUserList5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchUserByName")))
  )
  private[this] lazy val controllers_GameStateController_getUserList5_invoker = createInvoker(
    GameStateController_2.getUserList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "getUserList",
      Nil,
      "POST",
      """""",
      this.prefix + """searchUserByName"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_GameStateController_getUserList6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchUserByEmail")))
  )
  private[this] lazy val controllers_GameStateController_getUserList6_invoker = createInvoker(
    GameStateController_2.getUserList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "getUserList",
      Nil,
      "POST",
      """""",
      this.prefix + """searchUserByEmail"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_GameStateController_getUserList7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchUserByDagger")))
  )
  private[this] lazy val controllers_GameStateController_getUserList7_invoker = createInvoker(
    GameStateController_2.getUserList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "getUserList",
      Nil,
      "POST",
      """""",
      this.prefix + """searchUserByDagger"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_GameStateController_updateUserData8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUserData")))
  )
  private[this] lazy val controllers_GameStateController_updateUserData8_invoker = createInvoker(
    GameStateController_2.updateUserData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "updateUserData",
      Nil,
      "POST",
      """""",
      this.prefix + """updateUserData"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_GameStateController_noteForUser9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noteForUser")))
  )
  private[this] lazy val controllers_GameStateController_noteForUser9_invoker = createInvoker(
    GameStateController_2.noteForUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "noteForUser",
      Nil,
      "POST",
      """""",
      this.prefix + """noteForUser"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_GameStateController_deleteUser10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteUser")))
  )
  private[this] lazy val controllers_GameStateController_deleteUser10_invoker = createInvoker(
    GameStateController_2.deleteUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "deleteUser",
      Nil,
      "POST",
      """""",
      this.prefix + """deleteUser"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_GameStateController_fakeUser11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fakeUser")))
  )
  private[this] lazy val controllers_GameStateController_fakeUser11_invoker = createInvoker(
    GameStateController_2.fakeUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "fakeUser",
      Nil,
      "POST",
      """""",
      this.prefix + """fakeUser"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_GameStateController_downloadBattleLog12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("downloadBattleLog")))
  )
  private[this] lazy val controllers_GameStateController_downloadBattleLog12_invoker = createInvoker(
    GameStateController_2.downloadBattleLog(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "downloadBattleLog",
      Nil,
      "POST",
      """""",
      this.prefix + """downloadBattleLog"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_GameStateController_turnOffShield13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("turnOffShield")))
  )
  private[this] lazy val controllers_GameStateController_turnOffShield13_invoker = createInvoker(
    GameStateController_2.turnOffShield(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "turnOffShield",
      Nil,
      "POST",
      """""",
      this.prefix + """turnOffShield"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_GameStateController_turnOnShield14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("turnOnShield")))
  )
  private[this] lazy val controllers_GameStateController_turnOnShield14_invoker = createInvoker(
    GameStateController_2.turnOnShield(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "turnOnShield",
      Nil,
      "POST",
      """""",
      this.prefix + """turnOnShield"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_GameStateController_blockLeaderBoard15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockLeaderBoard")))
  )
  private[this] lazy val controllers_GameStateController_blockLeaderBoard15_invoker = createInvoker(
    GameStateController_2.blockLeaderBoard(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "blockLeaderBoard",
      Nil,
      "POST",
      """""",
      this.prefix + """blockLeaderBoard"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_GameStateController_blockTribe16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockTribe")))
  )
  private[this] lazy val controllers_GameStateController_blockTribe16_invoker = createInvoker(
    GameStateController_2.blockTribe(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "blockTribe",
      Nil,
      "POST",
      """""",
      this.prefix + """blockTribe"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_GameStateController_blockSearching17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockSearching")))
  )
  private[this] lazy val controllers_GameStateController_blockSearching17_invoker = createInvoker(
    GameStateController_2.blockSearching(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "blockSearching",
      Nil,
      "POST",
      """""",
      this.prefix + """blockSearching"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_GameStateController_blockGlobalChat18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockGlobalChat")))
  )
  private[this] lazy val controllers_GameStateController_blockGlobalChat18_invoker = createInvoker(
    GameStateController_2.blockGlobalChat(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "blockGlobalChat",
      Nil,
      "POST",
      """""",
      this.prefix + """blockGlobalChat"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_GameStateController_blockAttack19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockAttack")))
  )
  private[this] lazy val controllers_GameStateController_blockAttack19_invoker = createInvoker(
    GameStateController_2.blockAttack(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameStateController",
      "blockAttack",
      Nil,
      "POST",
      """""",
      this.prefix + """blockAttack"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_TribeController_getAllTribes20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTribeList")))
  )
  private[this] lazy val controllers_TribeController_getAllTribes20_invoker = createInvoker(
    TribeController_4.getAllTribes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TribeController",
      "getAllTribes",
      Nil,
      "POST",
      """""",
      this.prefix + """getTribeList"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_TribeController_getTribeDetails21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTribeDetails")))
  )
  private[this] lazy val controllers_TribeController_getTribeDetails21_invoker = createInvoker(
    TribeController_4.getTribeDetails(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TribeController",
      "getTribeDetails",
      Nil,
      "POST",
      """""",
      this.prefix + """getTribeDetails"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_TribeController_getTribeById22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchTribeById")))
  )
  private[this] lazy val controllers_TribeController_getTribeById22_invoker = createInvoker(
    TribeController_4.getTribeById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TribeController",
      "getTribeById",
      Nil,
      "POST",
      """""",
      this.prefix + """searchTribeById"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_TribeController_getTribeByName23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchTribeByName")))
  )
  private[this] lazy val controllers_TribeController_getTribeByName23_invoker = createInvoker(
    TribeController_4.getTribeByName(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TribeController",
      "getTribeByName",
      Nil,
      "POST",
      """""",
      this.prefix + """searchTribeByName"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_TribeController_updateTribeName24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateTribeName")))
  )
  private[this] lazy val controllers_TribeController_updateTribeName24_invoker = createInvoker(
    TribeController_4.updateTribeName(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TribeController",
      "updateTribeName",
      Nil,
      "POST",
      """""",
      this.prefix + """updateTribeName"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_TribeController_getTribeMessage25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("downloadTribeMessage")))
  )
  private[this] lazy val controllers_TribeController_getTribeMessage25_invoker = createInvoker(
    TribeController_4.getTribeMessage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TribeController",
      "getTribeMessage",
      Nil,
      "POST",
      """""",
      this.prefix + """downloadTribeMessage"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_TribeController_blockTribe26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockTribe")))
  )
  private[this] lazy val controllers_TribeController_blockTribe26_invoker = createInvoker(
    TribeController_4.blockTribe(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TribeController",
      "blockTribe",
      Nil,
      "POST",
      """""",
      this.prefix + """blockTribe"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_LoginController_login27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login27_invoker = createInvoker(
    LoginController_15.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_LoginController_checklogin28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checklogin")))
  )
  private[this] lazy val controllers_LoginController_checklogin28_invoker = createInvoker(
    LoginController_15.checklogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "checklogin",
      Nil,
      "POST",
      """""",
      this.prefix + """checklogin"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_UsersManagementController_getAdminUserList29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usersmanagement")))
  )
  private[this] lazy val controllers_UsersManagementController_getAdminUserList29_invoker = createInvoker(
    UsersManagementController_1.getAdminUserList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "getAdminUserList",
      Nil,
      "GET",
      """""",
      this.prefix + """usersmanagement"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_UsersManagementController_addAdminAccount30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAdminAccount")))
  )
  private[this] lazy val controllers_UsersManagementController_addAdminAccount30_invoker = createInvoker(
    UsersManagementController_1.addAdminAccount(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "addAdminAccount",
      Nil,
      "POST",
      """""",
      this.prefix + """addAdminAccount"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_UsersManagementController_updateUsername31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateusername")))
  )
  private[this] lazy val controllers_UsersManagementController_updateUsername31_invoker = createInvoker(
    UsersManagementController_1.updateUsername(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "updateUsername",
      Nil,
      "POST",
      """""",
      this.prefix + """updateusername"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_UsersManagementController_updateEmail32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateemail")))
  )
  private[this] lazy val controllers_UsersManagementController_updateEmail32_invoker = createInvoker(
    UsersManagementController_1.updateEmail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "updateEmail",
      Nil,
      "POST",
      """""",
      this.prefix + """updateemail"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_UsersManagementController_updatePassword33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepassword")))
  )
  private[this] lazy val controllers_UsersManagementController_updatePassword33_invoker = createInvoker(
    UsersManagementController_1.updatePassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "updatePassword",
      Nil,
      "POST",
      """""",
      this.prefix + """updatepassword"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_UsersManagementController_updateRole34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updaterole")))
  )
  private[this] lazy val controllers_UsersManagementController_updateRole34_invoker = createInvoker(
    UsersManagementController_1.updateRole(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "updateRole",
      Nil,
      "POST",
      """""",
      this.prefix + """updaterole"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_UsersManagementController_deleteAdminAcc35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteadminacc")))
  )
  private[this] lazy val controllers_UsersManagementController_deleteAdminAcc35_invoker = createInvoker(
    UsersManagementController_1.deleteAdminAcc(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "deleteAdminAcc",
      Nil,
      "POST",
      """""",
      this.prefix + """deleteadminacc"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_UsersManagementController_getUserData36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getuserdata")))
  )
  private[this] lazy val controllers_UsersManagementController_getUserData36_invoker = createInvoker(
    UsersManagementController_1.getUserData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "getUserData",
      Nil,
      "POST",
      """""",
      this.prefix + """getuserdata"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_UsersManagementController_sendEmail37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendEmail")))
  )
  private[this] lazy val controllers_UsersManagementController_sendEmail37_invoker = createInvoker(
    UsersManagementController_1.sendEmail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "sendEmail",
      Nil,
      "POST",
      """""",
      this.prefix + """sendEmail"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_UsersManagementController_profile38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_UsersManagementController_profile38_invoker = createInvoker(
    UsersManagementController_1.profile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "profile",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_UsersManagementController_getProfile39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getprofile")))
  )
  private[this] lazy val controllers_UsersManagementController_getProfile39_invoker = createInvoker(
    UsersManagementController_1.getProfile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "getProfile",
      Nil,
      "POST",
      """""",
      this.prefix + """getprofile"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_UsersManagementController_updateProfile40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateprofile")))
  )
  private[this] lazy val controllers_UsersManagementController_updateProfile40_invoker = createInvoker(
    UsersManagementController_1.updateProfile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "updateProfile",
      Nil,
      "POST",
      """""",
      this.prefix + """updateprofile"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_TimeZoneController_getTimeZone41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("timezone")))
  )
  private[this] lazy val controllers_TimeZoneController_getTimeZone41_invoker = createInvoker(
    TimeZoneController_9.getTimeZone(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TimeZoneController",
      "getTimeZone",
      Nil,
      "GET",
      """""",
      this.prefix + """timezone"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_TimeZoneController_updateTimeZone42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatetimezone")))
  )
  private[this] lazy val controllers_TimeZoneController_updateTimeZone42_invoker = createInvoker(
    TimeZoneController_9.updateTimeZone(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TimeZoneController",
      "updateTimeZone",
      Nil,
      "POST",
      """""",
      this.prefix + """updatetimezone"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_TextStringController_textString43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("textstring")))
  )
  private[this] lazy val controllers_TextStringController_textString43_invoker = createInvoker(
    TextStringController_10.textString(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TextStringController",
      "textString",
      Nil,
      "GET",
      """""",
      this.prefix + """textstring"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_TextStringController_getTextString44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTextString")))
  )
  private[this] lazy val controllers_TextStringController_getTextString44_invoker = createInvoker(
    TextStringController_10.getTextString(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TextStringController",
      "getTextString",
      Nil,
      "POST",
      """""",
      this.prefix + """getTextString"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_TextStringController_exportTextString45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exporttextstring")))
  )
  private[this] lazy val controllers_TextStringController_exportTextString45_invoker = createInvoker(
    TextStringController_10.exportTextString(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TextStringController",
      "exportTextString",
      Nil,
      "POST",
      """""",
      this.prefix + """exporttextstring"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_ProfanityController_profanity46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profanity")))
  )
  private[this] lazy val controllers_ProfanityController_profanity46_invoker = createInvoker(
    ProfanityController_13.profanity(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfanityController",
      "profanity",
      Nil,
      "GET",
      """""",
      this.prefix + """profanity"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_ProfanityController_getProfanityText47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getprofanitytext")))
  )
  private[this] lazy val controllers_ProfanityController_getProfanityText47_invoker = createInvoker(
    ProfanityController_13.getProfanityText(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfanityController",
      "getProfanityText",
      Nil,
      "POST",
      """""",
      this.prefix + """getprofanitytext"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_ProfanityController_exportProfanity48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportprofanity")))
  )
  private[this] lazy val controllers_ProfanityController_exportProfanity48_invoker = createInvoker(
    ProfanityController_13.exportProfanity(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfanityController",
      "exportProfanity",
      Nil,
      "POST",
      """""",
      this.prefix + """exportprofanity"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_NewsController_getNews49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("news")))
  )
  private[this] lazy val controllers_NewsController_getNews49_invoker = createInvoker(
    NewsController_5.getNews(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "getNews",
      Nil,
      "GET",
      """""",
      this.prefix + """news"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_NewsController_addEnglishNews50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addenglishnews")))
  )
  private[this] lazy val controllers_NewsController_addEnglishNews50_invoker = createInvoker(
    NewsController_5.addEnglishNews(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "addEnglishNews",
      Nil,
      "POST",
      """""",
      this.prefix + """addenglishnews"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_NewsController_addArabNews51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addarabnews")))
  )
  private[this] lazy val controllers_NewsController_addArabNews51_invoker = createInvoker(
    NewsController_5.addArabNews(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "addArabNews",
      Nil,
      "POST",
      """""",
      this.prefix + """addarabnews"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_NewsController_updateEnglishNewsTitle52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateenglishnewstitle")))
  )
  private[this] lazy val controllers_NewsController_updateEnglishNewsTitle52_invoker = createInvoker(
    NewsController_5.updateEnglishNewsTitle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "updateEnglishNewsTitle",
      Nil,
      "POST",
      """""",
      this.prefix + """updateenglishnewstitle"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_NewsController_updateEnglishNewsImage53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateenglishnewsimage")))
  )
  private[this] lazy val controllers_NewsController_updateEnglishNewsImage53_invoker = createInvoker(
    NewsController_5.updateEnglishNewsImage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "updateEnglishNewsImage",
      Nil,
      "POST",
      """""",
      this.prefix + """updateenglishnewsimage"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_NewsController_updateEnglishNewsVideo54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateenglishnewsvideo")))
  )
  private[this] lazy val controllers_NewsController_updateEnglishNewsVideo54_invoker = createInvoker(
    NewsController_5.updateEnglishNewsVideo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "updateEnglishNewsVideo",
      Nil,
      "POST",
      """""",
      this.prefix + """updateenglishnewsvideo"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_NewsController_updateEnglishNewsContent55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateenglishnewscontent")))
  )
  private[this] lazy val controllers_NewsController_updateEnglishNewsContent55_invoker = createInvoker(
    NewsController_5.updateEnglishNewsContent(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "updateEnglishNewsContent",
      Nil,
      "POST",
      """""",
      this.prefix + """updateenglishnewscontent"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_NewsController_deleteEnglishNews56_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteenglishnews")))
  )
  private[this] lazy val controllers_NewsController_deleteEnglishNews56_invoker = createInvoker(
    NewsController_5.deleteEnglishNews(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "deleteEnglishNews",
      Nil,
      "POST",
      """""",
      this.prefix + """deleteenglishnews"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_NewsController_updateArabNewsTitle57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatearabnewstitle")))
  )
  private[this] lazy val controllers_NewsController_updateArabNewsTitle57_invoker = createInvoker(
    NewsController_5.updateArabNewsTitle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "updateArabNewsTitle",
      Nil,
      "POST",
      """""",
      this.prefix + """updatearabnewstitle"""
    )
  )

  // @LINE:78
  private[this] lazy val controllers_NewsController_updateArabNewsImage58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatearabnewsimage")))
  )
  private[this] lazy val controllers_NewsController_updateArabNewsImage58_invoker = createInvoker(
    NewsController_5.updateArabNewsImage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "updateArabNewsImage",
      Nil,
      "POST",
      """""",
      this.prefix + """updatearabnewsimage"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_NewsController_updateArabNewsVideo59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatearabnewsvideo")))
  )
  private[this] lazy val controllers_NewsController_updateArabNewsVideo59_invoker = createInvoker(
    NewsController_5.updateArabNewsVideo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "updateArabNewsVideo",
      Nil,
      "POST",
      """""",
      this.prefix + """updatearabnewsvideo"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_NewsController_updateArabNewsContent60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatearabnewscontent")))
  )
  private[this] lazy val controllers_NewsController_updateArabNewsContent60_invoker = createInvoker(
    NewsController_5.updateArabNewsContent(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "updateArabNewsContent",
      Nil,
      "POST",
      """""",
      this.prefix + """updatearabnewscontent"""
    )
  )

  // @LINE:81
  private[this] lazy val controllers_NewsController_deleteArabNews61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletearabnews")))
  )
  private[this] lazy val controllers_NewsController_deleteArabNews61_invoker = createInvoker(
    NewsController_5.deleteArabNews(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NewsController",
      "deleteArabNews",
      Nil,
      "POST",
      """""",
      this.prefix + """deletearabnews"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_GameDataController_gameData62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gamedata")))
  )
  private[this] lazy val controllers_GameDataController_gameData62_invoker = createInvoker(
    GameDataController_11.gameData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "gameData",
      Nil,
      "GET",
      """""",
      this.prefix + """gamedata"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_GameDataController_getCampaignReference63_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("campaignreference")))
  )
  private[this] lazy val controllers_GameDataController_getCampaignReference63_invoker = createInvoker(
    GameDataController_11.getCampaignReference(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getCampaignReference",
      Nil,
      "POST",
      """""",
      this.prefix + """campaignreference"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_GameDataController_getUnitLevel64_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("unitlevels")))
  )
  private[this] lazy val controllers_GameDataController_getUnitLevel64_invoker = createInvoker(
    GameDataController_11.getUnitLevel(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getUnitLevel",
      Nil,
      "POST",
      """""",
      this.prefix + """unitlevels"""
    )
  )

  // @LINE:87
  private[this] lazy val controllers_GameDataController_getCombatUnits65_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("combatunits")))
  )
  private[this] lazy val controllers_GameDataController_getCombatUnits65_invoker = createInvoker(
    GameDataController_11.getCombatUnits(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getCombatUnits",
      Nil,
      "POST",
      """""",
      this.prefix + """combatunits"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_GameDataController_getDefensiveBuildings66_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("defensivebuildings")))
  )
  private[this] lazy val controllers_GameDataController_getDefensiveBuildings66_invoker = createInvoker(
    GameDataController_11.getDefensiveBuildings(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getDefensiveBuildings",
      Nil,
      "POST",
      """""",
      this.prefix + """defensivebuildings"""
    )
  )

  // @LINE:89
  private[this] lazy val controllers_GameDataController_getDefensiveBuildingLevel67_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("defensivebuildinglevel")))
  )
  private[this] lazy val controllers_GameDataController_getDefensiveBuildingLevel67_invoker = createInvoker(
    GameDataController_11.getDefensiveBuildingLevel(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getDefensiveBuildingLevel",
      Nil,
      "POST",
      """""",
      this.prefix + """defensivebuildinglevel"""
    )
  )

  // @LINE:90
  private[this] lazy val controllers_GameDataController_getResourceBuildings68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resourcebuildings")))
  )
  private[this] lazy val controllers_GameDataController_getResourceBuildings68_invoker = createInvoker(
    GameDataController_11.getResourceBuildings(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getResourceBuildings",
      Nil,
      "POST",
      """""",
      this.prefix + """resourcebuildings"""
    )
  )

  // @LINE:91
  private[this] lazy val controllers_GameDataController_getArmyBuildings69_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("armybuildings")))
  )
  private[this] lazy val controllers_GameDataController_getArmyBuildings69_invoker = createInvoker(
    GameDataController_11.getArmyBuildings(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getArmyBuildings",
      Nil,
      "POST",
      """""",
      this.prefix + """armybuildings"""
    )
  )

  // @LINE:92
  private[this] lazy val controllers_GameDataController_getOtherBuildings70_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("otherbuildings")))
  )
  private[this] lazy val controllers_GameDataController_getOtherBuildings70_invoker = createInvoker(
    GameDataController_11.getOtherBuildings(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getOtherBuildings",
      Nil,
      "POST",
      """""",
      this.prefix + """otherbuildings"""
    )
  )

  // @LINE:93
  private[this] lazy val controllers_GameDataController_getTownHallLevel71_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("townhalllevel")))
  )
  private[this] lazy val controllers_GameDataController_getTownHallLevel71_invoker = createInvoker(
    GameDataController_11.getTownHallLevel(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getTownHallLevel",
      Nil,
      "POST",
      """""",
      this.prefix + """townhalllevel"""
    )
  )

  // @LINE:94
  private[this] lazy val controllers_GameDataController_getDecorations72_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("decorations")))
  )
  private[this] lazy val controllers_GameDataController_getDecorations72_invoker = createInvoker(
    GameDataController_11.getDecorations(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getDecorations",
      Nil,
      "POST",
      """""",
      this.prefix + """decorations"""
    )
  )

  // @LINE:95
  private[this] lazy val controllers_GameDataController_getSpells73_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spells")))
  )
  private[this] lazy val controllers_GameDataController_getSpells73_invoker = createInvoker(
    GameDataController_11.getSpells(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getSpells",
      Nil,
      "POST",
      """""",
      this.prefix + """spells"""
    )
  )

  // @LINE:96
  private[this] lazy val controllers_GameDataController_getSpellLevels74_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spelllevels")))
  )
  private[this] lazy val controllers_GameDataController_getSpellLevels74_invoker = createInvoker(
    GameDataController_11.getSpellLevels(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getSpellLevels",
      Nil,
      "POST",
      """""",
      this.prefix + """spelllevels"""
    )
  )

  // @LINE:97
  private[this] lazy val controllers_GameDataController_getObstacles75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("obstacles")))
  )
  private[this] lazy val controllers_GameDataController_getObstacles75_invoker = createInvoker(
    GameDataController_11.getObstacles(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getObstacles",
      Nil,
      "POST",
      """""",
      this.prefix + """obstacles"""
    )
  )

  // @LINE:98
  private[this] lazy val controllers_GameDataController_getTrophy76_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("trophy")))
  )
  private[this] lazy val controllers_GameDataController_getTrophy76_invoker = createInvoker(
    GameDataController_11.getTrophy(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getTrophy",
      Nil,
      "POST",
      """""",
      this.prefix + """trophy"""
    )
  )

  // @LINE:99
  private[this] lazy val controllers_GameDataController_getAchievements77_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("achievements")))
  )
  private[this] lazy val controllers_GameDataController_getAchievements77_invoker = createInvoker(
    GameDataController_11.getAchievements(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getAchievements",
      Nil,
      "POST",
      """""",
      this.prefix + """achievements"""
    )
  )

  // @LINE:100
  private[this] lazy val controllers_GameDataController_getSpreadsheetData78_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewspreadsheetdata")))
  )
  private[this] lazy val controllers_GameDataController_getSpreadsheetData78_invoker = createInvoker(
    GameDataController_11.getSpreadsheetData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "getSpreadsheetData",
      Nil,
      "POST",
      """""",
      this.prefix + """viewspreadsheetdata"""
    )
  )

  // @LINE:101
  private[this] lazy val controllers_GameDataController_publishSpreadsheet79_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publishspeadsheet")))
  )
  private[this] lazy val controllers_GameDataController_publishSpreadsheet79_invoker = createInvoker(
    GameDataController_11.publishSpreadsheet(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameDataController",
      "publishSpreadsheet",
      Nil,
      "POST",
      """""",
      this.prefix + """publishspeadsheet"""
    )
  )

  // @LINE:103
  private[this] lazy val controllers_GameSettingsController_getGameSettings80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gamesettings")))
  )
  private[this] lazy val controllers_GameSettingsController_getGameSettings80_invoker = createInvoker(
    GameSettingsController_6.getGameSettings(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameSettingsController",
      "getGameSettings",
      Nil,
      "GET",
      """""",
      this.prefix + """gamesettings"""
    )
  )

  // @LINE:104
  private[this] lazy val controllers_GameSettingsController_getSettings81_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val controllers_GameSettingsController_getSettings81_invoker = createInvoker(
    GameSettingsController_6.getSettings(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameSettingsController",
      "getSettings",
      Nil,
      "POST",
      """""",
      this.prefix + """settings"""
    )
  )

  // @LINE:105
  private[this] lazy val controllers_GameSettingsController_saveSettingsData82_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("savesettingsdata")))
  )
  private[this] lazy val controllers_GameSettingsController_saveSettingsData82_invoker = createInvoker(
    GameSettingsController_6.saveSettingsData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameSettingsController",
      "saveSettingsData",
      Nil,
      "POST",
      """""",
      this.prefix + """savesettingsdata"""
    )
  )

  // @LINE:106
  private[this] lazy val controllers_GameSettingsController_addVersionSFS83_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addversionsfs")))
  )
  private[this] lazy val controllers_GameSettingsController_addVersionSFS83_invoker = createInvoker(
    GameSettingsController_6.addVersionSFS(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameSettingsController",
      "addVersionSFS",
      Nil,
      "POST",
      """""",
      this.prefix + """addversionsfs"""
    )
  )

  // @LINE:107
  private[this] lazy val controllers_GameSettingsController_deleteUnuseVersion84_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteunuseversion")))
  )
  private[this] lazy val controllers_GameSettingsController_deleteUnuseVersion84_invoker = createInvoker(
    GameSettingsController_6.deleteUnuseVersion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameSettingsController",
      "deleteUnuseVersion",
      Nil,
      "POST",
      """""",
      this.prefix + """deleteunuseversion"""
    )
  )

  // @LINE:108
  private[this] lazy val controllers_GameSettingsController_changeGameSubVersion85_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changegamesubversion")))
  )
  private[this] lazy val controllers_GameSettingsController_changeGameSubVersion85_invoker = createInvoker(
    GameSettingsController_6.changeGameSubVersion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameSettingsController",
      "changeGameSubVersion",
      Nil,
      "POST",
      """""",
      this.prefix + """changegamesubversion"""
    )
  )

  // @LINE:111
  private[this] lazy val controllers_GameVersionController_getGameVersion86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gameversion")))
  )
  private[this] lazy val controllers_GameVersionController_getGameVersion86_invoker = createInvoker(
    GameVersionController_12.getGameVersion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GameVersionController",
      "getGameVersion",
      Nil,
      "GET",
      """""",
      this.prefix + """gameversion"""
    )
  )

  // @LINE:113
  private[this] lazy val controllers_BundleController_bundle87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bundle")))
  )
  private[this] lazy val controllers_BundleController_bundle87_invoker = createInvoker(
    BundleController_8.bundle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BundleController",
      "bundle",
      Nil,
      "GET",
      """""",
      this.prefix + """bundle"""
    )
  )

  // @LINE:114
  private[this] lazy val controllers_BundleController_getBundle88_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbundle")))
  )
  private[this] lazy val controllers_BundleController_getBundle88_invoker = createInvoker(
    BundleController_8.getBundle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BundleController",
      "getBundle",
      Nil,
      "POST",
      """""",
      this.prefix + """getbundle"""
    )
  )

  // @LINE:115
  private[this] lazy val controllers_BundleController_saveBundle89_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("savebundledata")))
  )
  private[this] lazy val controllers_BundleController_saveBundle89_invoker = createInvoker(
    BundleController_8.saveBundle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BundleController",
      "saveBundle",
      Nil,
      "POST",
      """""",
      this.prefix + """savebundledata"""
    )
  )

  // @LINE:117
  private[this] lazy val controllers_iapController_iapData90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("iapdata")))
  )
  private[this] lazy val controllers_iapController_iapData90_invoker = createInvoker(
    iapController_3.iapData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.iapController",
      "iapData",
      Nil,
      "GET",
      """""",
      this.prefix + """iapdata"""
    )
  )

  // @LINE:118
  private[this] lazy val controllers_iapController_iapIOS91_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("iapios")))
  )
  private[this] lazy val controllers_iapController_iapIOS91_invoker = createInvoker(
    iapController_3.iapIOS(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.iapController",
      "iapIOS",
      Nil,
      "POST",
      """""",
      this.prefix + """iapios"""
    )
  )

  // @LINE:119
  private[this] lazy val controllers_iapController_iapAndroid92_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("iapandroid")))
  )
  private[this] lazy val controllers_iapController_iapAndroid92_invoker = createInvoker(
    iapController_3.iapAndroid(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.iapController",
      "iapAndroid",
      Nil,
      "POST",
      """""",
      this.prefix + """iapandroid"""
    )
  )

  // @LINE:120
  private[this] lazy val controllers_iapController_iapValid93_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("iapvalid")))
  )
  private[this] lazy val controllers_iapController_iapValid93_invoker = createInvoker(
    iapController_3.iapValid(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.iapController",
      "iapValid",
      Nil,
      "POST",
      """""",
      this.prefix + """iapvalid"""
    )
  )

  // @LINE:121
  private[this] lazy val controllers_iapController_testDate94_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testdate")))
  )
  private[this] lazy val controllers_iapController_testDate94_invoker = createInvoker(
    iapController_3.testDate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.iapController",
      "testDate",
      Nil,
      "POST",
      """""",
      this.prefix + """testdate"""
    )
  )

  // @LINE:122
  private[this] lazy val controllers_iapController_getUniquePayingUsers95_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uniquepayingusers")))
  )
  private[this] lazy val controllers_iapController_getUniquePayingUsers95_invoker = createInvoker(
    iapController_3.getUniquePayingUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.iapController",
      "getUniquePayingUsers",
      Nil,
      "POST",
      """""",
      this.prefix + """uniquepayingusers"""
    )
  )

  // @LINE:123
  private[this] lazy val controllers_iapController_getNewPayingUsers96_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newpayingusers")))
  )
  private[this] lazy val controllers_iapController_getNewPayingUsers96_invoker = createInvoker(
    iapController_3.getNewPayingUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.iapController",
      "getNewPayingUsers",
      Nil,
      "POST",
      """""",
      this.prefix + """newpayingusers"""
    )
  )

  // @LINE:125
  private[this] lazy val controllers_PlayersDataController_playersData97_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("playersdata")))
  )
  private[this] lazy val controllers_PlayersDataController_playersData97_invoker = createInvoker(
    PlayersDataController_0.playersData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayersDataController",
      "playersData",
      Nil,
      "GET",
      """""",
      this.prefix + """playersdata"""
    )
  )

  // @LINE:126
  private[this] lazy val controllers_PlayersDataController_getDAU98_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dau")))
  )
  private[this] lazy val controllers_PlayersDataController_getDAU98_invoker = createInvoker(
    PlayersDataController_0.getDAU(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayersDataController",
      "getDAU",
      Nil,
      "POST",
      """""",
      this.prefix + """dau"""
    )
  )

  // @LINE:127
  private[this] lazy val controllers_PlayersDataController_getMAU99_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mau")))
  )
  private[this] lazy val controllers_PlayersDataController_getMAU99_invoker = createInvoker(
    PlayersDataController_0.getMAU(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayersDataController",
      "getMAU",
      Nil,
      "POST",
      """""",
      this.prefix + """mau"""
    )
  )

  // @LINE:128
  private[this] lazy val controllers_PlayersDataController_getNewPlayingUsers100_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newplayingusers")))
  )
  private[this] lazy val controllers_PlayersDataController_getNewPlayingUsers100_invoker = createInvoker(
    PlayersDataController_0.getNewPlayingUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayersDataController",
      "getNewPlayingUsers",
      Nil,
      "POST",
      """""",
      this.prefix + """newplayingusers"""
    )
  )

  // @LINE:129
  private[this] lazy val controllers_PlayersDataController_getCCU101_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getccu")))
  )
  private[this] lazy val controllers_PlayersDataController_getCCU101_invoker = createInvoker(
    PlayersDataController_0.getCCU(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayersDataController",
      "getCCU",
      Nil,
      "POST",
      """""",
      this.prefix + """getccu"""
    )
  )

  // @LINE:130
  private[this] lazy val controllers_PlayersDataController_getGlobalChat102_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("globalchat")))
  )
  private[this] lazy val controllers_PlayersDataController_getGlobalChat102_invoker = createInvoker(
    PlayersDataController_0.getGlobalChat(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayersDataController",
      "getGlobalChat",
      Nil,
      "POST",
      """""",
      this.prefix + """globalchat"""
    )
  )

  // @LINE:131
  private[this] lazy val controllers_PlayersDataController_getTribeChat103_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tribechat")))
  )
  private[this] lazy val controllers_PlayersDataController_getTribeChat103_invoker = createInvoker(
    PlayersDataController_0.getTribeChat(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayersDataController",
      "getTribeChat",
      Nil,
      "POST",
      """""",
      this.prefix + """tribechat"""
    )
  )

  // @LINE:132
  private[this] lazy val controllers_PlayersDataController_getLoginLogoutTime104_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginlogout")))
  )
  private[this] lazy val controllers_PlayersDataController_getLoginLogoutTime104_invoker = createInvoker(
    PlayersDataController_0.getLoginLogoutTime(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayersDataController",
      "getLoginLogoutTime",
      Nil,
      "POST",
      """""",
      this.prefix + """loginlogout"""
    )
  )

  // @LINE:133
  private[this] lazy val controllers_PlayersDataController_getUniqueUsersNumber105_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uniqueusersnumber")))
  )
  private[this] lazy val controllers_PlayersDataController_getUniqueUsersNumber105_invoker = createInvoker(
    PlayersDataController_0.getUniqueUsersNumber(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayersDataController",
      "getUniqueUsersNumber",
      Nil,
      "POST",
      """""",
      this.prefix + """uniqueusersnumber"""
    )
  )

  // @LINE:135
  private[this] lazy val controllers_AdjustCallbackController_AdjustCallback106_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adjustcallback")))
  )
  private[this] lazy val controllers_AdjustCallbackController_AdjustCallback106_invoker = createInvoker(
    AdjustCallbackController_7.AdjustCallback(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdjustCallbackController",
      "AdjustCallback",
      Nil,
      "GET",
      """""",
      this.prefix + """adjustcallback"""
    )
  )

  // @LINE:136
  private[this] lazy val controllers_AdjustCallbackController_getAllAdjustCallbackData107_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getalladjustcallbackdata")))
  )
  private[this] lazy val controllers_AdjustCallbackController_getAllAdjustCallbackData107_invoker = createInvoker(
    AdjustCallbackController_7.getAllAdjustCallbackData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdjustCallbackController",
      "getAllAdjustCallbackData",
      Nil,
      "POST",
      """""",
      this.prefix + """getalladjustcallbackdata"""
    )
  )

  // @LINE:137
  private[this] lazy val controllers_AdjustCallbackController_getAdjustCallbackData108_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getadjustcallbackdata")))
  )
  private[this] lazy val controllers_AdjustCallbackController_getAdjustCallbackData108_invoker = createInvoker(
    AdjustCallbackController_7.getAdjustCallbackData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdjustCallbackController",
      "getAdjustCallbackData",
      Nil,
      "POST",
      """""",
      this.prefix + """getadjustcallbackdata"""
    )
  )

  // @LINE:141
  private[this] lazy val controllers_Assets_versioned109_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned109_invoker = createInvoker(
    Assets_14.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_16.index())
      }
  
    // @LINE:8
    case controllers_Application_inprogress1_route(params) =>
      call { 
        controllers_Application_inprogress1_invoker.call(Application_16.inprogress())
      }
  
    // @LINE:9
    case controllers_Application_gamestate2_route(params) =>
      call { 
        controllers_Application_gamestate2_invoker.call(Application_16.gamestate())
      }
  
    // @LINE:10
    case controllers_Application_tribes3_route(params) =>
      call { 
        controllers_Application_tribes3_invoker.call(Application_16.tribes())
      }
  
    // @LINE:14
    case controllers_GameStateController_getUserById4_route(params) =>
      call { 
        controllers_GameStateController_getUserById4_invoker.call(GameStateController_2.getUserById())
      }
  
    // @LINE:15
    case controllers_GameStateController_getUserList5_route(params) =>
      call { 
        controllers_GameStateController_getUserList5_invoker.call(GameStateController_2.getUserList())
      }
  
    // @LINE:16
    case controllers_GameStateController_getUserList6_route(params) =>
      call { 
        controllers_GameStateController_getUserList6_invoker.call(GameStateController_2.getUserList())
      }
  
    // @LINE:17
    case controllers_GameStateController_getUserList7_route(params) =>
      call { 
        controllers_GameStateController_getUserList7_invoker.call(GameStateController_2.getUserList())
      }
  
    // @LINE:19
    case controllers_GameStateController_updateUserData8_route(params) =>
      call { 
        controllers_GameStateController_updateUserData8_invoker.call(GameStateController_2.updateUserData())
      }
  
    // @LINE:20
    case controllers_GameStateController_noteForUser9_route(params) =>
      call { 
        controllers_GameStateController_noteForUser9_invoker.call(GameStateController_2.noteForUser())
      }
  
    // @LINE:21
    case controllers_GameStateController_deleteUser10_route(params) =>
      call { 
        controllers_GameStateController_deleteUser10_invoker.call(GameStateController_2.deleteUser())
      }
  
    // @LINE:22
    case controllers_GameStateController_fakeUser11_route(params) =>
      call { 
        controllers_GameStateController_fakeUser11_invoker.call(GameStateController_2.fakeUser())
      }
  
    // @LINE:23
    case controllers_GameStateController_downloadBattleLog12_route(params) =>
      call { 
        controllers_GameStateController_downloadBattleLog12_invoker.call(GameStateController_2.downloadBattleLog())
      }
  
    // @LINE:24
    case controllers_GameStateController_turnOffShield13_route(params) =>
      call { 
        controllers_GameStateController_turnOffShield13_invoker.call(GameStateController_2.turnOffShield())
      }
  
    // @LINE:25
    case controllers_GameStateController_turnOnShield14_route(params) =>
      call { 
        controllers_GameStateController_turnOnShield14_invoker.call(GameStateController_2.turnOnShield())
      }
  
    // @LINE:26
    case controllers_GameStateController_blockLeaderBoard15_route(params) =>
      call { 
        controllers_GameStateController_blockLeaderBoard15_invoker.call(GameStateController_2.blockLeaderBoard())
      }
  
    // @LINE:27
    case controllers_GameStateController_blockTribe16_route(params) =>
      call { 
        controllers_GameStateController_blockTribe16_invoker.call(GameStateController_2.blockTribe())
      }
  
    // @LINE:28
    case controllers_GameStateController_blockSearching17_route(params) =>
      call { 
        controllers_GameStateController_blockSearching17_invoker.call(GameStateController_2.blockSearching())
      }
  
    // @LINE:29
    case controllers_GameStateController_blockGlobalChat18_route(params) =>
      call { 
        controllers_GameStateController_blockGlobalChat18_invoker.call(GameStateController_2.blockGlobalChat())
      }
  
    // @LINE:30
    case controllers_GameStateController_blockAttack19_route(params) =>
      call { 
        controllers_GameStateController_blockAttack19_invoker.call(GameStateController_2.blockAttack())
      }
  
    // @LINE:32
    case controllers_TribeController_getAllTribes20_route(params) =>
      call { 
        controllers_TribeController_getAllTribes20_invoker.call(TribeController_4.getAllTribes())
      }
  
    // @LINE:33
    case controllers_TribeController_getTribeDetails21_route(params) =>
      call { 
        controllers_TribeController_getTribeDetails21_invoker.call(TribeController_4.getTribeDetails())
      }
  
    // @LINE:34
    case controllers_TribeController_getTribeById22_route(params) =>
      call { 
        controllers_TribeController_getTribeById22_invoker.call(TribeController_4.getTribeById())
      }
  
    // @LINE:35
    case controllers_TribeController_getTribeByName23_route(params) =>
      call { 
        controllers_TribeController_getTribeByName23_invoker.call(TribeController_4.getTribeByName())
      }
  
    // @LINE:36
    case controllers_TribeController_updateTribeName24_route(params) =>
      call { 
        controllers_TribeController_updateTribeName24_invoker.call(TribeController_4.updateTribeName())
      }
  
    // @LINE:38
    case controllers_TribeController_getTribeMessage25_route(params) =>
      call { 
        controllers_TribeController_getTribeMessage25_invoker.call(TribeController_4.getTribeMessage())
      }
  
    // @LINE:39
    case controllers_TribeController_blockTribe26_route(params) =>
      call { 
        controllers_TribeController_blockTribe26_invoker.call(TribeController_4.blockTribe())
      }
  
    // @LINE:42
    case controllers_LoginController_login27_route(params) =>
      call { 
        controllers_LoginController_login27_invoker.call(LoginController_15.login())
      }
  
    // @LINE:43
    case controllers_LoginController_checklogin28_route(params) =>
      call { 
        controllers_LoginController_checklogin28_invoker.call(LoginController_15.checklogin())
      }
  
    // @LINE:45
    case controllers_UsersManagementController_getAdminUserList29_route(params) =>
      call { 
        controllers_UsersManagementController_getAdminUserList29_invoker.call(UsersManagementController_1.getAdminUserList())
      }
  
    // @LINE:46
    case controllers_UsersManagementController_addAdminAccount30_route(params) =>
      call { 
        controllers_UsersManagementController_addAdminAccount30_invoker.call(UsersManagementController_1.addAdminAccount())
      }
  
    // @LINE:47
    case controllers_UsersManagementController_updateUsername31_route(params) =>
      call { 
        controllers_UsersManagementController_updateUsername31_invoker.call(UsersManagementController_1.updateUsername())
      }
  
    // @LINE:48
    case controllers_UsersManagementController_updateEmail32_route(params) =>
      call { 
        controllers_UsersManagementController_updateEmail32_invoker.call(UsersManagementController_1.updateEmail())
      }
  
    // @LINE:49
    case controllers_UsersManagementController_updatePassword33_route(params) =>
      call { 
        controllers_UsersManagementController_updatePassword33_invoker.call(UsersManagementController_1.updatePassword())
      }
  
    // @LINE:50
    case controllers_UsersManagementController_updateRole34_route(params) =>
      call { 
        controllers_UsersManagementController_updateRole34_invoker.call(UsersManagementController_1.updateRole())
      }
  
    // @LINE:51
    case controllers_UsersManagementController_deleteAdminAcc35_route(params) =>
      call { 
        controllers_UsersManagementController_deleteAdminAcc35_invoker.call(UsersManagementController_1.deleteAdminAcc())
      }
  
    // @LINE:52
    case controllers_UsersManagementController_getUserData36_route(params) =>
      call { 
        controllers_UsersManagementController_getUserData36_invoker.call(UsersManagementController_1.getUserData())
      }
  
    // @LINE:53
    case controllers_UsersManagementController_sendEmail37_route(params) =>
      call { 
        controllers_UsersManagementController_sendEmail37_invoker.call(UsersManagementController_1.sendEmail())
      }
  
    // @LINE:54
    case controllers_UsersManagementController_profile38_route(params) =>
      call { 
        controllers_UsersManagementController_profile38_invoker.call(UsersManagementController_1.profile())
      }
  
    // @LINE:55
    case controllers_UsersManagementController_getProfile39_route(params) =>
      call { 
        controllers_UsersManagementController_getProfile39_invoker.call(UsersManagementController_1.getProfile())
      }
  
    // @LINE:56
    case controllers_UsersManagementController_updateProfile40_route(params) =>
      call { 
        controllers_UsersManagementController_updateProfile40_invoker.call(UsersManagementController_1.updateProfile())
      }
  
    // @LINE:58
    case controllers_TimeZoneController_getTimeZone41_route(params) =>
      call { 
        controllers_TimeZoneController_getTimeZone41_invoker.call(TimeZoneController_9.getTimeZone())
      }
  
    // @LINE:59
    case controllers_TimeZoneController_updateTimeZone42_route(params) =>
      call { 
        controllers_TimeZoneController_updateTimeZone42_invoker.call(TimeZoneController_9.updateTimeZone())
      }
  
    // @LINE:61
    case controllers_TextStringController_textString43_route(params) =>
      call { 
        controllers_TextStringController_textString43_invoker.call(TextStringController_10.textString())
      }
  
    // @LINE:62
    case controllers_TextStringController_getTextString44_route(params) =>
      call { 
        controllers_TextStringController_getTextString44_invoker.call(TextStringController_10.getTextString())
      }
  
    // @LINE:63
    case controllers_TextStringController_exportTextString45_route(params) =>
      call { 
        controllers_TextStringController_exportTextString45_invoker.call(TextStringController_10.exportTextString())
      }
  
    // @LINE:65
    case controllers_ProfanityController_profanity46_route(params) =>
      call { 
        controllers_ProfanityController_profanity46_invoker.call(ProfanityController_13.profanity())
      }
  
    // @LINE:66
    case controllers_ProfanityController_getProfanityText47_route(params) =>
      call { 
        controllers_ProfanityController_getProfanityText47_invoker.call(ProfanityController_13.getProfanityText())
      }
  
    // @LINE:67
    case controllers_ProfanityController_exportProfanity48_route(params) =>
      call { 
        controllers_ProfanityController_exportProfanity48_invoker.call(ProfanityController_13.exportProfanity())
      }
  
    // @LINE:69
    case controllers_NewsController_getNews49_route(params) =>
      call { 
        controllers_NewsController_getNews49_invoker.call(NewsController_5.getNews())
      }
  
    // @LINE:70
    case controllers_NewsController_addEnglishNews50_route(params) =>
      call { 
        controllers_NewsController_addEnglishNews50_invoker.call(NewsController_5.addEnglishNews())
      }
  
    // @LINE:71
    case controllers_NewsController_addArabNews51_route(params) =>
      call { 
        controllers_NewsController_addArabNews51_invoker.call(NewsController_5.addArabNews())
      }
  
    // @LINE:72
    case controllers_NewsController_updateEnglishNewsTitle52_route(params) =>
      call { 
        controllers_NewsController_updateEnglishNewsTitle52_invoker.call(NewsController_5.updateEnglishNewsTitle())
      }
  
    // @LINE:73
    case controllers_NewsController_updateEnglishNewsImage53_route(params) =>
      call { 
        controllers_NewsController_updateEnglishNewsImage53_invoker.call(NewsController_5.updateEnglishNewsImage())
      }
  
    // @LINE:74
    case controllers_NewsController_updateEnglishNewsVideo54_route(params) =>
      call { 
        controllers_NewsController_updateEnglishNewsVideo54_invoker.call(NewsController_5.updateEnglishNewsVideo())
      }
  
    // @LINE:75
    case controllers_NewsController_updateEnglishNewsContent55_route(params) =>
      call { 
        controllers_NewsController_updateEnglishNewsContent55_invoker.call(NewsController_5.updateEnglishNewsContent())
      }
  
    // @LINE:76
    case controllers_NewsController_deleteEnglishNews56_route(params) =>
      call { 
        controllers_NewsController_deleteEnglishNews56_invoker.call(NewsController_5.deleteEnglishNews())
      }
  
    // @LINE:77
    case controllers_NewsController_updateArabNewsTitle57_route(params) =>
      call { 
        controllers_NewsController_updateArabNewsTitle57_invoker.call(NewsController_5.updateArabNewsTitle())
      }
  
    // @LINE:78
    case controllers_NewsController_updateArabNewsImage58_route(params) =>
      call { 
        controllers_NewsController_updateArabNewsImage58_invoker.call(NewsController_5.updateArabNewsImage())
      }
  
    // @LINE:79
    case controllers_NewsController_updateArabNewsVideo59_route(params) =>
      call { 
        controllers_NewsController_updateArabNewsVideo59_invoker.call(NewsController_5.updateArabNewsVideo())
      }
  
    // @LINE:80
    case controllers_NewsController_updateArabNewsContent60_route(params) =>
      call { 
        controllers_NewsController_updateArabNewsContent60_invoker.call(NewsController_5.updateArabNewsContent())
      }
  
    // @LINE:81
    case controllers_NewsController_deleteArabNews61_route(params) =>
      call { 
        controllers_NewsController_deleteArabNews61_invoker.call(NewsController_5.deleteArabNews())
      }
  
    // @LINE:83
    case controllers_GameDataController_gameData62_route(params) =>
      call { 
        controllers_GameDataController_gameData62_invoker.call(GameDataController_11.gameData())
      }
  
    // @LINE:85
    case controllers_GameDataController_getCampaignReference63_route(params) =>
      call { 
        controllers_GameDataController_getCampaignReference63_invoker.call(GameDataController_11.getCampaignReference())
      }
  
    // @LINE:86
    case controllers_GameDataController_getUnitLevel64_route(params) =>
      call { 
        controllers_GameDataController_getUnitLevel64_invoker.call(GameDataController_11.getUnitLevel())
      }
  
    // @LINE:87
    case controllers_GameDataController_getCombatUnits65_route(params) =>
      call { 
        controllers_GameDataController_getCombatUnits65_invoker.call(GameDataController_11.getCombatUnits())
      }
  
    // @LINE:88
    case controllers_GameDataController_getDefensiveBuildings66_route(params) =>
      call { 
        controllers_GameDataController_getDefensiveBuildings66_invoker.call(GameDataController_11.getDefensiveBuildings())
      }
  
    // @LINE:89
    case controllers_GameDataController_getDefensiveBuildingLevel67_route(params) =>
      call { 
        controllers_GameDataController_getDefensiveBuildingLevel67_invoker.call(GameDataController_11.getDefensiveBuildingLevel())
      }
  
    // @LINE:90
    case controllers_GameDataController_getResourceBuildings68_route(params) =>
      call { 
        controllers_GameDataController_getResourceBuildings68_invoker.call(GameDataController_11.getResourceBuildings())
      }
  
    // @LINE:91
    case controllers_GameDataController_getArmyBuildings69_route(params) =>
      call { 
        controllers_GameDataController_getArmyBuildings69_invoker.call(GameDataController_11.getArmyBuildings())
      }
  
    // @LINE:92
    case controllers_GameDataController_getOtherBuildings70_route(params) =>
      call { 
        controllers_GameDataController_getOtherBuildings70_invoker.call(GameDataController_11.getOtherBuildings())
      }
  
    // @LINE:93
    case controllers_GameDataController_getTownHallLevel71_route(params) =>
      call { 
        controllers_GameDataController_getTownHallLevel71_invoker.call(GameDataController_11.getTownHallLevel())
      }
  
    // @LINE:94
    case controllers_GameDataController_getDecorations72_route(params) =>
      call { 
        controllers_GameDataController_getDecorations72_invoker.call(GameDataController_11.getDecorations())
      }
  
    // @LINE:95
    case controllers_GameDataController_getSpells73_route(params) =>
      call { 
        controllers_GameDataController_getSpells73_invoker.call(GameDataController_11.getSpells())
      }
  
    // @LINE:96
    case controllers_GameDataController_getSpellLevels74_route(params) =>
      call { 
        controllers_GameDataController_getSpellLevels74_invoker.call(GameDataController_11.getSpellLevels())
      }
  
    // @LINE:97
    case controllers_GameDataController_getObstacles75_route(params) =>
      call { 
        controllers_GameDataController_getObstacles75_invoker.call(GameDataController_11.getObstacles())
      }
  
    // @LINE:98
    case controllers_GameDataController_getTrophy76_route(params) =>
      call { 
        controllers_GameDataController_getTrophy76_invoker.call(GameDataController_11.getTrophy())
      }
  
    // @LINE:99
    case controllers_GameDataController_getAchievements77_route(params) =>
      call { 
        controllers_GameDataController_getAchievements77_invoker.call(GameDataController_11.getAchievements())
      }
  
    // @LINE:100
    case controllers_GameDataController_getSpreadsheetData78_route(params) =>
      call { 
        controllers_GameDataController_getSpreadsheetData78_invoker.call(GameDataController_11.getSpreadsheetData())
      }
  
    // @LINE:101
    case controllers_GameDataController_publishSpreadsheet79_route(params) =>
      call { 
        controllers_GameDataController_publishSpreadsheet79_invoker.call(GameDataController_11.publishSpreadsheet())
      }
  
    // @LINE:103
    case controllers_GameSettingsController_getGameSettings80_route(params) =>
      call { 
        controllers_GameSettingsController_getGameSettings80_invoker.call(GameSettingsController_6.getGameSettings())
      }
  
    // @LINE:104
    case controllers_GameSettingsController_getSettings81_route(params) =>
      call { 
        controllers_GameSettingsController_getSettings81_invoker.call(GameSettingsController_6.getSettings())
      }
  
    // @LINE:105
    case controllers_GameSettingsController_saveSettingsData82_route(params) =>
      call { 
        controllers_GameSettingsController_saveSettingsData82_invoker.call(GameSettingsController_6.saveSettingsData())
      }
  
    // @LINE:106
    case controllers_GameSettingsController_addVersionSFS83_route(params) =>
      call { 
        controllers_GameSettingsController_addVersionSFS83_invoker.call(GameSettingsController_6.addVersionSFS())
      }
  
    // @LINE:107
    case controllers_GameSettingsController_deleteUnuseVersion84_route(params) =>
      call { 
        controllers_GameSettingsController_deleteUnuseVersion84_invoker.call(GameSettingsController_6.deleteUnuseVersion())
      }
  
    // @LINE:108
    case controllers_GameSettingsController_changeGameSubVersion85_route(params) =>
      call { 
        controllers_GameSettingsController_changeGameSubVersion85_invoker.call(GameSettingsController_6.changeGameSubVersion())
      }
  
    // @LINE:111
    case controllers_GameVersionController_getGameVersion86_route(params) =>
      call { 
        controllers_GameVersionController_getGameVersion86_invoker.call(GameVersionController_12.getGameVersion())
      }
  
    // @LINE:113
    case controllers_BundleController_bundle87_route(params) =>
      call { 
        controllers_BundleController_bundle87_invoker.call(BundleController_8.bundle())
      }
  
    // @LINE:114
    case controllers_BundleController_getBundle88_route(params) =>
      call { 
        controllers_BundleController_getBundle88_invoker.call(BundleController_8.getBundle())
      }
  
    // @LINE:115
    case controllers_BundleController_saveBundle89_route(params) =>
      call { 
        controllers_BundleController_saveBundle89_invoker.call(BundleController_8.saveBundle())
      }
  
    // @LINE:117
    case controllers_iapController_iapData90_route(params) =>
      call { 
        controllers_iapController_iapData90_invoker.call(iapController_3.iapData())
      }
  
    // @LINE:118
    case controllers_iapController_iapIOS91_route(params) =>
      call { 
        controllers_iapController_iapIOS91_invoker.call(iapController_3.iapIOS())
      }
  
    // @LINE:119
    case controllers_iapController_iapAndroid92_route(params) =>
      call { 
        controllers_iapController_iapAndroid92_invoker.call(iapController_3.iapAndroid())
      }
  
    // @LINE:120
    case controllers_iapController_iapValid93_route(params) =>
      call { 
        controllers_iapController_iapValid93_invoker.call(iapController_3.iapValid())
      }
  
    // @LINE:121
    case controllers_iapController_testDate94_route(params) =>
      call { 
        controllers_iapController_testDate94_invoker.call(iapController_3.testDate())
      }
  
    // @LINE:122
    case controllers_iapController_getUniquePayingUsers95_route(params) =>
      call { 
        controllers_iapController_getUniquePayingUsers95_invoker.call(iapController_3.getUniquePayingUsers())
      }
  
    // @LINE:123
    case controllers_iapController_getNewPayingUsers96_route(params) =>
      call { 
        controllers_iapController_getNewPayingUsers96_invoker.call(iapController_3.getNewPayingUsers())
      }
  
    // @LINE:125
    case controllers_PlayersDataController_playersData97_route(params) =>
      call { 
        controllers_PlayersDataController_playersData97_invoker.call(PlayersDataController_0.playersData())
      }
  
    // @LINE:126
    case controllers_PlayersDataController_getDAU98_route(params) =>
      call { 
        controllers_PlayersDataController_getDAU98_invoker.call(PlayersDataController_0.getDAU())
      }
  
    // @LINE:127
    case controllers_PlayersDataController_getMAU99_route(params) =>
      call { 
        controllers_PlayersDataController_getMAU99_invoker.call(PlayersDataController_0.getMAU())
      }
  
    // @LINE:128
    case controllers_PlayersDataController_getNewPlayingUsers100_route(params) =>
      call { 
        controllers_PlayersDataController_getNewPlayingUsers100_invoker.call(PlayersDataController_0.getNewPlayingUsers())
      }
  
    // @LINE:129
    case controllers_PlayersDataController_getCCU101_route(params) =>
      call { 
        controllers_PlayersDataController_getCCU101_invoker.call(PlayersDataController_0.getCCU())
      }
  
    // @LINE:130
    case controllers_PlayersDataController_getGlobalChat102_route(params) =>
      call { 
        controllers_PlayersDataController_getGlobalChat102_invoker.call(PlayersDataController_0.getGlobalChat())
      }
  
    // @LINE:131
    case controllers_PlayersDataController_getTribeChat103_route(params) =>
      call { 
        controllers_PlayersDataController_getTribeChat103_invoker.call(PlayersDataController_0.getTribeChat())
      }
  
    // @LINE:132
    case controllers_PlayersDataController_getLoginLogoutTime104_route(params) =>
      call { 
        controllers_PlayersDataController_getLoginLogoutTime104_invoker.call(PlayersDataController_0.getLoginLogoutTime())
      }
  
    // @LINE:133
    case controllers_PlayersDataController_getUniqueUsersNumber105_route(params) =>
      call { 
        controllers_PlayersDataController_getUniqueUsersNumber105_invoker.call(PlayersDataController_0.getUniqueUsersNumber())
      }
  
    // @LINE:135
    case controllers_AdjustCallbackController_AdjustCallback106_route(params) =>
      call { 
        controllers_AdjustCallbackController_AdjustCallback106_invoker.call(AdjustCallbackController_7.AdjustCallback())
      }
  
    // @LINE:136
    case controllers_AdjustCallbackController_getAllAdjustCallbackData107_route(params) =>
      call { 
        controllers_AdjustCallbackController_getAllAdjustCallbackData107_invoker.call(AdjustCallbackController_7.getAllAdjustCallbackData())
      }
  
    // @LINE:137
    case controllers_AdjustCallbackController_getAdjustCallbackData108_route(params) =>
      call { 
        controllers_AdjustCallbackController_getAdjustCallbackData108_invoker.call(AdjustCallbackController_7.getAdjustCallbackData())
      }
  
    // @LINE:141
    case controllers_Assets_versioned109_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned109_invoker.call(Assets_14.versioned(path, file))
      }
  }
}