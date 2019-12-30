package com.vectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Test2 {
	public static void main(String[] args) {
		
	ArrayList<String> al = new ArrayList<String>();
	al.add("10");
	al.add("20");
	Vector<String> v = new Vector<String>();
	v.add("ten");
	v.add("twenty");
	Collections.copy(al,v);
	System.out.println(al);
}
}