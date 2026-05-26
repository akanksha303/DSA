package linkedlist;

import java.util.Scanner;

//Static things cannot directly use non-static things
//make object to use the main function

public class singlylinkedlist {

    // 🔹 Make Node static so main can access it
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //to insert linked list
    static class Solution{
        public Node insertAtHead( Node head, int N){
            Node newN = new Node(N, head);
            return newN;
                }
        public void print(Node head){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    Solution sol = new Solution();
    Node head = null;

    // 🔹 Build linked list using insertAtHead
    for (int i = 0; i < n; i++) {
        int x = sc.nextInt();
        head = sol.insertAtHead(head, x);
    }

    // 🔹 Print linked list
    sol.print(head);

    sc.close();
}
