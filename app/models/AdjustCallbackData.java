package models;

import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import uk.co.panaxiom.playjongo.PlayJongo;

/**
 * Created by phuongdt1 on 9/16/15.
 */
public class AdjustCallbackData {
  public static MongoCollection adjustCallback() {
    return PlayJongo.getCollection("AdjustSDK");
  }

  private String userId;
  private String activityKind;
  private int success;
  private int willRetry;
  private String error;
  private String trackerToken;
  private String trackerName;
  private String network;
  private String campaign;
  private String adgroup;
  private String creative;
  private String createdAt;

  public String getUserId() {
    return userId;
  }

  public String getActivityKind() {
    return activityKind;
  }

  public int getSuccess() {
    return success;
  }

  public int getWillRetry() {
    return willRetry;
  }

  public String getError() {
    return error;
  }

  public String getTrackerToken() {
    return trackerToken;
  }

  public String getTrackerName() {
    return trackerName;
  }

  public String getNetwork() {
    return network;
  }

  public String getCampaign() {
    return campaign;
  }

  public String getAdgroup() {
    return adgroup;
  }

  public String getCreative() {
    return creative;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public static MongoCursor<AdjustCallbackData> getAdjustCallbackData() {
    return  adjustCallback().find().as(AdjustCallbackData.class);
  }

  public static MongoCursor<AdjustCallbackData> getAdjustCallbackDataByRange(String startDate, String endDate) {
    System.out.println(startDate);
    System.out.println(endDate);
    return  adjustCallback().find("{createdAt:{$gte:#,$lt:#}}", startDate, endDate).sort("{createdAt: 1}").as(AdjustCallbackData.class);
  }
}
