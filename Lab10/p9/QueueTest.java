package Lab10.p9;

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        q1.offer(5);
        q1.offer(3);
        q1.offer(2);
        list.add(5);
        list.add(3);
        list.add(2);
        System.out.println(q1);
        System.out.println("peak is "+ q1.peek());
        System.out.println(q1);
        System.out.println("poll from the head " + q1.poll());
        System.out.println(q1);
        System.out.println(q1.element());
        System.out.println(q1);
        // q1.remove();
        // q1.remove();
        // q1.remove();
        System.out.println(q1.remove());
        // Queue<String> q2 = new LinkedList<>();
        // q2.add("A");
        // q2.add("B");
        // q2.remove();
        // q2.remove();
        // System.out.println(q2);
        // q2.remove();
      
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            int x = listIterator.next();
            System.out.println(x);
        }
    }
}
