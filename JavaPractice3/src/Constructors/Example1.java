package Constructors;

 class Animal {
	
	public Animal() {
		super();
		System.out.println("Constructor is called when object created");
	}
	
	public void name() {
			System.out.println("Method is called");
		
	}
}
 
 class cat extends Animal{
	 public void name() {
		 System.out.println("Cat smiles");
	 }
 }
 

 
 
public class Example1 {
	public static void main(String[] args) {
		Animal ex1 = new cat();
		ex1.name();
	}
}
