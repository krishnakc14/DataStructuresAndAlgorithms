package org.java.practise.SimplePrograms;

import java.util.Scanner;

public class MatrixMultiplication {
	//TODO: Implement Strassen algorithm for Matrix multiplication

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] a = new int[n][n];
		
		System.out.println("Input A: \n");
		for(int i = 0; i< n; i++){
			
			for(int j = 0; j < n; j++){
				
				a[i][j] = (int) (Math.random() * 5);
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
			
		}
		

		int[][] b = new int[n][n];
		System.out.println("Input B: \n");
		for(int i = 0; i< n; i++){
			
			for(int j = 0; j < n; j++){
				
				b[i][j] =(int) (Math.random() * 5);
				System.out.print(b[i][j]+"\t");
			}
			System.out.print("\n");
			
		}
		
		int[][] c = new int[n][n];
		int sum = 0;
		
		for(int k = 0; k < n; k++)
		{
			for(int i = 0; i< n; i++){
				sum = 0;
				for(int j = 0; j < n; j++){
					
					sum = a[k][j]*b[j][i] + sum;
				}
				
				c[k][i] = sum;
			}
			
		}
		System.out.println("Output C: \n");
		for(int i = 0; i< n; i++){
			
			for(int j = 0; j < n; j++){
				
				System.out.print(c[i][j]+"\t");
			}
			System.out.print("\n");
			
		}
		
		sc.close();
		
	}

}
