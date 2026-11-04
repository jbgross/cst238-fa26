package sec2.week11;

import java.util.ArrayList;

public class Review {

    public static void main(String[] args) {
        // T1n = 8^n + n^8 + 4n^3 + 2n^2 + 3n*logn + 7n + 2
        // 8^n
        // (4 * 2)^n
        // 2^n - not Big O
        // O(2^n)
        int [] arr = {1, 2, 3, 4, 5};
        printForward(arr, 0);
        System.out.println();
        printReverseA(arr, arr.length - 1);
        printReverseB(arr, 0);

//
        ArrayList<Integer> ali = new ArrayList<>();
        System.out.println(ali.size());
        ali.add(5);
        System.out.println(ali.size());
        ali.isEmpty();
//        // this will throw an exception
////        System.out.println(ali.get(2));
//
//        int a = 255;
//        double u = 17.553;
//        String name = "Bill";
//        System.out.printf("%d - %b - %.1f - %s%n", a, false, u, name);
//        String output = String.format("%d - %b - %.1f - %s%n", a, false, u, name);
//        System.out.println(output);
//        System.out.printf("%s%n", String.format("%d", 10));
    }

    public static void printReverseB(int [] a, int i) {
        if (i != a.length) {
            printReverseB(a, i + 1);
            System.out.print(a[i] + " ");
            if(i == 0) {
                System.out.println();
            }
        }

    }

    public static void printReverseA(int [] a, int i) {
        if (i < 0) {
            System.out.println();
        } else {
            System.out.print(a[i] + " ");
            printReverseA(a, i - 1);
        }
    }

    public static void printForward(int [] a, int i) {
        if (i == a.length) {
            System.out.println();
        } else {
            System.out.print(a[i] + " ");
            printForward(a, i + 1);
            System.out.print(a[i] + " ");
        }
    }
}
