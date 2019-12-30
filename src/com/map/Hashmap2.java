package com.map;

import java.util.HashMap;

public class Hashmap2 {
public static void main(String[] args) {
	HashMap<Integer,String> h=new HashMap<Integer,String>();
	h.put(999, "subbu");
	h.put(333,"Hari");
	h.put(222, "suppi");
	h.put(777, "Gaja");
	//h.remove(333);
	//h.clear();
	System.out.println(h);
	//h.clone();
	System.out.println(h.clone());
	HashMap<Integer,String> h1=new HashMap<Integer,String>();
	h1.put(555, "ratan");
	h1.put(111,"durga");
	h1.putAll(h);
	
System.out.println(h1);
}
}
