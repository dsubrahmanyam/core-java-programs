package com.pattern;

public class DoubleTriangle {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i * 2); k++)// for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}

			System.out.println();
		}
        for (int i=6; i>=1; i--)
        {
         // Print space in increasing order
            for (int j=5; j>=i; j--)
            {
                System.out.print(" ");
            }
            // Print star in decreasing order
            //for (int k=1; k<=(i * 2) -1; k++)
            for (int k=1; k<=(i * 2) -1; k++)
            	//for (int k=1; k<=i; k++)

            {
                System.out.print("*");
            }
            
            System.out.println();
 
        }
 
	}

} 
