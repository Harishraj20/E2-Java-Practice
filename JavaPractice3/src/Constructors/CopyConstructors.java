package Constructors;

public class CopyConstructors {
	
	 String  name;
	 int age;
	
	public CopyConstructors(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Name: " + name +", age:"+age);
	}

	public CopyConstructors(CopyConstructors c1) {
		this.name = c1.name;
		this.age = c1.age;
		System.out.println("Copied Name: " + name + ", Copied Age: " + age);
	}
	public void constructorCopy() {
		System.out.println("Copy Constructor used");
	}

	public static void main(String[] args) {
		CopyConstructors c1 = new CopyConstructors("Harish",22);
		CopyConstructors c2 = new CopyConstructors(c1);
		c2.constructorCopy();
	}
}
