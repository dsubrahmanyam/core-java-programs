package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws3 {
void m2()throws FileNotFoundException,InterruptedException
{
	FileInputStream fis=new FileInputStream("abc.txt");
	Thread.sleep(300);
	System.out.println("Exception Handled");
}
void m1()
{
	try 
	{
		m2();
	}
	catch(FileNotFoundException|InterruptedException f)
	{
		f.printStackTrace();
	}

}
public static void main(String[] args) {
	Throws3 t=new Throws3();
	t.m1();
}
}
//One method is able to throws more than one exception
/*java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
at java.io.FileInputStream.open0(Native Method)
at java.io.FileInputStream.open(Unknown Source)
at java.io.FileInputStream.<init>(Unknown Source)
at java.io.FileInputStream.<init>(Unknown Source)
at com.exception.Throws3.m2(Throws3.java:9)
at com.exception.Throws3.m1(Throws3.java:17)
at com.exception.Throws3.main(Throws3.java:27)*/