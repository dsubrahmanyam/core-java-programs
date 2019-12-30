package com.strings;

public class StringCom {
	public static void main(String... ratan)
	{ String str1="ratan";
	String str2="Sravya";
	String str3="ratan";
	System.out.println(str1.compareTo(str2));
	System.out.println(str1.compareTo(str3));
	System.out.println(str2.compareTo(str1));
	System.out.println("ratan".compareTo("RATAN"));
	System.out.println("ratan".compareToIgnoreCase("RATAN"));
}
}