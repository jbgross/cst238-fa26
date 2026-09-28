package sec1.week06;

import java.util.Arrays;
import java.util.Random;

public class MondayBinarySearch {
    public static void main(String[] args) {
        int [] data = new int[10];
        Random rand = new Random(-7);
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(0, 100);
        }
        print(data);
        Arrays.sort(data);
        print(data);
    }

    public static int binarySearch(int [] a, int searchValue) {
        int lowerBound = 0;
        int upperBound = a.length;
        while(lowerBound <= upperBound) {
            int middleIndex = (lowerBound + upperBound)/2;
            if(a[middleIndex] == searchValue) {
                return middleIndex;
            } else if (searchValue < a[middleIndex]) {
                // value must be in first half
                // so we should change upper bound to restrict to lower half of the
                // remaining possible values
                upperBound = middleIndex - 1;
            } else {
                // value must be in second half
                // so we should change lower bound to restrict to upper half of the
                // remaining possible values
                lowerBound = middleIndex + 1;
            }

        }
//        if(a[middleIndex] == searchValue) {
//            return middleIndex;
//        }
        return -1;
    }

    public static void print(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
