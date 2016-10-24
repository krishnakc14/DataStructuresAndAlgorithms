package org.java.practise.SimplePrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	//0 and 1 are not prime numbers . 2 is a composite prime

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int[] primes = new int[number+1];
		
		if(isPrineNumber(number))
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime");
		
		//Sieve of Erotosthenes
		
		for(int i = 0; i < number; i++){
			primes[i] = 1;
			if(isPrineNumber(i))
				System.out.print(i+"\t");
			
		}
		
		for(int i = 0; i <= number; i++){
			primes[i] = 1;
		}
		
		primes[0] = 0;
		primes[1] = 0;
		
		for(int i = 2; i <= (int) Math.sqrt(number); i++){
			if(primes[i] == 1){
				for(int j = 2; i*j <= number; j++){
					primes[i*j] = 0;
				}
			}
		}
		
		System.out.println("\nPrimes for Sieve");
		for(int i = 0; i < primes.length; i++){
			if(primes[i] != 0)
				System.out.print(i+"\t");
		}
		
		//End sieve
		
	}
	
	public static boolean isPrineNumber(int number){
		
		int n = (int) Math.sqrt(number);
		
		for(int i = 2; i <= n; i++){
			if(number%i == 0){
				return false;
			}
		}
		return true;
	}

}

