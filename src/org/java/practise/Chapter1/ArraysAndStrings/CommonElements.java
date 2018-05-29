package org.java.practise.Chapter1.ArraysAndStrings;

import java.util.HashSet;

public class CommonElements {

	public static void main(String[] args) {

		int[] arr1 = {1, 10, 20 , 50};
		int[] arr2 = {20, 50};
		int b = 0;
		
		for(int i = 0; i < arr1.length; i++)
		{
			if(arr2.length == b)
				break;
			
			for(int j = b; j < arr2.length; j++)
			{
				
				if(arr2[j] == arr1[i])
				{
					b++;
					System.out.println(arr1[i]);
				}
					
				else if(arr2[j] > arr1[i])
				{
					//b++;
					break;
				}
				
			}
		}
		
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for(int i = 0; i < arr1.length; i++)
		{
			hash.add(arr1[i]);
		}
		for(int j = 0; j < arr2.length; j++)
		{
			if(hash.contains(arr2[j]))
				System.out.println(arr2[j]);
			
		}
		
		
		
	}

}
