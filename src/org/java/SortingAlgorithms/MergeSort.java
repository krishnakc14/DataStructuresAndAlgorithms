package org.java.SortingAlgorithms;

import static org.java.SortingAlgorithms.InitialVersion.*;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] num = getInput();
		
		mergeSort(num);
		
		printOutput(num);

	}
	
	public static void mergeSort(int[] num){
		
		int n = num.length;
		if(n < 2)
			return;
		
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		
		for(int i = 0; i < mid; i++){
			left[i] = num[i];
		}
		
		for(int i = mid, j=0; i < n; i++,j++){
			right[j] = num[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, num);
		
	}
	
	public static void merge(int[] left,int[] right,int[] num){
		
		int i = 0, j = 0, k=0; 
		
		while(i<left.length && j<right.length){
			
			if(left[i]<right[j]){
				num[k] = left[i];
				i++;
			}
			else{
				num[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length){
			num[k] = left[i];
			i++; k++;
		}
		
		while(j<right.length){
			num[k] = right[j];
			j++; k++;
		}
	}
	
	
}