package com.strings;

public class SpringEquals {
	public static void main(String... ratan)
	{ String str1="ratan";
	String str2="Sravya";
	String str3="ratan";
	System.out.println(str1.equals(str2));
	System.out.println(str1.equals(str3));
	System.out.println(str2.equals(str3));
	System.out.println("ratan".equals("RATAN"));
	System.out.println("ratan".equalsIgnoreCase("RATAN"));
}
}