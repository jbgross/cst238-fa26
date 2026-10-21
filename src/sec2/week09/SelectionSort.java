package sec2.week09;

public class SelectionSort {
    public static void main(String[] args) {
        int [] data = BubbleSort.generateData(20);
        BubbleSort.print(data);
        selectionSort(data);
        BubbleSort.print(data);
//        int x = 0;
//        for (int i = 0; i < 1000000; i++) {
//            x++;
//        }
//        System.out.println(x);

    }

    public static void selectionSort(int [] a) {
//        if (a.length == 0) {
//            return;
//        }

        for (int currentIndex = 0; currentIndex < a.length - 1; currentIndex++) {
            int smallestIndex = currentIndex;
//        int smallestValue = a[0];
            for (int i = currentIndex + 1; i < a.length; i++) {
                if (a[i] < a[smallestIndex]) {
                    // do not swap here
                    smallestIndex = i;
//                smallestValue = a[i];
                }
            }

            if (smallestIndex != currentIndex) {
                int temp = a[smallestIndex];
                a[smallestIndex] = a[currentIndex];
                a[currentIndex] = temp;
            }
            System.out.print("Iteration " + currentIndex + ": ");
            BubbleSort.print(a);
        }
    }
}
