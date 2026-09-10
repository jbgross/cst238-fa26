package sec2.week03;

public class ListRunner {
    public static void main(String[] args) {
        List l1 = new List(2);
        l1.print();
        l1.prepend("hello");
        l1.print();
        l1.prepend("goodbye");
        l1.print();
        l1.prepend("salutations");
        l1.print();
    }
}
