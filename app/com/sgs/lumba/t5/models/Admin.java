package com.sgs.lumba.t5.models;


import play.db.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Admin {

//  private static  ResultSet results;

  public static Connection GetDBConnect() {
    return DB.getConnection();
  }

  private static Connection conn = GetDBConnect();
  private static Statement statement = null;

  public static ResultSet GetUser(String username, String password) throws SQLException{
    ResultSet results = null;
    try {
      statement = conn.createStatement();
      String query = "SELECT * FROM `t5Admin`.`users` WHERE `username`='" + username + "' AND `password`='" + password + "'";
      System.out.println(query);
      results = statement.executeQuery(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return results;
  }

  public static ResultSet GetUser(String username) throws SQLException {
    ResultSet results = null;
    try {
      statement = conn.createStatement();
      String query = "SELECT * FROM `t5Admin`.`users` WHERE `username`='" + username + "'";
      results = statement.executeQuery(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return results;
  }

  public static ResultSet GetUsersInfo() {
    ResultSet results = null;
    try {
      statement = conn.createStatement();
      String query = "SELECT * FROM `t5Admin`.`users`";
      results = statement.executeQuery(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return results;
  }

  public static int UpdateTimeZone(String username, int timezone) throws SQLException {
    int results = 0;
    try {
      statement = conn.createStatement();
      String query = "UPDATE  `t5Admin`.`users` SET `timezone` = " + timezone + " WHERE `username`='" + username + "'";
      System.out.println("query: " + query);
      results = statement.executeUpdate(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return results;
  }

  public static int UpdateAccountInfo(int id, String username, String email, int role) throws SQLException {
    int results = 0;
    try {
      statement = conn.createStatement();
      String query = "UPDATE  `t5Admin`.`users` SET `username` = '" + username + "', `email`='" + email + "', `role` = " + role + " WHERE `id`=" + id + "";
      System.out.println("query: " + query);
      results = statement.executeUpdate(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return results;
  }

  public static ResultSet GetUserInfoByName(String username) {
    ResultSet results = null;
    try {
      statement = conn.createStatement();
      String query = "SELECT * FROM `t5Admin`.`users` WHERE `username`='" + username + "'";
      System.out.println(query);
      results = statement.executeQuery(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return results;
  }

  public static ResultSet GetUserInfoByEmail(String email) {
    ResultSet results = null;
    try {
      statement = conn.createStatement();
      String query = "SELECT * FROM `t5Admin`.`users` WHERE `email`='" + email + "'";
      System.out.println(query);
      results = statement.executeQuery(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return results;
  }

  public static int AddAdminAccount(String username, String password, String email, int role, int timezone) {
    int results = 0;
    try {
      statement = conn.createStatement();
      String query = "INSERT INTO  `t5Admin`.`users` (`username`, `password`, `email`, `role`, `timezone`) " +
              "VALUES ('" + username + "', '" + password + "', '" + email + "', " + role + ", " + timezone + ")";
      System.out.println("query: " + query);
      results = statement.executeUpdate(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return results;
  }

  public static void CloseStatement() {
//    if (rs != null) {
//      try {
//        rs.close();
//      } catch (SQLException e) {
//        e.printStackTrace();
//      }
//    }
    if (statement != null) {
      try {
        statement.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
