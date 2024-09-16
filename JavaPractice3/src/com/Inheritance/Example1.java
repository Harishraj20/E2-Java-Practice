package com.Inheritance;
class shape{
	public int calculateArea() {
		return 0;	
	}
}

class rectangle extends shape{
	int length;
	int breadth;
	public rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public int calculateArea() {
		return length*breadth;	
	}
}

public class Example1 {
	public static void main(String[] args) {
		
		rectangle r1 = new rectangle(10, 20);
		int result = r1.calculateArea();
		
		System.out.println("Area of the rectangle with length "+r1.length
				+"cm and Breadth "+r1.breadth+"cm is : "+result+" sq.units");
		
	}

}
