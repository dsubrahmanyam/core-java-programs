package com.exception;

public class FinallyBlockCase1 {

	public static void main(String[] args) {
		try {
			System.out.println("try-block");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("final-block");
		}

	}

}
