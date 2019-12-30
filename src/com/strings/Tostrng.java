package com.strings;

public class Tostrng {
	public static void main(String[] args) {
		Tostrng t = new Tostrng();
		System.out.println(t);
		System.out.println(t.toString());//object class toString() executed
	
	String r="gaga";
	System.out.println(r);
	System.out.println(r.toString());//String class toString() executed
	StringBuffer sb = new StringBuffer("anu");
	System.out.println(sb);
	System.out.println(sb.toString());////StringBuffer class toString() executed

}}
