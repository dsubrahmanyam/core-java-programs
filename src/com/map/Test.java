package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put(111,"subbu");
		h.put(222, "Ravi");
		h.put(333,"Anka");
		System.out.println(h);
		Set s=h.keySet();
		System.out.println(s);
		Collection c=h.values();
		System.out.println(c);
		Set ss=h.entrySet();
		Iterator itr=ss.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+" -----"+m.getValue());
		}
		
				// TODO Auto-generated method stub

	}

}
