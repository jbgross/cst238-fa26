package sec1.week10;

public class BadRecursion {

    public static void main(String[] args) {
//        int a = 5;
        badRecursion(5);
//        foo();
    }

    public static void badRecursion(int x) {
        System.out.println(x);
        badRecursion(x + 1);
    }

    public static void badRecursion() {

    }

    public static void foo() {
        int x = 1;
        System.out.println(x);
        bar(++x);
        System.out.println("foo2: " + x);
    }

    public static void bar(int a) {
        System.out.println("bar: " + a);
        a = quux(a);
        System.out.println("bar2: " + a);
    }

    public static int quux(int a) {
        System.out.println("quux: " + a);
        return ++a;
    }

}
