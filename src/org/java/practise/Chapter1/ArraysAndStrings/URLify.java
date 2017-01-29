package org.java.practise.Chapter1.ArraysAndStrings;

public class URLify {

	public static void main(String[] args) {

		String input = "this is kris      ";
		
		System.out.println(urlify(input));
		System.out.println(urlifyWithoutSb(input));
	}
	
	public static String urlify(String input)
	{
		StringBuffer sb = new StringBuffer();
		input = input.trim();
		for(int i = 0; i < input.length(); i++)
		{
			sb.append(input.charAt(i) == ' '?"%20":input.charAt(i));
		}
		return sb.toString();
	}

	
	public static String urlifyWithoutSb(String input)
	{
		char[] in = new char[input.length()];
		input = input.trim();
		for(int i = 0, k=0; i < input.length(); i++,k++)
		{
			if(input.charAt(i) == ' ')
			{
				in[k] = '%';
				++k;
				in[k] = '2';
				++k;
				in[k] = '0';
			}
			else{
				in[k] = input.charAt(i);
			}
		}
		return String.valueOf(in);
	}
}
