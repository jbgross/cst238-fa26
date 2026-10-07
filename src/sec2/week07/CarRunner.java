package sec2.week07;

public class CarRunner {
    public static void main(String[] args) {
        System.out.println(Car.getCarCount());
        Car c1 = new Car();
        System.out.println(Car.getCarCount());
        Car c2 = new Car();
        Car c3 = c2;
        System.out.println(c1.getCarCount());
        System.out.println(c2.getCarCount());

    }
}
