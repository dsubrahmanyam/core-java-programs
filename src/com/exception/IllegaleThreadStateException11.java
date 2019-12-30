package com.exception;
class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("jjuuffhf");
	}
}
public class IllegaleThreadStateException11 {

	public static void main(String[] args) {
	Thread t=new Thread();
	  t.start();
	  t.start();

	}

}
