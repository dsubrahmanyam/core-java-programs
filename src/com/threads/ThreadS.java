package com.threads;

public class ThreadS {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.print("S");
		Thread.sleep(1000);
		System.out.print(" U ");
		Thread.sleep(1000);
		System.out.print(" B ");
		Thread.sleep(1000);
		System.out.print(" B ");
		Thread.sleep(1000);
		System.out.print("U");

		
	}

}
