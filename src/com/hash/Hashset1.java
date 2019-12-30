package com.hash;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("Subbu");
		h.add("Ravi");
		h.add("Yamudu");
		h.add("java");
		h.add("kirak");
		h.add("nuve");
		h.add("Yamudu");
		h.add("job");
		h.add("job");
		h.add("rana ");
		h.add("babu");
		h.add("apple");
		h.add("mahesh");
		h.add("Subbu");
		System.out.println(h);
		HashSet<String>h2=new HashSet<String>();
		h2=(HashSet)h.clone();
System.out.println("elements:"+h2);
	}

}
