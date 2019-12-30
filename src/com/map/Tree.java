package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tree {
		public static void main(String[] args) 
		{
			TreeMap<Integer,String> h = new TreeMap<Integer,String>();
			h.put(111,"ratan");
			h.put(222,"anu");
			h.put(333,"aaa");
			h.put(444,"aaa");
			h.put(555,"ccc");
			System.out.println(h);
			h.remove(555);
			System.out.println(h.firstEntry());
			System.out.println(h.lastEntry());
			System.out.println(h.firstKey());
			System.out.println(h.lastKey());
			System.out.println(h.lowerKey(222));
			System.out.println(h.higherKey(222));
		}
}
