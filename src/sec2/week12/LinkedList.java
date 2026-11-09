package sec2.week12;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void append(String data) {
        if (isEmpty()) {
            head = new Node(data);
        } else {
            head.append(data);
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty LinkedList");
        } else {
            head.print();
        }
    }

    public boolean search(String value) {
        if (isEmpty()) {
            return false;
        } else {
            return head.search(value);
        }
    }

}

class Node {
    private String data;
    private Node next;

    public Node (String data) {
        this.data = data;
        this.next = null;
    }

    public boolean hasNext() {
        return next != null;
    }

    public void append(String data) {
        if (hasNext()) {
            next.append(data);
        } else {
            // no next node, so this is the LAST Node
            next = new Node(data);
        }
    }

    public void print() {
        if (hasNext()) {
            System.out.print(data + " ");
            next.print();
        } else {
            System.out.println(data);
        }
    }

    public boolean search(String value) {
        if (data.equals(value)) {
            return true;
        } else if (next == null) {
            // I don't have a match for value
            // and there are no more nodes
            return false;
        } else {
            return next.search(value);
        }
    }

}