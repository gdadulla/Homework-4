package Homework4;

public class Main {
	
	//method that transfers a Stack to a Queue
	public static void transferFromStackToQueue(Stack s, Queue q){
		
		//while stack is not empty
		while(!s.isEmpty()){
			
			//temp variable is set to what the stack pops
			Node temp = s.pop();
			
			//enqueues the temp
			q.enqueue(temp.getName());
		}
	}
	
	//method that transfers Queue to Stack
	public static void transferFromQueueToStack(Stack s, Queue q){
		
		//while stack is not empty
		while(!q.isEmpty()){
			
			//temp variable is set to what queue dequeues
			 Node temp = q.dequeue();
			 
			 //pushes the temp
			 s.push(temp.getName());
		 }
	 }

	//method that transfers Stack to another Stack
	public static void transferFromStackToStack(Stack s, Stack s2){
		  
		//while s is not empty
		while(!s.isEmpty()){
			
			//temp variable set to what s pops
			Node temp = s.pop();
			
			//s2 pushes temp 
			s2.push(temp.getName());
		}
	}
	
	   public static void main (String [] args){
		Stack s = new Stack();
		Stack s2 = new Stack();
		Queue q = new Queue();
		
		s.push("Germaine");
		s.push("Mike");
		s.push("Jamell");
		s.push("Vinny");
		
		s2.push("Germaine");
		s2.push("Mike");
		s2.push("Jamell");
		s2.push("Vinny");
		
		q.enqueue("Germaine");
		q.enqueue("Mike");
		q.enqueue("Jamell");
		q.enqueue("Vinny");
		
		Queue transfer = new Queue();
		transferFromStackToQueue(s, transfer);
		transfer.print();
		System.out.println("--------");
		
		Stack transfer2 = new Stack();
		transferFromQueueToStack(transfer2, q);
		transfer2.print();
		System.out.println("--------");
		
		Stack transfer3 = new Stack();
		transferFromStackToStack(s2, transfer3);
		transfer3.print();
		System.out.println("--------");
	
	
	
		}
}
