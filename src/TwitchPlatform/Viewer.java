package TwitchPlatform;

/**
* Class file for the viewer/user
* 
*/

import java.util.*;

public class Viewer extends Users {

  // create variables
  private int intBits;
  private int intChannelPoints;
  private ArrayList<Broadcaster> subscribed;
  private ArrayList<Broadcaster> followed;

  /**
  * Constructor - creates new instance of an viewer object
  *
  * @param bits - number of bits this object has bought
  * @param points - number of channel points this object has
  * @param username - name of the streamer 
  * @param age - age of the streamer 
  * @param creditCardNumber - credit card of the streamer
  */
  public Viewer (int bits, int points, String username, int age, int creditCardNumber) {
    super(username, age, creditCardNumber);
    this.intBits = bits;
    this.intChannelPoints = points;
    subscribed = new ArrayList<>();
    followed = new ArrayList<>();
  }
  
  /**
  * Gets the number of bits this user has bought
  *
  * @return number of bits bought by user
  */
  public int getBits() {
    return this.intBits;
  }

  /**
  * Purchases bits
  *
  * @param intAmount - number of bits to purchase
  */
  public void buyBits(int intAmount) {

    // If purchase is valid, print successful
    if (this.canBuy() == true){
      this.intBits += intAmount;
      System.out.println("Purchase successful");
    }
    // otherwise run this code
    else{
      System.out.println("Purchase failed");
    }
  }

  /**
  * follows streamer
  *
  * @param streamer - the broadcaster to follow
  */
  public void followChannel(Broadcaster streamer) {
    System.out.println("You followed " + streamer.getName());
    streamer.addFollower(1);
    this.followed.add(streamer);
  }

  /**
  * subscribes to streamer
  *
  * @param streamer - the broadcaster to subscribe to
  */
  public void subscribeChannel(Broadcaster streamer) {
    System.out.println("You subscribed to " + streamer.getName());
    streamer.addSubs(1);
    this.subscribed.add(streamer);
  }

  /**
  * Returns the list of broadcasters the user has followed
  *
  * @return arraylist of the broadcasters followed by the user
  */
  public ArrayList<Broadcaster> getFollowed() {
    return this.followed;
  } 

  /**
  * Returns the list of broadcasters the user has subscribed to
  *
  * @return arraylist of the broadcasters subscribed to by the user
  */
  public ArrayList<Broadcaster> getSubscribed() {
    return this.subscribed;
  } 

  /**
  * gets the number of channel points of the user
  *
  * @return the number of channel points of the user
  */
  public int getPoints() {
    return this.intChannelPoints;
  }

  /**
  * sets the number of channel points of the user
  *
  * @param intNum - the amount of channel points to add
  */
  public void setPoints(int intNum) {
    this.intChannelPoints += intNum;
  }
}