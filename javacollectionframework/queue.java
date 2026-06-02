//The first element inserted is the first one removed.

//Should the OLDEST element be processed first?

//Queue is an interface, not a class.
//The Queue interface defines what operations are allowed:

/*Queue Implementations in Java Collections
LinkedList, ArrayDeque, PriorityQueue, Deque (Double Ended Queue)*/


package javacollectionframework;
import java.util.Queue;
import java.util.LinkedList;

public class queue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // Insert
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q);

        // Front element
        System.out.println(q.peek());

        // Remove
        System.out.println(q.poll());

        System.out.println(q);

        // Size
        System.out.println(q.size());

        // Empty or not
        System.out.println(q.isEmpty());
    }
}

    

