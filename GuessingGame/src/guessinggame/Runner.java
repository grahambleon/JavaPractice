package guessinggame;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    boolean playingGame = true;
    System.out.println("Guess the number between 1 and 10!");
    int randomNum = ThreadLocalRandom.current().nextInt(0, 11);
    
    while(playingGame) {
      Scanner in = new Scanner(System.in);
      int guess = in.nextInt();
       
      if (guess > randomNum) {
        System.out.println("Too high! Guess again.");
      } else if (guess < randomNum) {
        System.out.println("Too low! Guess again.");
      } else {
        in.close();
        System.out.println("You got it!  The number was " + randomNum + "!");
        playingGame = false;
      }
    }
  }
}