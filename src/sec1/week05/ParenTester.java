package sec1.week05;

public class ParenTester {
    public static void main(String[] args) {
        String good = "()()(())#";
        System.out.println(good + " " + isMatched(good));
    }

    public static boolean isMatched(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '#') {
                break;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
