package sec1.week08;

import java.util.Scanner;

public class PrintfExample {
    public static void main(String[] args) {

        System.out.printf("%s%n","hello");
        String word1 = "hello";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
//        String word2 = in.next();
        String word2 = "world";
        System.out.printf("%s, %s%n", word1, word2);
        System.out.printf("%d%n", 1234);
        System.out.printf("%f%n", 0.1234);
        System.out.printf("%.2f%n", 0.1234);
        System.out.printf("%s: %d sec (%.2f)%n", "Jane", 14, 0.1234);

    }
}
