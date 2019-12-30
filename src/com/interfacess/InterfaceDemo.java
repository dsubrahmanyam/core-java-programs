package com.interfacess;

public class InterfaceDemo {
	public static void main(String[] args) {
		BankInterface f=new Sbi();
		f.diposite();
		f.withdraw();
		f.transaction();
		BankInterface g=new Hdfc();
		g.diposite();
		g.withdraw();
		g.transaction();
	}
}
	class Sbi implements BankInterface
	{

@Override
public void diposite() {
	// TODO Auto-generated method stub
	System.out.println("100 diposited");
}

@Override
public void withdraw() {
	System.out.println(" 5000 withdraw");
	
}

@Override
public void transaction() {
	System.out.println("1000 tranfared");
	
}
}
class Hdfc implements BankInterface
{

	@Override
	public void diposite() {
		// TODO Auto-generated method stub
		System.out.println(" 4000 withdraw");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println(" 6000 withdraw");
	}

	@Override
	public void transaction() {
		// TODO Auto-generated method stub
		System.out.println(" 9000 withdraw");
	}
	
}

	
