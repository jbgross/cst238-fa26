package sec2.week03;

public class List {
    private String [] data;
    private int count;

    public List() {
        this(10);
        System.out.println("empty constructor");
//        data = new String[10];
//        count = 0;
    }

    public List(int size) {
        System.out.println("int constructor");
        data = new String[size];
        count = 0;
    }

    public void prepend(String s) {
        for (int i = count; i > 0; i--) {
            data[i] = data[i - 1];
        }

        data[0] = s;
        count++;
    }


    public void print() {
        System.out.print("[Contents - Count: " + count + "] ");
        for (int i = 0; i < count; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public String foo() {
        return "hello";
    }
}
