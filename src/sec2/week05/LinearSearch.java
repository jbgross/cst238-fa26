package sec2.week05;

import java.util.Random;

public class LinearSearch {

    public static void main(String [] args) {
        Random rand = new Random(-7);
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        print(array);
        System.out.println("contains 7? " + linearSearch(array, 7));
        System.out.println("contains 9? " + linearSearch(array, 9));
        System.out.println("location of 7? " + locate(array, 7));
        System.out.println("location of 9? " + locate(array, 9));
        System.out.println("count of 7s? " + count(array, 7));
        System.out.println("count of 2s? " + count(array, 2));
        System.out.println("count of 9s? " + count(array, 9));
    }

    public static int count(int [] data, int searchValue) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
//            if (searchValue == data[i]) {
            if (data[i] == searchValue) {
                count++;
            }
        }
        return count;
    }

    public static int locate(int [] data, int searchValue) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }

    public static boolean linearSearch(int [] data, int searchValue) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchValue) {
                return true;
            }
        }

        return false;
    }

    public static void print(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
