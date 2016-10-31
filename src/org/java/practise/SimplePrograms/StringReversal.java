package org.java.practise.SimplePrograms;


public class StringReversal {
	
	Node head;
	
	public void stringReverse(String input)
	{
		int n = input.length();
		for(int i = 0; i < n; i++)
			push(input.charAt(i));
		
		while(n >0){
			System.out.print(pop());
			n--;
		}
		
		
		
	}
	

	public static void main(String[] args) {

		String input = "krishna";
		int n = input.length() -1;
		
		while(n >= 0){
			System.out.print(input.charAt(n));
			n = n-1;
		}
		System.out.println("Stack :");
		StringReversal strRev = new StringReversal();
		strRev.stringReverse(input);
		
	}
	
	class Node
	{
		char data;
		Node next;
		
		public Node(char data){
			this.data = data;
		}
		
	}
	

	
	public void push(char data)
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
	
	public char pop()
	{
		if(head == null)
		{
			System.out.println("Can't remove elements from an Empty stack");
			return 0;
		}
		
		char value = head.data;
		head = head.next;
		return value;
		
	}
		

}
