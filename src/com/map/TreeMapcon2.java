package com.map;

import java.util.TreeMap;

public class TreeMapcon2 {

	public static void main(String[] args)
	{
		//constructor approach
	TreeMap<String,Integer> t=new TreeMap<String,Integer>();
	t.put("subbu", 222);
	TreeMap<String,Integer> t1=new TreeMap<String,Integer>(t);
	t1.put("vin",111);
	System.out.println(t1);
	//putall
	TreeMap<String,Integer> m=new TreeMap<String,Integer>();
	m.put("dasari",888);
	TreeMap<String,Integer> m1=new TreeMap<String,Integer>();
	m1.put("rfgg",999);
	TreeMap<String,Integer> m2=new TreeMap<String,Integer>();
	m2.putAll(m);
	m2.putAll(m1);
	m2.put("rhul", 666);
	System.out.println(m2);

	// TODO Auto-generated method stub

	}

}
