package org.java.practise.SimplePrograms;

import java.util.Scanner;

public class PrimeFactorisation {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		primeFactor(num);
		
		
		sc.close();

	}
	
	private static void primeFactor(int num){
		
		if(num == 1)
			return;
		
		for(int i = 2; i <= num; i++){
		
			if(num%i == 0){
				System.out.print(i+"*");
				primeFactor(num/i);
				break;
			}
			
		}
		
	}

}
