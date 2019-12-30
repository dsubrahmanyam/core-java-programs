package com.threads;
class MyThread7 extends Thread 
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class ThreadDemo4 
{

	public static void main(String[] args) 
	{
		MyThread7 t1=new MyThread7();
		t1.setPriority(Thread.MAX_PRIORITY);
		MyThread7 t2=new MyThread7();
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		// TODO Auto-generated method stub

	}

}
