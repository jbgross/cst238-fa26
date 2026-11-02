package sec1.week11;

public class RecursiveList {

    private int [] data = {1, 2, 3, 4, 5, 6, 7, 8, 0, 0};
    private int size = 10;


    public void remove(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("bad index: " + pos);
            return;
        }
        leftShift(pos);
        size--;
    }

    private void leftShift(int pos) {
        if(pos == size - 1) {
            // we're done
        } else {
            data[pos] = data[pos + 1];
            leftShift(pos + 1);
        }
    }

    public void print() {
        print(0);
    }

    private void print(int start) {
        if (start == size) {
            System.out.println();
            // print a newline at the end
        } else {
            System.out.print(data[start] + " ");
            print(start + 1);
        }
    }

    public static void main(String[] args) {
        RecursiveList rl = new RecursiveList();
        rl.print();

        rl.remove(4);
        rl.print();
    }
}
