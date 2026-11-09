package sec1.week12;

public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        System.out.println(ll1.isEmpty());
        ll1.append("hello");
        System.out.println(ll1.isEmpty());
        ll1.append("goodbye");
        ll1.append("ciao");
        ll1.print();
    }
}
