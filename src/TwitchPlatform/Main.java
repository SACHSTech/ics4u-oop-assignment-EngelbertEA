package TwitchPlatform;

/**
* Main class that simulates the Twitch website
* 
*/

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    
    // Variable declaration
    String strUserName;
    int intAge;
    int intCardNumber;
    boolean isWatching;
    isWatching = true;
    int intRandom1;
    int intRandom2;
    int intOption;
    String strCommand;
    int intMoney;
    intMoney = 0;
    
    // Created buffered reader
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Create twitch object and broadcasters to stream
    Twitch twitch = new Twitch(10000000);
    Broadcaster Ninja = new Broadcaster(1000000, 500000, "Fornite", 100000, "Ninja", 25, -1);
    Broadcaster Shroud = new Broadcaster(2000000, 100000, "League of Legends", 10000, "Shroud", 23, -1);
    Broadcaster Tfue = new Broadcaster(1000, 500, "Valorant", 100, "Tfue", 28, -1);
    twitch.addStreamer(Ninja);
    twitch.addStreamer(Shroud);
    twitch.addStreamer(Tfue);

    // Create the user's account
    System.out.println("Welcome to Twitch!");
    System.out.println("To get started please create an account.");
    System.out.println("Enter your username:");
    strUserName = keyboard.readLine();
    System.out.println("Enter your age:");
    intAge = Integer.parseInt(keyboard.readLine());
    System.out.println("Enter a credit card number, type -1 if you do not want to:");
    intCardNumber = Integer.parseInt(keyboard.readLine());
    Viewer user = new Viewer(0, 0, strUserName, intAge, intCardNumber);
    System.out.println("Account created, welcome to Twitch!");
    System.out.println("There are currently, " + twitch.getTotalViewers() + " viewers.");

    // Main program loop
    while (isWatching) {
      // Clear all currently streaming broadcasters
      twitch.getActiveStreamers().clear();
      intRandom1 = 0;
      intRandom2 = 0;
      strCommand = "";
      // Randomly pick two broadcasters to stream
      while (intRandom1 == intRandom2) {
        intRandom1 = (int)(Math.random() * 3 + 0);
        intRandom2 = (int)(Math.random() * 3 + 0);
      }
      
      twitch.addActivetreamer(twitch.getAllStreamers().get(intRandom1));
      twitch.addActivetreamer(twitch.getAllStreamers().get(intRandom2));
      System.out.println("Select a streamer to watch by typing the number beside their name!");
      // Prints options to screen
      for (int count = 0; count < twitch.getActiveStreamers().size(); count++) {
        System.out.println(count + 1 + ". " + twitch.getActiveStreamers().get(count).getName());
      }

      // Get choice from user
      intOption = Integer.parseInt(keyboard.readLine()); 
      Broadcaster current = twitch.getActiveStreamers().get(intOption - 1);

      // Print stats about streamer
      System.out.println("You are watching: " + current.getName() + " play " + current.getGame() + " with " + current.getViews() + " other people");
      System.out.println(current.getName() + " has " + current.getFollowers() + " followers and " + current.getSubs() + " subs");

      // ask user how they want to participate with streamer
      while (strCommand != "quit") { 

        // print options
        System.out.println();
        System.out.println("Here are your options: ");
        System.out.println("Type in whatever message you want in the chat");
        System.out.println("donate | subscribe | follow | quit");
        strCommand = keyboard.readLine();

        // if donate is chosen, donate to streamer
        if (strCommand.equals("donate")) {
          System.out.print("How much would you like to donate? ");
          intMoney = Integer.parseInt(keyboard.readLine());
          user.buyBits(intMoney);
        }

        // subscribe to streamer
        else if (strCommand.equals("subscribe")) {
          user.subscribeChannel(twitch.getActiveStreamers().get(intOption - 1));
        }

        // follow streamer
        else if (strCommand.equals("follow")) {
          user.followChannel(twitch.getActiveStreamers().get(intOption - 1));
        }

        // quit watching streamer
        else if (strCommand.equals("quit")) {
          System.out.println("Do you want to exit Twitch as well?, 'yes' or 'no'");
          strCommand = keyboard.readLine();
          if (strCommand.equals("yes")) {
            isWatching = false;
          }
          strCommand = "quit";
        }

      }

      // Give out channel points for watching
      intRandom1 = (int)(Math.random() * 20 + 1);
      System.out.println("You got this many channel points! " + intRandom1);
      user.setPoints(intRandom1);
      System.out.println();
    }

    // print how much the user donated and how many channel points they got
    System.out.println("Thanks for watching, have a great day!");
    System.out.println("You donated this many bits: " + user.getBits() + " and got this many channel points: " + user.getPoints());

  }
}