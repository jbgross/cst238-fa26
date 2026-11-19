package sec2.week13pt2;

public class BST {
    private Node root;

    public BST() {
        root = null;
    }

    public BST add(String s) {
        if (isEmpty()) {
            root = new Node(s);
        } else {
            root.add(s);
        }
//        return new BST();
        return this;
    }

    public boolean isEmpty() {
        return root == null;
    }
}

class Node {
    private String data;
    private Node left;
    private Node right;

    public Node(String s) {
        this.data = s;
        this.left = null;
        this.right = null;
    }

    public void add(String s) {
        int direction = data.compareTo(s);

        if (direction < 0) {
            // data then s, go to the right
            if (hasRight()) {
                right.add(s);
            } else {
                right = new Node(s);
            }
        } else if (direction > 0) {
            // s then data, go to the left
            if (hasLeft()) {
                left.add(s);
            } else {
                left = new Node(s);
            }
        } else {
            // don't keep duplicates
        }
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }
}