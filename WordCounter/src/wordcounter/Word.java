package wordcounter;

public class Word { 
  public String letters;

  Word(String letters) {
    this.letters = letters;
  }
  
  public boolean hasMoreThan(int charCount ) {
    boolean answer = false;
    if (this.letters.length() > charCount) {
      answer = true;
    }
    return answer;
  }
  
  public boolean containsVowels() {
	boolean vowels = false;
    if ((this.letters.contains("a")) ||
    	  (this.letters.contains("e")) ||
    	  (this.letters.contains("i")) ||
    	  (this.letters.contains("o")) ||
    	  (this.letters.contains("u")) ||
    	  (this.letters.contains("y"))) {
      vowels = true;
    }
    return vowels;
  }
}
