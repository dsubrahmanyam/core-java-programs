package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap3 {
	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(111, "subbu");
		m.put(222, "ravi");
		m.put(555, "Venky");
		m.put(777, "venu");
		//m.put(777, "jan");
		System.out.println(m);
		Set <Integer>s=m.keySet();
		System.out.println(s);
		Collection<String> c=m.values();
		System.out.println(c);
	Set<Entry<Integer,String>>s2=m.entrySet();
	Iterator<Entry<Integer,String>> itr=s2.iterator();
	while(itr.hasNext())
	{
		Entry<Integer,String> e=itr.next();
		System.out.println(e);
	//	System.out.println(e.getKey()+"----"+e.getValue());
	}

	}

}
