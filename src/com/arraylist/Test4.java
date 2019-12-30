package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test4 {
	public static void main(String[] args) 
		{ ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(333,"ratan"));
		al.add(new Emp(222,"anu"));
		al.add(new Emp(111,"Sravya"));
		al.add(new Emp(999,"rava"));
		Collections.sort(al,new EnameComp());
		/*for(Emp e:al) {
			System.out.println(e.eid+"---"+e.ename);
		}*/
		Collections.sort(al,new MyComp());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		Emp s=(Emp)itr.next();  
		System.out.println(s.eid+" "+s.ename);
		}
		Iterator itr1=al.iterator();  
		while(itr1.hasNext()){  
		Emp st=(Emp)itr1.next();  
		System.out.println(st.eid+" "+st.ename);
		}
		}	}