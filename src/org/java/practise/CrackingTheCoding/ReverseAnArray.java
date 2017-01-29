/**
 * 
 */
package org.java.practise.CrackingTheCoding;

/**
 * @author krishna
 *
 */
public class ReverseAnArray {

	/**
	 * 
	 */
	public ReverseAnArray() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};
		
		for(int i = 0, len= arr.length-1; i<arr.length/2;i++,len--)
		{
			
			int temp = arr[i];
			arr[i] = arr[len];
			arr[len] = temp;
			
		}
		
		for(Integer a:arr)
			System.out.print(a +"\t");
		
	}

}
