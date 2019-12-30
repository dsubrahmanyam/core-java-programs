package com.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Treemap22 {

	
		public static void main(String[] args)
		{ 
			TreeMap<Integer,String> h = new TreeMap<>();
		h.put(111,"ratan");
		h.put(222,"anu");
		h.put(444,"aaa");
		h.put(333,"aaa");
		h.put(555,"ccc");
		System.out.println(h);
		System.out.println(h.lowerKey(222));
		System.out.println(h.ceilingKey(333));
		System.out.println(h.ceilingEntry(222));
		SortedMap s1 = h.headMap(333);
		TreeMap t1 = new TreeMap(s1);
		System.out.println(t1);
		/*System.out.println(h.floorEntry(333));
		System.out.println(h);
		Map.Entry<Integer,String> m1 = h.pollFirstEntry();
		System.out.println(m1.getKey()+"---"+m1.getValue());
		System.out.println(h);*/
	}

}
