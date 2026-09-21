package sec2.week05;

public class ParenTest {

    public static void main(String[] args) {
        String good = "()()#";
        System.out.println(good + " " + isBalance(good));
//        Stack stack = new Stack();
//        for(char c = 'A'; c < 'G'; c++) {
//            stack.push(c);
//        }
//
//        while(! stack.isEmpty()) {
//            System.out.println(stack.top());
//            stack.pop();
//        }
    }

    public static boolean isBalance(String input) {
        Stack stack = new Stack();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '#') {
                break;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
