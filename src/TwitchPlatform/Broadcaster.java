package TwitchPlatform;

/**
* Class file for creating broadcasters/streamers
* 
*/

public class Broadcaster extends Users {

  // Instance variables
  private int intFollowers;
  private int intSubscribers;
  private String strGame;
  private int intViewers;
  
  /**
  * Constructor - creates new instance of an broadcaster object
  *
  * @param followers - number of followers
  * @param subscribers - number of subscribers
  * @param game - game being played
  * @param viewers - number of people currently watching 
  * @param username - name of the streamer 
  * @param age - age of the streamer 
  * @param creditCardNumber - credit card of the streamer
  */
  public Broadcaster(int followers, int subscribers, String game, int viewers, String username, int age, int creditCardNumber) {
    super(username, age, creditCardNumber);
    this.intFollowers = followers;
    this.intSubscribers = subscribers;
    this.strGame = game;
    this.intViewers = viewers;
  }

  /**
  * Add followers to this class
  *
  * @param intNum - number of followers to add
  */
  public void addFollower(int intNum) {
    this.intFollowers += intNum;
  }

  /**
  * get number of followers
  *
  * @return number of followers
  */
  public int getFollowers() {
    return this.intFollowers;
  }

  /**
  * Add subs to this class
  *
  * @param intNum - number of subs to add
  */
  public void addSubs(int intNum) {
    this.intSubscribers += intNum;
  }

  /**
  * get number of subs
  *
  * @return number of subs
  */
  public int getSubs() {
    return this.intSubscribers;
  }

  /**
  * get the game that is currently being played
  *
  * @return number of subs
  */
  public String getGame() {
    return this.strGame;
  }

  /**
  * get the number of viewers the streamer currently has
  *
  * @return number of viewers
  */
  public int getViews() {
    return this.intViewers;
  }

}