package com.strings;

public class FirstAndLast {
public static void main(String[] args) {
	String s="developer";
	char c=s.charAt(0);
	System.out.println(c);
	char ch =s.charAt(s.length()-1);
	System.out.println(ch);
	s=s.substring(1,s.length());
	System.out.println(s);
}
}
