package sec1.week09;

public class SelectionSort {
    public static void main(String[] args) {

        int [] data = BubbleSort.generateData(20);
        BubbleSort.print(data);
    }

    public static void partialSelectionSort(int [] a) {
        if (a.length == 0) {
            return;
        }

        int k = 0;
        int smallestIndex = 0;
        int smallestValue = a[smallestIndex];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallestValue) {
                smallestIndex = i;
                smallestValue = a[i];
            }
        }
        // swap
        int temp = a[smallestIndex];
        a[smallestIndex] = a[k];
        a[k] = temp;
    }
}
