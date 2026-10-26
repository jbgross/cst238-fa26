package sec2.week10;

public class BadRecursion {
    public static void main(String[] args) {
//        foo(5);
        bad(5);
    }

    public static void bad(int x) {
        System.out.println(x);
        bad(x + 1);
    }

    public static int foo(int a) {
        System.out.println("Foo1: " + a);
        a *= bar(a);
        System.out.println("Foo1: " + a);
        return a;
    }

    public static int bar(int b) {
        System.out.println("Bar1:" + b);
        b = quux(b);
        System.out.println("Bar2:" + b);
        return b++;
    }

    public static int quux(int c) {
        System.out.println("Quux: " + c++);
        return c;
    }
}
