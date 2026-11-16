package sec1.week13;

public class BST {
    private Node root;

    public BST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void add(int data) {
        if (isEmpty()) {
            this.root = new Node(data);
        } else {
            this.root.add(data);
        }
    }
}

class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    private boolean hasLeft() {
        return this.left != null;
    }

    private boolean hasRight() {
        return this.right != null;
    }

    public void add(int data) {
        if(data <= this.data) {
            // smaller, goes to the left
            if (this.left == null) {
               // no left child
               this.left = new Node(data);
            } else {
                // there is a left child
                this.left.add(data);
            }
        } else {
            // equal to or larger
            if (hasRight()) {
                this.right.add(data);
            } else {
                this.right = new Node(data);
            }

        }
    }

}