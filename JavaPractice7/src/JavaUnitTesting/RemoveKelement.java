package JavaUnitTesting;

import java.util.Arrays;
import java.util.Scanner;


class ArrayManipulation {
     static int[] removeElement(int[] arr, int k) {
        // Sort the array
        Arrays.sort(arr);
        
        int j = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                arr[j] = arr[i]; 
                j++;
            }
        }

        return Arrays.copyOf(arr, j);
    }
}
public class RemoveKelement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to be removed: ");
        int k = scanner.nextInt();
        
        scanner.close();

        int[] result = ArrayManipulation.removeElement(arr, k);
        System.out.println("Array after removing " + k + ": " + Arrays.toString(result));
    }
}
