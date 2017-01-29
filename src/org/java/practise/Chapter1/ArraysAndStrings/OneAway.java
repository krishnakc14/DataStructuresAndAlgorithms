package org.java.practise.Chapter1.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class OneAway {
	
	//Find if the two Strings are one edit away ! 
	public static void main(String[] args)
	{
		
		String s1 = "pale";
		String s2 = "pqls";
		int count = 0;
		
		if(Math.abs(s1.length()-s2.length()) < 1)
		{
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			
			if(Math.abs(s1.length()-s2.length()) == 1)
			{
				s1 = s1.length() > s2.length()? s1:s2;
				s2 = s1.length() > s2.length()? s2:s1;
			}
			
			
			for(Character c: s1.toCharArray())
			{
				map.put(c, map.get(c) != null? map.get(c)+1:1);
				
			}
			
			for(Character c: s2.toCharArray())
			{
				map.put(c, map.get(c) != null? map.get(c)-1:1);
				
			}
			
			for(Character c: map.keySet())
			{
				count = count + map.get(c);
			}
			
			
			System.out.println(count > 1?"No !":"Yes");
		}
		else
		{
			System.out.println("No !");
		}
		
		
		
	}
}
