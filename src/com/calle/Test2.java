package com.calle;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test2 {

	public static void main(String[] args) {
		LinkedHashSet<Emp> h=new LinkedHashSet<Emp>();
		h.add(new Emp(444,"subbu"));
		h.add(new Emp(333,"Arjun"));
		h.add(new Emp(555,"Tata"));
		Iterator<Emp> itr=h.iterator();
		while(itr.hasNext())
		{
			Emp e=itr.next();
			//System.out.println(e.eid+" "+e.ename);
			//.out.println("---------------");
			if(e.eid==333)
				itr.remove();
			if(e.ename.equals("Tata"))
				itr.remove();
		}
		for(Emp e:h)
			System.out.println(e.eid+" "+e.ename);
		//System.out.println(e.eid" ");
		
		
	}

}
