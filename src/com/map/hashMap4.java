package com.map;

import java.util.HashMap;

public class hashMap4 {
	public static void main(String[] args) throws InterruptedException {
		 HashMap m = new HashMap();
		Temp t = new Temp();
		   m.put(t, "Durga");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
		}
		}
		class Temp {
		public String toString() {
		return "temp";
		}
		public void finalize() {
		System.out.println("finalize() Called");
}
}