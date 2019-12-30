package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(10);// 0
		s.add(9);// 1
		s.add(16);// 2
		s.add(19);// 3
		s.add(18);// 4
		s.add(13);// 5
		s.add(11);// 6
		// System.out.println(s.size());
		// System.out.println(s);
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext())
		{
			Integer num = itr.next();
			if (num % 3 != 0) 
			{
				itr.remove();
				
			}
			
		}
	    System.out.println(s);
		
	    }
	}
