package com.exception;
//import com.exception.InvalidAgeException;
import java.util.Scanner;

 public class Test1 {
	  //static int age=20;
	   //static void m1()throws InvalidAgeException
	 static void m1(int age)throws InvalidAgeException
	   {
		if(age>28)
		{
			System.out.println("you are eligible for marriage");
		}
		   else
		   {
			throw new InvalidAgeException();
			}
	    }

	public static void main(String[] args)throws InvalidAgeException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=s.nextInt();
		Test1.m1(age);
		s.close();
		/*Test1 t=new Test1();
		t.m1();*/
		
	}

}
