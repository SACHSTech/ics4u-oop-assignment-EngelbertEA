package TwitchChat;

import TwitchChat.*;

import java.io.*;
import java.util.*;

/*
* Java program that allows users to experience the Twitch hierarchy
* Helps register an account on Twitch
*/
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    //Objects
    Viewer Viewer1;
    Moderator Moderator2;
    Broadcaster Broadcaster3;

    //Variables
    String strChoice;
    boolean blnChoice = true;
    String strUsername;
    String strGame;
    int intRewards;
    int intGiftedSubs;
    int intDonations;
    int intBits;
    int intClips;
    int intOption;

    while(blnChoice == true) {
      System.out.println("Hi welcome to Twitch, are you a Viewer, Moderator, or Broadcaster?");
      System.out.println("If you want to quit, type Quit");
      strChoice = keyboard.readLine();
        if(strChoice.equalsIgnoreCase("Viewer")) {
          System.out.println("What is your username?");
          strUsername = keyboard.readLine();
          System.out.println("What game are you watching?");
          strGame = keyboard.readLine();
          System.out.println("How many Gifted Subs would you like to Gift to the streamer?");
          intGiftedSubs = Integer.parseInt(keyboard.readLine());
          System.out.println("How much money would you like to donate?");
          intDonations = Integer.parseInt(keyboard.readLine());
          System.out.println("How many bits would you like to cheer!");
          intBits = Integer.parseInt(keyboard.readLine());
          System.out.println("How many clips do you want to create");
          intClips = Integer.parseInt(keyboard.readLine());
          System.out.println("What rewards would you like to redeem with your channel points\n1. Type in Highlight\n2. Make Me Dance\n3. Dab\n4. Team Kill\n5. 10 Push Ups\n6. Play a game of your choice");
          intRewards = Integer.parseInt(keyboard.readLine());
          System.out.println("What would you like to type in chat?\n1. POG\n2. nice stream!\n3. cringe booooo!\n4. lame stream! boring!\n5. KekW\n6. KappaW");
          intOption = Integer.parseInt(keyboard.readLine());
          Viewer1 = new Viewer(strUsername, strGame, intGiftedSubs, intDonations, intBits, intClips,intRewards, intOption);
          System.out.println(Viewer1);
        }
        else if(strChoice.equalsIgnoreCase("Moderator")) {
          
        }
        else if(strChoice.equalsIgnoreCase("Broadcaster")) {

        }
        else if(strChoice.equalsIgnoreCase("Quit")) {
          blnChoice = false;
        }
        else { 
          System.out.println("Invalid Option");
        }
    }
  }
}