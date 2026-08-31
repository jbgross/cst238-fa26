package sec2.week02;

public class Whiteboard {

    private Marker m1;
    private Marker m2;
    private Marker [] markers;

    public Whiteboard() {
        System.out.println("I'm a new whiteboard!");
    }

    public void setMarker1(Marker m) {
        m1 = m;
    }

    public void setMarker2(Marker m) {
        m2 = m;
    }

    public String toString() {
        return "Marker m1: " + m1 + " - Marker m2: " + m2;
    }
}
