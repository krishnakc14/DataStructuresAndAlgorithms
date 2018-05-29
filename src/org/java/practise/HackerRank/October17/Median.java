package org.java.practise.HackerRank.October17;

import java.util.*;

public class Median {
    
    public static int size = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            size++;
           
        }
        
        buildHeap(a);
        
        System.out.println("Heapified Structure!");
        
        for(int a_i=0; a_i < size; a_i++){
           System.out.print(a[a_i]+"\t");
        }
        in.close();
    }
    
    public static void buildHeap(int[] a)
    {
        
       for(int k = size/2; k > 0; k--)
       {
    	   heapify(k-1,a);
       }
       
      
       
        
    }
    
    public static void heapify(int k, int[] a)
    {
    
        int index = getSmaller(k, a);
        
        if(a[k] > a[index])
            swap(a, k, index);
        
    }
    
    public static int getSmaller(int k, int[] a)
    {
        int index = 0;
        
        if(size < k)
        {
            return 0;
        }
        
         if(k*2+1 < size && k*2+2 < size)
         {
            index = a[k*2+1] < a[k*2+2] ? k*2+1:k*2+2; 
            
         }
            
         else
         {
             index = k*2+1;
         }
            
        return index;
    }
    
    public static void swap(int[] a, int k , int index)
    {
      int temp = a[k];
      a[k] = a[index];
      a[index] = temp;
        
    }
}

