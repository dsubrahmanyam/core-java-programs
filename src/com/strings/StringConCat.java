package com.strings;

public class StringConCat {
	public static void main(String[] args) {
		String s="subbu";
		String s2=s.concat("javaDeveloper");
		System.out.println(s2);
		String s1="raj";
		s1=s1.concat("kumar");
		System.out.println(s1);
		String str1="anu";
		String str2="anu";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		String str3 = new String("Sravya");
		String str4 = new String("Sravya");
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		StringBuffer sb1 = new StringBuffer("students");
		StringBuffer sb2 = new StringBuffer("students");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}

}
