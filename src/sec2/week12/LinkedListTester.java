package sec2.week12;

import sec1.week12.IterativeLinkedList;

public class LinkedListTester {
    public static void main(String[] args) {
        IterativeLinkedList ill = new IterativeLinkedList();
        System.out.println(ill.isEmpty());
        ill.append(7);
        System.out.println(ill.isEmpty());
        ill.append(8);
        ill.append(15);
        ill.append(23);
        ill.append(38);
        System.out.println(ill);


//        LinkedList ll1 = new LinkedList();
//        System.out.println(ll1.isEmpty());
//        ll1.append("jump");
//        System.out.println(ll1.isEmpty());
//        ll1.append("sprint");
//        ll1.append("hello");
//        ll1.print();
//        System.out.println(ll1.search("jump"));
//        System.out.println(ll1.search("hello"));
//        System.out.println(ll1.search("ciao"));
    }
}
