package com.numberpattern;

import java.util.Scanner;

public class Ekkalu {
	public static void main(String args[])
	  {
	   // int n, c;
	    System.out.println("Enter number");
	    Scanner in = new Scanner(System.in);
	   int n = in.nextInt();
	    System.out.println("Multiplication table of " + n);
	 
	    for (int c = 1; c <= 10; c++)
	      System.out.println(n + "*" + c + " = " + (n*c));
	  }
	}

