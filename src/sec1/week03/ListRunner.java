package sec1.week03;

public class ListRunner {
    public static void main(String[] args) {
        List l1 = new List(2);
        System.out.println("printing the array");
        l1.print();
        l1.prepend("hello");
        l1.print();
        l1.prepend("goodbye");
        l1.print();
        l1.prepend("uh");
        l1.print();
        l1.prepend("breaking!");
        l1.print();

    }
}
