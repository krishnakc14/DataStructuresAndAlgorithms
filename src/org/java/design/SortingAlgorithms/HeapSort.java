package org.java.design.SortingAlgorithms;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class HeapSort<AnyType extends Comparable<AnyType>> {
	
	//Things learnt from Heap Algorithm
	//1. To define AnyType object- String or Integer as the data type
	//2. Traverse Elements and heap Sort
	
	private int size = 0;
	
	private int CAPACITY = 10;
	
	
	AnyType[] arr = (AnyType[]) new Comparable[CAPACITY];
	
	
	private int getleftChildindex(int parentIndex){return 2*parentIndex +1;}
	private int getRightChildindex(int parentIndex){return 2*parentIndex +2;}
	private int getParentindex(int childIndex){return (childIndex - 1)/2;}
	
	private boolean hasleftChild(int parentIndex){return size>2*parentIndex +1;}
	private boolean hasRightChild(int parentIndex){return size>2*parentIndex +2;}
	private boolean hasParent(int childIndex){return size >= (childIndex - 1)/2;}
	
	private AnyType getleftChild(int parentIndex){return arr[2*parentIndex +1];}
	private AnyType getRightChild(int parentIndex){return arr[2*parentIndex +2];}

	
	private void swap(AnyType[] arr, int k , int index)
	{
		AnyType temp = arr[k];
		arr[k] = arr[index];
		arr[index] = temp;
		
	}
	
	private void ensureCapacity()
	{
		if(size == CAPACITY)
		{
			arr = Arrays.copyOf(arr, CAPACITY*2);
			CAPACITY *= 2;
		}
		
	}
	
	
	
}
