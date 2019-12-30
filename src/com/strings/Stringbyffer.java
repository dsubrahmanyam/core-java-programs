package com.strings;

public class Stringbyffer {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("ABCDFEG");
	                               // 0123456
	//System.out.println(sb.delete(2,4 ));
	System.out.println(sb.delete(2,5));
	System.out.println(sb.reverse());
	StringBuffer sb1=new StringBuffer("rattaiah");
	System.out.println(sb1.append(" subbu"));
	sb1.replace(0,2,"oy");
	System.out.println("after replaceing the string:-"+sb1);
}
}