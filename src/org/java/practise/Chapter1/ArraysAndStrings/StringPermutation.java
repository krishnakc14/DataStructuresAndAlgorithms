package org.java.practise.Chapter1.ArraysAndStrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringPermutation {
	
	
	public void permute(char[] input)
	{
		
		Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
		
		for(char ch: input)
		{
			//countMap.compute(ch, (key, val) -> val == null? 1:val+1); Java 8
			
			if(countMap.get(ch) != null)
				countMap.put(ch, countMap.get(ch)+1);
			else
				countMap.put(ch, 1);
			
			
		}
		
		char[] str = new char[input.length];
		char[] result = new char[input.length];
		int[] count = new int[input.length];
		int i = 0;
		
		for(char ch:countMap.keySet())
		{
			System.out.println(String.format("Key = %s, Value = %s", ch, countMap.get(ch)));
			str[i] = ch;
			count[i] = countMap.get(ch);
			i++;
		}
		
		permuteUtil(str, count, result, 0);
		
	}
	
	public void permuteUtil(char[] str, int[] count, char[] result, int level)
	{
		
		if(level == str.length)
		{
			printResult(result);
			return;
		}
		
		for(int i = 0; i < str.length; i++)
		{
			if(count[i] != 0)
			{
				result[level] = str[i];
				count[i]--;
				permuteUtil(str, count, result, level+1);
				count[i]++;
				
			}
			
		}
		
	}
	
	public void printResult(char[] ch)
	{
		
		for(char res:ch)
		{
			System.out.print(res);
		}
		System.out.println();
	}
	
	
	
	//Another approach to the problem ! 
	public void permutation(String s)
	{
		
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < s.length(); i++)
		{
			list = permutationOfString( String.valueOf(s.charAt(i)), list);
		}
		
		Set<String> set = new HashSet<String>(list);
		
		System.out.println(set);
		
		/*for(String ele: list)
		{
			System.out.println(ele);
		}*/
	}
	
	public List<String> permutationOfString(String s, List<String> list)
	{

		StringBuilder sb = new StringBuilder();
		List<String> newList = new ArrayList<String>();
		
		if(s == null)
			return newList;
		
		
		if(list.isEmpty())
		{
			list.add(s);
			return list;
		}
			
		
		for(String ele: list)
		{
			sb.append(ele);
			
			for(int i = 0;i <= ele.length(); i++)
			{
				
				newList.add(insertValueAt(i,ele, s));
				
			}
			
		}
		
		return newList;
	}
	

	private String insertValueAt(int i, String ele, String eleToAdd) 
	{
		return ele.substring(0, i) + eleToAdd + ele.substring(i, ele.length());
	}
	

	public static void main(String[] args) {
		
		StringPermutation sP = new StringPermutation();
		String input = "ABCA";
		sP.permute(input.toCharArray());
		//System.out.println(input.substring(0,1));
		
		sP.permutation("ABCD");
		
		
		
	}

}
