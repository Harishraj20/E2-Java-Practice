package MethodOverloading;
//Each child class overloads parent class method called move()
class WildAnimal {
    public void move() {
        System.out.println("Animal moves faster");
    }
    
    
}

class Rabbit extends WildAnimal {
    public void move(int speed) {
        System.out.println("Rabbit moves faster at a rate of: " + speed + " km/Hr");
    }
}

class Tortoise extends WildAnimal {
    public void move(int speed, int distance) {
        System.out.println("Tortoise moves at a rate of: " + speed +
                " km/Hr. It takes more than an hour to cover the distance of " + distance+"km");
    }
}

class Deer extends WildAnimal {
    public void move(int speed, int distance, String animal) {
        System.out.println("Deer moves faster at a rate of " + speed +
                " km/Hr and covers a distance of " + distance + " km when " + animal + " chases it");
    }
}

public class Exampl1 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.move(); 
        rabbit.move(15);

        Tortoise tortoise = new Tortoise();
        tortoise.move(5, 10); 

        Deer deer = new Deer();
        deer.move(20, 50, "a lion"); 
    }
}

