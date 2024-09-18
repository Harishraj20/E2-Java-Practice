package ExceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int result = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("This block will always be executed.");
        }
    }
}
