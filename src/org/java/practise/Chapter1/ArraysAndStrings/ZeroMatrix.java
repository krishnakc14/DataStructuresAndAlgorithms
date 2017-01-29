package org.java.practise.Chapter1.ArraysAndStrings;

public class ZeroMatrix {

	//Write an algorithm such that if an element in MxN matrix is 0, its entire row n column must be set to 0.
	public static void main(String[] args) {

		int M = 4;
		int N = 4;
		int[][] arr = new int[M][N];
				
		int count = 0;
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				 arr[i][j] = count++;
		    }
		}
		
		zero(arr);
		
		for(int i=0; i<M; i++) {
			System.out.println();
			for(int j=0; j<N; j++) {
				 System.out.print(arr[i][j] + "\t");
		    }
		}
		
		
	}
	
	public static void zero(int[][] arr)
	{
		int M = arr.length ;
		int N = arr[0].length;
		int count = 0;
		
		int[] I = new int[M];
		int[] J = new int[N];	
		
		for(int i=0; i<M; i++) {
			
			for(int j=0; j<N; j++) {
				
				 if(arr[i][j] == 0)
				 {
					 I[count] = i;
					 J[count] = j;
					 count++;
				 }
		    }
		
		}
		
		for(int k = 0; k < I.length; k++)
		{
			
			for(int i=0; i<N; i++) {
				arr[I[k]][i] = 0;
			}
			
			for(int j=0; j<M; j++) {
				arr[j][J[k]] = 0;
			}
			
		}

	}
}
