package com.exception;

public class FinallyBlockCase7 {
	public static void main(String[] args) {
		String s=null;
		System.out.println(s.length());
		//System.out.println(10/0);
		try {
			System.out.println("try");
		}
		
		finally
		{
			System.out.println("final-block");// o/p=final-block
		}

	}

}
