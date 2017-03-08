package org.java.practise.Chapter2.LinkedList;

import org.java.design.DataStructures.LinkedList;
import org.java.design.DataStructures.Node;

public class SumLists {
	
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

		SumLists list = new SumLists();
		list.add(7);
		list.add(1);
		list.add(6);
		
		SumLists list2 = new SumLists();
		list2.add(5);
		list2.add(9);
		list2.add(2);
		
		int sum = sum(list.head)+sum(list2.head);
		linkedList(sum);
		
		System.out.println("Sum is "+ sum);
		System.out.println("Sum is "+(reverse(list.head)+reverse(list2.head)));
		
	}
	
	//7-->1-->6 + 5-->9-->2 ==> 617+295
	public static int sum(Node node)
	{
		int i = 0, res = 0;
		while(node != null)
		{
			res+=node.data * Math.pow(10, i);
			i++;
			node = node.next;
			
		}
		return res;
	}
	
	//6-->1-->7 + 2-->9-->5 ==> 617+295
	public static double reverse(Node node)
	{
		double i = 0, res = 0;
		while(node != null)
		{
			res+=node.data * Math.pow(10, -i);
			i++;
			node = node.next;
			
		}
		
		res = res*Math.pow(10, i-1);
		
		return res;
	}
	
	public static void linkedList(int val)
	{
		SumLists sum = new SumLists();
		
		while(val != 0)
		{
			int rem = val%10;
			
			sum.add(rem);
				
			val = val/10;
			
		}
		
		LinkedList.print(sum.head);
	}

}
