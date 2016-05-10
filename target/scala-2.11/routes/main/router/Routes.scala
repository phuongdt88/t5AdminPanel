
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phuongdt1/Desktop/lumba/t5-admin-panel/conf/routes
// @DATE:Tue May 10 17:17:25 ICT 2016

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
  Application_18: controllers.Application,
  // @LINE:11
  DashBoardController_12: com.sgs.lumba.t5.controllers.DashBoardController,
  // @LINE:14
  LTVCalculatorController_19: com.sgs.lumba.t5.controllers.LTVCalculatorController,
  // @LINE:17
  PullActivitiesController_16: com.sgs.lumba.t5.controllers.PullActivitiesController,
  // @LINE:20
  GameStateController_3: com.sgs.lumba.t5.controllers.GameStateController,
  // @LINE:39
  TribeController_11: com.sgs.lumba.t5.controllers.TribeController,
  // @LINE:49
  LoginController_10: com.sgs.lumba.t5.controllers.LoginController,
  // @LINE:52
  UsersManagementController_2: controllers.UsersManagementController,
  // @LINE:66
  TimeZoneController_14: com.sgs.lumba.t5.controllers.TimeZoneController,
  // @LINE:69
  TextStringController_9: com.sgs.lumba.t5.controllers.TextStringController,
  // @LINE:73
  ProfanityController_5: com.sgs.lumba.t5.controllers.ProfanityController,
  // @LINE:77
  NewsController_6: com.sgs.lumba.t5.controllers.NewsController,
  // @LINE:91
  GameDataController_1: com.sgs.lumba.t5.controllers.GameDataController,
  // @LINE:97
  GameSettingsController_8: com.sgs.lumba.t5.controllers.GameSettingsController,
  // @LINE:105
  GameVersionController_0: com.sgs.lumba.t5.controllers.GameVersionController,
  // @LINE:107
  BundleController_15: com.sgs.lumba.t5.controllers.BundleController,
  // @LINE:111
  iapController_7: com.sgs.lumba.t5.controllers.iapController,
  // @LINE:119
  PlayersDataController_13: com.sgs.lumba.t5.controllers.PlayersDataController,
  // @LINE:129
  AdjustCallbackController_4: com.sgs.lumba.t5.controllers.AdjustCallbackController,
  // @LINE:135
  Assets_17: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_18: controllers.Application,
    // @LINE:11
    DashBoardController_12: com.sgs.lumba.t5.controllers.DashBoardController,
    // @LINE:14
    LTVCalculatorController_19: com.sgs.lumba.t5.controllers.LTVCalculatorController,
    // @LINE:17
    PullActivitiesController_16: com.sgs.lumba.t5.controllers.PullActivitiesController,
    // @LINE:20
    GameStateController_3: com.sgs.lumba.t5.controllers.GameStateController,
    // @LINE:39
    TribeController_11: com.sgs.lumba.t5.controllers.TribeController,
    // @LINE:49
    LoginController_10: com.sgs.lumba.t5.controllers.LoginController,
    // @LINE:52
    UsersManagementController_2: controllers.UsersManagementController,
    // @LINE:66
    TimeZoneController_14: com.sgs.lumba.t5.controllers.TimeZoneController,
    // @LINE:69
    TextStringController_9: com.sgs.lumba.t5.controllers.TextStringController,
    // @LINE:73
    ProfanityController_5: com.sgs.lumba.t5.controllers.ProfanityController,
    // @LINE:77
    NewsController_6: com.sgs.lumba.t5.controllers.NewsController,
    // @LINE:91
    GameDataController_1: com.sgs.lumba.t5.controllers.GameDataController,
    // @LINE:97
    GameSettingsController_8: com.sgs.lumba.t5.controllers.GameSettingsController,
    // @LINE:105
    GameVersionController_0: com.sgs.lumba.t5.controllers.GameVersionController,
    // @LINE:107
    BundleController_15: com.sgs.lumba.t5.controllers.BundleController,
    // @LINE:111
    iapController_7: com.sgs.lumba.t5.controllers.iapController,
    // @LINE:119
    PlayersDataController_13: com.sgs.lumba.t5.controllers.PlayersDataController,
    // @LINE:129
    AdjustCallbackController_4: com.sgs.lumba.t5.controllers.AdjustCallbackController,
    // @LINE:135
    Assets_17: controllers.Assets
  ) = this(errorHandler, Application_18, DashBoardController_12, LTVCalculatorController_19, PullActivitiesController_16, GameStateController_3, TribeController_11, LoginController_10, UsersManagementController_2, TimeZoneController_14, TextStringController_9, ProfanityController_5, NewsController_6, GameDataController_1, GameSettingsController_8, GameVersionController_0, BundleController_15, iapController_7, PlayersDataController_13, AdjustCallbackController_4, Assets_17, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_18, DashBoardController_12, LTVCalculatorController_19, PullActivitiesController_16, GameStateController_3, TribeController_11, LoginController_10, UsersManagementController_2, TimeZoneController_14, TextStringController_9, ProfanityController_5, NewsController_6, GameDataController_1, GameSettingsController_8, GameVersionController_0, BundleController_15, iapController_7, PlayersDataController_13, AdjustCallbackController_4, Assets_17, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inprogress""", """controllers.Application.inprogress()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """com.sgs.lumba.t5.controllers.DashBoardController.Dashboard()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getDashboardData""", """com.sgs.lumba.t5.controllers.DashBoardController.GetDashboardData()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ltvcalculator""", """com.sgs.lumba.t5.controllers.LTVCalculatorController.LTVCalculator()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getltvvalue""", """com.sgs.lumba.t5.controllers.LTVCalculatorController.GetLTVValue()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pullactivities""", """com.sgs.lumba.t5.controllers.PullActivitiesController.PullActivities()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createreport""", """com.sgs.lumba.t5.controllers.PullActivitiesController.CreateReport()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gamestate""", """com.sgs.lumba.t5.controllers.GameStateController.gamestate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchByUserId""", """com.sgs.lumba.t5.controllers.GameStateController.getUserById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchUserByName""", """com.sgs.lumba.t5.controllers.GameStateController.getUserList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchUserByEmail""", """com.sgs.lumba.t5.controllers.GameStateController.getUserList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchUserByDagger""", """com.sgs.lumba.t5.controllers.GameStateController.getUserList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateUserData""", """com.sgs.lumba.t5.controllers.GameStateController.updateUserData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noteForUser""", """com.sgs.lumba.t5.controllers.GameStateController.noteForUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteUser""", """com.sgs.lumba.t5.controllers.GameStateController.deleteUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fakeUser""", """com.sgs.lumba.t5.controllers.GameStateController.fakeUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """downloadBattleLog""", """com.sgs.lumba.t5.controllers.GameStateController.downloadBattleLog()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """turnOffShield""", """com.sgs.lumba.t5.controllers.GameStateController.turnOffShield()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """turnOnShield""", """com.sgs.lumba.t5.controllers.GameStateController.turnOnShield()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockLeaderBoard""", """com.sgs.lumba.t5.controllers.GameStateController.blockLeaderBoard()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockTribe""", """com.sgs.lumba.t5.controllers.GameStateController.blockTribe()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockSearching""", """com.sgs.lumba.t5.controllers.GameStateController.blockSearching()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockGlobalChat""", """com.sgs.lumba.t5.controllers.GameStateController.blockGlobalChat()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockAttack""", """com.sgs.lumba.t5.controllers.GameStateController.blockAttack()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tribes""", """com.sgs.lumba.t5.controllers.TribeController.tribes()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTribeList""", """com.sgs.lumba.t5.controllers.TribeController.getAllTribes()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTribeDetails""", """com.sgs.lumba.t5.controllers.TribeController.getTribeDetails()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchTribeById""", """com.sgs.lumba.t5.controllers.TribeController.getTribeById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchTribeByName""", """com.sgs.lumba.t5.controllers.TribeController.getTribeByName()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateTribeName""", """com.sgs.lumba.t5.controllers.TribeController.updateTribeName()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """downloadTribeMessage""", """com.sgs.lumba.t5.controllers.TribeController.getTribeMessage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blockTribe""", """com.sgs.lumba.t5.controllers.TribeController.blockTribe()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """com.sgs.lumba.t5.controllers.LoginController.Login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checklogin""", """com.sgs.lumba.t5.controllers.LoginController.CheckLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usersmanagement""", """controllers.UsersManagementController.getAdminUserInfo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addadminaccount""", """controllers.UsersManagementController.addAdminAccount()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateadminacc""", """controllers.UsersManagementController.updateAdminAccount()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """timezone""", """com.sgs.lumba.t5.controllers.TimeZoneController.timeZone()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatetimezone""", """com.sgs.lumba.t5.controllers.TimeZoneController.updateTimeZone()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """textstring""", """com.sgs.lumba.t5.controllers.TextStringController.textString()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTextString""", """com.sgs.lumba.t5.controllers.TextStringController.getTextString()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exporttextstring""", """com.sgs.lumba.t5.controllers.TextStringController.exportTextString()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profanity""", """com.sgs.lumba.t5.controllers.ProfanityController.profanity()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getprofanitytext""", """com.sgs.lumba.t5.controllers.ProfanityController.getProfanityText()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exportprofanity""", """com.sgs.lumba.t5.controllers.ProfanityController.exportProfanity()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """news""", """com.sgs.lumba.t5.controllers.NewsController.getNews()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addenglishnews""", """com.sgs.lumba.t5.controllers.NewsController.addEnglishNews()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addarabnews""", """com.sgs.lumba.t5.controllers.NewsController.addArabNews()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateenglishnewstitle""", """com.sgs.lumba.t5.controllers.NewsController.updateEnglishNewsTitle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateenglishnewsimage""", """com.sgs.lumba.t5.controllers.NewsController.updateEnglishNewsImage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateenglishnewsvideo""", """com.sgs.lumba.t5.controllers.NewsController.updateEnglishNewsVideo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateenglishnewscontent""", """com.sgs.lumba.t5.controllers.NewsController.updateEnglishNewsContent()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteenglishnews""", """com.sgs.lumba.t5.controllers.NewsController.deleteEnglishNews()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatearabnewstitle""", """com.sgs.lumba.t5.controllers.NewsController.updateArabNewsTitle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatearabnewsimage""", """com.sgs.lumba.t5.controllers.NewsController.updateArabNewsImage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatearabnewsvideo""", """com.sgs.lumba.t5.controllers.NewsController.updateArabNewsVideo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatearabnewscontent""", """com.sgs.lumba.t5.controllers.NewsController.updateArabNewsContent()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletearabnews""", """com.sgs.lumba.t5.controllers.NewsController.deleteArabNews()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gamedata""", """com.sgs.lumba.t5.controllers.GameDataController.gameData()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getdata/$section<[^/]+>""", """com.sgs.lumba.t5.controllers.GameDataController.getData(section:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exportgamedata/$section<[^/]+>""", """com.sgs.lumba.t5.controllers.GameDataController.exportGameData(section:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewspreadsheetdata/$section<[^/]+>""", """com.sgs.lumba.t5.controllers.GameDataController.getSpreadsheetData(section:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publishspreadsheet/$section<[^/]+>""", """com.sgs.lumba.t5.controllers.GameDataController.publishSpreadsheet(section:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gamesettings""", """com.sgs.lumba.t5.controllers.GameSettingsController.getGameSettings()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings""", """com.sgs.lumba.t5.controllers.GameSettingsController.getSettings()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """savesettingsdata""", """com.sgs.lumba.t5.controllers.GameSettingsController.saveSettingsData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addversionsfs""", """com.sgs.lumba.t5.controllers.GameSettingsController.addVersionSFS()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteunuseversion""", """com.sgs.lumba.t5.controllers.GameSettingsController.deleteUnuseVersion()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changegamesubversion""", """com.sgs.lumba.t5.controllers.GameSettingsController.changeGameSubVersion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gameversion""", """com.sgs.lumba.t5.controllers.GameVersionController.getGameVersion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bundle""", """com.sgs.lumba.t5.controllers.BundleController.bundle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbundle""", """com.sgs.lumba.t5.controllers.BundleController.getBundle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """savebundledata""", """com.sgs.lumba.t5.controllers.BundleController.saveBundle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """iapdata""", """com.sgs.lumba.t5.controllers.iapController.iapData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """iapios""", """com.sgs.lumba.t5.controllers.iapController.iapIOS()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """iapandroid""", """com.sgs.lumba.t5.controllers.iapController.iapAndroid()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """iapvalid""", """com.sgs.lumba.t5.controllers.iapController.iapValid()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testdate""", """com.sgs.lumba.t5.controllers.iapController.testDate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uniquepayingusers""", """com.sgs.lumba.t5.controllers.iapController.getUniquePayingUsers()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newpayingusers""", """com.sgs.lumba.t5.controllers.iapController.getNewPayingUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """playersdata""", """com.sgs.lumba.t5.controllers.PlayersDataController.playersData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dau""", """com.sgs.lumba.t5.controllers.PlayersDataController.getDAU()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mau""", """com.sgs.lumba.t5.controllers.PlayersDataController.getMAU()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newplayingusers""", """com.sgs.lumba.t5.controllers.PlayersDataController.getNewPlayingUsers()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getccu""", """com.sgs.lumba.t5.controllers.PlayersDataController.getCCU()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """globalchat""", """com.sgs.lumba.t5.controllers.PlayersDataController.getGlobalChat()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tribechat""", """com.sgs.lumba.t5.controllers.PlayersDataController.getTribeChat()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginlogout""", """com.sgs.lumba.t5.controllers.PlayersDataController.getLoginLogoutTime()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uniqueusersnumber""", """com.sgs.lumba.t5.controllers.PlayersDataController.getUniqueUsersNumber()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adjustcallback""", """com.sgs.lumba.t5.controllers.AdjustCallbackController.AdjustCallback()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getalladjustcallbackdata""", """com.sgs.lumba.t5.controllers.AdjustCallbackController.getAllAdjustCallbackData()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getadjustcallbackdata""", """com.sgs.lumba.t5.controllers.AdjustCallbackController.getAdjustCallbackData()"""),
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
    Application_18.index(),
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
    Application_18.inprogress(),
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

  // @LINE:11
  private[this] lazy val com_sgs_lumba_t5_controllers_DashBoardController_Dashboard2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_DashBoardController_Dashboard2_invoker = createInvoker(
    DashBoardController_12.Dashboard(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.DashBoardController",
      "Dashboard",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard"""
    )
  )

  // @LINE:12
  private[this] lazy val com_sgs_lumba_t5_controllers_DashBoardController_GetDashboardData3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getDashboardData")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_DashBoardController_GetDashboardData3_invoker = createInvoker(
    DashBoardController_12.GetDashboardData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.DashBoardController",
      "GetDashboardData",
      Nil,
      "POST",
      """""",
      this.prefix + """getDashboardData"""
    )
  )

  // @LINE:14
  private[this] lazy val com_sgs_lumba_t5_controllers_LTVCalculatorController_LTVCalculator4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ltvcalculator")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_LTVCalculatorController_LTVCalculator4_invoker = createInvoker(
    LTVCalculatorController_19.LTVCalculator(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.LTVCalculatorController",
      "LTVCalculator",
      Nil,
      "GET",
      """""",
      this.prefix + """ltvcalculator"""
    )
  )

  // @LINE:15
  private[this] lazy val com_sgs_lumba_t5_controllers_LTVCalculatorController_GetLTVValue5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getltvvalue")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_LTVCalculatorController_GetLTVValue5_invoker = createInvoker(
    LTVCalculatorController_19.GetLTVValue(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.LTVCalculatorController",
      "GetLTVValue",
      Nil,
      "POST",
      """""",
      this.prefix + """getltvvalue"""
    )
  )

  // @LINE:17
  private[this] lazy val com_sgs_lumba_t5_controllers_PullActivitiesController_PullActivities6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pullactivities")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_PullActivitiesController_PullActivities6_invoker = createInvoker(
    PullActivitiesController_16.PullActivities(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.PullActivitiesController",
      "PullActivities",
      Nil,
      "GET",
      """""",
      this.prefix + """pullactivities"""
    )
  )

  // @LINE:18
  private[this] lazy val com_sgs_lumba_t5_controllers_PullActivitiesController_CreateReport7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createreport")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_PullActivitiesController_CreateReport7_invoker = createInvoker(
    PullActivitiesController_16.CreateReport(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.PullActivitiesController",
      "CreateReport",
      Nil,
      "POST",
      """""",
      this.prefix + """createreport"""
    )
  )

  // @LINE:20
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_gamestate8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gamestate")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_gamestate8_invoker = createInvoker(
    GameStateController_3.gamestate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "gamestate",
      Nil,
      "GET",
      """""",
      this.prefix + """gamestate"""
    )
  )

  // @LINE:21
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_getUserById9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchByUserId")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_getUserById9_invoker = createInvoker(
    GameStateController_3.getUserById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "getUserById",
      Nil,
      "POST",
      """""",
      this.prefix + """searchByUserId"""
    )
  )

  // @LINE:22
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_getUserList10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchUserByName")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_getUserList10_invoker = createInvoker(
    GameStateController_3.getUserList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "getUserList",
      Nil,
      "POST",
      """""",
      this.prefix + """searchUserByName"""
    )
  )

  // @LINE:23
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_getUserList11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchUserByEmail")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_getUserList11_invoker = createInvoker(
    GameStateController_3.getUserList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "getUserList",
      Nil,
      "POST",
      """""",
      this.prefix + """searchUserByEmail"""
    )
  )

  // @LINE:24
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_getUserList12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchUserByDagger")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_getUserList12_invoker = createInvoker(
    GameStateController_3.getUserList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "getUserList",
      Nil,
      "POST",
      """""",
      this.prefix + """searchUserByDagger"""
    )
  )

  // @LINE:26
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_updateUserData13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateUserData")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_updateUserData13_invoker = createInvoker(
    GameStateController_3.updateUserData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "updateUserData",
      Nil,
      "POST",
      """""",
      this.prefix + """updateUserData"""
    )
  )

  // @LINE:27
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_noteForUser14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noteForUser")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_noteForUser14_invoker = createInvoker(
    GameStateController_3.noteForUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "noteForUser",
      Nil,
      "POST",
      """""",
      this.prefix + """noteForUser"""
    )
  )

  // @LINE:28
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_deleteUser15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteUser")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_deleteUser15_invoker = createInvoker(
    GameStateController_3.deleteUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "deleteUser",
      Nil,
      "POST",
      """""",
      this.prefix + """deleteUser"""
    )
  )

  // @LINE:29
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_fakeUser16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fakeUser")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_fakeUser16_invoker = createInvoker(
    GameStateController_3.fakeUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "fakeUser",
      Nil,
      "POST",
      """""",
      this.prefix + """fakeUser"""
    )
  )

  // @LINE:30
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_downloadBattleLog17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("downloadBattleLog")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_downloadBattleLog17_invoker = createInvoker(
    GameStateController_3.downloadBattleLog(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "downloadBattleLog",
      Nil,
      "POST",
      """""",
      this.prefix + """downloadBattleLog"""
    )
  )

  // @LINE:31
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_turnOffShield18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("turnOffShield")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_turnOffShield18_invoker = createInvoker(
    GameStateController_3.turnOffShield(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "turnOffShield",
      Nil,
      "POST",
      """""",
      this.prefix + """turnOffShield"""
    )
  )

  // @LINE:32
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_turnOnShield19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("turnOnShield")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_turnOnShield19_invoker = createInvoker(
    GameStateController_3.turnOnShield(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "turnOnShield",
      Nil,
      "POST",
      """""",
      this.prefix + """turnOnShield"""
    )
  )

  // @LINE:33
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_blockLeaderBoard20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockLeaderBoard")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_blockLeaderBoard20_invoker = createInvoker(
    GameStateController_3.blockLeaderBoard(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "blockLeaderBoard",
      Nil,
      "POST",
      """""",
      this.prefix + """blockLeaderBoard"""
    )
  )

  // @LINE:34
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_blockTribe21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockTribe")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_blockTribe21_invoker = createInvoker(
    GameStateController_3.blockTribe(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "blockTribe",
      Nil,
      "POST",
      """""",
      this.prefix + """blockTribe"""
    )
  )

  // @LINE:35
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_blockSearching22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockSearching")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_blockSearching22_invoker = createInvoker(
    GameStateController_3.blockSearching(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "blockSearching",
      Nil,
      "POST",
      """""",
      this.prefix + """blockSearching"""
    )
  )

  // @LINE:36
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_blockGlobalChat23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockGlobalChat")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_blockGlobalChat23_invoker = createInvoker(
    GameStateController_3.blockGlobalChat(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "blockGlobalChat",
      Nil,
      "POST",
      """""",
      this.prefix + """blockGlobalChat"""
    )
  )

  // @LINE:37
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_blockAttack24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockAttack")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameStateController_blockAttack24_invoker = createInvoker(
    GameStateController_3.blockAttack(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameStateController",
      "blockAttack",
      Nil,
      "POST",
      """""",
      this.prefix + """blockAttack"""
    )
  )

  // @LINE:39
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_tribes25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tribes")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_tribes25_invoker = createInvoker(
    TribeController_11.tribes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TribeController",
      "tribes",
      Nil,
      "GET",
      """""",
      this.prefix + """tribes"""
    )
  )

  // @LINE:40
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_getAllTribes26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTribeList")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_getAllTribes26_invoker = createInvoker(
    TribeController_11.getAllTribes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TribeController",
      "getAllTribes",
      Nil,
      "POST",
      """""",
      this.prefix + """getTribeList"""
    )
  )

  // @LINE:41
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_getTribeDetails27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTribeDetails")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_getTribeDetails27_invoker = createInvoker(
    TribeController_11.getTribeDetails(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TribeController",
      "getTribeDetails",
      Nil,
      "POST",
      """""",
      this.prefix + """getTribeDetails"""
    )
  )

  // @LINE:42
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_getTribeById28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchTribeById")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_getTribeById28_invoker = createInvoker(
    TribeController_11.getTribeById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TribeController",
      "getTribeById",
      Nil,
      "POST",
      """""",
      this.prefix + """searchTribeById"""
    )
  )

  // @LINE:43
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_getTribeByName29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchTribeByName")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_getTribeByName29_invoker = createInvoker(
    TribeController_11.getTribeByName(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TribeController",
      "getTribeByName",
      Nil,
      "POST",
      """""",
      this.prefix + """searchTribeByName"""
    )
  )

  // @LINE:44
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_updateTribeName30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateTribeName")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_updateTribeName30_invoker = createInvoker(
    TribeController_11.updateTribeName(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TribeController",
      "updateTribeName",
      Nil,
      "POST",
      """""",
      this.prefix + """updateTribeName"""
    )
  )

  // @LINE:45
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_getTribeMessage31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("downloadTribeMessage")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_getTribeMessage31_invoker = createInvoker(
    TribeController_11.getTribeMessage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TribeController",
      "getTribeMessage",
      Nil,
      "POST",
      """""",
      this.prefix + """downloadTribeMessage"""
    )
  )

  // @LINE:46
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_blockTribe32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blockTribe")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TribeController_blockTribe32_invoker = createInvoker(
    TribeController_11.blockTribe(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TribeController",
      "blockTribe",
      Nil,
      "POST",
      """""",
      this.prefix + """blockTribe"""
    )
  )

  // @LINE:49
  private[this] lazy val com_sgs_lumba_t5_controllers_LoginController_Login33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_LoginController_Login33_invoker = createInvoker(
    LoginController_10.Login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.LoginController",
      "Login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:50
  private[this] lazy val com_sgs_lumba_t5_controllers_LoginController_CheckLogin34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checklogin")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_LoginController_CheckLogin34_invoker = createInvoker(
    LoginController_10.CheckLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.LoginController",
      "CheckLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """checklogin"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_UsersManagementController_getAdminUserInfo35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usersmanagement")))
  )
  private[this] lazy val controllers_UsersManagementController_getAdminUserInfo35_invoker = createInvoker(
    UsersManagementController_2.getAdminUserInfo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "getAdminUserInfo",
      Nil,
      "GET",
      """""",
      this.prefix + """usersmanagement"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_UsersManagementController_addAdminAccount36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addadminaccount")))
  )
  private[this] lazy val controllers_UsersManagementController_addAdminAccount36_invoker = createInvoker(
    UsersManagementController_2.addAdminAccount(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "addAdminAccount",
      Nil,
      "POST",
      """""",
      this.prefix + """addadminaccount"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_UsersManagementController_updateAdminAccount37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateadminacc")))
  )
  private[this] lazy val controllers_UsersManagementController_updateAdminAccount37_invoker = createInvoker(
    UsersManagementController_2.updateAdminAccount(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersManagementController",
      "updateAdminAccount",
      Nil,
      "POST",
      """""",
      this.prefix + """updateadminacc"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_UsersManagementController_updateUsername38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateusername")))
  )
  private[this] lazy val controllers_UsersManagementController_updateUsername38_invoker = createInvoker(
    UsersManagementController_2.updateUsername(),
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

  // @LINE:56
  private[this] lazy val controllers_UsersManagementController_updateEmail39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateemail")))
  )
  private[this] lazy val controllers_UsersManagementController_updateEmail39_invoker = createInvoker(
    UsersManagementController_2.updateEmail(),
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

  // @LINE:57
  private[this] lazy val controllers_UsersManagementController_updatePassword40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepassword")))
  )
  private[this] lazy val controllers_UsersManagementController_updatePassword40_invoker = createInvoker(
    UsersManagementController_2.updatePassword(),
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

  // @LINE:58
  private[this] lazy val controllers_UsersManagementController_updateRole41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updaterole")))
  )
  private[this] lazy val controllers_UsersManagementController_updateRole41_invoker = createInvoker(
    UsersManagementController_2.updateRole(),
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

  // @LINE:59
  private[this] lazy val controllers_UsersManagementController_deleteAdminAcc42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteadminacc")))
  )
  private[this] lazy val controllers_UsersManagementController_deleteAdminAcc42_invoker = createInvoker(
    UsersManagementController_2.deleteAdminAcc(),
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

  // @LINE:60
  private[this] lazy val controllers_UsersManagementController_getUserData43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getuserdata")))
  )
  private[this] lazy val controllers_UsersManagementController_getUserData43_invoker = createInvoker(
    UsersManagementController_2.getUserData(),
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

  // @LINE:61
  private[this] lazy val controllers_UsersManagementController_sendEmail44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendEmail")))
  )
  private[this] lazy val controllers_UsersManagementController_sendEmail44_invoker = createInvoker(
    UsersManagementController_2.sendEmail(),
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

  // @LINE:62
  private[this] lazy val controllers_UsersManagementController_profile45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_UsersManagementController_profile45_invoker = createInvoker(
    UsersManagementController_2.profile(),
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

  // @LINE:63
  private[this] lazy val controllers_UsersManagementController_getProfile46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getprofile")))
  )
  private[this] lazy val controllers_UsersManagementController_getProfile46_invoker = createInvoker(
    UsersManagementController_2.getProfile(),
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

  // @LINE:64
  private[this] lazy val controllers_UsersManagementController_updateProfile47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateprofile")))
  )
  private[this] lazy val controllers_UsersManagementController_updateProfile47_invoker = createInvoker(
    UsersManagementController_2.updateProfile(),
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

  // @LINE:66
  private[this] lazy val com_sgs_lumba_t5_controllers_TimeZoneController_timeZone48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("timezone")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TimeZoneController_timeZone48_invoker = createInvoker(
    TimeZoneController_14.timeZone(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TimeZoneController",
      "timeZone",
      Nil,
      "GET",
      """""",
      this.prefix + """timezone"""
    )
  )

  // @LINE:67
  private[this] lazy val com_sgs_lumba_t5_controllers_TimeZoneController_updateTimeZone49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatetimezone")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TimeZoneController_updateTimeZone49_invoker = createInvoker(
    TimeZoneController_14.updateTimeZone(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TimeZoneController",
      "updateTimeZone",
      Nil,
      "POST",
      """""",
      this.prefix + """updatetimezone"""
    )
  )

  // @LINE:69
  private[this] lazy val com_sgs_lumba_t5_controllers_TextStringController_textString50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("textstring")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TextStringController_textString50_invoker = createInvoker(
    TextStringController_9.textString(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TextStringController",
      "textString",
      Nil,
      "GET",
      """""",
      this.prefix + """textstring"""
    )
  )

  // @LINE:70
  private[this] lazy val com_sgs_lumba_t5_controllers_TextStringController_getTextString51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTextString")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TextStringController_getTextString51_invoker = createInvoker(
    TextStringController_9.getTextString(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TextStringController",
      "getTextString",
      Nil,
      "POST",
      """""",
      this.prefix + """getTextString"""
    )
  )

  // @LINE:71
  private[this] lazy val com_sgs_lumba_t5_controllers_TextStringController_exportTextString52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exporttextstring")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_TextStringController_exportTextString52_invoker = createInvoker(
    TextStringController_9.exportTextString(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.TextStringController",
      "exportTextString",
      Nil,
      "POST",
      """""",
      this.prefix + """exporttextstring"""
    )
  )

  // @LINE:73
  private[this] lazy val com_sgs_lumba_t5_controllers_ProfanityController_profanity53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profanity")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_ProfanityController_profanity53_invoker = createInvoker(
    ProfanityController_5.profanity(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.ProfanityController",
      "profanity",
      Nil,
      "GET",
      """""",
      this.prefix + """profanity"""
    )
  )

  // @LINE:74
  private[this] lazy val com_sgs_lumba_t5_controllers_ProfanityController_getProfanityText54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getprofanitytext")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_ProfanityController_getProfanityText54_invoker = createInvoker(
    ProfanityController_5.getProfanityText(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.ProfanityController",
      "getProfanityText",
      Nil,
      "POST",
      """""",
      this.prefix + """getprofanitytext"""
    )
  )

  // @LINE:75
  private[this] lazy val com_sgs_lumba_t5_controllers_ProfanityController_exportProfanity55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportprofanity")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_ProfanityController_exportProfanity55_invoker = createInvoker(
    ProfanityController_5.exportProfanity(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.ProfanityController",
      "exportProfanity",
      Nil,
      "POST",
      """""",
      this.prefix + """exportprofanity"""
    )
  )

  // @LINE:77
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_getNews56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("news")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_getNews56_invoker = createInvoker(
    NewsController_6.getNews(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "getNews",
      Nil,
      "GET",
      """""",
      this.prefix + """news"""
    )
  )

  // @LINE:78
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_addEnglishNews57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addenglishnews")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_addEnglishNews57_invoker = createInvoker(
    NewsController_6.addEnglishNews(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "addEnglishNews",
      Nil,
      "POST",
      """""",
      this.prefix + """addenglishnews"""
    )
  )

  // @LINE:79
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_addArabNews58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addarabnews")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_addArabNews58_invoker = createInvoker(
    NewsController_6.addArabNews(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "addArabNews",
      Nil,
      "POST",
      """""",
      this.prefix + """addarabnews"""
    )
  )

  // @LINE:80
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsTitle59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateenglishnewstitle")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsTitle59_invoker = createInvoker(
    NewsController_6.updateEnglishNewsTitle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "updateEnglishNewsTitle",
      Nil,
      "POST",
      """""",
      this.prefix + """updateenglishnewstitle"""
    )
  )

  // @LINE:81
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsImage60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateenglishnewsimage")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsImage60_invoker = createInvoker(
    NewsController_6.updateEnglishNewsImage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "updateEnglishNewsImage",
      Nil,
      "POST",
      """""",
      this.prefix + """updateenglishnewsimage"""
    )
  )

  // @LINE:82
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsVideo61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateenglishnewsvideo")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsVideo61_invoker = createInvoker(
    NewsController_6.updateEnglishNewsVideo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "updateEnglishNewsVideo",
      Nil,
      "POST",
      """""",
      this.prefix + """updateenglishnewsvideo"""
    )
  )

  // @LINE:83
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsContent62_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateenglishnewscontent")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsContent62_invoker = createInvoker(
    NewsController_6.updateEnglishNewsContent(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "updateEnglishNewsContent",
      Nil,
      "POST",
      """""",
      this.prefix + """updateenglishnewscontent"""
    )
  )

  // @LINE:84
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_deleteEnglishNews63_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteenglishnews")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_deleteEnglishNews63_invoker = createInvoker(
    NewsController_6.deleteEnglishNews(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "deleteEnglishNews",
      Nil,
      "POST",
      """""",
      this.prefix + """deleteenglishnews"""
    )
  )

  // @LINE:85
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateArabNewsTitle64_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatearabnewstitle")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateArabNewsTitle64_invoker = createInvoker(
    NewsController_6.updateArabNewsTitle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "updateArabNewsTitle",
      Nil,
      "POST",
      """""",
      this.prefix + """updatearabnewstitle"""
    )
  )

  // @LINE:86
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateArabNewsImage65_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatearabnewsimage")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateArabNewsImage65_invoker = createInvoker(
    NewsController_6.updateArabNewsImage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "updateArabNewsImage",
      Nil,
      "POST",
      """""",
      this.prefix + """updatearabnewsimage"""
    )
  )

  // @LINE:87
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateArabNewsVideo66_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatearabnewsvideo")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateArabNewsVideo66_invoker = createInvoker(
    NewsController_6.updateArabNewsVideo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "updateArabNewsVideo",
      Nil,
      "POST",
      """""",
      this.prefix + """updatearabnewsvideo"""
    )
  )

  // @LINE:88
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateArabNewsContent67_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatearabnewscontent")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_updateArabNewsContent67_invoker = createInvoker(
    NewsController_6.updateArabNewsContent(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "updateArabNewsContent",
      Nil,
      "POST",
      """""",
      this.prefix + """updatearabnewscontent"""
    )
  )

  // @LINE:89
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_deleteArabNews68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletearabnews")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_NewsController_deleteArabNews68_invoker = createInvoker(
    NewsController_6.deleteArabNews(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.NewsController",
      "deleteArabNews",
      Nil,
      "POST",
      """""",
      this.prefix + """deletearabnews"""
    )
  )

  // @LINE:91
  private[this] lazy val com_sgs_lumba_t5_controllers_GameDataController_gameData69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gamedata")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameDataController_gameData69_invoker = createInvoker(
    GameDataController_1.gameData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameDataController",
      "gameData",
      Nil,
      "GET",
      """""",
      this.prefix + """gamedata"""
    )
  )

  // @LINE:92
  private[this] lazy val com_sgs_lumba_t5_controllers_GameDataController_getData70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getdata/"), DynamicPart("section", """[^/]+""",true)))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameDataController_getData70_invoker = createInvoker(
    GameDataController_1.getData(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameDataController",
      "getData",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """getdata/$section<[^/]+>"""
    )
  )

  // @LINE:93
  private[this] lazy val com_sgs_lumba_t5_controllers_GameDataController_exportGameData71_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportgamedata/"), DynamicPart("section", """[^/]+""",true)))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameDataController_exportGameData71_invoker = createInvoker(
    GameDataController_1.exportGameData(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameDataController",
      "exportGameData",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """exportgamedata/$section<[^/]+>"""
    )
  )

  // @LINE:94
  private[this] lazy val com_sgs_lumba_t5_controllers_GameDataController_getSpreadsheetData72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewspreadsheetdata/"), DynamicPart("section", """[^/]+""",true)))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameDataController_getSpreadsheetData72_invoker = createInvoker(
    GameDataController_1.getSpreadsheetData(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameDataController",
      "getSpreadsheetData",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """viewspreadsheetdata/$section<[^/]+>"""
    )
  )

  // @LINE:95
  private[this] lazy val com_sgs_lumba_t5_controllers_GameDataController_publishSpreadsheet73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publishspreadsheet/"), DynamicPart("section", """[^/]+""",true)))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameDataController_publishSpreadsheet73_invoker = createInvoker(
    GameDataController_1.publishSpreadsheet(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameDataController",
      "publishSpreadsheet",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """publishspreadsheet/$section<[^/]+>"""
    )
  )

  // @LINE:97
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_getGameSettings74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gamesettings")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_getGameSettings74_invoker = createInvoker(
    GameSettingsController_8.getGameSettings(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameSettingsController",
      "getGameSettings",
      Nil,
      "GET",
      """""",
      this.prefix + """gamesettings"""
    )
  )

  // @LINE:98
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_getSettings75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_getSettings75_invoker = createInvoker(
    GameSettingsController_8.getSettings(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameSettingsController",
      "getSettings",
      Nil,
      "POST",
      """""",
      this.prefix + """settings"""
    )
  )

  // @LINE:99
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_saveSettingsData76_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("savesettingsdata")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_saveSettingsData76_invoker = createInvoker(
    GameSettingsController_8.saveSettingsData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameSettingsController",
      "saveSettingsData",
      Nil,
      "POST",
      """""",
      this.prefix + """savesettingsdata"""
    )
  )

  // @LINE:100
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_addVersionSFS77_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addversionsfs")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_addVersionSFS77_invoker = createInvoker(
    GameSettingsController_8.addVersionSFS(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameSettingsController",
      "addVersionSFS",
      Nil,
      "POST",
      """""",
      this.prefix + """addversionsfs"""
    )
  )

  // @LINE:101
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_deleteUnuseVersion78_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteunuseversion")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_deleteUnuseVersion78_invoker = createInvoker(
    GameSettingsController_8.deleteUnuseVersion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameSettingsController",
      "deleteUnuseVersion",
      Nil,
      "POST",
      """""",
      this.prefix + """deleteunuseversion"""
    )
  )

  // @LINE:102
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_changeGameSubVersion79_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changegamesubversion")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameSettingsController_changeGameSubVersion79_invoker = createInvoker(
    GameSettingsController_8.changeGameSubVersion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameSettingsController",
      "changeGameSubVersion",
      Nil,
      "POST",
      """""",
      this.prefix + """changegamesubversion"""
    )
  )

  // @LINE:105
  private[this] lazy val com_sgs_lumba_t5_controllers_GameVersionController_getGameVersion80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gameversion")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_GameVersionController_getGameVersion80_invoker = createInvoker(
    GameVersionController_0.getGameVersion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.GameVersionController",
      "getGameVersion",
      Nil,
      "GET",
      """""",
      this.prefix + """gameversion"""
    )
  )

  // @LINE:107
  private[this] lazy val com_sgs_lumba_t5_controllers_BundleController_bundle81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bundle")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_BundleController_bundle81_invoker = createInvoker(
    BundleController_15.bundle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.BundleController",
      "bundle",
      Nil,
      "GET",
      """""",
      this.prefix + """bundle"""
    )
  )

  // @LINE:108
  private[this] lazy val com_sgs_lumba_t5_controllers_BundleController_getBundle82_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbundle")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_BundleController_getBundle82_invoker = createInvoker(
    BundleController_15.getBundle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.BundleController",
      "getBundle",
      Nil,
      "POST",
      """""",
      this.prefix + """getbundle"""
    )
  )

  // @LINE:109
  private[this] lazy val com_sgs_lumba_t5_controllers_BundleController_saveBundle83_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("savebundledata")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_BundleController_saveBundle83_invoker = createInvoker(
    BundleController_15.saveBundle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.BundleController",
      "saveBundle",
      Nil,
      "POST",
      """""",
      this.prefix + """savebundledata"""
    )
  )

  // @LINE:111
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_iapData84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("iapdata")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_iapData84_invoker = createInvoker(
    iapController_7.iapData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.iapController",
      "iapData",
      Nil,
      "GET",
      """""",
      this.prefix + """iapdata"""
    )
  )

  // @LINE:112
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_iapIOS85_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("iapios")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_iapIOS85_invoker = createInvoker(
    iapController_7.iapIOS(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.iapController",
      "iapIOS",
      Nil,
      "POST",
      """""",
      this.prefix + """iapios"""
    )
  )

  // @LINE:113
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_iapAndroid86_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("iapandroid")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_iapAndroid86_invoker = createInvoker(
    iapController_7.iapAndroid(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.iapController",
      "iapAndroid",
      Nil,
      "POST",
      """""",
      this.prefix + """iapandroid"""
    )
  )

  // @LINE:114
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_iapValid87_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("iapvalid")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_iapValid87_invoker = createInvoker(
    iapController_7.iapValid(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.iapController",
      "iapValid",
      Nil,
      "POST",
      """""",
      this.prefix + """iapvalid"""
    )
  )

  // @LINE:115
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_testDate88_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testdate")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_testDate88_invoker = createInvoker(
    iapController_7.testDate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.iapController",
      "testDate",
      Nil,
      "POST",
      """""",
      this.prefix + """testdate"""
    )
  )

  // @LINE:116
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_getUniquePayingUsers89_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uniquepayingusers")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_getUniquePayingUsers89_invoker = createInvoker(
    iapController_7.getUniquePayingUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.iapController",
      "getUniquePayingUsers",
      Nil,
      "POST",
      """""",
      this.prefix + """uniquepayingusers"""
    )
  )

  // @LINE:117
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_getNewPayingUsers90_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newpayingusers")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_iapController_getNewPayingUsers90_invoker = createInvoker(
    iapController_7.getNewPayingUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.iapController",
      "getNewPayingUsers",
      Nil,
      "POST",
      """""",
      this.prefix + """newpayingusers"""
    )
  )

  // @LINE:119
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_playersData91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("playersdata")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_playersData91_invoker = createInvoker(
    PlayersDataController_13.playersData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.PlayersDataController",
      "playersData",
      Nil,
      "GET",
      """""",
      this.prefix + """playersdata"""
    )
  )

  // @LINE:120
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getDAU92_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dau")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getDAU92_invoker = createInvoker(
    PlayersDataController_13.getDAU(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.PlayersDataController",
      "getDAU",
      Nil,
      "POST",
      """""",
      this.prefix + """dau"""
    )
  )

  // @LINE:121
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getMAU93_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mau")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getMAU93_invoker = createInvoker(
    PlayersDataController_13.getMAU(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.PlayersDataController",
      "getMAU",
      Nil,
      "POST",
      """""",
      this.prefix + """mau"""
    )
  )

  // @LINE:122
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getNewPlayingUsers94_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newplayingusers")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getNewPlayingUsers94_invoker = createInvoker(
    PlayersDataController_13.getNewPlayingUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.PlayersDataController",
      "getNewPlayingUsers",
      Nil,
      "POST",
      """""",
      this.prefix + """newplayingusers"""
    )
  )

  // @LINE:123
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getCCU95_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getccu")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getCCU95_invoker = createInvoker(
    PlayersDataController_13.getCCU(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.PlayersDataController",
      "getCCU",
      Nil,
      "POST",
      """""",
      this.prefix + """getccu"""
    )
  )

  // @LINE:124
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getGlobalChat96_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("globalchat")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getGlobalChat96_invoker = createInvoker(
    PlayersDataController_13.getGlobalChat(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.PlayersDataController",
      "getGlobalChat",
      Nil,
      "POST",
      """""",
      this.prefix + """globalchat"""
    )
  )

  // @LINE:125
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getTribeChat97_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tribechat")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getTribeChat97_invoker = createInvoker(
    PlayersDataController_13.getTribeChat(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.PlayersDataController",
      "getTribeChat",
      Nil,
      "POST",
      """""",
      this.prefix + """tribechat"""
    )
  )

  // @LINE:126
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getLoginLogoutTime98_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginlogout")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getLoginLogoutTime98_invoker = createInvoker(
    PlayersDataController_13.getLoginLogoutTime(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.PlayersDataController",
      "getLoginLogoutTime",
      Nil,
      "POST",
      """""",
      this.prefix + """loginlogout"""
    )
  )

  // @LINE:127
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getUniqueUsersNumber99_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uniqueusersnumber")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_PlayersDataController_getUniqueUsersNumber99_invoker = createInvoker(
    PlayersDataController_13.getUniqueUsersNumber(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.PlayersDataController",
      "getUniqueUsersNumber",
      Nil,
      "POST",
      """""",
      this.prefix + """uniqueusersnumber"""
    )
  )

  // @LINE:129
  private[this] lazy val com_sgs_lumba_t5_controllers_AdjustCallbackController_AdjustCallback100_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adjustcallback")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_AdjustCallbackController_AdjustCallback100_invoker = createInvoker(
    AdjustCallbackController_4.AdjustCallback(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.AdjustCallbackController",
      "AdjustCallback",
      Nil,
      "GET",
      """""",
      this.prefix + """adjustcallback"""
    )
  )

  // @LINE:130
  private[this] lazy val com_sgs_lumba_t5_controllers_AdjustCallbackController_getAllAdjustCallbackData101_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getalladjustcallbackdata")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_AdjustCallbackController_getAllAdjustCallbackData101_invoker = createInvoker(
    AdjustCallbackController_4.getAllAdjustCallbackData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.AdjustCallbackController",
      "getAllAdjustCallbackData",
      Nil,
      "POST",
      """""",
      this.prefix + """getalladjustcallbackdata"""
    )
  )

  // @LINE:131
  private[this] lazy val com_sgs_lumba_t5_controllers_AdjustCallbackController_getAdjustCallbackData102_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getadjustcallbackdata")))
  )
  private[this] lazy val com_sgs_lumba_t5_controllers_AdjustCallbackController_getAdjustCallbackData102_invoker = createInvoker(
    AdjustCallbackController_4.getAdjustCallbackData(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.sgs.lumba.t5.controllers.AdjustCallbackController",
      "getAdjustCallbackData",
      Nil,
      "POST",
      """""",
      this.prefix + """getadjustcallbackdata"""
    )
  )

  // @LINE:135
  private[this] lazy val controllers_Assets_versioned103_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned103_invoker = createInvoker(
    Assets_17.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_Application_index0_invoker.call(Application_18.index())
      }
  
    // @LINE:8
    case controllers_Application_inprogress1_route(params) =>
      call { 
        controllers_Application_inprogress1_invoker.call(Application_18.inprogress())
      }
  
    // @LINE:11
    case com_sgs_lumba_t5_controllers_DashBoardController_Dashboard2_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_DashBoardController_Dashboard2_invoker.call(DashBoardController_12.Dashboard())
      }
  
    // @LINE:12
    case com_sgs_lumba_t5_controllers_DashBoardController_GetDashboardData3_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_DashBoardController_GetDashboardData3_invoker.call(DashBoardController_12.GetDashboardData())
      }
  
    // @LINE:14
    case com_sgs_lumba_t5_controllers_LTVCalculatorController_LTVCalculator4_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_LTVCalculatorController_LTVCalculator4_invoker.call(LTVCalculatorController_19.LTVCalculator())
      }
  
    // @LINE:15
    case com_sgs_lumba_t5_controllers_LTVCalculatorController_GetLTVValue5_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_LTVCalculatorController_GetLTVValue5_invoker.call(LTVCalculatorController_19.GetLTVValue())
      }
  
    // @LINE:17
    case com_sgs_lumba_t5_controllers_PullActivitiesController_PullActivities6_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_PullActivitiesController_PullActivities6_invoker.call(PullActivitiesController_16.PullActivities())
      }
  
    // @LINE:18
    case com_sgs_lumba_t5_controllers_PullActivitiesController_CreateReport7_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_PullActivitiesController_CreateReport7_invoker.call(PullActivitiesController_16.CreateReport())
      }
  
    // @LINE:20
    case com_sgs_lumba_t5_controllers_GameStateController_gamestate8_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_gamestate8_invoker.call(GameStateController_3.gamestate())
      }
  
    // @LINE:21
    case com_sgs_lumba_t5_controllers_GameStateController_getUserById9_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_getUserById9_invoker.call(GameStateController_3.getUserById())
      }
  
    // @LINE:22
    case com_sgs_lumba_t5_controllers_GameStateController_getUserList10_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_getUserList10_invoker.call(GameStateController_3.getUserList())
      }
  
    // @LINE:23
    case com_sgs_lumba_t5_controllers_GameStateController_getUserList11_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_getUserList11_invoker.call(GameStateController_3.getUserList())
      }
  
    // @LINE:24
    case com_sgs_lumba_t5_controllers_GameStateController_getUserList12_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_getUserList12_invoker.call(GameStateController_3.getUserList())
      }
  
    // @LINE:26
    case com_sgs_lumba_t5_controllers_GameStateController_updateUserData13_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_updateUserData13_invoker.call(GameStateController_3.updateUserData())
      }
  
    // @LINE:27
    case com_sgs_lumba_t5_controllers_GameStateController_noteForUser14_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_noteForUser14_invoker.call(GameStateController_3.noteForUser())
      }
  
    // @LINE:28
    case com_sgs_lumba_t5_controllers_GameStateController_deleteUser15_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_deleteUser15_invoker.call(GameStateController_3.deleteUser())
      }
  
    // @LINE:29
    case com_sgs_lumba_t5_controllers_GameStateController_fakeUser16_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_fakeUser16_invoker.call(GameStateController_3.fakeUser())
      }
  
    // @LINE:30
    case com_sgs_lumba_t5_controllers_GameStateController_downloadBattleLog17_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_downloadBattleLog17_invoker.call(GameStateController_3.downloadBattleLog())
      }
  
    // @LINE:31
    case com_sgs_lumba_t5_controllers_GameStateController_turnOffShield18_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_turnOffShield18_invoker.call(GameStateController_3.turnOffShield())
      }
  
    // @LINE:32
    case com_sgs_lumba_t5_controllers_GameStateController_turnOnShield19_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_turnOnShield19_invoker.call(GameStateController_3.turnOnShield())
      }
  
    // @LINE:33
    case com_sgs_lumba_t5_controllers_GameStateController_blockLeaderBoard20_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_blockLeaderBoard20_invoker.call(GameStateController_3.blockLeaderBoard())
      }
  
    // @LINE:34
    case com_sgs_lumba_t5_controllers_GameStateController_blockTribe21_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_blockTribe21_invoker.call(GameStateController_3.blockTribe())
      }
  
    // @LINE:35
    case com_sgs_lumba_t5_controllers_GameStateController_blockSearching22_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_blockSearching22_invoker.call(GameStateController_3.blockSearching())
      }
  
    // @LINE:36
    case com_sgs_lumba_t5_controllers_GameStateController_blockGlobalChat23_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_blockGlobalChat23_invoker.call(GameStateController_3.blockGlobalChat())
      }
  
    // @LINE:37
    case com_sgs_lumba_t5_controllers_GameStateController_blockAttack24_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameStateController_blockAttack24_invoker.call(GameStateController_3.blockAttack())
      }
  
    // @LINE:39
    case com_sgs_lumba_t5_controllers_TribeController_tribes25_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TribeController_tribes25_invoker.call(TribeController_11.tribes())
      }
  
    // @LINE:40
    case com_sgs_lumba_t5_controllers_TribeController_getAllTribes26_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TribeController_getAllTribes26_invoker.call(TribeController_11.getAllTribes())
      }
  
    // @LINE:41
    case com_sgs_lumba_t5_controllers_TribeController_getTribeDetails27_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TribeController_getTribeDetails27_invoker.call(TribeController_11.getTribeDetails())
      }
  
    // @LINE:42
    case com_sgs_lumba_t5_controllers_TribeController_getTribeById28_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TribeController_getTribeById28_invoker.call(TribeController_11.getTribeById())
      }
  
    // @LINE:43
    case com_sgs_lumba_t5_controllers_TribeController_getTribeByName29_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TribeController_getTribeByName29_invoker.call(TribeController_11.getTribeByName())
      }
  
    // @LINE:44
    case com_sgs_lumba_t5_controllers_TribeController_updateTribeName30_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TribeController_updateTribeName30_invoker.call(TribeController_11.updateTribeName())
      }
  
    // @LINE:45
    case com_sgs_lumba_t5_controllers_TribeController_getTribeMessage31_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TribeController_getTribeMessage31_invoker.call(TribeController_11.getTribeMessage())
      }
  
    // @LINE:46
    case com_sgs_lumba_t5_controllers_TribeController_blockTribe32_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TribeController_blockTribe32_invoker.call(TribeController_11.blockTribe())
      }
  
    // @LINE:49
    case com_sgs_lumba_t5_controllers_LoginController_Login33_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_LoginController_Login33_invoker.call(LoginController_10.Login())
      }
  
    // @LINE:50
    case com_sgs_lumba_t5_controllers_LoginController_CheckLogin34_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_LoginController_CheckLogin34_invoker.call(LoginController_10.CheckLogin())
      }
  
    // @LINE:52
    case controllers_UsersManagementController_getAdminUserInfo35_route(params) =>
      call { 
        controllers_UsersManagementController_getAdminUserInfo35_invoker.call(UsersManagementController_2.getAdminUserInfo())
      }
  
    // @LINE:53
    case controllers_UsersManagementController_addAdminAccount36_route(params) =>
      call { 
        controllers_UsersManagementController_addAdminAccount36_invoker.call(UsersManagementController_2.addAdminAccount())
      }
  
    // @LINE:54
    case controllers_UsersManagementController_updateAdminAccount37_route(params) =>
      call { 
        controllers_UsersManagementController_updateAdminAccount37_invoker.call(UsersManagementController_2.updateAdminAccount())
      }
  
    // @LINE:55
    case controllers_UsersManagementController_updateUsername38_route(params) =>
      call { 
        controllers_UsersManagementController_updateUsername38_invoker.call(UsersManagementController_2.updateUsername())
      }
  
    // @LINE:56
    case controllers_UsersManagementController_updateEmail39_route(params) =>
      call { 
        controllers_UsersManagementController_updateEmail39_invoker.call(UsersManagementController_2.updateEmail())
      }
  
    // @LINE:57
    case controllers_UsersManagementController_updatePassword40_route(params) =>
      call { 
        controllers_UsersManagementController_updatePassword40_invoker.call(UsersManagementController_2.updatePassword())
      }
  
    // @LINE:58
    case controllers_UsersManagementController_updateRole41_route(params) =>
      call { 
        controllers_UsersManagementController_updateRole41_invoker.call(UsersManagementController_2.updateRole())
      }
  
    // @LINE:59
    case controllers_UsersManagementController_deleteAdminAcc42_route(params) =>
      call { 
        controllers_UsersManagementController_deleteAdminAcc42_invoker.call(UsersManagementController_2.deleteAdminAcc())
      }
  
    // @LINE:60
    case controllers_UsersManagementController_getUserData43_route(params) =>
      call { 
        controllers_UsersManagementController_getUserData43_invoker.call(UsersManagementController_2.getUserData())
      }
  
    // @LINE:61
    case controllers_UsersManagementController_sendEmail44_route(params) =>
      call { 
        controllers_UsersManagementController_sendEmail44_invoker.call(UsersManagementController_2.sendEmail())
      }
  
    // @LINE:62
    case controllers_UsersManagementController_profile45_route(params) =>
      call { 
        controllers_UsersManagementController_profile45_invoker.call(UsersManagementController_2.profile())
      }
  
    // @LINE:63
    case controllers_UsersManagementController_getProfile46_route(params) =>
      call { 
        controllers_UsersManagementController_getProfile46_invoker.call(UsersManagementController_2.getProfile())
      }
  
    // @LINE:64
    case controllers_UsersManagementController_updateProfile47_route(params) =>
      call { 
        controllers_UsersManagementController_updateProfile47_invoker.call(UsersManagementController_2.updateProfile())
      }
  
    // @LINE:66
    case com_sgs_lumba_t5_controllers_TimeZoneController_timeZone48_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TimeZoneController_timeZone48_invoker.call(TimeZoneController_14.timeZone())
      }
  
    // @LINE:67
    case com_sgs_lumba_t5_controllers_TimeZoneController_updateTimeZone49_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TimeZoneController_updateTimeZone49_invoker.call(TimeZoneController_14.updateTimeZone())
      }
  
    // @LINE:69
    case com_sgs_lumba_t5_controllers_TextStringController_textString50_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TextStringController_textString50_invoker.call(TextStringController_9.textString())
      }
  
    // @LINE:70
    case com_sgs_lumba_t5_controllers_TextStringController_getTextString51_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TextStringController_getTextString51_invoker.call(TextStringController_9.getTextString())
      }
  
    // @LINE:71
    case com_sgs_lumba_t5_controllers_TextStringController_exportTextString52_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_TextStringController_exportTextString52_invoker.call(TextStringController_9.exportTextString())
      }
  
    // @LINE:73
    case com_sgs_lumba_t5_controllers_ProfanityController_profanity53_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_ProfanityController_profanity53_invoker.call(ProfanityController_5.profanity())
      }
  
    // @LINE:74
    case com_sgs_lumba_t5_controllers_ProfanityController_getProfanityText54_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_ProfanityController_getProfanityText54_invoker.call(ProfanityController_5.getProfanityText())
      }
  
    // @LINE:75
    case com_sgs_lumba_t5_controllers_ProfanityController_exportProfanity55_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_ProfanityController_exportProfanity55_invoker.call(ProfanityController_5.exportProfanity())
      }
  
    // @LINE:77
    case com_sgs_lumba_t5_controllers_NewsController_getNews56_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_getNews56_invoker.call(NewsController_6.getNews())
      }
  
    // @LINE:78
    case com_sgs_lumba_t5_controllers_NewsController_addEnglishNews57_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_addEnglishNews57_invoker.call(NewsController_6.addEnglishNews())
      }
  
    // @LINE:79
    case com_sgs_lumba_t5_controllers_NewsController_addArabNews58_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_addArabNews58_invoker.call(NewsController_6.addArabNews())
      }
  
    // @LINE:80
    case com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsTitle59_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsTitle59_invoker.call(NewsController_6.updateEnglishNewsTitle())
      }
  
    // @LINE:81
    case com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsImage60_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsImage60_invoker.call(NewsController_6.updateEnglishNewsImage())
      }
  
    // @LINE:82
    case com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsVideo61_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsVideo61_invoker.call(NewsController_6.updateEnglishNewsVideo())
      }
  
    // @LINE:83
    case com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsContent62_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_updateEnglishNewsContent62_invoker.call(NewsController_6.updateEnglishNewsContent())
      }
  
    // @LINE:84
    case com_sgs_lumba_t5_controllers_NewsController_deleteEnglishNews63_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_deleteEnglishNews63_invoker.call(NewsController_6.deleteEnglishNews())
      }
  
    // @LINE:85
    case com_sgs_lumba_t5_controllers_NewsController_updateArabNewsTitle64_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_updateArabNewsTitle64_invoker.call(NewsController_6.updateArabNewsTitle())
      }
  
    // @LINE:86
    case com_sgs_lumba_t5_controllers_NewsController_updateArabNewsImage65_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_updateArabNewsImage65_invoker.call(NewsController_6.updateArabNewsImage())
      }
  
    // @LINE:87
    case com_sgs_lumba_t5_controllers_NewsController_updateArabNewsVideo66_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_updateArabNewsVideo66_invoker.call(NewsController_6.updateArabNewsVideo())
      }
  
    // @LINE:88
    case com_sgs_lumba_t5_controllers_NewsController_updateArabNewsContent67_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_updateArabNewsContent67_invoker.call(NewsController_6.updateArabNewsContent())
      }
  
    // @LINE:89
    case com_sgs_lumba_t5_controllers_NewsController_deleteArabNews68_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_NewsController_deleteArabNews68_invoker.call(NewsController_6.deleteArabNews())
      }
  
    // @LINE:91
    case com_sgs_lumba_t5_controllers_GameDataController_gameData69_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameDataController_gameData69_invoker.call(GameDataController_1.gameData())
      }
  
    // @LINE:92
    case com_sgs_lumba_t5_controllers_GameDataController_getData70_route(params) =>
      call(params.fromPath[String]("section", None)) { (section) =>
        com_sgs_lumba_t5_controllers_GameDataController_getData70_invoker.call(GameDataController_1.getData(section))
      }
  
    // @LINE:93
    case com_sgs_lumba_t5_controllers_GameDataController_exportGameData71_route(params) =>
      call(params.fromPath[String]("section", None)) { (section) =>
        com_sgs_lumba_t5_controllers_GameDataController_exportGameData71_invoker.call(GameDataController_1.exportGameData(section))
      }
  
    // @LINE:94
    case com_sgs_lumba_t5_controllers_GameDataController_getSpreadsheetData72_route(params) =>
      call(params.fromPath[String]("section", None)) { (section) =>
        com_sgs_lumba_t5_controllers_GameDataController_getSpreadsheetData72_invoker.call(GameDataController_1.getSpreadsheetData(section))
      }
  
    // @LINE:95
    case com_sgs_lumba_t5_controllers_GameDataController_publishSpreadsheet73_route(params) =>
      call(params.fromPath[String]("section", None)) { (section) =>
        com_sgs_lumba_t5_controllers_GameDataController_publishSpreadsheet73_invoker.call(GameDataController_1.publishSpreadsheet(section))
      }
  
    // @LINE:97
    case com_sgs_lumba_t5_controllers_GameSettingsController_getGameSettings74_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameSettingsController_getGameSettings74_invoker.call(GameSettingsController_8.getGameSettings())
      }
  
    // @LINE:98
    case com_sgs_lumba_t5_controllers_GameSettingsController_getSettings75_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameSettingsController_getSettings75_invoker.call(GameSettingsController_8.getSettings())
      }
  
    // @LINE:99
    case com_sgs_lumba_t5_controllers_GameSettingsController_saveSettingsData76_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameSettingsController_saveSettingsData76_invoker.call(GameSettingsController_8.saveSettingsData())
      }
  
    // @LINE:100
    case com_sgs_lumba_t5_controllers_GameSettingsController_addVersionSFS77_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameSettingsController_addVersionSFS77_invoker.call(GameSettingsController_8.addVersionSFS())
      }
  
    // @LINE:101
    case com_sgs_lumba_t5_controllers_GameSettingsController_deleteUnuseVersion78_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameSettingsController_deleteUnuseVersion78_invoker.call(GameSettingsController_8.deleteUnuseVersion())
      }
  
    // @LINE:102
    case com_sgs_lumba_t5_controllers_GameSettingsController_changeGameSubVersion79_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameSettingsController_changeGameSubVersion79_invoker.call(GameSettingsController_8.changeGameSubVersion())
      }
  
    // @LINE:105
    case com_sgs_lumba_t5_controllers_GameVersionController_getGameVersion80_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_GameVersionController_getGameVersion80_invoker.call(GameVersionController_0.getGameVersion())
      }
  
    // @LINE:107
    case com_sgs_lumba_t5_controllers_BundleController_bundle81_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_BundleController_bundle81_invoker.call(BundleController_15.bundle())
      }
  
    // @LINE:108
    case com_sgs_lumba_t5_controllers_BundleController_getBundle82_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_BundleController_getBundle82_invoker.call(BundleController_15.getBundle())
      }
  
    // @LINE:109
    case com_sgs_lumba_t5_controllers_BundleController_saveBundle83_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_BundleController_saveBundle83_invoker.call(BundleController_15.saveBundle())
      }
  
    // @LINE:111
    case com_sgs_lumba_t5_controllers_iapController_iapData84_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_iapController_iapData84_invoker.call(iapController_7.iapData())
      }
  
    // @LINE:112
    case com_sgs_lumba_t5_controllers_iapController_iapIOS85_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_iapController_iapIOS85_invoker.call(iapController_7.iapIOS())
      }
  
    // @LINE:113
    case com_sgs_lumba_t5_controllers_iapController_iapAndroid86_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_iapController_iapAndroid86_invoker.call(iapController_7.iapAndroid())
      }
  
    // @LINE:114
    case com_sgs_lumba_t5_controllers_iapController_iapValid87_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_iapController_iapValid87_invoker.call(iapController_7.iapValid())
      }
  
    // @LINE:115
    case com_sgs_lumba_t5_controllers_iapController_testDate88_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_iapController_testDate88_invoker.call(iapController_7.testDate())
      }
  
    // @LINE:116
    case com_sgs_lumba_t5_controllers_iapController_getUniquePayingUsers89_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_iapController_getUniquePayingUsers89_invoker.call(iapController_7.getUniquePayingUsers())
      }
  
    // @LINE:117
    case com_sgs_lumba_t5_controllers_iapController_getNewPayingUsers90_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_iapController_getNewPayingUsers90_invoker.call(iapController_7.getNewPayingUsers())
      }
  
    // @LINE:119
    case com_sgs_lumba_t5_controllers_PlayersDataController_playersData91_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_PlayersDataController_playersData91_invoker.call(PlayersDataController_13.playersData())
      }
  
    // @LINE:120
    case com_sgs_lumba_t5_controllers_PlayersDataController_getDAU92_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_PlayersDataController_getDAU92_invoker.call(PlayersDataController_13.getDAU())
      }
  
    // @LINE:121
    case com_sgs_lumba_t5_controllers_PlayersDataController_getMAU93_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_PlayersDataController_getMAU93_invoker.call(PlayersDataController_13.getMAU())
      }
  
    // @LINE:122
    case com_sgs_lumba_t5_controllers_PlayersDataController_getNewPlayingUsers94_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_PlayersDataController_getNewPlayingUsers94_invoker.call(PlayersDataController_13.getNewPlayingUsers())
      }
  
    // @LINE:123
    case com_sgs_lumba_t5_controllers_PlayersDataController_getCCU95_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_PlayersDataController_getCCU95_invoker.call(PlayersDataController_13.getCCU())
      }
  
    // @LINE:124
    case com_sgs_lumba_t5_controllers_PlayersDataController_getGlobalChat96_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_PlayersDataController_getGlobalChat96_invoker.call(PlayersDataController_13.getGlobalChat())
      }
  
    // @LINE:125
    case com_sgs_lumba_t5_controllers_PlayersDataController_getTribeChat97_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_PlayersDataController_getTribeChat97_invoker.call(PlayersDataController_13.getTribeChat())
      }
  
    // @LINE:126
    case com_sgs_lumba_t5_controllers_PlayersDataController_getLoginLogoutTime98_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_PlayersDataController_getLoginLogoutTime98_invoker.call(PlayersDataController_13.getLoginLogoutTime())
      }
  
    // @LINE:127
    case com_sgs_lumba_t5_controllers_PlayersDataController_getUniqueUsersNumber99_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_PlayersDataController_getUniqueUsersNumber99_invoker.call(PlayersDataController_13.getUniqueUsersNumber())
      }
  
    // @LINE:129
    case com_sgs_lumba_t5_controllers_AdjustCallbackController_AdjustCallback100_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_AdjustCallbackController_AdjustCallback100_invoker.call(AdjustCallbackController_4.AdjustCallback())
      }
  
    // @LINE:130
    case com_sgs_lumba_t5_controllers_AdjustCallbackController_getAllAdjustCallbackData101_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_AdjustCallbackController_getAllAdjustCallbackData101_invoker.call(AdjustCallbackController_4.getAllAdjustCallbackData())
      }
  
    // @LINE:131
    case com_sgs_lumba_t5_controllers_AdjustCallbackController_getAdjustCallbackData102_route(params) =>
      call { 
        com_sgs_lumba_t5_controllers_AdjustCallbackController_getAdjustCallbackData102_invoker.call(AdjustCallbackController_4.getAdjustCallbackData())
      }
  
    // @LINE:135
    case controllers_Assets_versioned103_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned103_invoker.call(Assets_17.versioned(path, file))
      }
  }
}