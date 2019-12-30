package com.exception;

public class Throws2 {
void studentdetails()throws InterruptedException
{
	System.out.println("subbu is sleeping");
	Thread.sleep(3000);
	System.out.println("do not distrub sir.....");
}
void hod()throws InterruptedException
{
	studentdetails();
}
void principal()throws InterruptedException
{
	hod();
}
void officeBoy()throws InterruptedException
{
	principal();
}
public static void main(String[] args)throws InterruptedException {
	Throws2 t=new Throws2();
	t.officeBoy();
}
}
//In above example method-by-method using throws keyword to delegate responsibilities of
//exception handling to caller method.
//At final main() method uses throws keyword to delegate the responsibilities of exception
//handling to JVM.