package org.java.practise.Chapter1.ArraysAndStrings;

public class RotateMatrix {
	
	//Given an image represented by NxN matrix, write a method to rotate the image by 90 degrees
	

	public static int temp = 0;
	
	public static void main(String[] args) {

		int N = 2;
		int[][] arr = new int[N][N];
				
		int count = 1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				 arr[i][j] = count++;
		    }
		}
		
		rotate(arr);
		
		for(int i=0; i<N; i++) {
			System.out.println();
			for(int j=0; j<N; j++) {
				 System.out.print(arr[i][j] + "\t");
		    }
		}
		
	}
	
	private static void rotate(int[][] arr)
	{
		int N = arr.length - 1;
		int M , K , L = 0;
		
		
		for(int i = N; i>0; i--)
		{
			M = N - i;
			
			for(int j = i; j > 0 ; j --)
			{
				K = j; L = N - j;
				
				temp = arr[i][K];
				
				swap(arr[K][M], arr, K, M);
				
				swap(arr[M][L], arr, M , L);
				
				swap(arr[L][i], arr, L , i);
				
				swap(arr[i][K], arr, i , K);
				
			}
		}
	}
	
	private static void swap(int arrVar, int[][] arr, int i, int j)
	{
		arr[i][j] = temp;
		temp = arrVar;
		
	}

}
