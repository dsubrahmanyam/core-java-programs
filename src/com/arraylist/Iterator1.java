package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("subbu");
		al.add("Anil");
		al.add("ramu");
		al.add("ramu");
		al.add("raj");
		al.add("guru");
		Iterator itr=al.iterator();//normal version
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.print( s );
		
		}
		Iterator<String> itr1=al.iterator();//generic version
		while(itr1.hasNext())
		{
			String s=itr1.next();
			System.out.println(s);
		}
		

}
	}
