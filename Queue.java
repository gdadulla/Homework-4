package Homework4;

public class Queue{

	public Node bottom;
	public Node top;
	
	Queue(){
		bottom = null;
		top = null;
	}	
	
	public boolean isEmpty(){
		return(top == null);
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
		
	public void enqueue(String s){
		Node temp = new Node(s, null);
		if(this.isEmpty()){
			this.top = temp;
			this.bottom = temp;
	
		}
		else{
			this.bottom.setNext(temp);
			this.bottom = temp;
		}
	}
	
	public Node dequeue(){
		if(this.isEmpty()){
			return null;
		}
		else{
			System.out.println("dequeue -> " + top);
			Node temp = top;
			this.top = top.getNext();
			return temp;
		}
	}

}
