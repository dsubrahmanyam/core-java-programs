package com.numberpattern;

public class Trangle {

	public static void main(String[] args) {
		int m = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i * 2); k++) {

				System.out.print(i);
			}

			System.out.println();
		}
	}

}
