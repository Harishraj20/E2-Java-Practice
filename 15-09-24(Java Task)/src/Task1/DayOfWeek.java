package Task1;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to get the day of the week: ");

        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();
            
            switch (dayNumber) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 7.");
                    break;
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close(); 
    }
}
