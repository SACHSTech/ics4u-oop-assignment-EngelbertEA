package TwitchChat;

import TwitchChat.*;

public class Users {

  private String strUsername;
  private String strGame;
  private int intDonations;
  private int intGiftedSubs;
  private int intBits;
  private int intClips;
  private int intOption;
  
  /** 
  * Constructor: Creates a new user Instance
  * @param Username - person's username on Twitch
  * @param Game - the videogame the person is watching
  * @param GiftedSubs - the amount of Channel points a viewer has
  * @param Donations - the amount of Donations 
  * @param Bits - the amount of Bits you are cheering
  * @param Clips - the amount of Clips you are creating
  */
  public Users(String Username, String Game, int GiftedSubs, int Donations, int Bits, int Clips, int Option) {
    this.strUsername = Username;
    this.strGame = Game;
    this.intGiftedSubs = GiftedSubs;
    this.intDonations = Donations;
    this.intBits = Bits;
    this.intClips = Clips;
    this.intOption = Option;
  }

  /**
  * Getter method for strUsername
  * @return Username
  */
  public String getUsername() {
    return strUsername;
  }
  /**
  * Getter method for strGame
  * @return Game you are watching
  */
  public String getGame() {
    return strGame;
  }
  /**
  * Getter method for intGiftedSubs
  * @return amount of Gifted Subs
  */
  public int getGiftedSubs() {
    return intGiftedSubs;
  }
  /**
  * Getter method for intDonations
  * @return Donation amount
  */
  public int getDonations() {
    return intDonations;
  }
  /**
  * Getter method for intBits
  * @return amount of Bits cheering
  */
  public int getBits() {
    return intBits;
  }
  /**
  * Getter method for intClips
  * @return amount of Clips created
  */
  public int getClips() {
    return intClips;
  }
  /**
  * Getter method for intOption
  * @return option numbers for chat function
  */
  public int getOption(){
    return intOption;
  }
}