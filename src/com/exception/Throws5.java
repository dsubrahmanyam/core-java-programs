package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws5 {
	static void m2()throws FileNotFoundException,InterruptedException
	{
		FileInputStream fis=new FileInputStream("d.txt");
		Thread.sleep(1000);
		System.out.println("exception handled");
	}
   static void m1()throws InterruptedException
   {
	   try
	   {
		   m2();
	   }
	   catch(FileNotFoundException f)
	   {
		   f.printStackTrace();
	   }
   }
   public static void main(String[] args) 
   {
	Throws5 t=new Throws5();
	try
	{
		 m1();
	}
	catch(InterruptedException i)
	{
		i.printStackTrace();
	}
   }
}
