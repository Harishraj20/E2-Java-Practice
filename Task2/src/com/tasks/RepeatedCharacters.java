package com.tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (c != ' ') { 
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Repeated characters and their counts:");
        
        for (Character key : charCount.keySet()) {
            if (charCount.get(key) > 1) {  
                System.out.println(key + " : " + charCount.get(key));
            }
        }

        scanner.close();
    }
}
