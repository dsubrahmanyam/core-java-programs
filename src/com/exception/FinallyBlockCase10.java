package com.exception;

public class FinallyBlockCase10 {
int m1()
{
	try
	{
		return 10;
	}
	catch(ArithmeticException ae)
	{
		return 20;
	}
	finally
	{
		return 30;
	}
}
	public static void main(String[] args)
	{
		FinallyBlockCase10 f=new FinallyBlockCase10();
				int x=f.m1();
				System.out.println(x);
			
		
	}
}

