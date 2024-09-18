package Strings;

public class ToCharArray {
	public static void main(String[] args) {
		String myStr = "Hello, World!";

		String subStr = myStr.substring(7, 10);
		System.out.println("Substring: " + subStr);

		CharSequence subSeq = myStr.subSequence(7, 10);
		System.out.println("SubSequence: " + subSeq);

		char[] charArray = myStr.toCharArray();
		System.out.print("CharArray: ");
		for (char c : charArray) {
			System.out.print(c);
		}
		System.out.println();

		char[] subStrCharArray = subStr.toCharArray();
		System.out.print("Substring CharArray: ");
		for (char c : subStrCharArray) {
			System.out.print(c);
			System.out.println();
		}
	}
}
