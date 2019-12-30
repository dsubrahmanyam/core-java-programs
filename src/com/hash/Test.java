package com.hash;

import java.util.HashSet;

public class Test {
	public static void main(String[] args)
	{ HashSet<String> h = new HashSet<String>();
	System.out.println(h.add("D")); //true
	System.out.println(h.add("D")); //false
	System.out.println(h);
	}
	
}
