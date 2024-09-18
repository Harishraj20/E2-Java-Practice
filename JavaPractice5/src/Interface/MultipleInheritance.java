package Interface;

interface Animals {
 void sound();
}

interface Pet {
 void sound();
}

class Dog implements Animals, Pet {
 public void sound() {
     System.out.println("The dog barks");
 }
}

public class MultipleInheritance {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.sound();
     }
 }
 

