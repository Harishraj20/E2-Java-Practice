package Encapsulation;

// Base class Person with encapsulation
class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter and Setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class Male extends Person {

    // Constructor
    public Male(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void generalInfo() {
        System.out.println(getName() + " is a " + getGender() + " and he is " + getAge() + " years old.");
    }
}

public class EncapsulationEx1 {
    public static void main(String[] args) {

        Male john = new Male("John", 30, "Male");

    
        john.generalInfo();  
    }
}
