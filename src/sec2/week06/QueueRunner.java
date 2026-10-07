package sec2.week06;

public class QueueRunner {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enqueue(7);
        q1.enqueue(14);
        q1.enqueue(21);
        q1.enqueue(28);
        System.out.println(q1);
    }
}
