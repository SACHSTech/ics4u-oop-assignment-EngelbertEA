package TwitchPlatform;

/**
* Class file for users, the viewers and broadcasters
* 
*/

public class Users {

  // creating variables
  private String strUsername;
  private int intAge;
  private int intCreditCard;

  /**
  * Constructor - creates new instance of an user object
  *
  * @param username - name of the streamer 
  * @param age - age of the streamer 
  * @param creditCardNumber - credit card of the streamer
  */
  public Users(String username, int age, int creditCardNumber) {

    this.strUsername = username;
    this.intAge = age;
    this.intCreditCard = creditCardNumber;

  }

  /**
  * Gets the credit card of the user
  *
  * @return credit card number of user
  */
  public int getCard() {
    return this.intCreditCard;
  }

  /**
  * Gets the name of the user
  *
  * @return name of the user
  */
  public String getName() {
    return this.strUsername;
  }

  /**
  * Gets whether user can buy any bits or not
  *
  * @return boolean pf whether the user can donate anything
  */
  public boolean canBuy() {

    if (this.intAge > 17 && this.intCreditCard != -1) {
      return true;
    }
    else{
      return false;
    }

  }


  
}