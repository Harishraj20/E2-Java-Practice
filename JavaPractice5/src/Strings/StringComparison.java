package Strings;

public class StringComparison {
    public static void main(String[] args) {
        String string1 = "Hello"; 
        String string2 = "Hello";
        String string3 = new String("Hello"); 

        // Check reference equality
        System.out.println(string1 == string2); 
        System.out.println(string1 == string3); 

        // Check logical equality
        System.out.println(string1.equals(string2)); 
        System.out.println(string1.equals(string3));

        
        String string4 = string3.intern();
        System.out.println(string1 == string4); 
    }
}
