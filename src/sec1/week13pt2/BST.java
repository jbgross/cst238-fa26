package sec1.week13pt2;

public class BST {
    private Node root;

    public BST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public BST add(String s) {
        if (isEmpty()) {
            root = new Node(s);
        } else {
            root.add(s);
        }
        return this;
    }

}

class Node {
    private String data;
    private Node left;
    private Node right;

    public Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void add(String s) {
        int direction = this.data.compareTo(s);
        if (direction < 0) {
            // s has to go to the right
            if (hasRight()) {
                right.add(s);
            } else {
                right = new Node(s);
            }
        } else if (direction > 0) {
            // s has to go to the left
            if (hasLeft()) {
                left.add(s);
            } else {
                left = new Node(s);
            }
        } else {
            // strings are equal, so ignore (do not add duplicates)

        }
    }

    public boolean hasRight() {
        return right != null;
    }

    public boolean hasLeft() {
        return left != null;
    }
}
