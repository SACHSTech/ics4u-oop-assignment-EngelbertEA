package TwitchPlatform;

/**
* Class file for creating the Twitch platform
* 
*/

import java.util.*;

public class Twitch {

  // creating variables
  private ArrayList<Broadcaster> streamers;
  private ArrayList<Broadcaster> activeStreamers;
  private int intTotalViewers;
  private Viewer user;

  /**
  * Constructor - creates new instance of an twitch object
  *
  * @param totalViewers - total number of viewers on the platform
  */
  public Twitch(int totalViewers, Viewer user) {
    this.intTotalViewers = totalViewers;
    streamers = new ArrayList<>();
    activeStreamers = new ArrayList<>();
    this.user = user;
  }

  /**
  * Add streamers to this class
  *
  * @param streamer - the streamer to add to the site
  */
  public void addStreamer(Broadcaster streamer) {
    this.streamers.add(streamer);
  }

  /**
  * Add an active streamer to the list of currently live streamers
  *
  * @param streamer - the streamer to add to the arraylist
  */
  public void addActivetreamer(Broadcaster streamer) {
    this.activeStreamers.add(streamer);
  }

  /**
  * Get list of active streamers
  *
  * @return arraylist of active streamers
  */
  public ArrayList<Broadcaster> getActiveStreamers() {
    return this.activeStreamers;
  }

  /**
  * Get list of all streamers
  *
  * @return arraylist of all streamers
  */
  public ArrayList<Broadcaster> getAllStreamers() {
    return this.streamers;
  }

  /**
  * Add number of viewers to the site
  *
  * @param intNum - number of viewers to add to the site
  */
  public void addViewers(int intNum) {
    this.intTotalViewers += intNum;
  }

  /**
  * Gets total number of viewers on the site
  *
  * @return the number of viewers on the site
  */
  public int getTotalViewers() {
    return this.intTotalViewers;
  }


}