package models;

import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import uk.co.panaxiom.playjongo.PlayJongo;

/**
 * Created by phuongdt1 on 8/18/15.
 */
public class Tribe {
  public static MongoCollection clan() {
    return PlayJongo.getCollection("clan_v54");
  }

  public static MongoCollection clanLookup() {
    return PlayJongo.getCollection("clanLookup_v54");
  }

  private String name;
  private int    id;
  private String clanId;
  private int    membersCount;
  private int    trophies;
  private String memberIds;
  private int    clanRole;
  private int    joinPolicy;
  private String description;


  public int getJoinPolicy() {
    return joinPolicy;
  }

  public String getDescription() {
    return description;
  }


  public int getClanRole() {
    return clanRole;
  }

  public String getMemberIds() {
    return memberIds;
  }

  public int getId() {
    return id;
  }

  public String getClanId() {
    return clanId;
  }

  public int getMembersCount() {
    return membersCount;
  }

  public int getTrophies() {
    return trophies;
  }

  public String getName() {
    return name;
  }

  public static MongoCursor<Tribe> getAllTribes() {
    return clan().find().sort("{trophies: -1}").as(Tribe.class);
  }

  public static Tribe getTribeDetails(String tribeId) {
    return  clan().findOne("{clanId: #}", tribeId).as(Tribe.class);
  }

  public static Tribe getInfoFromClanLookupByUserId(String userId) {
    return clanLookup().findOne("{userId: #}", userId).as(Tribe.class);
  }

  public static MongoCursor<Tribe> getTribeByName(String tribeName) {
    return clan().find("{name: {$regex: #, $options:'i'}}", tribeName).as(Tribe.class);
  }

  public static Tribe getClanByUserId(String id) {
    return clanLookup().findOne("{userId: #}", id).as(Tribe.class);
  }

  public static Tribe getClanByClanId(String clanId) {
    return clan().findOne("{clanId: #}", clanId).as(Tribe.class);
  }
}
