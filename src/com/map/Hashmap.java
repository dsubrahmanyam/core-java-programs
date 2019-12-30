package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(999, "subbu");
		h.put(333,"Hari");
		h.put(222, "suppi");
		h.put(777, "Gaja");
		System.out.println(h);
	//h.containsKey(999);
	System.out.println(h.containsKey(777));
	System.out.println(h.containsValue("abc"));
		
		Set <Integer>s=h.keySet();
		System.out.println(s);
		Collection<String> c=h.values();
		System.out.println(c);
		Set<Entry<Integer,String>> s1=h.entrySet();
		for(Entry<Integer,String> e:s1)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}

} 
