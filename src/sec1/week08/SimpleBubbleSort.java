package sec1.week08;
import java.util.Random;
public class SimpleBubbleSort {
    public static void main(String[] args) {
        int [] a = new int[10];
        Random rand = new Random(-7);
        for (int i = 0; i < 10; i++) {
            a[i] = rand.nextInt(0, 21);
        }
        print(a);
        partialBubble(a);
        print(a);
    }

    public static void partialBubble(int [] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])  {
                // two elements out of order
                int temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void print(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
}
