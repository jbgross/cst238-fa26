package sec2.week13;

public class BST {
    private Node root;

    public BST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if(isEmpty()) {
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
        return left != null;
    }

    private boolean hasRight() {
        return right != null;
    }

    public void add(int data) {
        if (data <= this.data) {
            // must go to the left

            if(this.left == null) {
                // make this data into our left node
                left = new Node(data);
            } else {
                left.add(data);
            }

        } else {
            // must go to the right
            if (hasRight()) {
                right.add(data);
            } else {
                right = new Node(data);
            }
        }
    }
}
