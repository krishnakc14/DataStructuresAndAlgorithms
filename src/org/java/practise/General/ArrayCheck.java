package org.java.practise.General;

import java.util.Arrays;
import java.util.List;

public class ArrayCheck {

	public ArrayCheck() {
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		List<Integer> list = Arrays.asList(1,2,3) ;
		changevalue(a);
		changevalueList(list);
		
		System.out.println(a[0]);
		System.out.println("List value:"+list.get(0));

	}
	
	private static void changevalue(int[] b){
		b[0] = 100;
	}
	
	private static void changevalueList(List<Integer> b){
		b.set(0, 100);
		b = null;
	}

}
