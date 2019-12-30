package com.map;

import java.util.Comparator;
import java.util.TreeMap;

public class Treemap11 {
	public static void main(String[] args)
	{ 
		TreeMap<String,Integer> h = new TreeMap(new MyComp());
	      h.put("ratan",111);
	       h.put("anu",222);
	       h.put("zzzz",333);
	System.out.println(h); //{zzzz=333, ratan=111, anu=222}
	}
	}
	class MyComp implements Comparator <String>
	{ public int compare(String s1,String s2)
	{ //place the comments check the output
	//return s1.compareTo(s2);//{anu=222, ratan=111, zzzz=333}
	//return s2.compareTo(s1);//{zzzz=333, ratan=111, anu=222}
	return -s1.compareTo(s2);//{zzzz=333, ratan=111, anu=222}
	//return s2.compareTo(s1);//{zzzz=333, ratan=111, anu=222}
	}
	}

