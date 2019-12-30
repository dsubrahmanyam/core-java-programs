package com.numberpattern;

public class EvenPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 8; i++) {
			for (int j = 8; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 2; k < (i * 2); k++)// for(int k=1;k<=i;k++)
			{
				System.out.print("1");
			}
			// for(int m=2;m<=i;m++)another method
			// {
			// System.out.print(" * ");
			// }

			System.out.println();
		}
	}

}
