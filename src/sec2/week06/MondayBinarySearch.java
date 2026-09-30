package sec2.week06;

import java.util.Arrays;
import java.util.Random;

public class MondayBinarySearch {
    public static void main(String[] args) {
        int [] data = new int[10];
        Random rand = new Random(-7);
        for (int i = 0; i < 10; i++) {
            data[i] = rand.nextInt(0,100);
        }
        print(data);
        Arrays.sort(data);
        print(data);
        System.out.println("location of 7: " +  binarySearch(data, 7));
        System.out.println("location of 62: " +  binarySearch(data, 62));
        System.out.println("location of 78: " +  binarySearch(data, 78));
        System.out.println("location of 300: " +  binarySearch(data, 300));
        System.out.println("location of 34: " +  binarySearch(data, 34));
        System.out.println("location of 3: " +  binarySearch(data, 3));
        System.out.println("location of -3: " +  binarySearch(data, -3));
    }

    public static int binarySearch(int [] a, int searchValue) {
        int lowerBound = 0;
        int upperBound = a.length - 1;
        while(lowerBound <= upperBound) {
            int middleIndex = (lowerBound + upperBound) / 2;
            if (searchValue == a[middleIndex]) {
                return middleIndex;
            } else if(searchValue < a[middleIndex]) {
                // value must be in the first half of the remaining values
                upperBound = middleIndex -1;
            } else {
                // value must be in the second half of the remaining value
                lowerBound = middleIndex + 1;
            }
        }
        return -1;
    }

    public static void print(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
