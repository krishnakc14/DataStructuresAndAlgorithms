package org.java.practise.General;

import java.util.*;

public class GameOfThrones {
	
	private static long count = 0;
	
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
       char[] arr = inputString.toCharArray();
       int len = arr.length-1;
        
       for(int j = 0; j < arr.length; j++)
       {
    	    arr = inputString.toCharArray();
    	    swap(arr,0,j);
       		
       		for(int k = 0; k < len; k++)
            {
         	   for(int i = len; i > 1; i--)
                {
                	swap(arr,i,i-1);
                	System.out.println(arr);
                	count++;
                	StringBuffer sb =  new StringBuffer(String.valueOf(arr));
                	if(sb.reverse().toString().equalsIgnoreCase(String.valueOf(arr)))
                	{
                		System.out.println("I got a palindrome here!");
                	}
                	
                }
         	   
            }
       }
      
       System.out.println("Total Count: "+count);
        myScan.close();
    }
    
    private static void swap(char[] arr, int a, int b){
    	char temp = arr[a];
   		arr[a] = arr[b];
   		arr[b] = temp;
    }
    
  
}