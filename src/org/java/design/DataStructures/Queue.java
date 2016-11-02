package org.java.design.DataStructures;

public class Queue {
	
	public Node head;
	public Node rear;
	
	public void enqueue(int data){
		
		if(head == null){
			head = new Node(data);
			rear = head;
			return;
		}
		
		rear.next = new Node(data);
		rear = rear.next;
		
	}
	
	public void deque()
	{
		
		if(head == null){
			System.out.println("Dequeuing from an Empty Queue!");
			return;
		}
		
		head = head.next;
		
	}
	
	public void add(Node node){
		
		if(head == null){
			head = new Node(node);
			rear = head;
			return;
		}
		
		rear.next = new Node(node);
		rear = rear.next;
		
	}
	
	public Node poll()
	{
		
		if(head == null){
			System.out.println("Dequeuing from an Empty Queue!");
			return null;
		}
		Node current = head;
		head = head.next;
		return current.node;
		
	}
	
	public void frontOfQueue(){
		
		if(head == null){
			System.out.println("Empty Queue!");
			return;
		}
		
		System.out.println(head.data); 
		
	}
	
	public void print()
	{
		System.out.println("\n Queue Elements");
		
		if(head == null){
			System.out.println("Empty Queue!");
			return;
		}
		
		Node current = head;
		while(current != null){
			System.out.print(current.data+"\t");
			current = current.next;
		}
			
		
	}
	
	public boolean isEmpty()
	{
		
		if(head == null)
			return true;
		return false;
	}
	
	

	public static void main(String[] args) {

		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.deque();
		q.enqueue(50);
		q.enqueue(60);
		q.frontOfQueue();
		q.print();
		q.deque();
		q.deque();
		q.deque();
		q.deque();
		q.deque();
		q.deque();
		q.print();
		
		
		
	}
	
}
