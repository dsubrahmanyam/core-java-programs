package com.strings;

public class RevString {
public static void main(String[] args) {
	String s="sai subbu";
	String[] ss=s.split(" ");
	String A=" ";
	
for (String s2: ss)  
{
	String B = " ";
	for (int i = s2.length() - 1; i >= 0; i--) 
	{
		B = B+s2.charAt(i);
	}
	A = A+ B ;
}
System.out.println(A);

}

}