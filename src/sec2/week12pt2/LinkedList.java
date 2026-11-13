package sec2.week12pt2;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void append(int data) {
        if(this.isEmpty()) {
            head = new Node(data);
        } else{
            Node current = head;
            while(current.hasNext()) {
                // end is NOT the last
                current = current.getNext();
            }
            current.setNext(new Node(data));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node n = head;
        while(n != null) {
            sb.append(n.getData()).append(" ");
            n = n.getNext();
        }
        return sb.toString();
    }
}

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public void setNext(Node n) {
        next = n;
    }

    public Node getNext() {
        return next;
    }
}