package sec1.week07;

public class StaticExamples {
    public static void main(String[] args) {
        System.out.println("how many cars? " + Car.getCarCount());
//        System.out.println(Car.getColor());
        Car c1 = new Car();
        System.out.println(c1);
        System.out.println(c1.getCarCount());
        Car c2 = new Car("green");
        System.out.println(c1);
        System.out.println(c1.getCarCount());
        System.out.println(c2.getCarCount());
    }

}

class Car {

    public static final String DEFAULT_COLOR = "blue";
    private static int count = 0;
    private final String color;

    public Car() {
//        new Car("burgundy");
        this(DEFAULT_COLOR);
    }

    public Car(String color) {
        this.color = color;
        count++;
    }

//    public void setColor(String color) {
//        this.color = color;
//    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return color + " car";
    }

    public static int getCarCount() {
        return count;
    }
}