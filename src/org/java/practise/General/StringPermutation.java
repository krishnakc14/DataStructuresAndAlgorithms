package org.java.practise.General;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringPermutation {
	
	
	public void permute(char[] input)
	{
		
		Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
		
		for(char ch: input)
		{
			countMap.compute(ch, (key, val) -> val == null? 1:val+1);
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
	

	public static void main(String[] args) {
		
		StringPermutation sP = new StringPermutation();
		String input = "k";
		sP.permute(input.toCharArray());
		System.out.println(input.substring(0,1));
		
		
		
	}

}
