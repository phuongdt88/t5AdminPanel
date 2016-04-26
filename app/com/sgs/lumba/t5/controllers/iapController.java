package com.sgs.lumba.t5.controllers;

import models.GoogleDrive;
import models.IAP;
import org.jongo.Aggregate.ResultsIterator;
import org.jongo.MongoCursor;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import com.sgs.lumba.t5.views.html.iapdata;

public class iapController  extends Controller{
//  public static String getNewDate() {
//    Date dNow = new Date( );
//    SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd.hh.mm.ss");
//    return ft.format(dNow);
//  }

  public static Long getTimeStamp() {
    Date dNow = new Date();
    return dNow.getTime();
  }
  public Result iapData() {
    return ok(iapdata.render());
  }

  public Result iapIOS() {
    DynamicForm data = Form.form().bindFromRequest();
    String startDate = data.get("startDate");
    String endDate = data.get("endDate");
    String startDate1 = startDate + " 00:00:00";
    String endDate1 = endDate + " 23:59:59";
    int exportType = Integer.parseInt(data.get("exportType"));
    int purchaseType = Integer.parseInt(data.get("purchaseType"));
    String csv = null;
    try {
      csv = "In-App Purchase IOS_" + startDate + "_" + endDate + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String [] header = "ID, UserID, Diwan Level, Game Level, Coins, Water, Oil, Pearls, Daggers, Status, Purchased Pearls, Purchased ItemID, Paid Amount, Currency, Rate To USD, Country, Transaction ID, Platform, Device Info, Created At, Install At, Transaction, Verifying Text, IP Address".split(",");
      //Write the header to file
      writer.writeNext(header);

      MongoCursor<IAP> purchases = null;
      if(purchaseType == 0) {
        purchases = IAP.getValidIOSPurchase(startDate1, endDate1);
      } else {
        purchases = IAP.getAllIOSPurchase(startDate1, endDate1);
      }
      if(purchases.count() > 0){
        writeCSVFile(writer, purchases);

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
      } else{
        return ok("No data");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public Result iapAndroid() {
    DynamicForm data = Form.form().bindFromRequest();
    String startDate = data.get("startDate");
    String endDate = data.get("endDate");
    String startDate1 = startDate + " 00:00:00";
    String endDate1 = endDate + " 23:59:59";
    int exportType = Integer.parseInt(data.get("exportType"));
    int purchaseType = Integer.parseInt(data.get("purchaseType"));
    String csv = null;
    try {
      csv = "In-App Purchase Android_" + startDate + "_" + endDate + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String [] header = "ID, UserID, Diwan Level, Game Level, Coins, Water, Oil, Pearls, Daggers, Status, Purchased Pearls, Purchased ItemID, Paid Amount, Currency, Rate To USD, Country, Transaction ID, Platform, Device Info, Created At, Install At, Transaction, Verifying Text, IP Address".split(",");
      //Write the header to file
      writer.writeNext(header);

      MongoCursor<IAP> purchases = null;
      if(purchaseType == 0) {
        purchases = IAP.getValidAndroidPurchase(startDate1, endDate1);
      } else {
        purchases = IAP.getAllAndroidPurchase(startDate1, endDate1);
      }
      if(purchases.count() > 0){
        writeCSVFile(writer, purchases);
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
      } else{
        return ok("No data");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public Result iapValid() {
    DynamicForm data = Form.form().bindFromRequest();
    String startDate = data.get("startDate");
    String endDate = data.get("endDate");
    String startDate1 = startDate + " 00:00:00";
    String endDate1 = endDate + " 23:59:59";
    int exportType = Integer.parseInt(data.get("exportType"));
    String csv = null;
    try {
      csv = "In-App Purchase Valid_" + startDate + "_" + endDate + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String [] header = "ID, UserID, Diwan Level, Game Level, Coins, Water, Oil, Pearls, Daggers, Status, Purchased Pearls, Purchased ItemID, Paid Amount, Currency, Rate To USD, Country, Transaction ID, Platform, Device Info, Created At, Install At, Transaction, Verifying Text, IP Address".split(",");
      //Write the header to file
      writer.writeNext(header);

      MongoCursor<IAP> purchases = IAP.getValidIAP(startDate1, endDate1);

      if(purchases.count() > 0){
        writeCSVFile(writer, purchases);
        java.io.File file = new java.io.File(csv);
        if(exportType == 0) {
          String fileId = GoogleDrive.uploadFile(file, csv, "text/csv");
          if (fileId != null) {
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
      } else{
        return ok("No data");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public void writeCSVFile(CSVWriter writer, MongoCursor<IAP> data) {
    try {
      data.forEach(new Consumer<IAP>() {
        @Override
        public void accept(IAP iap) {
          String id = iap.getId() + "";
          String userId = iap.getUserId();
          String diwanLevel = iap.getDiwanLevel() + "";
          String gameLevel = iap.getGameLevel() + "";
          String coins = iap.getCoins() + "";
          String water = iap.getWater() + "";
          String oil = iap.getOil() + "";
          String pearls = iap.getPearls() + "";
          String daggers = iap.getDaggers() + "";
          String gameState = iap.getGameState();
          String purchasedPearls = iap.getPurchasedPearls() + "";
          String purchasedItemId = iap.getPurchasedItemId();
          String paidAmount = iap.getPaidAmount() + "";
          String currency = iap.getCurrency();
          String rateToUSD = iap.getRateToUSD() + "";
          String country = iap.getCountry();
          String transactionId = iap.getTransactionId();
          String deviceInfo = iap.getDeviceInfo();
          String installAt = iap.getInstallAt();
          String transaction = iap.getTransaction();
          String verifyingText = iap.getVerifyingText();
          String ipAddress = iap.getIpAddress();
          String createdAt = iap.getCreatedAt();
          String status = iap.getStatus();
          String platform = iap.getPlatform();

          String[] row = new String[]{id, userId, diwanLevel, gameLevel, coins, water, oil, pearls, daggers, status, purchasedPearls, purchasedItemId, paidAmount, currency, rateToUSD, country, transactionId, platform, deviceInfo, createdAt, installAt, transaction, verifyingText, ipAddress};
          writer.writeNext(row);
        }
      });
      writer.close();
      System.out.println("write csv done");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public Result testDate() {
    DynamicForm data = Form.form().bindFromRequest();
    String date = data.get("date");
    System.out.println(date.split(","));
    String [] dateArr = date.split(",");
    for(int i = 0; i < dateArr.length; i++) {
      System.out.println(dateArr[i]);
    }
    return ok("ok");
  }

  public Result getUniquePayingUsers() {
    DynamicForm data = Form.form().bindFromRequest();
    String date = data.get("date");
    int exportType = Integer.parseInt(data.get("exportType"));
    String [] dateArr = date.split(",");

    String csv = null;
    try {
      csv = "Unique Paying Users_" + getTimeStamp() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "Date, Total Users".split(",");
      //Write the header to file
      writer.writeNext(header);


      for (int i = 0; i < dateArr.length; i++) {
        List<String> users = IAP.getUniquePayingUsers(dateArr[i]);
        System.out.println(users.size());
        String totalUsers = users.size() + "";
        String [] row = new String[] {dateArr[i], totalUsers};
        writer.writeNext(row);
      }
      writer.close();
      System.out.println("write csv done");

//      upload csv file to google drive
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

  public Result getNewPayingUsers() {
    DynamicForm data = Form.form().bindFromRequest();
    String date = data.get("date");
    System.out.println(date);
    int exportType = Integer.parseInt(data.get("exportType"));

    String csv = null;
    try {
      csv = "New Paying Users_" + getTimeStamp() + ".csv";
      final CSVWriter writer = new CSVWriter(new FileWriter(csv));
      String[] header = "Date, Total Users".split(",");
      //Write the header to file
      writer.writeNext(header);

      String[] dateArr = date.split(",");
      System.out.println(dateArr);
      for (int i = 0; i < dateArr.length; i++) {
        String date1 = dateArr[i];
        List<String> a = new ArrayList<>();
        ResultsIterator<IAP> minmax = IAP.getMinMaxIdByDate(date1);
        System.out.println("1");
        minmax.forEach(new Consumer<IAP>() {
          @Override
          public void accept(IAP iap) {
            int minId = iap.getMinId();
            int maxId = iap.getMaxId();
            List<String> users = IAP.getUniquePayingUsers(date1);
            for (int j = 0; j < users.size(); j++) {
              String userId = users.get(j);
              System.out.println(userId);
              ResultsIterator<IAP> minIAPId = IAP.getMinIAPIdByUserID(userId);
              minIAPId.forEach(new Consumer<IAP>() {
                @Override
                public void accept(IAP iap) {

                  int userMinId = iap.getMinId();
                  System.out.println(minId);
                  System.out.println(maxId);
                  if (userMinId >= minId && userMinId <= maxId) {
                    a.add(userId);
                  }
                }
              });
            }
          }
        });
        System.out.println(a.size());
        String totalNewUsers = a.size() + "";
        String [] row = new String[] {dateArr[i], totalNewUsers};
        writer.writeNext(row);
        System.out.println("---------");
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
}

