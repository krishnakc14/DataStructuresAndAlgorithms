package org.java.design.DataStructures;

public class Stack {

	int maxSize = 10;
	int[] A = new int[maxSize];
	int top = -1;
	
	public void push(int data)
	{
		if(top == maxSize-1){
			System.out.println("Stack Overflow !");
			return;
		}
		
		top = top +1;
		A[top] = data;
		
	}
	
	public void pop()
	{
		if(top == -1){
			System.out.println("Can't remove from an Empty stack");
			return;
		}
			
		A[top] = 0;
		top = top-1;
		
	}
	
	public boolean isEmpty()
	{
		if(top < 0)
			return true;
		return false;
	}
	
	public int top()
	{
		return A[top];
	}
	
	public static void main(String[] args) {

		Stack st = new Stack();
		st.pop();
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.top());
		st.push(40);
		st.push(50);
		st.push(60);
		st.pop();
		System.out.println(st.top());
		System.out.println(st.isEmpty());
		st.pop();st.pop();st.pop();st.pop();st.pop();st.pop();
		System.out.println(st.isEmpty());
		
	}

}
