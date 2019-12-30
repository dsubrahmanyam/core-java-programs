package com.superthis;

 class A {
int a=20;
int b=10;
 }
class B extends A
{
	int a=50;
	int b=90;
	
	
	B(int a, int b)
	{
		System.out.println(a+" "+b);//height priority always go for local variables// 40,80
		System.out.println(a+" "+b);//40,80 same
		System.out.println(this.a+" "+this.b);//class level variable 50,90
		System.out.println(super.a+" "+super.b);
	}
	
}
class Test
{
	public static void main(String[] args) {
		 new B(40,80);

	}
}
