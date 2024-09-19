package generics;


class Box<T> {
 private T item;

 public Box(T item) {
     this.item = item;
 }

 public T getItem() {
     return item;
 }

 public void setItem(T item) {
     this.item = item;
 }


 public void displayItemType() {
     System.out.println("The type of item in the box is: " + item.getClass().getName());
 }
}

public class GenericEx1 {
 public static void main(String[] args) {

     Box<Integer> intBox = new Box<>(100);
     System.out.println("Integer Box contains: " + intBox.getItem());
     intBox.displayItemType();


     Box<String> stringBox = new Box<>("Hello Generics!");
     System.out.println("String Box contains: " + stringBox.getItem());
     stringBox.displayItemType();


     Box<Double> doubleBox = new Box<>(99.99);
     System.out.println("Double Box contains: " + doubleBox.getItem());
     doubleBox.displayItemType();
     
     Box<Float> floatBox = new Box<>(99.99f);
     System.out.println("float Box contains: " + floatBox.getItem());
     floatBox.displayItemType();

 }
}

