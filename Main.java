package Homework4;

import java.util.Iterator;

public class Main {
	
	public static void transferFromStackToQueue(Stack s, Queue q){
		while(!s.isEmpty()){
		Node temp = s.pop();
		q.enqueue(temp.getName());
		}
	   }
	
	public static void transferFromQueueToStack(Stack s, Queue q){
		 while(!q.isEmpty()){
			 Node temp
		 }
	      
	   }
	
	public static void transferFromStackToStack(){
		  
	       
	   }
	
	   public static void main (String [] args){
		Stack s = new Stack();
		Queue q = new Queue();
		
		s.push("Germaine");
		s.push("Mike");
		s.push("Jamell");
		s.push("Vinny");
		
		q.enqueue("Germaine");
		q.enqueue("Mike");
		q.enqueue("Jamell");
		q.enqueue("Vinny");
		q.print();
		System.out.println("");
		
		q.dequeue();
		q.print();
		System.out.println("");
		
		
		Queue transfer = new Queue();
		transferFromStackToQueue(s, transfer);
		transfer.print();
	
	
		}
}
