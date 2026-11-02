package sec2.week11;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void prepend(int value) {
        Node newHeadNode = new Node(value);
        newHeadNode.setNext(head);
        head = newHeadNode;
    }

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            head.add(value);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(10);
        ll.add(15);
        ll.add(20);
    }
}

class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public void add(int value) {
        if(next == null) {
            // this is the last Node, so add a new Node here
            next = new Node(value);
        } else {
            next.add(value);
        }
    }

    public void setNext(Node n) {
        next = n;
    }
}