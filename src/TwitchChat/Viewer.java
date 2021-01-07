package TwitchChat;

import TwitchChat.*;

public class Viewer{

  private int intChannelPoints;
  private int intDonations;
  private int intBits;
  private String strBroadcaster;

  public Viewer(String username, int Points, int Donations, int Bits, String Streamer) {
    this.intChannelPoints = intPoints;
    this.intDonations = Donations;
    this.intBits = Bits;
    this.strBroadcaster = Streamer;
  }

  public int intGetPoints() {
    return intChannelPoints;
  }

  public int intGetDonations() {
    return intDonations;
  }

  public int intGetBits() {
    return intBits;
  }

  public String getStreamerName() {
    return strBroadcaster;
  }
}