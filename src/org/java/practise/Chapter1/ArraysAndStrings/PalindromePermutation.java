package org.java.practise.Chapter1.ArraysAndStrings;

import java.util.HashMap;

public class PalindromePermutation {
	
	//Basic idea here is - A string to be a permutation of a palindrome, 
	//it can have no more than one character that is odd. 
	
	private static HashMap<Character, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		
		System.out.println(palindrome("kaaak"));
		
	}
	
	public static boolean palindrome(String input)
	{
		int count = 0; 
		
		for(int i = 0; i < input.length(); i++)
		{
			map.put(input.charAt(i), map.get(input.charAt(i)) != null?map.get(input.charAt(i))+1:1);
		}
		
		for(Character c: map.keySet())
		{
			if(map.get(c) ==1 || (map.get(c) % 2 != 0 && count == 0))
				count++;
			else if(map.get(c) % 2 != 0 && count >=1)
				return false;
		}
		
		if(count > 1)
			return false;
		
		return true;
		
	}

}
