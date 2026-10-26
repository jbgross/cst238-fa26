package sec2.week10;

public class GoodRecursion {

    public static void main(String[] args) {
//        countDown(3);
        System.out.println(factorial(3));
    }

    public static int factorial(int a) {
        if(a == 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    public static int countDown(int a) {
        if(a == 0) {
            // base case
            System.out.println("done!");
            return 0;
        } else {
            // recursive
            System.out.println(a);
            countDown(a - 1);
            System.out.println("upward: " + a);
            return 1;
        }
    }
}

