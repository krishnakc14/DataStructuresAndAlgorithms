package org.java.practise.Chapter2.LinkedList;

import org.java.design.DataStructures.LinkedList;
import org.java.design.DataStructures.Node;

public class Partition {

public Node head;
	
	public static int k = 5;

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

		Partition list = new Partition();
		list.add(3);
		list.add(6);
		list.add(8);
		list.add(5);
		list.add(10);
		list.add(2);
		list.add(1);
		
		part(list.head);
		
		LinkedList.print(list.head);
		
	}
	
	public static void part(Node node)
	{
		
		while(node != null)
		{
			int val = node.data;
			
			if( val >= k)
			{
				Node curr = node;
				
				while(curr != null)
				{
					if(curr.data < val && curr.data < k)
					{
						int temp = curr.data;
						curr.data = node.data;
						node.data = temp;
						break;
						
					}
					curr = curr.next;
				}
			}
			node = node.next;
		}
	}
}
