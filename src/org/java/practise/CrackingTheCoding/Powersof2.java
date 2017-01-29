package org.java.practise.CrackingTheCoding;

public class Powersof2 {

	public static int prev = 1;
	
	public static void main(String[] args) {

		System.out.println(power(5));
		
		powerBelow(31);
	}
	
	//To find the power of 2 
	public static int power(int n)
	{
		
		if(n ==1)
			return 2;
		
		prev = power(n/2);
		
		return n%2 ==0? prev*prev:2*prev*prev;
		
	}
	
	
	//To find all the powers of 2 below that number 
	public static int powerBelow(int n)
	{
		
		if(n == 1)
		{
			System.out.println(1);
			return 1;
		}
		
		int cur = powerBelow(n/2);
		
		int prev = 2* cur;
		
		System.out.println(prev);
		
		return prev;
		
	}

}
