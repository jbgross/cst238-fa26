package sec2.week04;

public class QueueRunner {

    public static void main(String[] args) {
        Queue q1 = new Queue();
        for (int i = 0; i < 10; i++) {
            q1.enqueue(i);
        }
        for (int i = 0; i < 10; i++) {
            q1.dequeue();
        }

        System.out.println(q1.isEmpty());
        q1.enqueue(17);
    }
}
