package sec2.week06;

public class Queue {
    private int [] data;
    private int front;
    private int back;

    public Queue() {
        data = new int[4];
        front = 0;
        back = 0;
    }

    public boolean isEmpty() {
        return front == back;
    }

    public void enqueue(int value) {
        int nextBack = (back + 1) % data.length;
        if (nextBack == front) {
            System.out.println("QUEUE FULL");
            return;
        }

        data[back] = value;
        back = nextBack;
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("QUEUE EMPTY");
            return;
        }

        front = (front + 1) % data.length;
    }

    public int front() {
        if(isEmpty()) {
            System.out.println("QUEUE EMPTY");
            return -1;
        }

        return data[front];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[front: ").append(front).
                append(", back: ").append(back).append("] ");

        for (int i = front; i != back; i = (i + 1) % data.length)
        {
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}
