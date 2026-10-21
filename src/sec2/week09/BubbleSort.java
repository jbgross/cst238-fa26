package sec2.week09;

import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        int [] data = generateData(20);
        print(data);
//        partialBubble(data);
//        print(data);
//        fullBubble(data);
        bubbleSort(data);
        print(data);
    }

    public static void fullBubble(int [] a) {
        int count = 0;
        while (! isSorted(a)) {
            partialBubble(a);
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
    public static boolean isSorted(int [] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(int [] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            boolean isSorted = true;
            for (int k = 0; k < a.length - 1 - i; k++) {
                if (a[k] > a[k + 1]) {
                    isSorted = false;
                    int temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                }
            }

            if (isSorted) {
                break;
            }
//            if (isSorted(a)) {
//                break;
//            }
        }
        System.out.println("iterations: " + i);
    }

    public static void partialBubble(int [] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            }
        }
    }

    public static int [] generateData(int size) {
//        Random rand = new Random(-7);
//        int [] a = new int[size];
//        int [] a = rand.ints(size, 0, 20).toArray();
//        return a;

        return (new Random(-7)).ints(size, 0, 21).toArray();
    }
}
