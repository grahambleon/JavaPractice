package wordcounter;

import java.util.Scanner;

public class Runner {

  public static void main(String[] args) {
    System.out.println("Enter some words!");
    
    Scanner in = new Scanner(System.in);
    String input = in.next();
    in.close();
    String[] sentence = input.split("\\\\s+");
    
    System.out.println(sentence[1]);
    
//    for (int i=0; i<sentence.length; i++)
//    {
//    	Word word = new Word(sentence[i]);
//    	System.out.println(word.letters);
//    }
  }
}
