package Constructors;

class Student {
    String name;
    int age;
    String course;
    
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Undecided";
    }

    public Student(String name) {
        this.name = name;
        this.age = 0;
        this.course = "Undecided"; 
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Undecided"; 
    }

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
     
        Student s1 = new Student(); 
        Student s2 = new Student("John");
        Student s3 = new Student("Alice", 22);
        Student s4 = new Student("Bob", 25, "Computer Science");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
        }
    }
