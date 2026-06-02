
//Store nodes connected through references.
/*What is a Node?
     A node contains:
       Data
       Reference to next node */




package javacollectionframework;
import java.util.LinkedList;



//NODE
class Node {

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
   }
}



public class linkedlist {
    // head of the list
    Node head;
     

    

    //Creating nodes
    public linkedlist() {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        //Connect them:
        n1.next = n2;
        n2.next = n3;

        // set head to first node
        head = n1;


        //Traversing a Linked List
        Node temp = n1;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
       
        //Insert at Beginning
        Node newNode = new Node(5);
        newNode.next = head;
        head = newNode;

        //Delete First Node
        head = head.next;


       //Delete Last Node
       temp = head;
       while(temp.next.next != null){
             temp = temp.next;
       }
       temp.next = null;


        //Search an Element
        temp = head;
        while(temp != null){
            if(temp.data == 20){
                System.out.println("Found");
           }
           temp = temp.next;
        }
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // add() -> Adds element at the end of the list
        list.add(10);
        list.add(20);
        list.add(30);

        // addFirst() -> Adds element at the beginning of the list
        list.addFirst(5);

        // addLast() -> Adds element at the end of the list
        list.addLast(40);

        System.out.println("List: " + list); // [5, 10, 20, 30, 40]

        // getFirst() -> Returns the first element
        System.out.println("First Element: " + list.getFirst());

        // getLast() -> Returns the last element
        System.out.println("Last Element: " + list.getLast());

        // contains() -> Checks if a specific element exists
        System.out.println("Contains 20? " + list.contains(20));

        // size() -> Returns the number of elements in the list
        System.out.println("Size: " + list.size());

        // isEmpty() -> Checks whether the list is empty
        System.out.println("Is Empty? " + list.isEmpty());

        // removeFirst() -> Removes and returns the first element
        System.out.println("Removed First: " + list.removeFirst());

        // removeLast() -> Removes and returns the last element
        System.out.println("Removed Last: " + list.removeLast());

        System.out.println("After Removals: " + list); // [10, 20, 30]

        // clear() -> Removes all elements from the list
        list.clear();

        System.out.println("After Clear: " + list); // []

        // isEmpty() -> Returns true because the list is now empty
        System.out.println("Is Empty After Clear? " + list.isEmpty());
    }







    }







