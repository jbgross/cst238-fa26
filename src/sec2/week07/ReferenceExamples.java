package sec2.week07;

public class ReferenceExamples {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x = " + x);
        setInt(x);
        System.out.println("x = " + x);

        int [] b = {5}; // int [] b = new int[1]; b[0] = 5;
        System.out.println("b[0] = " + b[0]);
        setIntArray(b);
        System.out.println("b[0] = " + b[0]);

        String s = "hello";
        System.out.println("s = " + s);
        setString(s);
        System.out.println("s = " + s);

        Car c1 = new Car("white", 200);
        System.out.println(c1.getColor());
        changeCarColor(c1);
        System.out.println(c1.getColor());
    }

    public static void changeCarColor(Car c) {
        System.out.println(c.getColor());
//        c.setColor("blue");
        c = new Car("blue", 100);
        System.out.println(c.getColor());
    }
    
    public static void setString(String s) {
        System.out.println("s = " + s);
        s = "goodbye";
        System.out.println("s = " + s);
    }

    public static void setIntArray(int [] a) {
        System.out.println("a[0] = " + a[0]);
        a[0] = 10;
        System.out.println("a[0] = " + a[0]);

    }
    
    public static void setInt(int a) {
        System.out.println("a = " + a);
        a = 10;
        System.out.println("a = " + a);
    }
}
