package com.pattern;

public class Trianglepattern {

	public static void main(String[] args) 
	{
		for (int i=1; i<=4; i++) 
        { 
            // Print space in decreasing order 
            for (int j=4; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
     
    }

	// TODO Auto-generated method stub

	}

