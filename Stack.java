package Homework4;

public class Stack {
	
	//instance variables
	public Node top;

	Stack(){
		top = null;
	}
	
	//push method that addis Nodes to Stack
	public void push(String s){
		Node temp = new Node(s, null);
		
		//if stack is empty top is set to new Node
		if(this.isEmpty()){
			this.top = temp;
		}
		
		//else temp next is set to top and top is set to new Node
		else{
			temp.setNext(this.top);
			this.top = temp;
		}
	}
	
	//isEmpty method that returns if Stack is empty or not
	public boolean isEmpty(){
		return top == null;
	}
	
	//pop method that removes the last Node in Stack
	public Node pop(){
		
		//if Empty return null
		if(this.isEmpty()){
			return null;	
		}
		
		//else temp is set to top and top is set to top.next. Return temp
		else{
			Node temp = this.top;
			this.top = this.top.getNext();
			System.out.println("pop -> " + temp.getName());
			return temp;
		}
	}
	
	//peek method that returns top of Stack
	public Node peek(){
		return this.top;
	}
	
	//print method that traverses Stack and prints
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
