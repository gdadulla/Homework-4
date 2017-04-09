package Homework4;

public class Stack {
	
	public Node top;

	Stack(){
		top = null;
	}
	
	public void push(String s){
		Node temp = new Node(s, null);
		if(this.isEmpty()){
			this.top = temp;
		}
		else{
			temp.setNext(this.top);
			this.top = temp;
		}
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public Node pop(){
		if(this.isEmpty()){
			return null;	
		}
		else{
			Node temp = this.top;
			this.top = this.top.getNext();
			System.out.println("pop -> " + temp.getName());
			return temp;
		}
	}
	
	public Node peek(){
		return this.top;
	}
	
	public void print(){
		if(this.isEmpty()){
			System.out.println("List is empty");	
		}
		else{
			Node temp = this.top;
			while(temp != null){
				System.out.println(temp);
				temp = temp.getNext();
			}
		}
	}
	
}
