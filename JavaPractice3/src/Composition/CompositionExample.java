package Composition;

class Address{
	String street;
	String city;
	String country;
	public Address(String street, String city, String country) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}

class Person{
	String name;
	Address address;
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo() {
		 System.out.println("Name: " + name);
	        System.out.println("Address: " + address.getStreet() + ", " + 
	            address.getCity() + ", " + address.getCountry());
	}
}

public class CompositionExample {
	public static void main(String[] args) {
        Address address = new Address("No.1, Indira Street", "Avadi, Chennai", "TN");
        Person person = new Person("John Doe", address);
        person.displayInfo();


	}

}
