package com.nigel.thread;

class RunableDemo implements Runnable{

	private String name;

	public RunableDemo(String name ) {
		
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
//			try {
//				Thread.sleep(1000);
//				System.out.println(name + " :" + i);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("Current Thread: " + Thread.currentThread().getName());
			System.out.println(name + " :" + i);
			if(i == 10) {
				System.out.println("礼让");
				Thread.yield();
			}
		}
	}


}

public class ThreadDemo03 {

	public static void main(String[] args) {
		RunableDemo runableDemo1 = new RunableDemo("B");
		RunableDemo runableDemo = new RunableDemo("A");
		Thread thread = new Thread(runableDemo);
		Thread thread1 = new Thread(runableDemo1);
//		System.out.println(thread.isAlive());
		thread.start();
		thread1.start();

		//强制执行
//		for(int i = 0; i < 50; i++) {
//			if(i>10) {
//				try {
//					thread.join();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			System.out.println("主线程: " + i);
//		}
//		System.out.println(thread.isAlive());
//		thread1.start();
	}

}
