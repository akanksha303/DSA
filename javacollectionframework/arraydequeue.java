// Deque = Double Ended Queue
// It allows insertion and deletion from both ends.

package javacollectionframework;

import java.util.ArrayDeque;

public class arraydequeue {

    public static void main(String[] args) {

        // Creating an ArrayDeque of Integer type
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // addFirst() -> Inserts an element at the front of the deque
        dq.addFirst(20);
        dq.addFirst(10);
        System.out.println("After addFirst(): " + dq);

        // addLast() -> Inserts an element at the rear of the deque
        dq.addLast(30);
        dq.addLast(40);
        System.out.println("After addLast(): " + dq);

        // offerFirst() -> Adds an element at the front and returns true if successful
        dq.offerFirst(5);

        // offerLast() -> Adds an element at the rear and returns true if successful
        dq.offerLast(50);

        System.out.println("After offer methods: " + dq);

        // removeFirst() -> Removes and returns the first element, throws exception if empty
        dq.removeFirst();

        // removeLast() -> Removes and returns the last element, throws exception if empty
        dq.removeLast();

        System.out.println("After remove methods: " + dq);

        // pollFirst() -> Removes and returns the first element, returns null if empty
        dq.pollFirst();

        // pollLast() -> Removes and returns the last element, returns null if empty
        dq.pollLast();

        System.out.println("After poll methods: " + dq);

        // getFirst() -> Retrieves the first element without removing it
        System.out.println("First Element: " + dq.getFirst());

        // getLast() -> Retrieves the last element without removing it
        System.out.println("Last Element: " + dq.getLast());

        // peekFirst() -> Retrieves the first element, returns null if deque is empty
        System.out.println("Peek First: " + dq.peekFirst());

        // peekLast() -> Retrieves the last element, returns null if deque is empty
        System.out.println("Peek Last: " + dq.peekLast());

        // size() -> Returns the number of elements in the deque
        System.out.println("Size: " + dq.size());

        // isEmpty() -> Checks whether the deque contains any elements
        System.out.println("Is Empty: " + dq.isEmpty());

        // contains() -> Checks whether a specific element exists in the deque
        System.out.println("Contains 20: " + dq.contains(20));

        // clear() -> Removes all elements from the deque
        dq.clear();

        System.out.println("After clear(): " + dq);
    }
}
