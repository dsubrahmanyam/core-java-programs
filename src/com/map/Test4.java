package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
	HashMap<Emp,Student> h=new HashMap<Emp,Student>();
	h.put(new Emp(111,"ratan"),new Student(000,"rajuu"));
	h.put(new Emp(222,"rani"),new Student(777,"king"));
	Set ss=h.entrySet();
	Iterator itr=ss.iterator();
	while(itr.hasNext())
	{
		Map.Entry m=(Map.Entry)itr.next();
		Emp e=(Emp)m.getKey();
		System.out.println(e.eid+" ----"+e.ename);
		Student sss=(Student)m.getValue();
		System.out.println(sss.sid+"---"+sss.sname);
	}
	
	
	// TODO Auto-generated method stub

	}

}
