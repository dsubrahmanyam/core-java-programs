package com.exception;

public class FinallyBlockCase9 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("subbu".charAt(10));
		}
		finally
		{
			int[] a= {10,20,30};
			System.out.println(a[7]);// o/p=final-block
		}

	}

}


