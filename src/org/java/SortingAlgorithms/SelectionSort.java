package org.java.SortingAlgorithms;

import static org.java.SortingAlgorithms.InitialVersion.*;

public class SelectionSort {

	public static void main(String[] args) {
		//In place selection sort algorithm
		
		int[] numbers = getInput();
		int n = numbers.length;
		
		for(int j = 1; j < n; j++)
		{
			int index = j-1;
			for(int i = j; i<n; i++)
			{
				if(numbers[index] > numbers[i]){
					index = i;
				}
			}
			swap(numbers, j-1, index);
		}
		
		printOutput(numbers);

	}
	
	

}
