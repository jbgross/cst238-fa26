package sec1.week04;

public class QueueRunner {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        System.out.println(q1.isEmpty());
        q1.enqueue(21);
        System.out.println(q1.isEmpty());
        System.out.println(q1.front());
        q1.dequeue();
        System.out.println(q1.isEmpty());
        for(int i = 0; i < 10; i++) {
            q1.enqueue(i);
        }

        while(! q1.isEmpty()) {
            System.out.println(q1.front());
            q1.dequeue();
        }
    }
}
