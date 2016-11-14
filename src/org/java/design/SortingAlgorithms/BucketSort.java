package org.java.design.SortingAlgorithms;

import org.java.design.DataStructures.LinkedList;

public class BucketSort {

	public static void main(String[] args) {


		int[] num = InitialVersion.getInput();
		int n = num.length;
		
		int buckets = (int)Math.sqrt(n);
		LinkedList[] list = new LinkedList[buckets];
		System.out.println("");
		
		for(int i = 0; i < n; i++)
		{
			int pos = num[i]/buckets;
			System.out.print(pos+"\t");
			list[pos].add(num[i]);
			
		}
		
		for(int k = 0; k < buckets; k++)
		{
			
			if(!list[k].isEmpty())
			{
				for(int i = 1; i < list[k].length(); i++)
				{
					int key = list[k].valueAt(i);
					int j = i;
					
					while(j > 0 && key < list[k].valueAt(j-1)){ 
							//swap(list[k], j-1 ,j);
							j = j-1;
					}
					
					
				}
				
			}
			
		}
		
	}

}
