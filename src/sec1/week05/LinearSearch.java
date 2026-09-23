package sec1.week05;

import java.util.Random;

public class LinearSearch {

    public static void main(String [] args) {
        int [] array = new int[10];
        Random rand = new Random(-7);
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(0, 10);
        }
        print(array);
        System.out.println("is 9 present? " + linearSearch(array, 9));
        System.out.println("is 7 present? " + linearSearch(array, 7));
        System.out.println("how many 7s? " + count(array, 7));
        System.out.println("how many 2s? " + count(array, 2));
        System.out.println("how many 9s? " + count(array, 9));
        System.out.println("location of first 7: " + locate(array, 7));
        System.out.println("location of first 9: " + locate(array, 9));
    }

    public static void print(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int locate(int [] data, int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static int count(int [] data, int value) {
        int frequency = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                frequency++;
            }
        }

        return frequency;
    }

    public static boolean linearSearch(int [] data, int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;

    }
}
