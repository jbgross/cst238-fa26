package sec2.week02;
import java.util.*;

public class Marker {
    private String color;
    private boolean capped;
//    String foo = "bar";

    public Marker(String co, boolean ca) {
        color = co;
        setCapped(ca);
    }

    public void setCapped(boolean c) {
//        String foo = "foo";
        capped = c;
    }

    public boolean isCapped() {
//        System.out.println(foo);
        return capped;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String c) {
//        c = color;
        color = c;
    }

    public String toString() {
        // stringified
        return "Marker - Color = " + color + " (Capped: " + capped + ")";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
//        r.nextInt(1000);
        Marker m1 = new Marker("periwinkle", true);
        System.out.println(m1);
        m1.setColor("red");
        System.out.println(m1.getColor());
        m1.setCapped(false);
        m1.setCapped(true);
        System.out.println(m1);

        Marker m2 = new Marker("orange", false);
        m2.setCapped(false);
        System.out.println(m1);
    }


}
