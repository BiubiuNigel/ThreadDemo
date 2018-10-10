package com.nigel.thread;

class MyThreadDemo implements Runnable {
	
	private int ticket = 5;
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				tell();
//				if(ticket > 0) {
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println("Ticket: " + Thread.currentThread().getName() + " : "+ ticket--);
//				}
			}
		}
	}
	
	public synchronized void tell() {
		if(ticket > 0) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Ticket: " + Thread.currentThread().getName() + " : "+ ticket--);
		}
	}
}

public class ThreadDemo05 {

	public static void main(String[] args) {
		MyThreadDemo myThreadDemo = new MyThreadDemo();
		Thread t1 = new Thread(myThreadDemo,"A");
		Thread t2 = new Thread(myThreadDemo,"B");
		Thread t3 = new Thread(myThreadDemo,"C");
		t1.start();
		t2.start();
		t3.start();
	}

}
