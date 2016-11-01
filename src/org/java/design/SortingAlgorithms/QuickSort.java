package org.java.design.SortingAlgorithms;

import static org.java.design.SortingAlgorithms.InitialVersion.*;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] num = getInput();
		quickRecurs(num, 0, num.length-1);
		printOutput(num);

	}
	
	public static void quickRecurs(int[] num, int start, int end)
	{
		if(start >= end){
			return;
		}
		
		int pIndex = quickSort(num, start , end);
		quickRecurs(num, start, pIndex-1);
		quickRecurs(num, pIndex+1, end);
		
	}
	
	public static int quickSort(int[] num, int start, int end)
	{
		int pIndex = start;
		int pivot = num[end];
		
		for(int i = start; i < end; i++){
			if(num[i] <= pivot){
				
				swap(num, i, pIndex);
				pIndex++;
				
			}
		}
		
		swap(num, pIndex, end);
		
		return pIndex;
		
	}
	
	public static int randomizedSort(int[] num, int start, int end)
	{
		Random rn = new Random();
		int ran = rn.nextInt((end-start)+1) + start;
		
		swap(num, ran, end);
		return quickSort(num, start, end);
	}

}
