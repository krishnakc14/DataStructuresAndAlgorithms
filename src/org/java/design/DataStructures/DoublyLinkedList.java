package org.java.design.DataStructures;

public class DoublyLinkedList {
	
	public Node head;

	public void add(int data)
	{
		if(head == null){
			head = new Node(data);
			head.prev = null;
			return;
		}
		
		Node prev = head;
		Node current = head.next;
		while(current != null){
			prev = current;
			current = current.next;
		}
		
		current = new Node(data);
		prev.next = current;
		current.prev = prev;
		
	}
	
	public void addAsHead(int data)
	{
		
		Node newHead = new Node(data);
		newHead.prev = null;
		
		if(head == null)
		{
			head = newHead;
			head.next = null;
		}
		
		head.prev = newHead;
		newHead.next = head;
		head = newHead;
		
	}

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.addAsHead(100);
		list.add(70);
		list.add(90);
		
		list.print(list.head);
		
		System.out.println("\n Reverse List:");
		list.printReverse(list.head);
		
		System.out.println("\n Reverse List Using Recursion:");
		list.printReverseRecursion(list.head);
		
	}
	
	public void print(Node head)
	{
		Node current = head;
		while(current != null){
			System.out.print(current.value+"\t");
			current = current.next;
		}
		
	}
	
	public void printReverse(Node head)
	{
		
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		
		while(current.prev != null)
		{
			System.out.print(current.value+"\t");
			current = current.prev;
		}
		
	}
	
	public void printReverseRecursion(Node head)
	{
		if(head.next == null)
			return;
		
		if(head.prev != null)
			head = head.next;
		
		printReverse(head);
		
		System.out.print(head.value +"\t");
		
	}
	
	public class Node{
		
		public int value;
		public Node next;
		public Node prev;
		
		
		public Node(int data){
			value = data;
		}
		
	}

}
