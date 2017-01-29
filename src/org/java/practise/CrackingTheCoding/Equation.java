package org.java.practise.CrackingTheCoding;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Equation {

	public static int prev = 1;
	public static Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
	
	public static void main(String[] args) 
	{

		computeEquation();
		
		int val = 0;
		
		for(Integer in : map.keySet())
		{
			val = val + map.get(in) * in;
		}
		System.out.println(val);
		
	}
	
	public static void computeEquation()
	{
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int prev = 0;
		int limit = sc.nextInt();
		
		for(int i = 0; i < limit ; i++)
		{
			map.put(sc.nextInt(),0);
			
		}
		
		for(Integer in : map.keySet())
		{
			int val = 0;
			
			if(prev != 0)
			{
				int newIn = in - prev;
				val = (map.get(newIn) != null && map.get(newIn) != 0)? map.get(newIn) * map.get(prev):map.get(prev) * power(num, newIn);
			}
			else
			{
				val = power(num, in);
			}
			
			prev = in;
			map.put(in, val);
			
		}
		sc.close();
		
	}
	
	public static int power(int num, int n)
	{
		
		if(n ==1)
			return num;
		
		prev = power(num, n/2);
		
		return n%2 ==0? prev*prev:num*prev*prev;
		
	}

}
