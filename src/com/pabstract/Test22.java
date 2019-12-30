package com.pabstract;

abstract class Test7
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println("m4 method");
	}
}
	class Test22 extends Test7
	{
		void m1()
		{
			System.out.println("m1 method");
		}
		void m2()
		{
			System.out.println("m2 method");
		}
		void m3()
		{
			System.out.println("m3 method");
		}
	

	public static void main(String[] args) 
	{
	Test22 t=new Test22();
	t.m1();
	t.m2();
	t.m3();
	t.m4();
	// TODO Auto-generated method stub

	
	}
}
