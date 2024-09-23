package JavaUnitTesting;

abstract class Shape {
	public abstract double area();

	public abstract double perimeter();
}

class square extends Shape {
	private double side;

	public square(double side) {
		if (side < 0) {
			throw new ArithmeticException("Side length cannot be negative.");
		}
		this.side = side;
	}

	@Override
	public double area() {
		double result = side * side;
		return result;
	}

	@Override
	public double perimeter() {
		double result = 4 * side;
		return result;
	}
}

class rectangle extends Shape {
	private double length;
	private double breadth;

	public rectangle(double length, double breadth) {
		if (length < 0 || breadth < 0) {
			throw new ArithmeticException("Length and breadth cannot be negative.");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		double result = length * breadth;
		return result;
	}

	@Override
	public double perimeter() {
		double result = 2 * (length + breadth);
		return result;
	}
}

public class ShapeCalculator {

}
