package com.wrapperclassss;

public class ConstructorWrapper {
	public static void main(String[] args) {
	
	Integer i1 = new Integer(100);
	Integer i2 = new Integer("100");//constructor approach to create wrapper object
	System.out.println(i1+i2);
	System.out.println(i2);
}
}
