package sec1.week02;

public class MarkerRunner {
    public static void main(String[] args) {
        Marker m1 = new Marker();
        Whiteboard wb = new Whiteboard();
        wb.setMarker1(m1);
        Marker m2 = new Marker();
        m2.setColor("shrimp");
        wb.setMarker2(m2);

        m1.setColor("green-lavender");
//        wb.setMarker2(m2);

        wb.printBoard();
//        m1.color = "blue";
//        int x = 5, y = 7;
//        if (x = y) {
//
//        }
    }
}
