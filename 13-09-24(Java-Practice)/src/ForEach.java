public class ForEach {
	static int array1[] = { 10, 20, 30, 40, 50 };

	static void arrayIterator() {
		for (int i : array1) {
			System.out.println(i);

		}
	}

	static void arrayEvenIdentifier() {
		boolean status = false;
		for (int i : array1) {
			if (i % 2 != 0) {
				System.out.println(i);
				status = true;
			}
		}

		if (!status) {
			System.out.println("Odd Number");
		}
	}

	static void sumArray() {
		int sum = 0;
		for (int i : array1) {
			sum += i;
		}
		System.out.println("The sum of the array elements:" + sum);

	}

	public static void main(String[] args) {
		arrayIterator();
		arrayEvenIdentifier();
		sumArray();

	}

}
