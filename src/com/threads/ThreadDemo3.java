package com.threads;


	class MyThread4 extends  Thread
	{
		public void run()
	    {
		System.out.println("hi subbu-1");
	    }
	  
	}
	class MyThread5 extends  Thread
	{
		public void run()
	    {
		System.out.println("hi subbu-2");
	    }
	  
	}
	class MyThread6 extends  Thread
	{
		public void run()
	    {
		System.out.println("hi subbu-3");
	    }
	  
	}
	public class ThreadDemo3
	{
	public static void main(String[] args) 
	{
		MyThread4 t4=new MyThread4();
		t4.start();
		MyThread5 t5=new MyThread5();
	    t5.start();
		MyThread6 t6=new MyThread6();
		t6.start();
		// TODO Auto-generated method stub

	}

	}




