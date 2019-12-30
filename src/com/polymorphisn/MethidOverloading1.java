package com.polymorphisn;

public class MethidOverloading1 {
public void m(int a)
{
	System.out.println(a+a);
}
public void m(double b)
{
	System.out.println(b+b);
}
public static void main(String[] args) {
	MethidOverloading1 o=new MethidOverloading1();
	o.m(10);
	o.m(2.0);
}
}
