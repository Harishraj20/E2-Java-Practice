package JavaUnitTesting;

public class FibonacciSeries {
	   int fibonacci (int n)
	    {
		   if(n <0) {
			   throw new IllegalArgumentException("Negative numbers are not allowed.");
		   }

	        if (n <= 1) {
	            return n;
	        }

	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
}
