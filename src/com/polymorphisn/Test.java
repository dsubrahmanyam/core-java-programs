package com.polymorphisn;

class Test 
{
Test(int a)
{
	System.out.println("int constructor");
}
    Test(int a,int b)
    {
	System.out.println("int,int constructor");
     }
         Test(char ch)
         {
	       System.out.println("char constructor");
           }
public static void main(String[] args) 
{
	new Test(10);
	new Test(10,20);
	new Test('a');

}
}
