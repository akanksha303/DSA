import java.util.Scanner;
public class singlelinkedlist {

    // Node class represents each node of the linked list
    static class Node {
        int data;   // stores value
        Node next;  // stores address of next node

        // Constructor with data and next node
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        // Constructor with only data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Solution class contains linked list operations
    static class Solution {

        // Function to insert node at head
        public Node insertAtHead(Node head, int value) {

            // Create new node
            Node newNode = new Node(value, head);

            // New node becomes the new head
            return newNode;
        }

        // Function to print linked list
        public void print(Node head) {

            Node temp = head;

            // Traverse linked list
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of nodes
        int n = sc.nextInt();

        Solution sol = new Solution();

        Node head = null;

        // Taking input and inserting at head
        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            head = sol.insertAtHead(head, x);
        }

        // Print linked list
        sol.print(head);

        sc.close();
    }
}