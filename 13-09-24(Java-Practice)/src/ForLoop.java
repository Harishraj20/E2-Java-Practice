public class ForLoop {

	static void squarePattern(int k) {
		for (int i = 1; i < k; i++) {
			for (int j = 1; j < k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void rightTrianglePattern(int n, String k) {
		int i;
		for (i = 0; i <= n; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(k);
			}
			System.out.println();

		}

	}

	static void invertedRightTrianglePattern(int n, String k) {
		int i;
		for (i = n; i >= 1; i--) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(k);

			}
			System.out.println();
		}

	}

	static void equilateralTrianglePattern(int n, String k) {
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	static void invertedEquilateralTrianglePattern(int n, String k) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = n; j < 2 * n - (2 * i + 1); j++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Pattern for Square");
		squarePattern(5);
		System.out.println("--------------------------");
		System.out.println("Pattern for Right angled Triangle");
		rightTrianglePattern(10, "*");
		System.out.println("--------------------------");
		System.out.println("Pattern for inverted rightTriangle");
		invertedRightTrianglePattern(10, "*");
		System.out.println("--------------------------");
		System.out.println("Pattern for  Equivalatral Triangle");
		equilateralTrianglePattern(10, "*");
		System.out.println("--------------------------");
		System.out.println("Pattern for inverted Equivalatral Triangle");
		invertedEquilateralTrianglePattern(10, "*");
	}

}
