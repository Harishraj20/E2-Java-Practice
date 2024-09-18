package Strings;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String text = "apple,banana,orange";
        
        String[] fruits = text.split(",");
        
        System.out.println(Arrays.toString(fruits));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

