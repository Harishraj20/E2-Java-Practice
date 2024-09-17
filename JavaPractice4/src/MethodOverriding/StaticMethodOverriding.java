package MethodOverriding;

class Human {
    String gender;
    int age;

    public Human(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public void displayInfo(String gender) {
        System.out.println("The person is " + gender);
    }

    public void displayAge() {
        System.out.println("The person's age is " + age);
    }
}


class Student extends Human {
    
    String name;
    
    public Student(String name, String gender, int age) {
        super(gender, age);
        this.name = name;
    }

    @Override
    public void displayInfo(String gender) {
        System.out.println(name + " is a " + gender);
    }

    @Override
    public void displayAge() {
        System.out.println(name + " is " + age + " years old");
    }
}

public class StaticMethodOverriding {
    public static void main(String[] args) {
        Student student = new Student("John", "male", 20);

        student.displayInfo("male"); 
        student.displayAge();  
    }
}
