package StackAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(11);
        queue.add(7);

    System.out.println(queue.peek());
    System.out.println(queue.remove());
    System.out.println(queue.peek());

    
    }
}
