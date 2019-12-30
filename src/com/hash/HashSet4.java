package com.hash;

import java.util.HashSet;

public class HashSet4 {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet();
		h.add(333);
		h.add(444);
		h.add(555);
		h.add(666);
		System.out.println(h);
		HashSet s=new HashSet();
		//for(Integer k:h)
		//{
		//	System.out.println(k);
		//}
		s=(HashSet)h.clone();
		System.out.println(s);
		

	}

}
