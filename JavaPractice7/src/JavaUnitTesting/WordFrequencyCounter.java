package JavaUnitTesting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
	
	 public static Map<String, Integer> countWordFrequency(String input) {
	        String[] words = input.split("\\s+");
	        Map<String, Integer> wordCount = new HashMap<>();

	        for (String word : words) {
	            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	        }
	        return wordCount;
	    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String input = scanner.nextLine();

        Map<String, Integer> wordCount = countWordFrequency(input);
        System.out.println("The frequency of words: ");
        System.out.println(wordCount);
        
        scanner.close();
    }

   
}
