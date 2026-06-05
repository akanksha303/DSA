// HashSet
// Stores unique elements and does not maintain insertion order.

package javacollectionframework;

import java.util.HashSet;

public class HashSets {

    public static void main(String[] args) {

        // Creating a HashSet of Integer type
        HashSet<Integer> set = new HashSet<>();

        // add() -> Adds an element to the set if it is not already present
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate value ignored

        System.out.println("After add(): " + set);

        // remove() -> Removes the specified element from the set
        set.remove(20);

        System.out.println("After remove(): " + set);

        // contains() -> Checks whether a specific element exists in the set
        System.out.println("Contains 10: " + set.contains(10));

        // size() -> Returns the number of elements in the set
        System.out.println("Size: " + set.size());

        // isEmpty() -> Checks whether the set contains any elements
        System.out.println("Is Empty: " + set.isEmpty());

        // addAll() -> Adds all elements from another collection
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(40);
        set2.add(50);

        set.addAll(set2);

        System.out.println("After addAll(): " + set);

        // removeAll() -> Removes all elements that exist in another collection
        set.removeAll(set2);

        System.out.println("After removeAll(): " + set);

        // retainAll() -> Keeps only the elements that exist in another collection
        HashSet<Integer> set3 = new HashSet<>();
        set3.add(10);
        set3.add(60);

        set.retainAll(set3);

        System.out.println("After retainAll(): " + set);

        // iterator() -> Returns an iterator to traverse the set
        System.out.print("Using Iterator: ");

        var it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // clear() -> Removes all elements from the set
        set.clear();

        System.out.println("After clear(): " + set);
    }
}