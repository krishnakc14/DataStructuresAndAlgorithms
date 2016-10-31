package org.java.practise.DataStructures.Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BalancedPranthesis {
	
	public Node head;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String exp = sc.next();
		BalancedPranthesis b = new BalancedPranthesis();
		sc.close();
		Map<Character,Character> map = new HashMap<Character,Character>();
		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');
		
		int len = exp.length();
		
		for(int i = 0; i < len; i++)
		{
			if(exp.charAt(i) == '{' || exp.charAt(i) == '(' ||
					exp.charAt(i) == '['){
				b.push(exp.charAt(i));
				
			}
			
			if(exp.charAt(i) == '}' || exp.charAt(i) == ')' ||
					exp.charAt(i) == ']'){
				char pop = b.pop();
				
				if(pop=='N' || !map.get(pop).equals(exp.charAt(i))){
					System.out.println("Invalid Expression");
					break;
				}
				
			}
			
		}
		
		if(b.isEmpty())
			System.out.println("Valid Expression!");
		else{
			System.out.println("Invalid Expression");
		}
		
	}
	
	class Node
	{
		char data;
		Node next;
		
		public Node(char data){
			this.data = data;
		}
		
	}
	
	public boolean isEmpty()
	{
		if(head == null)
			return true;
		return false;
		
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
			return 'N';
		}
		
		char value = head.data;
		head = head.next;
		return value;
		
	}
		

}
