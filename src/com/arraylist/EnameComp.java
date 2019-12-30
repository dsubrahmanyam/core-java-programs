package com.arraylist;

import java.util.Comparator;

public class EnameComp implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		Emp e3=(Emp)e1;
		Emp e4=(Emp)e2;
		return e3.ename.compareTo(e4.ename);
	}

}
