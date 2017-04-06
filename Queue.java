package Homework4;

public class Queue extends Stack{

	private Node bottom = null;
	
	public void enqueue(Node n){
		if(isEmpty()){
			top = bottom = n;
		}
		else{
			bottom.setNext(n);
			bottom = n;
		}
	}
	
	public Node dequeue(){
		if(isEmpty()){
			return null;
		}
		else{
			Node temp = top;
			top = top.getNext();
			return temp;		
		}
	}
	
}
