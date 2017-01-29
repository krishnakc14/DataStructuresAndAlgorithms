package org.java.practise.Chapter1.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
	
	
	//If string is aabcccccaa --> a2b1c5a2 . If compressed string is longer, return original String

	public static void main(String[] args) {

		String s1 = "aabcccccaa";
		String s2 = "a3b1c5a2";
		unCompress(s2);
		
		System.out.println(StringComp(s1));
		System.out.println(compress(s1));
		
	}
	
	public static String StringComp(String s1)
	{
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s1.length(); i++)
		{
			count++;
			
			if(i+1 >= s1.length() || s1.charAt(i) != s1.charAt(i+1))
			{
				sb.append(s1.charAt(i));
				sb.append(count);
				count = 0;
			}
			
			
		}
		
		return sb.toString().length() > s1.length()? s1:sb.toString();
		
	}
	
	public static String compress(String s1)
	{
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuffer sb = new StringBuffer();
		Character prev = ' ';
		
		for(Character c: s1.toCharArray())
		{
			if(map.isEmpty())
			{
				map.put(c, 1);
				prev = c;
			}
			
			if( c == prev)
			{
				map.put(c, map.get(c)+1);
			}
			
			else
			{
				sb.append(prev);
				sb.append(map.get(prev));
				map.remove(prev);
				map.put(c, 1);
				prev = c;
			}
			
			
		}
		
		sb.append(prev);
		sb.append(map.get(prev));
		
		return sb.toString().length() > s1.length()? s1:sb.toString();
		
	}
	
	public static void unCompress(String s1)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < s1.length(); i = i+2)
		{
			
			for(int j = 0; j < Character.getNumericValue((s1.charAt(i))); j++)
			{
				sb.append(s1.charAt(i-1));
			}
			
		}
		
		System.out.println(sb.toString());
		
	}

}
