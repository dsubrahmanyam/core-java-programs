package com.polymorphisn;


	 class Parent1 
	{
	  float  marry()
	   {
		   System.out.println("Black girl");
		   return 10.5f;
	   }
	   
	}
	class  Child1 extends Parent1
	{
	float marry()
		{
			System.out.println("Red girl");
		return 10.5f;
		}
		public static void main(String[] args) 
		{
			new  Child1().marry();
		}
	}


