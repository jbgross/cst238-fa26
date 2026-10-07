package sec2.week07;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {

        Car c1 = new Car("maroon", 150000);
        Car c2 = new Car("gray", 5);
        Car c3 = new Car("green", 55);
        Car c4 = new Car("ochre", 100);

        ArrayList<Car> lot = new ArrayList<>();
        lot.add(c1);
        lot.add(c2);
        lot.add(c3);
        lot.add(c4);
        lot.add(new Car("blue", 1000000));

        for (int i = 0; i < lot.size(); i++) {
            System.out.println(lot.get(i));
        }
        System.out.println();


        ArrayList<String> als = new ArrayList<>();
        Collections.sort(als);

        System.out.println("Sorted: ");
        Collections.sort(lot);
        for (int i = 0; i < lot.size(); i++) {
            System.out.println(lot.get(i));
        }
        System.out.println();

    }
}
