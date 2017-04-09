/*
 * Germaine Dadulla
 * CSI/CEN 213
 * Professor Magnus
 * April 9, 2017
 * 
 * H4
 */
package Homework4;

public class Queue{

	//instance variables
	public Node bottom;
	public Node top;
	
	Queue(){
		bottom = null;
		top = null;
	}	
	
	//enqueue method adds Nodes to queue
	public void enqueue(String s){
		Node temp = new Node(s, null);
		
		//if queue is empty top and bottom are set to new Node
		if(this.isEmpty()){
			this.top = temp;
			this.bottom = temp;
	
		}
		
		//else bottom next is set to new Node and bottom is set to new Node
		else{
			this.bottom.setNext(temp);
			this.bottom = temp;
		}
	}
	
	//dequeue method that removes the first Node in the list
	public Node dequeue(){
		
		//if queue is empty return null
		if(this.isEmpty()){
			return null;
		}
		
		//else temp is set to top and top is set to next Node. return temp
		else{
			System.out.println("dequeue -> " + top);
			Node temp = top;
			this.top = top.getNext();
			return temp;
		}
	}
	//isEmpty method that returns if the Queue is empty
	public boolean isEmpty(){
		return(top == null);
	}
	
	//peek method that returns top
	public Node peek(){
		return this.top;
	}
	
	//print method that traverses Queue and prints
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
