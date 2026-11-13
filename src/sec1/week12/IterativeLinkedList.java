package sec1.week12;

public class IterativeLinkedList {
    private ItNode head;

    public IterativeLinkedList () {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void append(int data) {
        if(isEmpty()) {
            this.head = new ItNode(data);
        } else {
            ItNode last = head;
            while(last.hasNext()) {
                last = last.getNext();
            }
            // last must be the last ItNode
            // because it has no next
            last.setNext(new ItNode(data));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(isEmpty()) {
            sb.append("Empty");
        } else {
            sb.append(head.data).append(" ");
            ItNode n = head.getNext();
            while (n != null) {
                sb.append(n.data).append(" ");
                n = n.getNext();
            }
        }

        return sb.toString();
    }
}

class ItNode {
    public final int data;
    private ItNode next;

    public ItNode(int data) {
        this.data = data;
        this.next = null;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public ItNode getNext() {
        return next;
    }

    public void setNext(ItNode next) {
        this.next = next;
    }


}