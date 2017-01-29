package org.java.practise.Chapter1.ArraysAndStrings;

public class Palindrome {

	
	//To find if a String is a Palindrome or not
	public static void main(String[] args) {

		System.out.println(paliFind("malayalam"));
	}
	
	public static boolean paliFind(String in)
	{
		int n = in.length();
		
		for(int i = 0, j = n-1; i< n ; i++,j--)
		{
			
			if(in.charAt(i) != in.charAt(j))
				return false;
			
		}
		return true;
		
	}

}
