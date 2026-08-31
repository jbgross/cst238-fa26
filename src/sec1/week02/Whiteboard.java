package sec1.week02;

public class Whiteboard {
    private Marker [] markers;
    private Marker marker1;
    private Marker marker2;

    public void setMarker1(Marker m) {
        marker1 = m;
    }

    public void setMarker2(Marker m) {
        marker2 = m;
    }

    public void printBoard() {
        System.out.println("First Marker Color: " + marker1.getColor());
        System.out.println("Second Marker Color: " + marker2.getColor());
    }
}
