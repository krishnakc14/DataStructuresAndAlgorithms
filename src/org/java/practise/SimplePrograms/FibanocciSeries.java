package org.java.practise.SimplePrograms;

import java.util.Scanner;

public class FibanocciSeries {

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
		
	}

}
