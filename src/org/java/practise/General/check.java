package org.java.practise.General;

public class check {

	public static void main(String[] args) {
		//rollTheString("vwxyz", new int[]{1,2,3,4,5});
		 maxStep(3,3);
	}

	
	 static String rollTheString(String s, int[] roll) {

	        
	        char[] input = new char[s.length()];
	        input = s.toCharArray();
	       
	            
	            for(int j = 0; j < roll.length-1 && j < roll[j]; j++)
	            {
	            	char c1 = input[j];
	            	if(c1 == 'z')
	            		c1 = 'a';
	            	else
	            		c1++;
	 	            input[j] = c1;
	 	            System.out.println(c1);
	            }
	            String s2 = new String(input);
		        System.out.println(s2);
	            
	        
	        
	       
	        return s2;
	    }
	 
	 static int maxStep(int n, int k) {

	        int val = 0;
	        int prev_val = 0;
	        
	        for(int i = 1; i<=n; i++)
	        {
	            prev_val = val;
	            
	            if(val+i == k )
	            {
	            	if(prev_val != 0 && prev_val < i)
		            	val = i;
	            }
	            	
	            else
	                val = val +i;
	        }
	        
	        System.out.println(val);
			return prev_val;

	    }
	 
}
