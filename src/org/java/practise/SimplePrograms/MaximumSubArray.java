package org.java.practise.SimplePrograms;

import java.util.Scanner;

public class MaximumSubArray {
	//TODO - Find the Solution using Divide and Conquer

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] price = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			price[i] = sc.nextInt();
		}
		
		//To find the Max sub Array - Brute force O(n^2)
		findSum(price,n);
		
		//To find the Max sub Array SUM alone - Brute force O(n^2)
		maxSubArray(price,n);
		
		//To find the Max sub Array SUM and SubArray - Kadanes Algo -  O(n)
		kadanesAlgo(price,n);
		
		//maxSubArrayDivide(price, 0, price.length);
		
		sc.close();
		
	}
	

//Day	 |
//-------|------------------------------------------------------------------
//Price  |100 113 110 85 105 102  86 63 81 101 94 106 101 79 94 90 97
//Change |    13 -3 -25  20 -3  -16 -23 18 20 -7  12 -5 -22  15 -4 7
	
	//13 -3 -25 20 -3 -16 -23 18 20 -7 12 -5 -22 15 -4 7
	
	private static void kadanesAlgo(int[] num, int n)
	{
		
		int total = num[0], current = num[0];
		int startPos =  0, endPos = 0;
		
		for( int i = 1; i < n; i++)
		{
			if(current < 0 && Math.max(num[i], current+num[i]) > 0)
				startPos = i+1;
			
			current = Math.max(num[i], current+num[i]);
			
			if(current > total){
				total = current ;
				endPos = i+1;
			}
		}
		System.out.println("The maximum sub array is from "+startPos+ " to "+endPos+" with value "+total);
		
	}
	
	
	private static void maxSubArray(int[] price, int n)
	{
		int bigsum = 0, sum = 0;
		int start = 0, end = 0;
		
		for(int i = 0; i < n ; i++)
		{
			sum = 0;
			for(int j = i; j < n; j++)
			{
				sum = sum+price[j];
				if(sum > bigsum)
				{
					bigsum = sum;
					start = i+1;
					end = j+1;
				}
			}
		}
		
		System.out.println("The maximum sub array is from "+start+ " to "+end+" with value "+bigsum);
		
	}
	
	
	private static void findSum(int[] price, int n)
	{
		int profit = 0;
		int buyOn = 0, sellOn = 0;
		

		for(int i = 0; i < n; i++){
			
			for(int j = i; j < n; j++)
			{
				if(price[j] - price[i] > profit){
					profit = price[j] - price[i];
					buyOn = i+1;
					sellOn = j+1;
					
				}
				
			}
			
		}
		
		System.out.println("Buy on day "+buyOn + " and Sell on "+sellOn+ " with profit "+profit);
		
	}
	
}
