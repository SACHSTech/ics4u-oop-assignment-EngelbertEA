package TwitchChat;

import TwitchChat.*;

public class Broadcaster extends Users{

  private String strRaid;
  private int intViewerCount;

  public Broadcaster(String Username, String Game, int GiftedSubs, int Donations, int Bits, int Clips, int Option, String Raid, int ViewerCount) {
    super(Username, Game, GiftedSubs, Donations, Bits, Clips, Option);
    this.strRaid = Raid;
    this.intViewerCount = ViewerCount;
  }
  
  public String getRaid() {
    return strRaid;
  }

  public String getViewerCount() {
    return intViewerCount;
  }
}