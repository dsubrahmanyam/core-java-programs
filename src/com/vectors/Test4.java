package com.vectors;

import java.util.Iterator;
import java.util.Vector;

public class Test4 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(2,7);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(5);
		v.add(3);
		System.out.println(v.capacity());
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext())
		{ Integer x = itr.next();
		if(x%2==0)
		{ System.out.println(x);
		}
		else
		{ itr.remove();
		}
		}
		System.out.println(v);
		}
		}

