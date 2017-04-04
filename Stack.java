package Homework4;

public class Stack {
	
	private Node top = null;

	
	public void push(Node n){
		if(this.isEmpty()){
			this.top = n;
		}
		else{
			n.setNext(top);
			this.top = n;
		}
	}
	
	public boolean isEmpty(){
		return this.top == null;
	}
	
	public Node pop(){
		
	}
	
	public Node peek(){
		return this.top;
	}
	
}
