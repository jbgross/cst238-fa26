package sec2.week08;

public class PrintFExample {
    public static void main(String[] args) {
        System.out.println("hello, world");
        String word1 = "hello";
        String word2 = "world";
        System.out.println(word1 + " " + word2);
        System.out.printf("%s%n", "foo");
        System.out.printf("%s, %s", word1, word2);
        System.out.printf("%d%n", 101);
        System.out.printf("%f%n", 0.1234);
        System.out.printf("%.2f%n", 0.1234);
        System.out.printf("%s: %d sec (%.2f)%n", "Jane", 14, 0.1254);
    }
}
