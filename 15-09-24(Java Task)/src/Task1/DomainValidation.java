package Task1;

import java.util.Scanner;

public class DomainValidation {

    static void domainValidate(String url) {
    	
        int lastIndex = url.lastIndexOf('.');
        
        if (lastIndex == -1) {
            System.out.println("Invalid domain name: No period found.");
        } else {
            String domainName = url.substring(lastIndex + 1);

            if (domainName.equals("com")) {
                System.out.println("This website belongs to the COMMERCIAL domain.");
            } else if (domainName.equals("org")) {
                System.out.println("This website belongs to the ORGANIZATION domain.");
            } else if (domainName.equals("in")) {
                System.out.println("This website belongs to the INDIA domain.");
            } else {
                System.out.println("Please enter a valid domain name.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter Valid URL: "); 
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        
        if (url.isEmpty()) {
            System.out.println("Input cannot be empty. Please enter a valid URL.");
        } else {
            domainValidate(url.trim());
        }
        
        scanner.close(); 
    }
}
