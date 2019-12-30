package com.threads;
class MyThread1 extends Thread
{
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println("User thread");
	}
}
}
public class ThreadDemo1 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.run();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
		// TODO Auto-generated method stub

	}

}


