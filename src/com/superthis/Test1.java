package com.superthis;
class T
{
	void m1()
	{
		System.out.println("m1-T");
	}
}
class R extends T
{
	void m2() {
	System.out.println("m2-B");
	m1();
	this.m1();
	super.m1();//to refere super class methods from sub classes
	}
	void m1()
	{
		System.out.println("m1-Y");
	}
	}

public class Test1 {
 
	public static void main(String[] args) {
		R b=new R();
		b.m2();

	}

}
