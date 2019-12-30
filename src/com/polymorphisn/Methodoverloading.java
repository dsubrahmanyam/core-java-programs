package com.polymorphisn;

public class Methodoverloading 
{
	void m1(int a)
	{
		System.out.println("int m1 method");// TODO Auto-generated method stub
	}
void m1(int a,int b)
{
	System.out.println("int,int m1 method");
	
}
void m1(char ch)
{
	System.out.println("char m1 method");
	
}
public static void main(String[] args) 
{
	Methodoverloading mo=new Methodoverloading();
	mo.m1(10);
	mo.m1(12,30);
mo.m1('a');
	
	}

}
  