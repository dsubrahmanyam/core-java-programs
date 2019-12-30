package com.threads;

class ThreadB extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("child thread start calclulation");
		}
		for (int i = 1; i <= 100; i++) {
			total = total + i;
		}
		System.out.println("child thread tyring to give notification");

		this.notify();
	}
}

public class ThreadA {
	public static void main(String[] args) throws Exception {
		ThreadB t = new ThreadB();
		t.start();
		//Thread.sleep(1000);
		// t.join();
		synchronized (t) {
			System.out.println("main thread tying to call wait() method");
			t.wait(1000);// IllegalMonitorStateException(declare in side synchronized Area)
			System.out.println("child thread get notification");
			System.out.println(t.total);
		}
	}
}