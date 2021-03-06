package org.java.design.DataStructures;

public class LinkedList {
	
	public Node head;

	public void add(int data)
	{
		if(head == null){
			head = new Node(data);
			return;
		}
		
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		
		current.next = new Node(data);
		
	}
	
	public void addAsHead(int data)
	{
		if(head == null){
			head = new Node(data);
			return;
		}
		
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
		
	}
	
	public void delete(int data)
	{
		
		if(head == null){
			System.out.println("Cannot delete from an Empty List");
			return;
		}
		
		if(head.data == data)
		{
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next != null){
			if(current.next.data == data)
			{
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
		
	}
	
	public void find(int data)
	{
		
		if(head == null){
			System.out.println("Empty List!");
			return;
			
		}
		
		Node current = head;
		int position = 0;
		while(current != null)
		{
			if(current.data == data){
				System.out.println("The data is at position "+position);
				return;
				
			}
			position++;
			current = current.next;
			
		}
		
		System.out.println("Could not find "+data+" in the list");
		
		
	}
	
	public static void print(Node head)
	{
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
	
	public int length()
	{
		
		Node current = head;
		int len = 0;
		while(current != null){
			++len;
			current = current.next;
		}
		
		return len;
	}
	
	public int valueAt(int i)
	{
		int count = 0;
		Node current = head;
		
		while(count < i && current != null)
		{
			current = current.next;
			count = count+1;
		}
		
		return current == null? 0:current.data;
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.addAsHead(100);
		list.add(70);
		list.add(90);
		list.delete(50);
		list.find(90);
		print(list.head);
		System.out.println("List length = "+list.length());
		System.out.println(String.format("Value at %d is "+list.valueAt(5),5));

	}
	

}
