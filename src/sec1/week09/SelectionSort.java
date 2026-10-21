package sec1.week09;

public class SelectionSort {
    public static void main(String[] args) {

        int [] data = BubbleSort.generateData(20);
        BubbleSort.print(data);
        selectionSort(data);
        BubbleSort.print(data);
    }

    public static void selectionSort(int[] a) {
        if (a.length == 0) {
            return;
        }

        for (int k = 0; k < a.length - 1; k++) {
            int smallestIndex = k;
            int smallestValue = a[k];
            for (int i = k + 1; i < a.length; i++) {
                if (a[i] < smallestValue) {
//                if (a[i] < a[smallestIndex]) {
                    // do not swap here
                    smallestIndex = i;
                    smallestValue = a[i];
                }
            }


            if (k != smallestIndex){
                int temp = a[smallestIndex];
                a[smallestIndex] = a[k];
                a[k] = temp;
            }
            System.out.print("Iteration " + k + ": ");
            BubbleSort.print(a);
        }
    }
}
