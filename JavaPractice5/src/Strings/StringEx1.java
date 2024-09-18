package Strings;


public class StringEx1 {
	
public static void main(String[] args) {
	
	String string = "Hello"; // creating string using string literal
	String string2 =string.concat(" World");
	System.out.println(string);
	//Out Put will be Hello as String is immutable. But concat create new object. Assign it explicitly to reference variable
	System.out.println(string2);
	
	}
}
