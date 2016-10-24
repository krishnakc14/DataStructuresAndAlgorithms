package org.java.SortingAlgorithms;

import static org.java.SortingAlgorithms.InitialVersion.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] num = getInput();
		int n = num.length;
		
		for(int i = n; i > 1; i--)
		{
			for(int j = 1; j < i; j++)
			{
				if(num[j-1] > num[j]){
					swap(num, j-1,j);
				}
				
			}
		}
		
		printOutput(num);

	}

}
