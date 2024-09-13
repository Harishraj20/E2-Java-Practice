public class Vehicle {
	String name;
	int price;
	int yearOfRelease;

	public Vehicle() {
		// Default Constructor
		System.out.println("Default constructor is called!!!!");
	}

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("price: " + price);
		System.out.println("Year of Release:" + yearOfRelease);
	}

	public static void main(String[] args) {

		Vehicle car = new Vehicle();
		car.name = "BMW X1";
		car.price = 4500000;
		car.yearOfRelease = 2024;

		car.displayInfo();

		Vehicle bike = new Vehicle();
		bike.name = "KTM Duke 390";
		bike.price = 300000;
		bike.yearOfRelease = 2024;

		bike.displayInfo();

	}

}
