package com.exception;

import java.io.FileInputStream;

public class Throws4 {
void m2()throws Exception
{
	FileInputStream fis=new FileInputStream("ac.txt");
	Thread.sleep(3000);
	System.out.println("Exception Handled");
}
void m1()
{
	try
	{
		m2();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	Throws4 t=new Throws4();
	t.m1();
}
}
//The root class is able to throws all exceptions (Exception root class)
/*java.io.FileNotFoundException: ac.txt (The system cannot find the file specified)
at java.io.FileInputStream.open0(Native Method)
at java.io.FileInputStream.open(Unknown Source)
at java.io.FileInputStream.<init>(Unknown Source)
at java.io.FileInputStream.<init>(Unknown Source)
at com.exception.Throws4.m2(Throws4.java:8)
at com.exception.Throws4.m1(Throws4.java:16)
at com.exception.Throws4.main(Throws4.java:25)*/
