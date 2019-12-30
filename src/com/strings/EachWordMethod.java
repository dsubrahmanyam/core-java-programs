 package com.strings;

class EachWord {
	public static String reverseWord(String str) {
		String s[] = str.split("\\s");
		String s1 = "";
		for (String ss : s) {
			StringBuilder sb = new StringBuilder(ss);
			sb.reverse();
			s1 += sb.toString() + " ";
		}
		return s1.trim();
	}
}

public class EachWordMethod {
	public static void main(String[] args) {
		System.out.println(EachWord.reverseWord("my name is khan"));
        System.out.println(EachWord.reverseWord("I am sonoo jaiswal"));
	}
}