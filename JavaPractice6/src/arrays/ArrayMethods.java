package arrays;
import java.util.Arrays;
import java.util.Comparator;


public class ArrayMethods {

    public static void main(String[] args) {
        // Initialize arrays for demonstration
        int[] intArray = {5, 2, 9, 1, 5, 6};
        int[] intArrayCopy = Arrays.copyOf(intArray, intArray.length);
        System.out.println(Arrays.toString(intArrayCopy));
        String[] strArray = {"Apple", "Banana", "Cherry"};
        String[] strArray2 = {"Apple", "Banana", "Cherry"};
        String[] strArray3 = {"Apple", "Blueberry", "Cherry"};

        // asList() Method
        System.out.println("List view of strArray: " + Arrays.asList(strArray));

        // binarySearch() method
        int index = Arrays.binarySearch(intArray, 9);
        System.out.println("Index of 9 in intArray: " + index);

        // compare() method
        int comparison = Arrays.compare(strArray, strArray2);
        System.out.println("Comparison between strArray and strArray2: " + comparison);

        // copyOf() method
        int[] newArray = Arrays.copyOf(intArray, 10);
        System.out.println("Copied array with new length: " + Arrays.toString(newArray));

        //copyOfRange() method
        int[] rangeArray = Arrays.copyOfRange(intArray, 1, 4);
        System.out.println("Copied range of array: " + Arrays.toString(rangeArray));

        // equals() method
        boolean areEqual = Arrays.equals(strArray, strArray2);
        System.out.println("Arrays.equals() result: " + areEqual);

        // fill() method
        Arrays.fill(intArray, 10);
        System.out.println("Array after fill(): " + Arrays.toString(intArray));


        // mismatch() method
        int mismatchIndex = Arrays.mismatch(strArray, strArray3);
        System.out.println("First mismatch index between strArray and strArray3: " + mismatchIndex);


        // parallelSort() method
        Arrays.parallelSort(intArray);
        System.out.println("Array after parallelSort(): " + Arrays.toString(intArray));

        // setAll() method
        Arrays.setAll(intArray, i -> i * 2);
        System.out.println("Array after setAll(): " + Arrays.toString(intArray));

        //sort()
        Arrays.sort(intArray);
        System.out.println("Array after sort(): " + Arrays.toString(intArray));

        //sort() with range method
        Arrays.sort(intArray, 1, 4);
        System.out.println("Array after sort() with range: " + Arrays.toString(intArray));

        //sort() with Comparator
        Arrays.sort(strArray, Comparator.reverseOrder());
        System.out.println("Array after sort() with Comparator: " + Arrays.toString(strArray));

        // toString() method
        System.out.println("String representation of intArray: " + Arrays.toString(intArray));
    }
}
