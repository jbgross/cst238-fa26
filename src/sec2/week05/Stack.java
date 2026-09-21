package sec2.week05;

public class Stack {
    private int top;
    private char [] data;

    public Stack() {
        top = -1;
        data = new char[10];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char c) {
        if(top >= data.length - 1) {
            System.out.println("STACK FULL");
            return;
        }

        data[++top] = c;
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("STACK EMPTY");
            return;
        }

        top--;
    }

    public char top() {
        if(isEmpty()) {
            System.out.println("STACK EMPTY");
            return 0;
        }

        return data[top];
    }
}
