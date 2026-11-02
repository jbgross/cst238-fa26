package sec1.week11;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            head.add(data);
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(7);
        ll.add(12);
        ll.add(17);
    }
}

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void add(int data) {
        if (this.next == null) {
            // this is currently the last node
            this.next = new Node(data);
        } else {
            this.next.add(data);
        }
    }
}