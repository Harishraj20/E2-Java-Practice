package linkedList;

import java.util.LinkedList;

public class LLEx1 {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

       
        System.out.println("The LinkedList: " + linkedList);

     
        linkedList.addFirst(5);
        System.out.println("After adding 5 at the beginning: " + linkedList);

      
        linkedList.addLast(60);
        System.out.println("After adding 60 at the end: " + linkedList);

        linkedList.add(2, 25);
        System.out.println("After adding 25 at index 2: " + linkedList);


        Integer firstElement = linkedList.getFirst();
        System.out.println("First element: " + firstElement);


        Integer lastElement = linkedList.getLast();
        System.out.println("Last element: " + lastElement);

        Integer elementAtIndex = linkedList.get(3);
        System.out.println("Element at index 3: " + elementAtIndex);


        linkedList.set(3, 35);
        System.out.println("After updating index 3 to 35: " + linkedList);

        linkedList.removeFirst();
        System.out.println("After removing the first element: " + linkedList);


        linkedList.removeLast();
        System.out.println("After removing the last element: " + linkedList);


        linkedList.remove(2);
        System.out.println("After removing the element at index 2: " + linkedList);

  
        if (linkedList.contains(30)) {
            System.out.println("LinkedList contains 30");
        } else {
            System.out.println("LinkedList does not contain 30");
        }


        System.out.println("Size of LinkedList: " + linkedList.size());


        if (linkedList.isEmpty()) {
            System.out.println("LinkedList is empty");
        } else {
            System.out.println("LinkedList is not empty");
        }
        
        linkedList.clear();
        System.out.println("After clearing the LinkedList: " + linkedList);


        if (linkedList.isEmpty()) {
            System.out.println("LinkedList is empty after clearing");
        } else {
            System.out.println("LinkedList is not empty after clearing");
        }
    }
}
