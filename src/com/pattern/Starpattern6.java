package com.pattern;

public class Starpattern6 {

	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");// TODO Auto-generated method stub
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			for(int m=1;m<=4;m++)
			{
				for(int t=1;t<=m;t++)
				{
					System.out.print(" ");
					
				}
				for(int k=4;k>=m;k--)
				{
					System.out.print("*");
				}
				System.out.println();
			   }
		}
}

