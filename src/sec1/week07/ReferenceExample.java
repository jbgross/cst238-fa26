package sec1.week07;

public class ReferenceExample {

    public static void main(String[] args) {
        String s = "bar";
        System.out.println("value of s: " + s);
        changeString(s);
        System.out.println("value of s: " + s);

        int x = 5;
        System.out.println("value for x: " + x);
        changeInt(x);
        System.out.println("value for x: " + x);

        int [] a = {7};
        System.out.println("value for a[0]: " + a[0]);
        changeIntArray(a);
        System.out.println("value for a[0]: " + a[0]);
    }


    public static void changeIntArray(int [] z) {
        System.out.println("value for z[0]: " + z[0]);
        z[0] = 8;
        System.out.println("value for z[0]: " + z[0]);
    }

    public static void changeInt(int i) {
        System.out.println("value for i: " + i);
        i = 10;
        System.out.println("value for i: " + i);
    }

    public static void changeString(String param) {
        System.out.println("value of param: " + param);
        param = "foo";
        System.out.println("value of param: " + param);
    }
}
