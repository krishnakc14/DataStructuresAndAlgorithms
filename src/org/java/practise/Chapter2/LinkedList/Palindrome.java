package org.java.practise.Chapter2.LinkedList;

import org.java.design.DataStructures.Node;

public class Palindrome {

	//Check if the linked list is a palindrome 
	
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

	//Solution 1 
	//Reverse the linked list and check 
	public static boolean reverse(Node current)
	{
		Node head = null;
		Node forward = current;
		
		while(current != null)
		{
			Node node = new Node(current.data);
			node.next = head;
			head = node;
			current = current.next;
			
		}
		
		
		Node reverse = head;
		
		while(forward != null && reverse != null)
		{
			
			if(forward.data != reverse.data)
				return false;
			
			forward= forward.next;
			reverse = reverse.next;
			
		}
		
		return true;
		
	}
	
	//Solution 2 - Iterative method
	public static boolean iterative(Node current)
	{
		
		while(current != null)
		{
			int value = current.data;
			Node runner = current;
			
			while(runner.next != null)
			{
				if(runner.next.next == null)
				{
					value = runner.next.data;
					runner.next = null;
				}
				else
					runner = runner.next;
			}
			
			if(current.data != value)
				return false;
			
			current = current.next;
		}
		
		return true;
	}
	
	
	//Solution 3 - Recurssion
	public Interim recursion(Node current, Node recurs)
	{
		
		if(recurs == null)
			return new Interim(current, recurs, true);
		
		Interim interim = recursion(current, recurs.next);
		
		interim.res = interim.res && (recurs.data == interim.current.data);
		
		return new Interim(current.next, recurs, interim.res);
		
	}
	
	
	public static void main(String[] args) {

		Palindrome list = new Palindrome();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(10);
		//list.add(90);
		
	//	System.out.println(reverse(list.head));
		//System.out.println(iterative(list.head));
		System.out.println(list.recursion(list.head, list.head).res);
		
	}
	
	
}

class Interim
{
	
	public Node current;
	public Node recurs;
	public boolean res;
	
	public Interim()
	{
		
	}
	
	public Interim(Node current, Node recurs, boolean res)
	{
		this.current = current;
		this.recurs = recurs;
		this.res = res;
		
	}
	
}

