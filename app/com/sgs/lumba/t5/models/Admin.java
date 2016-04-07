package com.sgs.lumba.t5.models;


import play.db.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Admin {

  private static  ResultSet results;

  public static Connection GetDBConnect() {
    return DB.getConnection();
  }

  public static ResultSet GetUser(String username, String password) {
    Connection conn = GetDBConnect();
    try {
      Statement statement = conn.createStatement();
      String query = "Select * from t5Admin.`users` where `username`='" + username + "' and `password`='" + password + "'";
      results = statement.executeQuery(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return results;
  }
}
