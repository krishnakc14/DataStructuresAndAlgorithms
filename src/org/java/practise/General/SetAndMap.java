package org.java.practise.General;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetAndMap {

	public static void main(String[] args) {
		
		BeanClass obj1 = new BeanClass(1, "krishna");
		BeanClass obj2 = new BeanClass(1, "Krish");
		
		Map<BeanClass, Integer> map = new HashMap<BeanClass, Integer>();
		
		Set<BeanClass> set = new HashSet<BeanClass>();
		map.put(obj1, 1);
		map.put(obj2, 2);
		
		set.add(obj1);
		set.add(obj2);

		for(BeanClass key: map.keySet()){
			System.out.println(" Map Values:"+key.getId() + " Name:" +key.getName() + "Value:"+map.get(key));
			
		}
		for(BeanClass val:set){
			System.out.println(val.getId() + "  "+val.getName());
		}
		
		
	}

}
