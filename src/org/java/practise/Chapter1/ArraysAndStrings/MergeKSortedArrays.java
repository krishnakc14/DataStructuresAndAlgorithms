package org.java.practise.Chapter1.ArraysAndStrings;

import java.util.PriorityQueue;

public class MergeKSortedArrays implements Comparable<MergeKSortedArrays> {
	
	int array, index, value;
	
	public MergeKSortedArrays(int array, int index, int value)
	{
		this.array = array;
		this.index = index;
		this.value = value; 
		
	}
	
	@Override
	public int compareTo(MergeKSortedArrays o) {
		if(value > o.value) return 1;
		else if(value < o.value) return -1;
		return 0;
	}

	public static void main(String[] args) {
		
		int[][] arr = {{2,4},{1,3,5},{8, 9, 10, 15}};
		
		int[] res = merge(arr);
		
		for(Integer val : res)
		{
			System.out.print(val+"\t");
		}
		
	}
	
	public static int[] merge(int[][] arr)
	{
		
		PriorityQueue<MergeKSortedArrays> pq = new PriorityQueue<MergeKSortedArrays>();
		int size = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			
			size+=arr[i].length;
			pq.add(new MergeKSortedArrays(i, 0, arr[i][0]));
			
		}
		
		int[] result = new int[size];
		
		for(int i = 0; !pq.isEmpty(); i++)
		{
			MergeKSortedArrays node = pq.poll();
			result[i] = node.value;
			
			int newIndex = node.index + 1;
			if(newIndex < arr[node.array].length)
			{
				pq.add(new MergeKSortedArrays(node.array, newIndex, arr[node.array][newIndex]));
				
			}
			
			
		}
		
		return result;
		
	}

	

}
