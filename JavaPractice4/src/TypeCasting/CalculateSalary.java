package TypeCasting;

public class CalculateSalary {

    private static void hikeCalculator(int salary, Float hikepercent) {
        double salaryInc = salary * hikepercent / 100; //Implicit Type casting
        System.out.println("Original Salary: " + salary);
        System.out.println("Hike Percentage: " + hikepercent + "%");
        System.out.println("Salary Increment: " + salaryInc);
    }

    public static void main(String[] args) {
        hikeCalculator(200000, 7.456f); 
    }
}
