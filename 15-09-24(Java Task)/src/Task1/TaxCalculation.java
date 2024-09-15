package Task1;

import java.util.Scanner;

public class TaxCalculation {

    private static void taxCalculator(int salary) {
        double taxAmount;

        if (salary <= 25000) {
            System.out.println("No tax is applicable for the salary.");
            
        } else if (salary > 25000 && salary <= 500000) {
            taxAmount = salary * 5.0 / 100;
            System.out.println("The employee has to pay Rs. " + taxAmount + " (5%) of the salary as Tax per Annum");
            
        } else if (salary > 500000 && salary <= 1000000) {
            taxAmount = salary * 10.0 / 100;
            System.out.println("The employee has to pay Rs. " + taxAmount + " (10%) of the salary as Tax per Annum");
            
        } else if (salary > 1000000) {
            taxAmount = salary * 15.0 / 100;
            System.out.println("The employee has to pay Rs. " + taxAmount + " (15%) of the salary as Tax per Annum");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Salary: ");
        
        if (scanner.hasNextInt()) {
            int salary = scanner.nextInt();

            if (salary >= 0) {
                taxCalculator(salary);
            } else {
                System.out.println("Salary cannot be negative.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer salary.");
        }

        scanner.close();
    }
}
