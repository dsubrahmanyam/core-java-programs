package com.strings;

public class Conversionstringsb {
	public static void main(String[] args) {
		String str1="ratan";
		StringBuffer sb = new StringBuffer(str1);
		System.out.println(sb);
		//conversion of StringBuffer to String
		StringBuffer sb1 = new StringBuffer("anu");
		String s = sb1.toString();
		System.out.println(s);
		
	}

}
