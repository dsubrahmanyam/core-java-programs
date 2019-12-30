package com.strings;

public class EachWordWithoutMethod {
	public static void main(String[] args) {
		String s = "Hello There !Test Engineer";
		String[] words = s.split(" ");
		String A= "";
		int count=0;
		for (String ss : words) 
		{
			String B = " ";
			for (int i= ss.length() - 1; i >= 0; i--) 
			{
				B = B+ss.charAt(i);
			}
			A = A+ B ;
		}
		System.out.println(A);
	}

}