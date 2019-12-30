package com.numberpattern;

import java.util.Scanner;

public class Test {

		// TODO Auto-generated method stub
		 //private static final Scanner scanner = new Scanner(System.in);

		    public static void main(String[] args) {
		    	Scanner scanner = new Scanner(System.in);
		        int N = scanner.nextInt();
		     String ans="";
		      if(N%2==1)
		   {
		    ans=" wired";
		   }
		      else {
		         if(N>=6 && N<=20)
		          {
		           ans="wired";
		            }
		         else
		         {
		        	 ans="not wired";
		         }
            //scanner.close();
		              }
		             System.out.println(ans);
		}
}
	
