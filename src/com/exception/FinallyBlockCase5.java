package com.exception;

public class FinallyBlockCase5 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("catch"); 
		}
		finally
		{
			System.out.println(10/0);// o/p=final-block 
		}

	}
	}

