package com.empsort1;

import java.util.Comparator;



public class MyComp1 implements  Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Emp1 e1=(Emp1)o1;
		Emp1 e2=(Emp1)o2;
		 if(e1.eid==e2.eid)
		return 0;
		 else if(e1.eid>e2.eid)
			return 1;
		else
			return -1;
	}
}
