package sec2.week06;

public class List {
    private int [] data;
    private int size;

    public List() {
        data = new int[10];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void append(int value) {
        if (size == data.length) {
            System.out.println("LIST FULL");
            return;
        }

        data[size++] = value;
    }

    public void insert(int location, int value) {
        // check if space available
        if (size == data.length) {
            System.out.println("LIST FULL");
            return;
        }

        // check if invalid index
        if (location < 0 || location > size) {
            System.out.println(location + " NOT A VALID INDEX");
            return;
        }

        for (int i = size; i > location; i--) {
            data[i] = data[i - 1];
        }
        data[location] = value;
        size++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}
