package com.hash;

import java.util.HashSet;

public class HashSet5 {

	public static void main(String[] args) {
		HashSet<String> t = new HashSet<String>();  
		t.add("ddd");
		t.add("uuu");
		t.add("999");
		t.add("ppp");
		System.out.println(t);
		HashSet h=new HashSet();
		h=(HashSet)t.clone();
		System.out.println(h);
		
		}

}
