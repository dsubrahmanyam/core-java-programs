package com.numberpattern;

public class OncesTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int t=1;
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			int t = 1;
			for (int k = 1; k <= i; k++) {
				System.out.print(t +" " );
				// t++;
			}
			System.out.println();
		}
	}

}


