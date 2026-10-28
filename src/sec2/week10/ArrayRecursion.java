package sec2.week10;

import java.util.Random;

public class ArrayRecursion {
    public static void main(String[] args) {
        Random rand = new Random(-8);
        int [] a = rand.ints(10, -50, 51).toArray();

        print(a, 0);
        System.out.println(sum(a));
        int [] b = rand.ints(3, 0, 10).toArray();
        print(b, 0);
        System.out.println(sum(b));
        int [] c = {};
        System.out.println(sum(c));
        System.out.println(getSmallestValue(a, 0));
    }

    public static int getSmallestValue(int [] a, int index) {
//        if (index == a.length) {
//            // base case
//            return Integer.MAX_VALUE;
//        } else {
//            int smallest = getSmallestValue(a, index + 1);
////            return getSmallestValue(a, index + 1);
//            if (a[index] < smallest) {
//                return a[index];
//            } else {
//                return smallest;
//            }
//        }
        if(index == a.length) {
            return Integer.MAX_VALUE;
        } else if (a[index] < getSmallestValue(a, index + 1)) {
            return a[index];
        } else {
            return getSmallestValue(a, index + 1);
        }


    }

    public static void print(int [] a, int index) {
        if(index == a.length) {
            // base case
            System.out.println();
        } else {
            // recursive case
            System.out.print(a[index] + " ");
            print(a, index + 1);
        }
    }



    // helper method
    public static int sum(int [] a) {
        return sum(a, 0);
    }

    public static int sum(int [] a, int index) {
//        int total = 0;
        if (index == a.length) {
//        if (index == a.length - 1) {
            // base case
//            return a[index];
            return 0;
        } else {
            // recursive case
            return a[index] + sum(a, index + 1);
        }
    }
}
