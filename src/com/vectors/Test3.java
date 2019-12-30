package com.vectors;

import java.util.Enumeration;
import java.util.Vector;

public class Test3 {
	public static void main(String[] args)
	{ Vector<Integer> v=new Vector<Integer>();
	for (int i=0;i<5 ;i++ )
	{ v.add(i);
	}
	Enumeration<Integer> e = v.elements();
	while (e.hasMoreElements())
	{ Integer i = e.nextElement();
	System.out.println(i);
	}
	System.out.println(v);
	}
	}

