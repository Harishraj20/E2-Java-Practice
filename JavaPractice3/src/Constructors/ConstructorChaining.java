package Constructors;
class Vehicle {
    private String brand;
    private int year;

    public Vehicle() {
        this("Unknown Brand", 0); 
        System.out.println("Default Vehicle constructor called");
    }

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Parameterized Vehicle constructor called: " + brand + ", " + year);
    }
}

class Car extends Vehicle {
    private String model;

    public Car() {
        this("Unknown Model"); 
        System.out.println("Default Car constructor called");
    }

    public Car(String model) {
        super("Toyota", 2020); 
        this.model = model;
        System.out.println("Parameterized Car constructor called: " + model);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Car myCar = new Car();
    }
}
