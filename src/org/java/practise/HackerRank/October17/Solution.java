package org.java.practise.HackerRank.October17;

import java.util.*;

public class Solution {
	
	/*
	 * A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example, if left rotations are performed on array , then the array would become .

Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of  (the number of integers) and  (the number of left rotations you must perform). 
The second line contains  space-separated integers describing the respective elements of the array's initial state.

Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.

Sample Input

5 4
1 2 3 4 5
	 */

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
    
    public static int[] arrayLeftRotation(int[] a, int n, int d)
    {
     
        int[] output = new int[n];
        if(n == d){
            output = a;
        }
        else if(d > n){
            output = arrayLeftRotation(a,n,d-n);
        }
        else
        {
            for(int i = d, k =0; i < n; i++,k++){
                output[k] = a[i];
            }
             for(int i = 0, k = n-d; i < d; i++,k++){
                output[k] = a[i];
            }
            
        }
        return output;
        
    }
    
    //Proposed Solution
    public static int[] rotateArray(int[] arr, int d){
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int n = arr.length;
        
        // Create new array for rotated elements:
        int[] rotated = new int[n]; 
        
        // Copy segments of shifted elements to rotated array:
        System.arraycopy(arr, d, rotated, 0, n - d);
        System.arraycopy(arr, 0, rotated, n - d, d);
        
        return rotated;
    }
}

