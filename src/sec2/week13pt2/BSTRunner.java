package sec2.week13pt2;

public class BSTRunner {
    public static void main(String[] args) {
        BST b1 = new BST();
        b1.add("four");
        b1.add("score");
        b1.add("seven");
        b1.add("and");
        BST b2 = b1.add("and").add("years").add("ago");
        if (b1 == b2) {
            System.out.println("samesies");
        } else {
            System.out.println("different");
        }
    }
}


