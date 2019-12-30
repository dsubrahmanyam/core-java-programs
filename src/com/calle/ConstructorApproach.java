package com.calle;

import java.util.ArrayList;

public class ConstructorApproach {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("subbu");
		ArrayList<String> a2=new ArrayList<String>(al);
		a2.add("ratan");
		System.out.println(a2);
		ArrayList<Integer> b1=new ArrayList<Integer>();
		b1.add(10);
		ArrayList<Integer> b2=new ArrayList<Integer>();
		b2.add(30);
		ArrayList<Integer> b3=new ArrayList<Integer>();
		b3.addAll(b1);
		b3.addAll(b2);
		b3.add(90);
		System.out.println(b3);
	}

}
