package org.java.practise.CrackingTheCoding;

import java.util.Scanner;

public class FibanocciSeries {
	
	public int allFibanocci(int n)
	{
		int res = 0;
		int prev = 1;
		
		if(n == 1)
			return 0;
				
		for(int i = 1; i < n; i++)
		{
			System.out.print(res+" ");
			res = res + prev;
			prev = res - prev;
			
		}
		
		//To print all the numbers in Fibanocci
		System.out.println(res);
		return res;
		
	}

	public static void main(String[] args) {

		//1.618- Golden ratio 
		//  |-----------------------------------------|------------------|
		//  A										  B					 C
		//	AC/AB = AB/BC = 1.618
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = (int) ((Math.pow(1.618, (double)n)/Math.sqrt(5) ) + 0.5);
		System.out.println(result);
		sc.close();
		
		FibanocciSeries fb = new FibanocciSeries();
		//To print the Nth number in fibanocci series
		System.out.println(fb.allFibanocci(10));
		
	}

}
