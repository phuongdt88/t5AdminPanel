
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/phuongdt1/Desktop/lumba/t5-admin-panel/conf/routes
// @DATE:Tue May 10 17:17:25 ICT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseUsersManagementController UsersManagementController = new controllers.ReverseUsersManagementController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseUsersManagementController UsersManagementController = new controllers.javascript.ReverseUsersManagementController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
