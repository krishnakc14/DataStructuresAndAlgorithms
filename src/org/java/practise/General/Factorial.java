package org.java.practise.General;

public class Factorial {

	public static void main(String[] args) {

		Factorial fact = new Factorial();
		System.out.println(fact.fact(3));
		
		
	}
	
	public int fact(int n)
	{
		if(n == 1)
			return 1;
		
		return n * fact(n-1);
		
	}

}
