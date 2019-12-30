package com.pattern;

import java.util.Scanner;

public class SameNumber5times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
				System.out.println("Enter number");
		int num=s.nextInt();
				for (int i = 2; i <= num; i++)
	        {
	            for (int j = 2; j <= i; j++)
	            {
	                System.out.print(i );
	            }
	           System.out.println();
	        }
	    }
	}


