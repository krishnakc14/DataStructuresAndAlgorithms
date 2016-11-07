package org.java.design.DataStructures;

public class Node {

	public int data;
	public Node next;
	public Node node;
	public Node left;
	public Node right;
	
	public Node(int data){
		this.data = data;
	}
	
	public Node(Node node){
		this.node = node;
	}
	

}
