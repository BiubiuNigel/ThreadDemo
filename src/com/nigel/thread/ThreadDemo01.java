package com.nigel.thread;

public class ThreadDemo01 {

	public static void main(String[] args) {
//
//		MyThread mt = new MyThread("A");
//		MyThread mt1 = new MyThread("B");
////		mt.run();
////		mt1.run();
//		mt.start();
//		mt1.start();
		MyRunable mr1 = new MyRunable("A");
		MyRunable mr2 = new MyRunable("B");
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		t1.start();
		t2.start();
	}

}
