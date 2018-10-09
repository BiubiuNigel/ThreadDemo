package com.nigel.thread;

public class MyRunable implements Runnable{
	
	private String name;
	public MyRunable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + " : " + i);
		}
	}
}
