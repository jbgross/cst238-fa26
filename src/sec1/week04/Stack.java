package sec1.week04;

public class Stack {
    private int [] data;
    private static final int DEFAULT_SIZE = 10;
    private int top;

    public Stack() {
        data = new int[DEFAULT_SIZE];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
//        if(top == -1) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public void push(int newData) {
        if(top >= data.length - 1) {
            System.out.println("STACK FULL");
            return;
        }
//        top++;
//        data[top++] = newData; // WRONG
        data[++top] = newData;
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

//    public void doTheThing


}
