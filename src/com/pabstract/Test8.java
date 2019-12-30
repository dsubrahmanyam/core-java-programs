package com.pabstract;

abstract class Test0 {
	abstract void m1();

	abstract void m2();

	abstract void m3();

	abstract void m4();
}

abstract class Test6 extends Test0 {
	void m1() {
		System.out.println("m1() method");
	}
}

abstract class Test9 extends Test6 {
	void m2() {
		System.out.println("m2() method");
	}
}

abstract class Test10 extends Test9 {
	void m3() {
		System.out.println("m3() method");
	}
}

class Test8 extends Test10 {
	void m4() {
		System.out.println("m4() method");
	}

	public static void main(String[] args) {
		Test8 t = new Test8();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		// TODO Auto-generated method stub

	}

}
