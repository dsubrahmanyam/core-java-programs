package com.threads;
class MyThread0 extends Thread
{
	public void run()
	{
		System.out.println("hook functionality");
	}
}
public class ThreadDemo5 
{
	public static void main(String[] args)
	{
		MyThread0 t=new MyThread0();
		Runtime r=Runtime.getRuntime();// TODO Auto-generated method stub
        r.addShutdownHook(t);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Mythread ");
			try
			{
				Thread.sleep(1000);
			}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			
		}
	}

}
