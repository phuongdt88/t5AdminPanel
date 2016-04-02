package controllers;

import au.com.bytecode.opencsv.CSVWriter;
import models.GoogleDrive;
import models.PlayersData;
import models.User;
import org.jongo.MongoCursor;
import play.Play;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.playersdata;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by phuongdt1 on 9/15/15.
 */
public class PlayersDataController extends Controller{
  public Result playersData() {
    return ok(playersdata.render());
  }

  public Result getDAU() {
    DynamicForm data = Form.form().bindFromRequest();
    String date = data.get("date");
    int platform = Integer.parseInt(data.get("platform"));
    int exportType = Integer.parseInt(data.get("exportType"));
    String platformTxt = "";
    switch(platform) {
      case 0:
        platformTxt = "iOS";
        break;
      case 1:
        platformTxt = "Android";
        break;
      case 2:
        platformTxt = "All";
        break;
    }

    String csv = null;
    try {
      csv = "Daily Active Users_" + platformTxt + "_" + new Date().getTime() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "Date, Total Active Users".split(",");
      //Write the header to file
      writer.writeNext(header);

      String[] dateArr = date.split(",");
      for (int i = 0; i < dateArr.length; i++) {
        List<String> androidUsersList = new ArrayList<>();
        List<String> users = PlayersData.getDAU(dateArr[i]);
        for (int j = 0; j < users.size(); j++) {
          String userId = users.get(j);

          PlayersData userAndroid = PlayersData.findUserAndroidByUserId(userId);
          if (userAndroid != null) {
            androidUsersList.add(userAndroid.getUserId());
          }
        }
        System.out.println(androidUsersList.size());
        String totalAndroidUsers = androidUsersList.size() + "";
        String totalIOSUsers = (users.size() - androidUsersList.size()) + "";
        String[] row = null;

        if(platform == 0) {
          row = new String[]{dateArr[i], totalIOSUsers};
        } else if( platform == 1){
          row = new String[]{dateArr[i], totalAndroidUsers};
        } else {
          row = new String[]{dateArr[i], users.size()+""};
        }
        writer.writeNext(row);
      }
      writer.close();
      System.out.println("write csv done");
      java.io.File file = new java.io.File(csv);
      if(exportType == 0) {
        String fileId = GoogleDrive.uploadFile(file, csv, "text/csv");
        if (fileId != null){
          System.out.println(fileId);
        } else {
          System.out.println("error");
        }
        return ok(fileId);
      } else {
        response().setHeader("Content-Lenght", String.valueOf(file.length()));
        response().setHeader("Content-Disposition", "attachment; filename=" + csv);
        return ok(file).as("text/csv");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public Result getMAU() {
    DynamicForm data = Form.form().bindFromRequest();
    String month = data.get("month");
    int platform = Integer.parseInt(data.get("platform"));
    int exportType = Integer.parseInt(data.get("exportType"));
    String platformTxt = "";
    switch(platform) {
      case 0:
        platformTxt = "iOS";
        break;
      case 1:
        platformTxt = "Android";
        break;
      case 2:
        platformTxt = "All";
        break;
    }

    String csv = null;
    try {
      csv = "Monthly Active Users_" + platformTxt + "_" + new Date().getTime() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "Month, Total Active Users".split(",");
      //Write the header to file
      writer.writeNext(header);

      String[] monthArr = month.split(",");
      for (int i = 0; i < monthArr.length; i++) {
        List<String> androidUsersList = new ArrayList<>();
        List<String> users = PlayersData.getDistinctActiveUsersByMonth(monthArr[i]);
        for (int j = 0; j < users.size(); j++) {
          String userId = users.get(j);

          PlayersData userAndroid = PlayersData.findUserAndroidByUserId(userId);
          if (userAndroid != null) {
            androidUsersList.add(userAndroid.getUserId());
          }
        }
        System.out.println(androidUsersList.size());
        String totalAndroidUsers = androidUsersList.size() + "";
        String totalIOSUsers = (users.size() - androidUsersList.size()) + "";
        String[] row = null;

        if (platform == 0) {
          row = new String[]{reWriteMonth(monthArr[i]), totalIOSUsers};
        } else if(platform == 1){
          row = new String[]{reWriteMonth(monthArr[i]), totalAndroidUsers};
        } else {
          row = new String[]{reWriteMonth(monthArr[i]), users.size()+""};
        }
        writer.writeNext(row);
      }
      writer.close();
      System.out.println("write csv done");
      java.io.File file = new java.io.File(csv);
      if(exportType == 0) {
        String fileId = GoogleDrive.uploadFile(file, csv, "text/csv");
        if (fileId != null){
          System.out.println(fileId);
        } else {
          System.out.println("error");
        }
        return ok(fileId);
      } else {
        response().setHeader("Content-Lenght", String.valueOf(file.length()));
        response().setHeader("Content-Disposition", "attachment; filename=" + csv);
        return ok(file).as("text/csv");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }


  public Result getNewPlayingUsers() {
    DynamicForm data = Form.form().bindFromRequest();
    String month = data.get("month");
    int platform = Integer.parseInt(data.get("platform"));
    int exportType = Integer.parseInt(data.get("exportType"));
    String platformTxt = "";
    switch(platform) {
      case 0:
        platformTxt = "iOS";
        break;
      case 1:
        platformTxt = "Android";
        break;
    }

    String csv = null;
    try {
      csv = "New Playing Users_" + platformTxt + "_" + new Date().getTime() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "Month, Total Users".split(",");
      //Write the header to file
      writer.writeNext(header);

      String[] monthArr = month.split(",");
      for (int i = 0; i < monthArr.length; i++) {
        List<String> androidUsersList = new ArrayList<>();
        MongoCursor<User> users = User.getActiveUserByMonth(monthArr[i]);
        users.forEach(new Consumer<User>() {
          @Override
          public void accept(User user) {
            String userId = user.getUserId();
            PlayersData userAndroid = PlayersData.findUserAndroidByUserId(userId);
            if (userAndroid != null) {
              androidUsersList.add(userAndroid.getUserId());
            }
          }
        });

        System.out.println(androidUsersList.size());
        String totalAndroidUsers = androidUsersList.size() + "";
        String totalIOSUsers = (users.count() - androidUsersList.size()) + "";
        String[] row = null;

        if (platform == 0) {
          row = new String[]{reWriteMonth(monthArr[i]), totalIOSUsers};
        } else {
          row = new String[]{reWriteMonth(monthArr[i]), totalAndroidUsers};
        }
        writer.writeNext(row);
      }
      writer.close();
      System.out.println("write csv done");
      java.io.File file = new java.io.File(csv);
      if(exportType == 0) {
        String fileId = GoogleDrive.uploadFile(file, csv, "text/csv");
        if (fileId != null){
          System.out.println(fileId);
        } else {
          System.out.println("error");
        }
        return ok(fileId);
      } else {
        response().setHeader("Content-Lenght", String.valueOf(file.length()));
        response().setHeader("Content-Disposition", "attachment; filename=" + csv);
        return ok(file).as("text/csv");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public Result getCCU() {
    DynamicForm data = Form.form().bindFromRequest();
    String startDate = data.get("startDate");
    String endDate = data.get("endDate");
    String startDate1 = startDate + " 00:00:00";
    String endDate1 = endDate + " 23:59:59";
    int exportType = Integer.parseInt(data.get("exportType"));

    String csv = null;
    try {
      csv = "Concurrent Users_" + new Date().getTime() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "Time, Total Users".split(",");
      //Write the header to file
      writer.writeNext(header);

      MongoCursor<PlayersData> ccu = PlayersData.getCcuByDateRange(startDate1, endDate1);
      ccu.forEach(new Consumer<PlayersData>() {
        @Override
        public void accept(PlayersData playersData) {
          String createdAt = playersData.getCreatedAt();
          String concurrentUsers = playersData.getCcu() + "";
          String [] row = new String[]{createdAt, concurrentUsers};
          writer.writeNext(row);
        }
      });
      writer.close();
      System.out.println("write csv done");
      java.io.File file = new java.io.File(csv);
      if(exportType == 0) {
        String fileId = GoogleDrive.uploadFile(file, csv, "text/csv");
        if (fileId != null){
          System.out.println(fileId);
        } else {
          System.out.println("error");
        }
        return ok(fileId);
      } else {
        response().setHeader("Content-Lenght", String.valueOf(file.length()));
        response().setHeader("Content-Disposition", "attachment; filename=" + csv);
        return ok(file).as("text/csv");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public Result getGlobalChat() {
    DynamicForm data = Form.form().bindFromRequest();
    String startDate = data.get("startDate");
    String endDate = data.get("endDate");
    String startDate1 = startDate + " 00:00:00";
    String endDate1 = endDate + " 23:59:59";
    int exportType = Integer.parseInt(data.get("exportType"));

    String csv = null;
    try {
      csv = "Global Chat_" + new Date().getTime() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "UserID, User Name, Room Name, Chat Message, Time(PT), Time(UTC)".split(",");
      //Write the header to file
      writer.writeNext(header);

      MongoCursor<PlayersData> globalChat = PlayersData.getGlobalChatByDateRange(startDate1, endDate1);
      globalChat.forEach(new Consumer<PlayersData>() {
        @Override
        public void accept(PlayersData playersData) {
          String userId = playersData.getUserId();
          String roomName = playersData.getRoomName();
          String createdAt = playersData.getCreatedAt();
          String message = playersData.getMessage();
          //get user's name by uesrId
          User user = User.getUserById(userId);
          String name;
          if(user != null) {
            name = user.getName();
          } else {
            name = "";
          }
          // write content
          String [] row = new String[]{userId, name, roomName, message, createdAt, "demo"};
          writer.writeNext(row);
        }
      });
      writer.close();
      System.out.println("write csv done");
      java.io.File file = new java.io.File(csv);
      if(exportType == 0) {
        String fileId = GoogleDrive.uploadFile(file, csv, "text/csv");
        if (fileId != null){
          System.out.println(fileId);
        } else {
          System.out.println("error");
        }
        return ok(fileId);
      } else {
        response().setHeader("Content-Lenght", String.valueOf(file.length()));
        response().setHeader("Content-Disposition", "attachment; filename=" + csv);
        return ok(file).as("text/csv");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public Result getTribeChat() {
    DynamicForm data = Form.form().bindFromRequest();
    String startDate = data.get("startDate");
    String endDate = data.get("endDate");
    String startDate1 = startDate + " 00:00:00";
    String endDate1 = endDate + " 23:59:59";
    int exportType = Integer.parseInt(data.get("exportType"));

    String csv = null;
    try {
      csv = "Tribe Chat_" + new Date().getTime() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "UserID, User Name, Clan ID, Chat Message, Time(PT), Time(UTC)".split(",");
      //Write the header to file
      writer.writeNext(header);

      MongoCursor<PlayersData> tribeChat = PlayersData.getTribeChatByDateRange(startDate1, endDate1);
      tribeChat.forEach(new Consumer<PlayersData>() {
        @Override
        public void accept(PlayersData playersData) {
          String userId = playersData.getUserId();
          String createdAt = playersData.getCreatedAt();
          String message = playersData.getMessage();
          String clanId = playersData.getClanId();
          //get user's name by userId
          User user = User.getUserById(userId);
          String name;
          if(user != null) {
            name = user.getName();
          } else {
            name = "";
          }
          // write content
          String [] row = new String[]{userId, name, clanId, message, createdAt, "demo"};
          writer.writeNext(row);
        }
      });
      writer.close();
      System.out.println("write csv done");
      java.io.File file = new java.io.File(csv);
      if(exportType == 0) {
        String fileId = GoogleDrive.uploadFile(file, csv, "text/csv");
        if (fileId != null){
          System.out.println(fileId);
        } else {
          System.out.println("error");
        }
        return ok(fileId);
      } else {
        response().setHeader("Content-Lenght", String.valueOf(file.length()));
        response().setHeader("Content-Disposition", "attachment; filename=" + csv);
        return ok(file).as("text/csv");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public Result getLoginLogoutTime() {
    DynamicForm data = Form.form().bindFromRequest();
    String startDate = data.get("startDate");
    String endDate = data.get("endDate");
    String startDate1 = startDate + " 00:00:00";
    String endDate1 = endDate + " 23:59:59";
    int exportType = Integer.parseInt(data.get("exportType"));

    String csv = null;
    try {
      csv = "Login - Logout Time_" + new Date().getTime() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "UserID, Login, Logout, Create At(PDT), Create At(UTC)".split(",");
      //Write the header to file
      writer.writeNext(header);

      MongoCursor<PlayersData> activeUsers = PlayersData.getActiveUsersByDateRange(startDate1, endDate1);
      activeUsers.forEach(new Consumer<PlayersData>() {
        @Override
        public void accept(PlayersData playersData) {
          String userId = playersData.getUserId();
          String createdAt = playersData.getCreatedAt();
          String login = playersData.getLogin();
          String logout = playersData.getLogout();

          // write content
          String [] row = new String[]{userId, login, logout, createdAt, "demo"};
          writer.writeNext(row);
        }
      });
      writer.close();
      System.out.println("write csv done");
      java.io.File file = new java.io.File(csv);
      if(exportType == 0) {
        String fileId = GoogleDrive.uploadFile(file, csv, "text/csv");
        if (fileId != null){
          System.out.println(fileId);
        } else {
          System.out.println("error");
        }
        return ok(fileId);
      } else {
        response().setHeader("Content-Lenght", String.valueOf(file.length()));
        response().setHeader("Content-Disposition", "attachment; filename=" + csv);
        return ok(file).as("text/csv");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public Result getUniqueUsersNumber() {
    DynamicForm data = Form.form().bindFromRequest();
    String endDate = data.get("endDate");
    String endDate1 = endDate + " 23:59:59";
    int exportType = Integer.parseInt(data.get("exportType"));

    String csv = null;
    try {
      csv = "Number of Unique Users_" + new Date().getTime() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "Number of unique users".split(",");
      //Write the header to file
      writer.writeNext(header);

      String uniqueUsersNumber = User.getUniqueUsersNumber(endDate1) + "";
      System.out.println(uniqueUsersNumber);
      System.out.println("-------");
      // write content
      String [] row = new String[]{uniqueUsersNumber};
      writer.writeNext(row);

      writer.close();
      System.out.println("write csv done");
      java.io.File file = new java.io.File(csv);
      if(exportType == 0) {
        String fileId = GoogleDrive.uploadFile(file, csv, "text/csv");
        if (fileId != null){
          System.out.println(fileId);
        } else {
          System.out.println("error");
        }
        return ok(fileId);
      } else {
        response().setHeader("Content-Lenght", String.valueOf(file.length()));
        response().setHeader("Content-Disposition", "attachment; filename=" + csv);
        return ok(file).as("text/csv");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }



  public String reWriteMonth(String month) {
    String [] arr = month.split("-");
    String year = arr[0];
    String monthNum = arr[1];
    String monthReWrite = "";
    switch (monthNum) {
      case "01":
        monthReWrite = "Jan";
        break;
      case "02":
        monthReWrite = "Feb";
        break;
      case "03":
        monthReWrite = "Mar";
        break;
      case "04":
        monthReWrite = "Apr";
        break;
      case "05":
        monthReWrite = "May";
        break;
      case "06":
        monthReWrite = "Jun";
        break;
      case "07":
        monthReWrite = "Jul";
        break;
      case "08":
        monthReWrite = "Aug";
        break;
      case "09":
        monthReWrite = "Sep";
        break;
      case "10":
        monthReWrite = "Oct";
        break;
      case "11":
        monthReWrite = "Nov";
        break;
      case "12":
        monthReWrite = "Dec";
        break;
    }
    String  str = "'"+ monthReWrite + ", " + year;
    return str;
  }
}
