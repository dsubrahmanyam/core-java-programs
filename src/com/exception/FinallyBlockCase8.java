package com.exception;

public class FinallyBlockCase8 {
	public static void main(String[] args) {
		System.out.println(10/0);
		try {
			System.out.println("try");
			System.exit(0); 
		}
		
		finally
		{
			System.out.println("final-block");// o/p=final-block
		}

	}

}
