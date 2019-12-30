package com.pabstract;

 class AbstractDemo{

	public static void main(String[] args)
	{
		Bank b=new Htfc();
		b.diposite();
		b.withdraw();
		b.transaction();
		Bank a=new Icici();
		a.diposite();
		a.withdraw();
		 a.transaction();
	}
}

 abstract class Bank{
          public void diposite()
         {
	        System.out.println("This diposite applicable for all bank...");
          }
            public void withdraw()
           {
	       System.out.println("This withdraw applicable for all bank...");
           }
    abstract int transaction();
	
}
class Htfc extends Bank
{

	@Override
	public int  transaction() {
		System.out.println("this htfc transacion applicable for all");
		return 0;
	}
}
class Icici extends Bank
{

	@Override
	public int transaction() {
		// TODO Auto-generated method stub
		System.out.println("this icici transacion applicable for all");

	return 0;
	}
}

