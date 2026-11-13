package sec2.week12pt2;

public class LLTester {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println(ll.isEmpty());
        ll.append(4);
        System.out.println(ll.isEmpty());
        ll.append(7);
        ll.append(-5);
        System.out.println(ll);
    }
}
