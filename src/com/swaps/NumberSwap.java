package com.swaps;

public class NumberSwap {

	public static void main(String[] args) {
		int num=153,rev,sum=0,temp;
		temp=num;
        while(num!=0)
        {
        	rev=num%10;
        	//sum=sum+(rev*rev*rev);
        	num=num/10;
        	sum=sum+(rev*rev*rev);//153  1*1*1 + 5*5*5  +3*3*3
                                      //1+125+27=153
        }
        if(temp==sum)
        {
        	System.out.println("the num is amstrong");
        }
        else
        {
        	System.out.println("the no is  not amstrong");
        }
	}

}
