class Stationary {
	String type;
	String brand;
	int price;

	// Parameterized constructor;
	// this keyword refer the current instance of the class (i.e object that call
	// the constructor) it is necessary to set the value for the instance variables
	// of the objects created!!

	public Stationary(String type, String brand, int price) {
		this.type = type;
		this.brand = brand;
		this.price = price;
	}

//	
	public void properties() {
		System.out.println(type + " is of the brand " + brand + " and costs " + price + "Rs");
	}
}

public class Constructors {
	public static void main(String[] args)
	{
		Stationary obj1 = new Stationary("Black Pen", "XYZ", 10);
		Stationary obj2 = new Stationary("pencil", "XYZ", 5);
		Stationary obj3 = new Stationary("Eraser", "XYZ", 5);
		Stationary obj4 = new Stationary("Sharnpener", "XYZ", 5);

		obj1.properties();
		obj2.properties();
		obj3.properties();
		obj4.properties();

	}

}
