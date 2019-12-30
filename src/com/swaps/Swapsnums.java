package com.swaps;

public class Swapsnums {
public static void main(String[] args) {
	int a=5;
	int b=4;
	int c;
	/*a=a^b;101  100   1+1=0,0+0=0,1+0=1,0+1=1;
	b=a^b;//001  100    101=5
	a=a^b;  101 001     100=4*/  //first approach
	//b=a+b-(a=b);//30-10       second approach   
	c=a;//c=5
	a=b;//a=4
	b=c; //b=5 third approach  
System.out.println("a="+a );
	System.out.println("b="+b);
	//System.out.println("a:"+"b");
}
}
