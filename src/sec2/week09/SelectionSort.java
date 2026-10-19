package sec2.week09;

public class SelectionSort {
    public static void main(String[] args) {
        int [] data = BubbleSort.generateData(20);
        BubbleSort.print(data);
        partialSelectionSort(data);
        BubbleSort.print(data);
        int x = 0;
        for (int i = 0; i < 1000000; i++) {
            x++;
        }
        System.out.println(x);

    }

    public static void partialSelectionSort(int [] a) {
        if (a.length == 0) {
            return;
        }

        int smallestIndex = 0;
        int smallestValue = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallestValue) {
                // do not swap here
                smallestIndex = i;
                smallestValue = a[i];
            }
        }

        int temp = a[smallestIndex];
        a[smallestIndex] = a[0];
        a[0] = temp;
    }
}
