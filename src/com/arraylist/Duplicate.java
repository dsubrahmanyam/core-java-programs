package com.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.hash.Hashset;

public class Duplicate {
	public static void main(String[] args) {
		
ArrayList al=new ArrayList();
 al.add(111);
 al.add(222);
 al.add(111);
 al.add(333);
 al.add(111);
 al.add(444);
 al.add(888);
 al.add(999);
 System.out.println(al);
 System.out.println("after removing");
 LinkedHashSet s=new LinkedHashSet(al);
 System.out.println(s);
}
}

