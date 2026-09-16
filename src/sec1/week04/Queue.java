package sec1.week04;

public class Queue {
    private int front;
    private int back;
    private int [] data;
    private static final int DEFAULT_SIZE = 7;

    public Queue() {
//        front = front;
        this.front = 0;
        this.back = 0;
        this.data = new int[DEFAULT_SIZE];
//        DEFAULT_SIZE = 8;
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void enqueue(int value) {
        // check - do I have space?
        int newBack = (back + 1) % data.length;
        if(newBack == front) {
            System.out.println("QUEUE FULL");
            return;
        }

        this.data[back] = value;
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
        return data[front];
    }
}
