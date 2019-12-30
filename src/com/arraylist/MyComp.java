package com.arraylist;

import java.util.Comparator;

public class MyComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Emp e = (Emp)o1;
		Emp e1 = (Emp)o2;
		if (e.eid == e1.eid )
		return 0;
		else if (e.eid > e1.eid)
		return 1;
		else
		return -1;

	
	}

}
