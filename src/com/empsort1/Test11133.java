package com.empsort1;

import java.util.ArrayList;
import java.util.Collections;


public class Test11133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp1> a=new ArrayList<Emp1>();
		a.add(new Emp1(111,"yiran"));
		a.add(new Emp1(555,"qam"));
		a.add(new Emp1(777,"xam"));
		Collections.sort(a,new EidComp());
		for(Emp1 e1:a)
		{
			System.out.println(e1.eid+" "+e1.ename);
		}

	}

}
