package org.java.design.SortingAlgorithms;

import java.util.Scanner;

public class InitialVersion {

	public static void main(String[] args) {
		

	}
	
	public static int[] getInput(){
		System.out.println("No of elements in the array :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Elements:");
		int[] numbers = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			//numbers[i] =  sc.nextInt();
			numbers[i] =  (int) (Math.random() * 100);
			System.out.print(numbers[i] + "\t");
		}
		
		
		
		return numbers;
		
	}
	
	public static void swap(int[] num, int n1, int n2){
		
		int temp = num[n1];
		num[n1] = num[n2];
		num[n2] = temp;
		
	}
	
	public static void printOutput(int[] numbers)
	{
		System.out.println("\n"+"Sorted Array:");	
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + "\t");
		}
	}

}
