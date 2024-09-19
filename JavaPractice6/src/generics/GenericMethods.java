package generics;

public class GenericMethods {
    
    public <T> void printArray(T[] array) {
        for (T a : array) {
            System.out.println("The elements in array are: " + a);
        }
    }

    public static void main(String[] args) {
        Character[] array = {'A', 'B', 'C'};

        GenericMethods gm = new GenericMethods();
        gm.printArray(array); 
        
        Integer[]arr1 = {10,20,30,40,50};
        gm.printArray(arr1);
    }
}
