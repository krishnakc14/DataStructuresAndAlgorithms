package org.java.practise.SimplePrograms;

import java.util.Scanner;

public class EuclidsAlgorithmGCD {
	
	//Euclids algorithm states that GCD can be obtained by dividing highest number with lowest
	//and taking the remainder to divide the divisor again until remainder is 0.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1>num2)
			computeGCD(num1,num2);
		else
			computeGCD(num2,num1);
		
		computeGCDwithWhile(num1,num2);
		System.out.println(2%7);
		
		sc.close();
		
	}
	
	private static void computeGCD(int n1 , int n2)
	{
		if(n2 == 0){
			System.out.println("GCD is "+n1);
			return;
		}
		
		computeGCD(n2,n1%n2);
	}
	
	private static void computeGCDwithWhile(int n1 , int n2)
	{
		
		while(n2 != 0){
			int temp = n1%n2;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println("GCD is " + n1);
		
	}

}
