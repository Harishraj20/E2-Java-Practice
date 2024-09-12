
public class IfElse {
	
	public void evenNumber(int num) {
		String  details;
		if (num % 2 == 0) {
			details = "The number is Even";
		} else {
			details = "The number is odd";
		}
		System.out.println(details);
	}
	
	
	public void ageCategorizer(int age) {
		String message;
		if(age < 5) {
			message = "Infant";
		} else {
			message ="adult";
		}
		System.out.println(message);
	}
	
	

	public static void main(String[] args) {
		IfElse obj = new IfElse();
		obj.ageCategorizer(10);
		obj.ageCategorizer(4);
		obj.evenNumber(20);
		obj.evenNumber(23);
	}

}
