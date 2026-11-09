package sec2.week12;

public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        System.out.println(ll1.isEmpty());
        ll1.append("jump");
        System.out.println(ll1.isEmpty());
        ll1.append("sprint");
        ll1.append("hello");
        ll1.print();
        System.out.println(ll1.search("jump"));
        System.out.println(ll1.search("hello"));
        System.out.println(ll1.search("ciao"));
    }
}
