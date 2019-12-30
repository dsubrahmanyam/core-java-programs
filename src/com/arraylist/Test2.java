package com.arraylist;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(111);
	al.add(222);
	al.add("venkey");
	System.out.println(al);
	System.out.println(al.lastIndexOf(3));
	System.out.println(al);
     System.out.println(al.size());
	al.add(1,555);
	System.out.println(al);
	ArrayList<Integer>a=new ArrayList<Integer>(al);
	a.add(999);
	a.add(888);
	System.out.println(al.addAll(a));
	System.out.println(a);
	a.remove(5);
	System.out.println(a);
	System.out.println(a.isEmpty());
	a.clear();
	System.out.println(a);
	System.out.println(a.isEmpty());
	//System.out.println(al.indexOf(999));
	System.out.println(a);
	}

}
