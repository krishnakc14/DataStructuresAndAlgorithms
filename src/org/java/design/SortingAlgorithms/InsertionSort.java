package org.java.design.SortingAlgorithms;

import static org.java.design.SortingAlgorithms.InitialVersion.*;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] num = getInput();
		int n = num.length;
		
/*		for(int i = 1; i < n; i++)
		{
			int key = num[i];
			
			for(int j = i; j > 0; j--)
			{
				if(key < num[j-1]){ 
					swap(num, j-1 ,j);
				}
				
			}
		}
		*/
		//Alternate method
		long init = System.currentTimeMillis();
		for(int i = 1; i < n; i++)
		{
			int key = num[i];
			int j = i;
			
			while(j > 0 && key < num[j-1]){ 
					swap(num, j-1 ,j);
					j = j-1;
				}
				
		}
		long fina = System.currentTimeMillis();
		
		
		
		printOutput(num);
		System.out.println("\nTime diff = "+ (fina-init));

	}

}
