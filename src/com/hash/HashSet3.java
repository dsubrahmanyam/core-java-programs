package com.hash;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("Hari");
		h.add("Yuvva");
		h.add("Tata");
		h.add("poli");
		System.out.println(h);
		//HashSet<String> s=new HashSet<String>();
		//s=(HashSet)h.clone();
		//System.out.println(s);
		for(String s:h) 
		{
			System.out.println(s);
		}
		HashSet<String> h1=new HashSet<String>();
		h1=(HashSet)h.clone();
		System.out.println(h1);
	}

}
