package models;

import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
import uk.co.panaxiom.playjongo.PlayJongo;

/**
 * Created by phuongdt1 on 9/9/15.
 */
public class GameVersion {

  public static MongoCollection gameVersion() {
    return PlayJongo.getCollection("gameVersion");
  }

  private int id;
  private String gameVersion;


  public int getId() {
    return id;
  }
  public String getGameVersion() {
    return gameVersion;
  }

  public static MongoCursor<GameVersion> getAllGameVersion() {
    return gameVersion().find().as(GameVersion.class);
  }
}
