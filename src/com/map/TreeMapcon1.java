package com.map;

import java.util.TreeMap;

public class TreeMapcon1 {
	public static void main(String[] args) {
	
	TreeMap<Integer,String> t=new TreeMap<Integer,String>();
	t.put(999,"subbu");
	t.put(222,"venkey");
	t.put(777,"babu");
	t.put(444,"dada");
	t.put(555,"raj");
	TreeMap<String,Integer> t2=new TreeMap<String,Integer>();
	t2.put("subbu",333);
	t2.put("venkey",444);
	t2.put("babu",666);
	t2.put("dada",777);
	t2.put("raj",999);

	System.out.println(t2);
	// TODO Auto-generated method stub

	}

}
