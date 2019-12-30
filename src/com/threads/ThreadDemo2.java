package com.threads;

class MyThread3 extends  Thread
{
	public void run()
    {
	System.out.println("hi subbu");
    }
  
}
public class ThreadDemo2 
{
public static void main(String[] args) 
{
	MyThread3 t=new MyThread3();
	t.start();
	MyThread3 t2=new MyThread3();
    t2.start();
	MyThread3 t3=new MyThread3();
	t3.start();
	// TODO Auto-generated method stub

}

}




