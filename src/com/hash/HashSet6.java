package com.hash;

import java.util.HashSet;

public class HashSet6 {
	public static void main(String[] args) {
		HashSet<String> t = new HashSet<String>();  
		t.add("ddd");
		t.add("uuu");
		t.add("999");
		t.add("ppp");
		System.out.println(t);
		//t.size();
		t.remove("999");
		System.out.println(t);
		System.out.println("size:"+t.size());
		System.out.println("elements are:"+t.isEmpty());
		t.clear();
		System.out.println(t);
		System.out.println("elements are:"+t.isEmpty());
}
}