package org.java.practise.CrackingTheCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {

		
		//boolean result = permu("abc", "cbad");
		boolean result = BetterPermutation("abcf", "cfba");
		//boolean result = BestPermutation("abcf", "cdba");
		System.out.println(result?"Yes":"No");
		
	}

	//Brute Force Solution - O(n2)
	public static boolean permu(String s1, String s2)
	{
		
		boolean valueFound = true;
		
		if(s1.length() != s2.length())
			return false;
		
		for(int i = 0; i < s1.length(); i++)
		{
			
			if(valueFound)
			{
				valueFound = false;
				
				for(int j = 0; j < s2.length(); j++)
				{
					
					if(s2.charAt(j) == s1.charAt(i))
					{
						
						StringBuilder s = new StringBuilder(s2);
						s.setCharAt(j, '0');
						s2 = s.toString();
						valueFound = true;
						
					}
					
					
				}
				
			}
			
			else
			{
				return false;
			}
			
		}
		
		return valueFound?true:false;
		
	}
	
	
	//Better approach - O(n log n)
	public static boolean BetterPermutation(String s1, String s2)
	{

		if(s1.length() != s2.length())
			return false;
		
		
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		s1 = new String(c1);
		s2 = new String(c2);
		
		return s1.equals(s2);
		
	}
	
		//Better approach - O(n)
		public static boolean BestPermutation(String s1, String s2)
		{

			if(s1.length() != s2.length())
				return false;
			
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			
			char[] c1 = s1.toLowerCase().toCharArray();
			char[] c2 = s2.toLowerCase().toCharArray();
			
			
			for(char ch: c1)
			{
				
				if(map.get(ch) != null)
					map.put(ch, map.get(ch)+1);
				else
					map.put(ch, 1);
				
			}
			
			for(char ch: c2)
			{
				
				if(map.get(ch) == null)
					return false;
				else
					map.put(ch, map.get(ch)-1);
				
			}
			
			for(char ch : map.keySet())
			{
				if(map.get(ch) != 0)
					return false;
				
			}
			
			return true;
			
			
		}
	
	
	
}
