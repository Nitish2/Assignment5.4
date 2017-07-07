package StackOperations;

/**
 *  Stack operations push, pop, peek without using collections.
 */

import java.util.Stack;

class StackDemo {  //Creating class
	public static void main(String args[]) {
		// Creating stack
		Stack<String> st = new Stack<String>();
        
		// Push operation 
		// Stack follows Last-In-First out approach
		st.push("Nitish");  // Inserting element in the stack at the bottom 
		st.push("Bhawani"); // Inserting element in the stack at second position
		st.push("Vishwas"); // Inserting element in the stack at third position
		st.push("Mithun");  // Inserting element at the top 
		System.out.println("Stack after PUSH operation: " + st);
		
		// checking the top element and prints it
        System.out.println("\nElement at the top is: " + st.peek()); /**Peek operation which returns  
                                                                         the value of the top  
		                                                              **/
        //Pop operation
		st.pop(); //Deleting element from the top 
		st.pop(); //Deleting element from second position
		st.pop(); //Deleting element from third position
		st.pop(); //Deleting element from the bottom 
		System.out.println("\nStack is empty" + st); /**Printing empty stack
		                                               after deleting all elements  
		                                             **/
		

	}

}