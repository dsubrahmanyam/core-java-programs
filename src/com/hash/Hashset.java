package com.hash;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
	HashSet<String>h=new HashSet<String>();
	h.add("subbu");
	h.add("Tata");
	h.add("Ravi");
	h.add("Java");
	h.add("Ganga");
    System.out.println(h);
    h.remove("Ganga");
    h.add("spring");
    //h.size();
    System.out.println(h);
   // h.size();
   // System.out.println(h);
System.out.println("String are:"+h.size());
    System.out.println("String are:"+h.clone());

	Iterator <String>itr=h.iterator();
	while(itr.hasNext())
			{
		       String s=(String)itr.next();
		       System.out.println(s);
		      			}
	 	}
}
