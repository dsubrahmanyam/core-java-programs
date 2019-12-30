package com.pattern;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i-1;j++)
	{
		System.out.print("2");
	}
	for(int k=1;k<=5;k++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	}

}
/*for (int i = 1; i <= rows; i++)
{
    for (int j = 1; j <= i-1; j++)
    {
        System.out.print(" ");
    }
    // Print star in decreasing order
    for (int k = 1; k <= rows; k++)
    {
        System.out.print("*");
    }
    System.out.println();
}*/

