package Methods;

final class Numbers{
	private static int a = 0;
	int b = 10;
	
static void numCategory() {
	Numbers obj = new Numbers();
	System.out.println("we can access static variable directly inside static method: "+a);
	System.out.println("we cannot access instance variable directly inside static method: "+ obj.b);
	
}
 void numCategorize() {
	System.out.println("we can directly access non static variable directly inside non - static method: "+ b);
}
}
public class Staticmethods {

	public static void main(String[] args) {
		Numbers.numCategory();
		Numbers numbers = new Numbers();
		numbers.numCategorize();
		

	}


}
