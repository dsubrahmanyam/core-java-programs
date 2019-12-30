package com.superthis;
class K
{
	K()
	{
		System.out.println("K-con");//first priority
	}
	K(int i)
	{
		System.out.println("K-int-param-Con");
	}
}
class L extends K
{
	L()
	{
		
		super(13);
		System.out.println("L-con");
	}
	void t1()
	{
	
		System.out.println("hello");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L p=new L();
		p.t1();

	}

}
