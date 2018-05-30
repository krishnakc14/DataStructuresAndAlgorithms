package org.java.practise.General;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
	  
	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
          a[i] = in.nextInt();
          if(map.get(a[i]) != null)
              map.put(a[i], map.get(a[i]+1));
          else
              map.put(a[i], 1);
      }
      
      for(Integer ins:map.keySet())
      {
          if(map.get(ins) != 2)
              System.out.println(in);
      }
      
  }
}