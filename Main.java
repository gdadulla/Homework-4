package Homework4;


public class Main {
	
	public static void main (String [] args){
		Stack s = new Stack();
		Queue q = new Queue();
		Node node = new Node("Germaine");
		Node node2 = new Node("Mike");
		Node node3 = new Node("Jamell");
		Node node4 = new Node("Vinny");
		
		s.push(node);
		s.push(node2);
		s.push(node3);
		s.push(node4);
		s.print();
		System.out.println("");
		
		s.pop();
		s.print();
		
	
	
		}
}
