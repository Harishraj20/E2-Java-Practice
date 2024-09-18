package Strings;

public class Immutability {
	public static void main(String[] args) {
		String str = "Knowledge";// Create a String object with the value "Knowledge" in the String pool
		String snew = str.concat(" is Power");// Create a new String object with the value "Knowledge Base" 
		//and reassign 'snew' to this new object
		System.out.println(str);
		System.out.println(snew);// Print the value of 'str', which is now "Knowledge Base"
	}
}
