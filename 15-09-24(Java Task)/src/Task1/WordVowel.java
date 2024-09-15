package Task1;

import java.util.Scanner;

public class WordVowel {

    private static void checkLastCharOfFirstWord(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length > 0) {
            String firstWord = words[0];
            
            char lastChar = firstWord.charAt(firstWord.length() - 1);
            
            if(isVowel(lastChar)) {
            	 System.out.println("The last character of the first word is a vowel.");
            	}else {
            		System.out.println("The last character of the first word is not a vowel.");
            	}
         }else {
        	 System.out.println("Invalid Input. Please enter valid input");
         }
        
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence or word: ");
        String sentence = scanner.nextLine();
        
        checkLastCharOfFirstWord(sentence);

        scanner.close();
    }
}
