//Smallest element gets highest priority by default.

package javacollectionframework;
import java.util.Collections;
import java.util.PriorityQueue;

import javax.swing.text.View;



public class priorityqueue {
    public priorityqueue(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        //Insert element
        //add()
        pq.add(10);
        pq.add(5);
        pq.add(20);

        //offer()
        //add()	offer()
        //Throws exception if insertion fails	
        //Returns false if insertion fails
        pq.offer(40);

        System.out.println(pq);


        //peek()
        //View highest priority element without removing.
        System.out.println(pq.peek());


        //poll()
        //Remove highest priority element.
        System.out.println(pq.poll());

        //remove()
        //Also removes highest priority element.
        pq.remove();

        
        // poll()
        pq.remove();

        //Difference:
        // poll()	remove()
        // Returns null if empty	
        // Throws exception if empty

        //size()
        System.out.println(pq.size());

        //isEmpty()
        System.out.println(pq.isEmpty());

        //Max Heap Priority Queue
        PriorityQueue<Integer> st = new PriorityQueue<>(Collections.reverseOrder());

        }

}
