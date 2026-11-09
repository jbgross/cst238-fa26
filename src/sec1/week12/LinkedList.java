package sec1.week12;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Empty";
        } else {
            StringBuilder sb = new StringBuilder();

            return sb.toString();
        }
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
            System.out.println("Empty Linked List");
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

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public String getData() {
        return data;
    }

    public void append(String data) {
        // find the last node
        if (hasNext()) {
            // this is NOT the last node
            next.append(data);
        } else {
            // this IS the last node
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

    public void toString(StringBuffer sb) {
        if (hasNext()) {
            sb.append(data).append(" ");
             next.toString(sb);
        } else {
            sb.append(data).append("\n");
        }
    }

    public boolean search(String value) {
        if (this.data.equals(value)) {
            return true;
        } else if (! hasNext()) {
            return false;
        } else {
            return next.search(value);
        }
    }
}