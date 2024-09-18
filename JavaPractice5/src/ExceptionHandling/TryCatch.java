package ExceptionHandling;

public class TryCatch {
	
    public static void main(String[] args) {
    	
        try {
        	
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
        	
            System.out.println("An exception occurred: " + e.getMessage());
            
        }
    }
}
