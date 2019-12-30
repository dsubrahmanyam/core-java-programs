package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(111);
	al.add(222);
	al.add("venkey");
	al.add(111);
	al.add(222);
	al.add("raj");
	//System.out.println(al);
	ArrayList a=new ArrayList(al);
	al.addAll(a);
	System.out.println(a);

}}
	