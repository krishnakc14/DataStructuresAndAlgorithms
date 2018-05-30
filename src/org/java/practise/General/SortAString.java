package org.java.practise.General;

import java.util.Arrays;
import java.util.Comparator;

public class SortAString {

	public SortAString() {
	}

	public static void main(String[] args) {

		
		String[] s = {"Krish","Anu","Jaanu"};
		
		for(int i = 0; i < s.length; i++)
		{
			Character[] n = new Character[s[i].length()];
			
			for(int j = 0; j <s[i].length(); j++)
			{
				n[j] = s[i].charAt(j);
				
			}
			
			//Sorts the specified array into ascending numerical order.
			//Implementation note: The sorting algorithm is a Dual-Pivot Quicksort by Vladimir Yaroslavskiy,
			//Jon Bentley, and Joshua Bloch. This algorithm offers O(n log(n)) performance on many data sets
			//that cause other quicksorts to degrade to quadratic performance, and is typically faster than traditional 
			//(one-pivot) Quicksort implementations.

			Arrays.sort(n, new Comparator<Character>(){

				@Override
				public int compare(Character o1, Character o2) {

					Character c1 = Character.toLowerCase(o1);
					Character c2 = Character.toLowerCase(o2);
					return c1.compareTo(c2);
				
				}
				
			});
			
			StringBuilder sb = new StringBuilder();
			
			for(char a:n)
			{
				sb.append(a);
			}
			
			s[i] = new String(sb.toString());
			
		}
		
		Arrays.sort(s);
		
		for(String name:s)
		{
			System.out.print(name+"\t");
		}
		
		
	}
	
	class AlphabetComparator implements Comparator<Character>
	{
		
		public int compare(Character s1, Character s2)
		{
			
			return s1.compareTo(s2);
			
		}
		
	}

}
