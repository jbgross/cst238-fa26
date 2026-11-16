package sec1.week13;

import java.util.Random;

public class BSTTester {
    public static void main(String[] args) {
        BST b1 = new BST();
        Random rand = new Random(-7);
        for (int i = 0; i < 20; i++) {
            int x = rand.nextInt(43);
            b1.add(x);
        }
    }
}
