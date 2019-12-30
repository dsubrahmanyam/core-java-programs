package com.polymorphisn;

public class MethodOverloading2 {
	long m(int a)
	{
		System.out.println("hi");
		return 11;
	}
	int m(float f)
	{
		System.out.println("jav");
		return 10;
	}
public static void main(String[] args) {
	MethodOverloading2 t=new MethodOverloading2();
	long d=t.m(10);
	System.out.println(d);
	int f=t.m(10.5f);
	System.out.println(f);
	
}
}
