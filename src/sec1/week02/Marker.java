package sec1.week02;

public class Marker {
    // attributes - things that a Marker knows about itself
    private String color;
    private boolean capped;

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

    public void setCapped(boolean c) {
        capped = c;
    }

    public boolean isCapped() {
        return capped;
    }

    public static void main(String[] args) {
        Marker m1 = new Marker();
        Marker m2 = new Marker();
        System.out.println(m1);
        System.out.println(m2);

        m1.setColor("periwinkle");
        System.out.println(m1.getColor());
        m1.setCapped(true);
        System.out.println(m1.isCapped());
        m1.setCapped(false);
        System.out.println(m1.isCapped());

        m2.setCapped(true);
        System.out.println(m1.isCapped());

        m2.color = "orange";

    }
}

//public class Whiteboard {
//
//}
