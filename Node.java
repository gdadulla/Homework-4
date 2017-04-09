package Homework4;



public class Node {
	
	private String name;
	private Node next;
	
	public Node(String name){
		this.name = name;
		this.next = null;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public void setNext(Node node){
		this.next = node;
	}
	
	public Node getNext(){
		return next;
	}
	
	public String toString(){
		return "Name: " + this.name;
	}
	
}
