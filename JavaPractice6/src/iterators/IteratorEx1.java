package iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorEx1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));		
		Iterator<Integer> iterate = array.iterator();
		while(iterate.hasNext()) {
			 Integer num = iterate.next(); 
			 if (num % 3 == 0) {
	                System.out.println(num + " is even.");
	            } else {
	                System.out.println(num + " is odd.");
	            }
	        }
	}

}
