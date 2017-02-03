package org.java.practise.Chapter2.LinkedList;

import java.util.HashSet;

import org.java.design.DataStructures.Node;

public class RemoveDuplicates {
	
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
	

	public static void main(String[] args) {

		RemoveDuplicates list = new RemoveDuplicates();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(10);
		list.add(90);
		
		remove(list);
		
	}

	public static void remove(RemoveDuplicates n)
	{
		
		HashSet<Integer> hash = new HashSet<Integer>();
		
		if(n == null)
		{
			System.out.println("Empty List");
			return;
		}
		
		Node curr = n.head;
		hash.add(curr.data);
		
		while(curr.next != null)
		{
			
			if(hash.contains(curr.next.data))
				curr.next = curr.next.next;
			else
				hash.add(curr.next.data);
			
			curr = curr.next;
			
		}
		
		Node cur = n.head;
		while(cur != null)
		{
			System.out.print(cur.data + "\t");
			cur = cur.next;
		}
		
	}
}
