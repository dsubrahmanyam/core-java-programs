package com.exception;

public class FinallyBlockCase3 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(NullPointerException ae)//catch block not matched
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("final-block");// o/p=final-block
		}

	}


}
// o/p=final-block
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at com.exception.FinallyBlockCase3.main(FinallyBlockCase3.java:6)

