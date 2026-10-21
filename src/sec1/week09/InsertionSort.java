package sec1.week09;

public class InsertionSort {
    public static void main(String[] args) {
        int [] a = BubbleSort.generateData(20);
        BubbleSort.print(a);
        insertionSort(a);
        BubbleSort.print(a);

    }

    public static void insertionSort(int [] a) {
        for (int k = 1; k < a.length; k++) {
            int currentIndex = k;
            for (int i = currentIndex - 1; i >= 0; i--) {
                if (a[currentIndex] < a[i]) {
                    // swap
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
