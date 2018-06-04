package wordcounter;

public class Word { 
  public String letters;

  Word(String letters) {
    this.letters = letters;
  }
  
  public boolean hasMoreThan(int charCount ) {
	return this.letters.length() > charCount;
  }
  
  public boolean containsVowels() {
    return (this.letters.contains("a")) ||
		  (this.letters.contains("e")) ||
		  (this.letters.contains("i")) ||
		  (this.letters.contains("o")) ||
		  (this.letters.contains("u")) ||
		  (this.letters.contains("y"));
  }
}
