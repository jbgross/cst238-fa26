package sec2.week08;
import java.util.*;
public class SimpleBubbleSort {
    public static void main(String[] args) {
        int [] a = new int[10];
        Random rand = new Random(-7);

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(0, 21);
        }
        print(a);
        partialBubbleSort(a);
        print(a);
    }

    public static void partialBubbleSort(int [] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
    }

    public static void print(int [] a ) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
}
