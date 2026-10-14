import java.util.ArrayDeque;
import java.util.Queue;

public class arrayDeque {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.offer(60);
        q1.offer(50);
        q1.offer(5);
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        q1.add(46);
        q1.add(40);
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.size());
        System.out.println(q1.contains(50));
        System.out.println(q1.remove());
        System.out.println(q1.isEmpty());
    }
}
