package com.string12;

public class Reverse123 {

	public static void main(String[] args) 
	{
		String  str="subbu";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			
			rev=rev+str.charAt(i);
		}
		// TODO Auto-generated method stub
System.out.println("String reverse is:"+rev);
	}

}
