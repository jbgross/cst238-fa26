package sec1.week10;

import java.util.Random;

public class ArrayRecursion {

    public static void main(String[] args) {
        Random rand = new Random(-7);
        int [] a = rand.ints(10, 0, 21).toArray();
        print(a);
        System.out.println(search(a, 3, 0));
        System.out.println("sum: " + sum(a, 0));
    }

    public static int sum(int [] a, int start) {
        if (start == a.length - 1) {
            return a[start];
        } else {
            return a[start] + sum(a, start + 1);
        }
    }

    public static int search(int [] a, int key, int start) {
        if(start == a.length) {
            // start is equal to array length
            // if key is not found
            return -1;
        } else if (a[start] == key) {
            // if the element at position start is equal to key
            return start;
        } else {
            // if the element at position start is not equal to key
            return search(a, key, start + 1);
        }
    }

    public static void print(int [] a) {
        print(a, 0);
    }

    public static void print(int [] a, int start) {
        if(start == a.length) {
            System.out.println();
        } else {
            System.out.print(a[start] + " ");
            print(a, start + 1);
        }
    }
}
