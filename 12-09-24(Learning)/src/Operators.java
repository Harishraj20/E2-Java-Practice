
public class Operators {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		
		//Addition, multiply and modulo Operator
		System.out.println("sum of two numbers : "+ (number1+number2));
		System.out.println("Product of two numbers:"+ " "+(number1*number2));
		System.out.println("Modulo operator:"+" "+(number1 % number2));
		
		//Unary Operations
		System.out.println("Pre increment of number1:" +" "+ ++number1);
		System.out.println("Post increment of number2:" +" "+ number2++);
		System.out.println("After Post Incrementing: "+ number2);
		
		System.out.println("Pre decrement of number1:" +" "+ --number1);
		System.out.println("Post decrement of number2:" +" "+ number2--);
		System.out.println("After Post decrementing: "+ number2);
		
	}
	

}
