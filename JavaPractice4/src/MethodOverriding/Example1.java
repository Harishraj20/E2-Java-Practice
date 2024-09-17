package MethodOverriding;

class parent{
	public void overriding() {
		System.out.println("This method belong to parent class");
		
	}
}
 class child extends parent{
	 public void overriding() {
			System.out.println("This method belong to child class");
			
		}
 }
public class Example1 {
	public static void main(String[] args) {
		parent p1 = new parent();
		p1.overriding();
		
		child c1 = new child();
		c1.overriding();
		
	}

}
//Child class method have same name and same signature and return type as that of parent class
