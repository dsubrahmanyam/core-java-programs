package com.empsort1;

import java.util.Comparator;

public class EidComp implements Comparator<Emp1>{

	@Override
	public int compare(Emp1 e1, Emp1 e2) {
		// TODO Auto-generated method stub
		return e1.ename.compareTo(e2.ename);
	}

}
