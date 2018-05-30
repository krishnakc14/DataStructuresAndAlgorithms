package org.java.practise.General;

import java.lang.reflect.Field;

public class CollectionCheck {
	
	private static String a ="sdf";
	
	private String id;
	private String name;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CollectionCheck(String a){
		//this.a = a;
	}
	public CollectionCheck(){
		//this.a = a;
	}
	 
	public static void main(String args[]) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		 
		 CollectionCheck c = new CollectionCheck("krish");
		 
		 CollectionCheck obj1 = new CollectionCheck();
		 
		 CollectionCheck obj2 = new CollectionCheck();
		 obj1 = obj2;
		 
		 obj2.setId("krish");
		 
		 obj1.setName("Some name");
		 
		 System.out.println(obj1.getId());
		 System.out.println(obj2.getName());
		 
		
		 
		Field field = CollectionCheck.class.getDeclaredField("a");
		
		field.setAccessible(true);
		
		String name = (String) field.get(c);
			
			System.out.println(name);
			
			System.out.println(a);
		}
 
	
}

class B extends CollectionCheck {
	public B(String a) {
		super(a);
		
	}
	
	
	public static void getMethod(){
		
	}


	
	
}
