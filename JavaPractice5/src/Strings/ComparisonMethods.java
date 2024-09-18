package Strings;

public class ComparisonMethods {

public static void main(String[] args) {
	
	String s1 = "Programmer";
	String s2 = "programmer";
	String s3 = "Python Programmer";
	String s4 = "Python Programmer";
	String s5 = "PROGRAMMER";
	String s6 = "JavaProgrammer.com";

	
	
	System.out.println(s3.contains(s1)); // True as Programmer word is present in Python Programmer
	System.out.println(s3.contentEquals(s4));//True both content are same
	System.out.println(s1.contains("e")); //true as it contains e
	System.out.println(s2.contentEquals("mmer")); // False as it check entire word to match the content
	System.out.println(s1.equalsIgnoreCase(s5));
	
	System.out.println(s1.indexOf("mmer"));
	System.out.println(s3.lastIndexOf("r"));
	System.out.println(s6.lastIndexOf("."));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println();
}
}
