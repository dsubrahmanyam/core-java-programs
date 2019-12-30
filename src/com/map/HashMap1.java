package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
	
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(777, "Vinay");
		m.put(444,"Hari");
		m.put(null, "raja");
		m.put(null, "Rajuu");
		System.out.println(m);
		 m.remove(888,"Lap");
		 m.replace(111, "jana");
		 m.replace(777,  "aasha");
		 System.out.println(m);
		 
		 for(Entry<Integer,String> e1:m.entrySet())
			{
				System.out.println(e1.getKey()+" "+e1.getValue());
			}
		 System.out.println(m);
	      for(Entry e:m.entrySet())
	      {    
	       System.out.println(e.getKey()+" "+e.getValue());    
	      }  System.out.println("------------");
	      
	      m.putIfAbsent(999,"Guru");
			for(Entry<Integer,String> e1:m.entrySet())
			{
				System.out.println(e1.getKey()+" "+e1.getValue());
			}
			//m.replaceAll(k, "Ajay");
			for(Entry<Integer,String> e2:m.entrySet())
			{
				System.out.println(e2.getKey()+" "+e2.getValue());
			}

	}

}
