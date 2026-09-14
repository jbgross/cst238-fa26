package sec1.week04;

public class StackRunner {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        System.out.println(s1.isEmpty());
        s1.push(5);
        System.out.println(s1.top());
        System.out.println(s1.top());
        System.out.println(s1.top());

//        Stack s2 = null;
//        System.out.println(s2);
//        s2 = s1;
//        int x = 5;
//        int y = x;
//        x = 10;
//        System.out.println(y);
    }
}
