package sec2.week07;

public class Car implements Comparable<Car> {
    public static final String DEFAULT_COLOR = "red";
    private static int carCount;
    private int speed;
    private String color;
    private int mileage;

    public Car() {
        this(DEFAULT_COLOR, 0);
    }

    public Car(String color, int mileage) {
//        this.color = color;
        setColor(color);
        carCount++;
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static int getCarCount() {
        return carCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void speedUp() {
        speed += 5;
    }

//    public static void main(String [] args) {
////        System.out.println(speed);
//    }


    public int compareTo(Car c) {
//        return this.mileage - c.mileage;
        return this.color.compareTo(c.color);
    }

    public String toString() {
        return color + " car with " + mileage + " miles";
    }
}
