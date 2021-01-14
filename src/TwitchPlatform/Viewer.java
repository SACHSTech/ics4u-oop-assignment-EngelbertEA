package TwitchChat;

import TwitchChat.*;

public class Viewer extends Users{

  private int intRewards;

  public Viewer(String Username, String Game, int GiftedSubs, int Donations, int Bits, int Clips, int Rewards, int Option) {
    super(Username, Game, GiftedSubs, Donations, Bits, Clips, Option);
    this.intRewards = Rewards;

  
  } 
  public int getRewards(){
    return intRewards;
  }
}