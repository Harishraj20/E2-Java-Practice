package Abstraction;

abstract class Person {
 protected String name;
 protected int age;


 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Abstract method
 public abstract void displayRole();


 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

class Teacher extends Person {
 private String subject;

 public Teacher(String name, int age, String subject) {
     super(name, age);
     this.subject = subject;
 }

 @Override
 public void displayRole() {
     System.out.println(name + " is a Teacher who teaches " + subject + ".");
 }
}


class Student extends Person {
 private String grade;

 public Student(String name, int age, String grade) {
     super(name, age);
     this.grade = grade;
 }

 @Override
 public void displayRole() {
     System.out.println(name + " is a Student in grade " + grade + ".");
 }
}

public class Example1 {
 public static void main(String[] args) {
     Teacher teacher = new Teacher("John", 40, "Mathematics");
     Student student = new Student("Alice", 14, "8th Grade");

     teacher.displayInfo();   
     teacher.displayRole(); 

     student.displayInfo();  
     student.displayRole(); 
 }
}
