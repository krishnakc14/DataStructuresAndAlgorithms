package org.java.practise.General;

import java.io.IOException;
import java.net.MalformedURLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Pattern;

public class FinalVariableCheckForThread implements Runnable {

	
	
	/*public void increment(){
		for(int i = 0; i < 100; i++)
		{
			value++;
			
			System.out.println("Changed by Thread: "+Thread.currentThread().getName()+ " Value: "+value);
		}
	}*/
	
	@Override
	public void run() {
	 int value = 0; 
		
		for(int i = 0; i < 100; i++)
		{
			value++;
			
			System.out.println("Changed by Thread: "+Thread.currentThread().getName()+ " Value: "+value);
		}
		
		
	}
	
	public static void main(String args[]) throws MalformedURLException, IOException, ParseException{
	/*	FinalVariableCheckForThread obj = new FinalVariableCheckForThread();
		FinalVariableCheckForThread obj2 = new FinalVariableCheckForThread();
	//	obj.increment();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();*/
		
		Pattern p = Pattern.compile("[\\s]");
		String[] s = p.split("Hello\nWprls\t!");
		for(String d : s){
			System.out.println(d);
		}
		
NumberFormat n = NumberFormat.getCurrencyInstance(Locale.GERMANY);
n.parse("ggh").doubleValue();
		
	}

}
