package sec1.week09;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int [] data = generateData(20);
        print(data);
//        sort(data);
//        print(data);
//        sortUntil(data);
        bubbleSort(data);
        print(data);
    }

    public static void bubbleSort(int [] a) {
        int k;
        for (k = 0; k < a.length; k++) {
            boolean isSorted = true;
            for (int i = 0; i < a.length - 1 - k; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            if (isSorted) {
                break;
            }
//            if (isSorted(a)) {
//                break;
//            }
        }
        System.out.println("number of iterations: " + k);
    }

    public static void partialSort(int [] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                // swap
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
    }

    public static boolean isSorted(int [] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
//            else {
//                return true;
//            }
        }
        return true;

    }

    public static void sortUntil(int [] a) {
        int count = 0;
        while(! isSorted(a)) {
            partialSort(a);
            count++;
            System.out.print(count + ": ");
            print(a);
        }
    }

    public static void print(int [] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int [] generateData(int size) {
//        Random rand = new Random(-7);
        return (new Random(-7)).ints(size, 0, 21).toArray();

    }
}
