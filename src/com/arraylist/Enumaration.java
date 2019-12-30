package com.arraylist;

import java.util.Enumeration;
import java.util.Vector;

public class Enumaration {

	public static void main(String[] args) {
		Vector<String> v=new <String>Vector();
		v.add("asf");
		v.add("html");
		v.add("java");
		v.add("spring");
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			String s=(String)e.nextElement();
			System.out.println(s);
		}
		Enumeration<String> e1=v.elements();
		while(e1.hasMoreElements())
		{
			String s=e1.nextElement();
			System.out.println(s);
		}
		

	}

}
