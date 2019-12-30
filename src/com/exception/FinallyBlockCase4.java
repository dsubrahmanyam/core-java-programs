package com.exception;

public class FinallyBlockCase4 {
	public static void main(String[] args) {
	try {
		System.out.println(10/0);
	}
	catch(ArithmeticException ae)
	{
		System.out.println(10/0); 
	}
	finally
	{
		System.out.println("final-block");// o/p=final-block
	}

}
}
//before ABN
//final-block
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at com.exception.FinallyBlockCase4.main(FinallyBlockCase4.java:10)
