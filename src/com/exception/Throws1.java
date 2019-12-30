package com.exception;

public class Throws1 
{
      void studentdetalis()throws InterruptedException
       {
	       System.out.println("subbu is sleeping");
	        Thread.sleep(3000);
	         System.out.println("do not distrub");
        }
                void hod()throws InterruptedException
                 {
                	studentdetalis();
                 }
 void principal()
 {
	    try
	    {
	       hod();
         }
	catch(InterruptedException ie) 
	 {
		ie.printStackTrace();
	 }
 }
 
 void officeBoy()
 {
	 principal();
 }
          public static void main(String[] args) {
	       Throws1 t=new Throws1();
	      t.officeBoy();
           }
}
//in above example exception raised in studentDetails() method but it delegating responsibilities of
//exception handling to hod() method by using throws keyword.
// But hod() method delegating responsibilities of exception handling to principal() method by
//using throws now principal handing this exception by using try-catch blocks.