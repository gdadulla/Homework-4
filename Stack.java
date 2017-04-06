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
		if(this.isEmpty()){
			return null;
		}
		else{
			Node temp = this.top;
			top = top.getNext();
			return temp;
		}
	}
	
	public Node peek(){
		return this.top;
	}
	
	public void print(){
		if(isEmpty()){
			System.out.println("The list is empty");	
		}
		else{
			Node temp = top;
			while(temp != null){
				System.out.println(temp);
				temp = temp.getNext();
			}
		}
	}
	
}
