package TwitchChat;

import TwitchChat.*;

public class Moderator extends Users{
  
  private int intAdBreak;
  private int intTimeOut;
  private String strStreamTitle;

  public Moderator(String Username, String Game, int GiftedSubs, int Donations, int Bits, int Option, int Clips, int AdBreak, int TimeOut, String StreamTitle) {
    super(Username, Game, GiftedSubs, Donations, Bits, Clips, Option);
    this.intAdBreak = AdBreak;
    this.intTimeOut = TimeOut;
    this.strStreamTitle = StreamTitle;
  }

  public int getAdBreak() {
    return intAdBreak;
  }

  public int getTimeOut() {
    return intTimeOut;
  }

  public String getStreamTitle() {
    return strStreamTitle;
  }
}
