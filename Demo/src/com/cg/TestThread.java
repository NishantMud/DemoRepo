package com.cg;


public class TestThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello I am a thread...");
		
	}
	
	
	public static void main(String[] args) {
		
		TestThread t = new TestThread();
		t.start();
		TestThread t1 = new TestThread();
		
		try {
			System.out.println(t.getName()+" "+t.getPriority()+" "+t.getState());
			t.sleep(3000);
			t1.start();
			System.out.println(t1.getName()+" "+t1.getPriority()+" "+t1.getState());
			t1.join();
			if(t1.interrupted()) {
				System.out.println("Alive");
			}
			else {
				System.out.println("Dead");
			}
			//System.out.println(t1.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
