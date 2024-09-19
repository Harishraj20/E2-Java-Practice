package arrayLists;

import java.util.ArrayList;

public class AlEx1 {

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(7);
        arr1.add(4);
        arr1.add(1);
        arr1.add(9);
        arr1.add(3);


        System.out.println("The ArrayList: " + arr1);

        if (arr1.contains(4)) {
            System.out.println("The list contains 4");
        } else {
            System.out.println("The list doesn't have 4");
        }

        arr1.remove(Integer.valueOf(4)); 
        System.out.println("After removing 4: " + arr1);

        arr1.add(2, 8);
        System.out.println("After adding 8 at index 2: " + arr1);

        Integer element = arr1.get(3);
        System.out.println("Element at index 3: " + element);

        arr1.set(3, 10);
        System.out.println("After updating index 3 to 10: " + arr1);

        System.out.println("Size of ArrayList: " + arr1.size());

        arr1.clear();
        System.out.println("After clearing the ArrayList: " + arr1);


        if (arr1.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }

        ArrayList<Character> arr2 = new ArrayList<>();
        arr2.add('h');
        arr2.add('e');
        arr2.add('l');
        arr2.add('l');
        arr2.add('o');

        if (arr2.contains('o')) {
            System.out.println("arr2 contains 'o'");
        } else {
            System.out.println("arr2 does not contain 'o'");
        }

        if (arr1.equals(arr2)) {
            System.out.println("Both ArrayLists are the same");
        } else {
            System.out.println("Both ArrayLists are not the same");
        }
    }
}
