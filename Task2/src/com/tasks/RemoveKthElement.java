package com.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveKthElement {
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

        System.out.println("The Array elements: " + Arrays.toString(arr));

        Arrays.sort(arr);

        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != k) {
                arr[j] = arr[i];
                j++;
            }
        }

        if (arr[arr.length - 1] != k) {
            arr[j] = arr[arr.length - 1];
            j++;
        }

        System.out.print("Array after removing duplicates and " + k + ": ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
