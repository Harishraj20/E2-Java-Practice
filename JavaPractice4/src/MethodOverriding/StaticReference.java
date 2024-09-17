package MethodOverriding;

class classA {
     void display() {
        System.out.println("Static method in Parent");
    }
}

class classB extends classA {
     void display() {
        System.out.println("Static method in Child will be executed when the reference type of the object is classB");
    }
}

public class StaticReference {
    public static void main(String[] args) {
    	classA obj1 = new classA();
    	classB obj2 = new classB();

        obj1.display(); 
        obj2.display(); 
    }
}

