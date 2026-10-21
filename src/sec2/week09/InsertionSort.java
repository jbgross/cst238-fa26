package sec2.week09;

public class InsertionSort {
    public static void main(String[] args) {
        int [] data = BubbleSort.generateData(20);
        BubbleSort.print(data);
        insertionSort(data);
        BubbleSort.print(data);
    }

    public static void insertionSort(int [] a) {
        for (int k = 1; k < a.length; k++) {
            int currentIndex = k;

//            while (currentIndex > 0 && a[currentIndex] < a[currentIndex - 1]) {
//                // swap
//                int temp = a[currentIndex];
//                a[currentIndex] = a[currentIndex - 1];
//                a[currentIndex - 1] = temp;
//                currentIndex--;
//
//            }
            for (int i = currentIndex - 1; i >= 0 && currentIndex >= 0; i--) {
                if (a[currentIndex] < a[i]) {
                    int temp = a[currentIndex];
                    a[currentIndex] = a[i];
                    a[i] = temp;
                    currentIndex--;
                } else {
                    break;
                }
            }
        }
    }
}
