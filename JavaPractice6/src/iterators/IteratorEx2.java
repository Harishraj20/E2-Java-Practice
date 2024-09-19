package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            String car = it.next();
            if (car.equals("BMW")) {
                it.remove(); 
            }
        }

        System.out.println("Remaining cars: " + cars);
    }
}
