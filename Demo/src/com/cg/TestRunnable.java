package com.cg;

public class TestRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello I am a thread");
	}
	
	public static void main(String[] args) {
		
		TestRunnable runnable = new TestRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		
	}

}
