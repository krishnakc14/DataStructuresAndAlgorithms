package org.java.practise.DataStructures.Programs;

import org.java.design.DataStructures.LinkedList;
import org.java.design.DataStructures.Node;

public class ReverseALinkedList {
	
	
	public Node Recursive(Node head)
	{
		
		if(head == null || head.next == null)
			return head;
		
		Node newList = Recursive(head.next);
		
		Node cur = newList;
		while(cur.next != null)
			cur = cur.next;
		cur.next = head;
		head.next = null;
		
		return newList;
		
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
		
		list.print(list.head);
		
		ReverseALinkedList rev = new ReverseALinkedList();

		System.out.println("Reversed List:");
		
		list.print(rev.Recursive(list.head));
		
	}
	
}
