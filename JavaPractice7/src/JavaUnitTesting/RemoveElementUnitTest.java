package JavaUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveElementUnitTest {
	@Test
	public void RemoveElementCase1() {
		int arr[] = { 1, 2, 3, 4, 5, 1, 1, 2, 7, 8 };
		int k = 1;
		int expectedArray[] = { 2, 2, 3, 4, 5, 7, 8 };
		assertArrayEquals(expectedArray, ArrayManipulation.removeElement(arr, k));
	}

	@Test
	public void RemoveElementCase2() {
		int arr[] = { 1, 2, 3, 4, 5, 1, 1, 2, 7, 8 };
		int k = 10;
		int expectedArray[] = { 1, 1, 1, 2, 2, 3, 4, 5, 7, 8 };
		assertArrayEquals(expectedArray, ArrayManipulation.removeElement(arr, k));
	}

	@Test
	public void RemoveElementCase3() {
		int arr[] = {};
		int k = 1;
		int expectedArray[] = {};
		assertArrayEquals(expectedArray, ArrayManipulation.removeElement(arr, k));
	}

	@Test
	public void RemoveElementCase4() {
		int arr[] = { 1 };
		int k = 1;
		int expectedArray[] = {};
		assertArrayEquals(expectedArray, ArrayManipulation.removeElement(arr, k));
	}

	@Test
	public void RemoveElementCase5() {
		int arr[] = { 5 };
		int k = 1;
		int expectedArray[] = { 5 };
		assertArrayEquals(expectedArray, ArrayManipulation.removeElement(arr, k));
	}

	@Test
	public void RemoveElementCase6() {
		int arr[] = { 2, 2, 2, 2 };
		int k = 2;
		int expectedArray[] = {};
		assertArrayEquals(expectedArray, ArrayManipulation.removeElement(arr, k));
	}

	@Test
	public void RemoveElementCase7() {
		int arr[] = { 3, 3, 3, 3 };
		int k = 2;
		int expectedArray[] = { 3, 3, 3, 3 };
		assertArrayEquals(expectedArray, ArrayManipulation.removeElement(arr, k));
	}

	@Test
	public void RemoveElementCase8() {
		int arr[] = { -1, -2, -3, -2, -4 };
		int k = -2;
		int expectedArray[] = { -4, -3, -1 };
		assertArrayEquals(expectedArray, ArrayManipulation.removeElement(arr, k));
	}

	@Test
	public void RemoveElementCase9() {
		int arr[] = { 0, 1, 2, 0, 3 };
		int k = 0;
		int expectedArray[] = { 1, 2, 3 };
		assertArrayEquals(expectedArray, ArrayManipulation.removeElement(arr, k));
	}

}
