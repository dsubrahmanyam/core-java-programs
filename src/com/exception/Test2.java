package com.exception;

import java.util.Scanner;

public class Test2 {
	static void m2(int age)throws InvalidAgeException1
	{
		if(age>30)
		{
			System.out.println("your eligible for marriage");
		}
		else
		{
			throw new InvalidAgeException1("Your not eligible for marriage");
		}
	}
	public static void main(String[] args)throws InvalidAgeException1 {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age");
		int age=s.nextInt();
		Test2.m2(age);
	}

}
