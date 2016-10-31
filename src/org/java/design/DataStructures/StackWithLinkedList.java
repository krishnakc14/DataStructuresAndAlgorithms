package org.java.design.DataStructures;

public class StackWithLinkedList {
	
	Node head;
	
	public void push(int data)
	{
		
		if(head == null)
		{
			head = new Node(data);
			return;
		}
		
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
		
	}
	
	public void pop()
	{
		if(head == null)
		{
			System.out.println("Can't remove elements from an Empty stack");
			return;
		}
		
		System.out.println("Element removed"+head.data);
		head = head.next;
		
		
	}
	
	public int top(){
		
		if(head == null)
		{
			System.out.println("Can't remove elements from an Empty stack");
			return -1;
		}
		
		return head.data;
	}
	
	public boolean isEmpty()
	{
		if(head == null)
			return true;
		return false;
		
	}

	public static void main(String[] args) {

		StackWithLinkedList st = new StackWithLinkedList();
		st.pop();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.top());
		st.push(40);
		st.push(50);
		st.push(60);
		st.pop();
		System.out.println(st.top());
		System.out.println(st.isEmpty());
		st.pop();st.pop();st.pop();st.pop();st.pop();st.pop();
		System.out.println(st.isEmpty());
		
	}

	
	class Node
	{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}
		
	}
	
}
