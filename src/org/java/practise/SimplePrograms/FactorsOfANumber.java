package org.java.practise.SimplePrograms;

import java.util.Scanner;

public class FactorsOfANumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//The idea is , the multiples always exist in pairs . On the left hand side of ^n and on the right side
		// And a*b= n ==> b = n/a. So if we find one we can find another. 
		//So its enuf to traverse till ^n
		System.out.println((int)Math.sqrt(num));
		
		for(int i = 1; i <= (int)Math.sqrt(num); i++){
			
			if(num%i ==0){
				int n = num/i;
				System.out.print(i!=n?i+"\t"+n+"\t":i+"\t");
			}
				
		}
		sc.close();
		
	}

}
