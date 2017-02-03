package org.java.practise.Chapter2.LinkedList;

import org.java.design.DataStructures.Node;

public class KthToLastElement {
	
	//Find the Kth to Last element in a Singly Linked List .
	
	public Node head;
	
	public static int k = 0;

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

	public static void main(String[] args) {

		KthToLastElement list = new KthToLastElement();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(90);
		
		element(list.head);
		magicSolution(list.head);
		
	}
	
	//Recurssion ! 
	public static int element(Node node)
	{
	
		if(node.next == null)
		{
			if(k == 0)
				System.out.println("The Element is "+node.data);
			return 0;
		}
		
		int index = element(node.next) + 1;
		
		if(index == k)
			System.out.println("The Element is "+node.data);
		
		return index;
		
	}
	
	//Better Solution !!!! 
	//The idea here is to have 2 pointers p1 and p2.
	//Both p1 and p2 now point to the head node
	//Make p1 travel k spaces initially through the list.
	//Then travesrse p1 and p2 equally now. Remember p1 starts from Kth position and p2 frm head
	//When p1 hits the end, p2 is at the element we are looking for !
	//Holaaaa. Magic !!!!!
	
	public static void magicSolution(Node node)
	{
		
		Node p1 = node;
		Node p2 = node;
		
		for(int i = 0; i < k ; i++)
		{
			
			if(p1 == null)
				break;
			
			p1 = p1.next;
		}
		
		while(p1.next != null)
		{
			p1 = p1.next;
			p2 = p2.next;
		}
		
		System.out.println("The Element you are lookin for is "+p2.data);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
