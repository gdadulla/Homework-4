/*
 * Germaine Dadulla
 * CSI/CEN 213
 * Professor Magnus
 * April 9, 2017
 * 
 * H4
 */
package Homework4;

public class Node {
	
	private String name;
	private Node next;
	
	public Node(String name, Node n){
		this.name = name;
		this.next = n;
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
