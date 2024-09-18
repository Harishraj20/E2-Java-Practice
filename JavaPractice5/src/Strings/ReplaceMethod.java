package Strings;

public class ReplaceMethod {
    public static void main(String[] args) {
        // Actual string
        String originalString = "The price is $100 and $200. Special discount is $50.";


        String replacedString = originalString.replace("$", "USD");


        String finalString = replacedString.replaceAll("USD\\d+", "XXX");

        System.out.println("Original String: " + originalString);
        System.out.println("After replace: " + replacedString);
        System.out.println("After replaceAll: " + finalString);
    }
}
