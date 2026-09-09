package sec1.week03;

public class List {
    private String [] data;
    private int count;
    private String name;

    public List() {
//        data = new String[10];
//        count = 0;
        this(10);
        System.out.println("empty constructor");
    }

    public List(int length) {
        System.out.println("one-parameter constructor");
        this.data = new String[length];
        this.count = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print("[number of elements: " + count + "]: ");
        for (int i = 0; i < count; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void prepend(String s) {
        // shift one to the right
        for (int i = count; i > 0; i--) {
            data[i] = data[i - 1];
        }
        data[0] = s;
        count++;
    }

}
