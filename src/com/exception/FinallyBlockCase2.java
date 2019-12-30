package com.exception;

public class FinallyBlockCase2 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("catch");// o/p=catch
		}
		finally
		{
			System.out.println("final-block");// o/p=final-block
		}

	}


}
