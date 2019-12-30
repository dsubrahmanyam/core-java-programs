package com.polymorphisn;

 class Parent7
{
	static void m1()
	{
		System.out.println("parent method");
	}
}
	class Child4 extends Parent7
	{
		static void m1()
		{
		System.out.println("child method");
		}	// TODO Auto-generated method stub	
	
	public static void main(String[] args) 
	{
	 Parent7 p=new Child4();	// TODO Auto-generated method stub
   p.m1();
	}

}
