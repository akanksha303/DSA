//A Stack is a linear data structure that follows: LIFO



// ✅ Undo
//✅ Backtracking
//✅ Reverse
//✅ Nested Brackets
//✅ Expression Evaluation
//✅ Next Greater Element
//✅ Previous Greater Element
//✅ Stock Span
//✅ Browser History
//✅ Function Calls
//✅ DFS

import java.util.Stack;


public class stack {

    public static void main(String [] args){
        Stack <String> st = new Stack<>();

        //push()
        //Adds an element to the top.

        st.push("10");
        st.push("20");
        System.out.println(st);

        //pop
        //Removes and returns the top element.
        System.out.println(st.pop());



        //peek()
        //Looks at the top element without removing it.
        System.out.println(st.peek());


        //isEmpty()
        //checks whether the stack contains any elements or not.
        if(st.isEmpty()){
            System.out.println("Empty");


        //size()
        System.out.println(st.size());


        //search()
        //Finds position from top.
        System.out.println(st.search("20"));

     }
    
}
