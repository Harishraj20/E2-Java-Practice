package ExceptionHandling;

public class MultipleTryCatch {
    public static void main(String[] args) {
        try {
        	int[] numbers = {1, 2, 3,4,5};
            numbers[10] = 1; 
            int result = 10 / 0; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
