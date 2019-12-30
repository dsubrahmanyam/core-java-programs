package com.string12;

public class StringReverse 
{
	
	public static void main(String[] args) 
	
	{
		String s="hello";
		
        char[] ch=s.toCharArray();  
		String rev="";
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
