package Task1;

import java.util.Scanner;

public class LeapYearValidation {

    static void validateLeapYear(int year) {
        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter year between 1000 and 10000: ");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
        	
            int year = scanner.nextInt();
            if (year >= 1000 && year <= 10000) {
                validateLeapYear(year);
            } else {
                System.out.println("Year must be between 1000 and 10000.");
            }
        } 
        
        else {
            System.out.println("Invalid input. Please enter a valid year.");
        }

        scanner.close(); 
    }
}
