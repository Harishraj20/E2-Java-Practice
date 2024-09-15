package Task1;

import java.util.Scanner;

public class VowelCheck {
	
    private static void checkLastCharOfFirstWord(String sentence) {
        int firstIndexOfSpace = sentence.indexOf(' ');

        String firstWord;
        if (firstIndexOfSpace == -1) {
            firstWord = sentence;
            System.out.println(firstWord);
        } else {
            firstWord = sentence.substring(0, firstIndexOfSpace);
            System.out.println(firstWord);
        }

        char lastChar = firstWord.charAt(firstWord.length() - 1);

        if (isVowel(lastChar)) {
            System.out.println("The last character of the first word is a vowel.");
        } else {
            System.out.println("The last character of the first word is not a vowel.");
        }
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence/Word: ");
        String sentence = scanner.nextLine();

        checkLastCharOfFirstWord(sentence);
        scanner.close();
    }
}
