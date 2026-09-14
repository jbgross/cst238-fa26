package sec2.week04;

public class Stack {
    private int [] data;
    private int top;
    private static final int DEFAULT_SIZE = 10;

    public Stack() {
        data = new int[DEFAULT_SIZE];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
//        if (top == -1) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public void push(int newData) {
        if (top + 1 >= data.length) {
            System.out.println("STACK FULL");
        } else {
            data[++top] = newData;
        }
    }

    public int top() {
        if(isEmpty()) {
            System.out.println("STACK EMPTY");
            return -1;
        }
        return data[top];
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("STACK EMPTY");
            return;
        }
        top--;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(int i = top; i >= 0; i--) {
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}
