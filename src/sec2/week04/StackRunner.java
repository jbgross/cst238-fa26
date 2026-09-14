package sec2.week04;

public class StackRunner {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        System.out.println(s1.isEmpty());
        s1.push(7);
        s1.push(9);
        s1.push(11);
        s1.push(13);
        s1.push(15);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);



//        Stack s2;
//        System.out.println(s2);
//        s2 = s1;
//        int x = 5;
//        int y = x;
//        x = 10;
//        System.out.println(y);
    }
}
