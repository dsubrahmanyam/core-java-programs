package com.polymorphisn;

 class parent
{
   void marry()
   {
	   System.out.println("Black girl");
   }
   
}
class  Child extends parent
{
	void marry()
	{
		System.out.println("Red girl");
	
	}
	public static void main(String[] args) 
	{
		Child c=new Child(); 
		c.marry();
	}
}
