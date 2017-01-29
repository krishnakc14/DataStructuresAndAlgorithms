package org.java.practise.Chapter1.ArraysAndStrings;

public class StringRotataion {

	//Consider you have isSubstring method which returns if a string is a substring of another or not. 
	//With just one call, find if s2 is a rotation of s1
	//s1 = waterbottle s2 = erbottlewat
	
	public static void main(String[] args) {

		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		String s3 = s1+s1;
		
		
		if(s1.length() == s2.length())
			System.out.println(isSubstring(s3, s2));
		else
			System.out.println("false");
		
	}
	
	public static boolean isSubstring(String s1, String s2)
	{
		
		return s1.contains(s2); 
		
	}

}
