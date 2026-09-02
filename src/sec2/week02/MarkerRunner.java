package sec2.week02;

public class MarkerRunner {
    public static void main(String[] args) {
        int [] a = new int[0];
        System.out.println(a);
        Marker m1 = new Marker("hot pink", false);
//        m1.color = "blue";
//        m1.color = "Josh";
//        m1.setColor("Josh");
        System.out.println(m1);

        Whiteboard wb = new Whiteboard();
        wb.setMarker1(m1);
        wb.setMarker2(new Marker("green", true));
        System.out.println(wb);

    }
}
