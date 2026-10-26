package sec1.week10;

public class GoodRecursion {

    public static void main(String[] args) {
//        good(3);
        System.out.println(converge(1, 3) + converge(3,6));
    }

    public static int converge(int a, int b) {
        if(a >= b) {
            // base case
            return 0;
        } else {
            // recursive case
            return a + b + converge(a, b);
        }
    }

    public static void good(int a){

        if(a == 0) {
            // base case
            System.out.println("done");
        } else {
            // recursive case
            System.out.println("a before: " + a);
            good(a - 1);
            System.out.println("a after: " + a);
        }
    }
}
