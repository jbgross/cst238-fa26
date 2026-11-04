package sec1;

public class Review {
    private int foo = 0;
    private static int bar = 1;


    public static double sumPositive(double [] u, int start) {
        double sum;
        if(start < 0) {
            return 0.0;
        } else if(u[start] > 0.0) {
            return u[start] + sumPositive(u, start - 1);
        } else {
            return 0.0 + sumPositive(u, start - 1);
        }
    }


    public static void printIterative(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void printRecursive(int [] a, int index) {
        if (index == a.length) {
            System.out.println();
        } else {
            System.out.print(a[index] + " ");
            printRecursive(a, index + 1);
        }
    }

    public int getFoo() {
        return foo;
    }

    public static void setBar(int bar) {
//        this.bar = bar;
        Review.bar = bar;
    }
    public static void setBar2(int b) {
//        this.bar = bar;
        bar = b;
        // T1n = 8^n + n^8 + n^2 + logn + n + 5
        // 8^n = (4 * 2)^n
        // 1^n - NO
        // 2^n
        // = O(2^n)
    }

    public static void main(String[] args) {
//        System.out.println(Review.foo);
        System.out.println(Review.bar);
        System.out.println(bar);
        Review r = new Review();
//        System.out.println(Review.foo);
        System.out.println(r.foo);
    }
}
