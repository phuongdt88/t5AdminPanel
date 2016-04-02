package models;

import org.jongo.Aggregate.ResultsIterator;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import uk.co.panaxiom.playjongo.PlayJongo;

import java.util.List;

/**
 * Created by phuongdt1 on 9/10/15.
 */
public class IAP {
  public static MongoCollection iap() {
    return PlayJongo.getCollection("purchases");
  }

  private int id;
  private String userId;
  private int diwanLevel;
  private int gameLevel;
  private int coins;
  private int water;
  private  int oil;
  private int pearls;
  private int daggers;
  private  String gameState;
  private String status;
  private int purchasedPearls;
  private String purchasedItemId;
  private int paidAmount;
  private String currency;
  private int rateToUSD;
  private String country;
  private String transactionId;
  private String platform;
  private String deviceInfo;
  private String createdAt;
  private  String installAt;
  private String transaction;
  private String verifyingText;
  private String ipAddress;
  private  int minId;
  private  int maxId;

  public int getMinId() {
    return minId;
  }

  public int getMaxId() {
    return maxId;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public int getId() {
    return id;
  }

  public String getUserId() {
    return userId;
  }

  public int getDiwanLevel() {
    return diwanLevel;
  }

  public int getGameLevel() {
    return gameLevel;
  }

  public int getCoins() {
    return coins;
  }

  public int getWater() {
    return water;
  }

  public int getOil() {
    return oil;
  }

  public int getPearls() {
    return pearls;
  }

  public int getDaggers() {
    return daggers;
  }

  public String getGameState() {
    return gameState;
  }

  public String getStatus() {
    return status;
  }

  public int getPurchasedPearls() {
    return purchasedPearls;
  }

  public String getPurchasedItemId() {
    return purchasedItemId;
  }

  public int getPaidAmount() {
    return paidAmount;
  }

  public String getCurrency() {
    return currency;
  }

  public int getRateToUSD() {
    return rateToUSD;
  }

  public String getCountry() {
    return country;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public String getPlatform() {
    return platform;
  }

  public String getDeviceInfo() {
    return deviceInfo;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getInstallAt() {
    return installAt;
  }

  public String getTransaction() {
    return transaction;
  }

  public String getVerifyingText() {
    return verifyingText;
  }

  public static MongoCursor<IAP> getValidIOSPurchase(String startDate, String endDate) {
    return iap().find("{createdAt:{$gte:#,$lt:#},status:\"Valid\",platform:\"ios\"}",startDate, endDate).as(IAP.class);
  }

  public static MongoCursor<IAP> getAllIOSPurchase(String startDate, String endDate) {
    return iap().find("{createdAt:{$gte:#,$lt:#},platform:\"ios\"}",startDate, endDate).as(IAP.class);
  }

  public static MongoCursor<IAP> getValidAndroidPurchase(String startDate, String endDate) {
    return iap().find("{createdAt:{$gte:#,$lt:#},status:\"Valid\",platform:\"android\"}",startDate, endDate).as(IAP.class);
  }

  public static MongoCursor<IAP> getAllAndroidPurchase(String startDate, String endDate) {
    return iap().find("{createdAt:{$gte:#,$lt:#},platform:\"android\"}",startDate, endDate).as(IAP.class);
  }

  public static MongoCursor<IAP> getValidIAP(String startDate, String endDate) {
    return iap().find("{createdAt:{$gte:#,$lt:#},status:\"Valid\"}",startDate, endDate).as(IAP.class);
  }

  public static List<String> getUniquePayingUsers(String date) {
    return iap().distinct("userId").query("{createdAt:{$regex:#}}", date).as(String.class);
  }

  public static ResultsIterator<IAP> getMinMaxIdByDate(String date) {
    return iap().aggregate("{$match:{createdAt:{$regex:#}}}", date).and("{$group:{_id:\"abc\", \"minId\":{$min:\"$id\"}, \"maxId\":{$max:\"$id\"}}}").as(IAP.class);
  }

  public static MongoCursor<IAP> getUsersByDate(String date) {
    return  iap().find("{createdAt:{$regex:#}}", date).as(IAP.class);
  }

  public static ResultsIterator<IAP> getMinIAPIdByUserID(String userId) {
    return iap().aggregate("{$match:{userId:#}}",userId).and("{$group:{_id:\"$userId\", \"minId\":{$min:\"$id\"}}}").as(IAP.class);
  }
}
