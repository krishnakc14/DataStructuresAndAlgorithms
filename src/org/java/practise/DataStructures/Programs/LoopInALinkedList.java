package org.java.practise.DataStructures.Programs;

import java.util.HashSet;
import java.util.Set;

public class LoopInALinkedList {
	
	//Floyd's tortoise and hare Algorithm
	//We can also detect Start Of The Loop
	
//1 --> 2 --> 3 --> 4
//			  ^	    |
//			  |_____|
			
	class Node {
        int data;
        Node next;
    }


  boolean hasCycle(Node head) {

    if(head == null)
    {
        return false;
    }
    
    Set<Node> set = new HashSet<Node>();
    Node current = head;
    while(current != null){
       int length = set.size();
        set.add(current);
        if(set.size() == length)
            return true;
        current = current.next;
        
    }
    return false;
    
}
  
  boolean hasCycleFloyd(Node head) {

	    if(head == null)
	    {
	        return false;
	    }
	    
	    Node tortoise = head;
	    Node hare = head;
	    
	    while(tortoise != null && hare != null)
	    {
	    	 if(tortoise.next != null)
		    	tortoise =  tortoise.next;
		   	 else
		   	    return false;
	    	 
	    	 if(hare.next != null && hare.next.next != null)
		       	 hare =  hare.next.next;
		   	 else
		   		 return false;
	    	
	    	
	    	if(tortoise == hare){
	    		detectStartOfTheLoop(head, tortoise);
	    		return true;
	    	}
	  	   
	    }
	    return false;
	  
	    
	}
  
  public void detectStartOfTheLoop(Node head, Node tortoise) {

	  //Move a pointer to the head and start incrementing by 1. 
	  //Note that tortoise is the point where we determined that there is a loop in the linkedList
	  //Once these two points, we will be at the start of the loop ! Crazy !!
	    while(head == tortoise)
	    {
	    	head = head.next;
	    	tortoise = tortoise.next;
	    	
	    }
	  
	    System.out.println("The Loop starts at "+head.data);
	    
	}


	public static void main(String[] args) {

		
		
		
	}

}
