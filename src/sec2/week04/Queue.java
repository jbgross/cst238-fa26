package sec2.week04;

public class Queue {
    private int [] data;
    private static final int DEFAULT_SIZE = 5;
    private int front;
    private int back;

    public Queue() {
        this(DEFAULT_SIZE);
    }

    public Queue(int size) {
        this.data = new int[size];
        int front = 5;
        this.front = 0;
        this.back  = 0;
    }

    public boolean isEmpty() {
        return this.front == this.back;
    }

    public void enqueue(int newValue) {
        int newBack = (back + 1) % data.length;
        if (newBack == front) {
            System.out.println("QUEUE FULL");
            return;
        }
        data[back] = newValue;
        back = newBack;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("QUEUE EMPTY");
            return;
        }
        front = (front + 1) % data.length;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("QUEUE EMPTY");
            return -9999;
        }
        return data[front];
    }

}
