package org.java.practise.General;

import java.math.BigDecimal;
import java.util.Scanner;

public class Multiplication {

	public Multiplication() {
		
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input values:");
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		
		System.out.println(a.multiply(b));
		
		try
		{
			
		}
		finally{
			
		}
		
		
	}
	
	static
	{
		String os = System.getenv("OS");
		if(os != null && os.equalsIgnoreCase("WINDOWS_NT"))
		{
			System.out.println("I am in windows");
		}else
		{
			System.out.println("I am in MAC");
			System.exit(1);
		}
	}
	

}
