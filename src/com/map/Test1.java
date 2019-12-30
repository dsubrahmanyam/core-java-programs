package com.map;

import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
HashMap h1=new HashMap();
h1.put(999, "eswar");
h1.put(777,"ram");
h1.put(888,"anil");
HashMap h2=new HashMap(h1);
//h2.putAll(h1);
h2.put(555,"raj");
h2.put(666, "utti");
System.out.println(h2);
	}

}
