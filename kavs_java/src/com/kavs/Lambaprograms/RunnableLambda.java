package com.kavs.Lambaprograms;

public class RunnableLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable basic =()->{String threadName=Thread.currentThread().getName();
		System.out.println("Thread Name : "+ threadName);};
		
		Thread t1 = new Thread(basic);
		Thread t2 = new Thread(basic);
		t1.start();
		t2.start();
		
		t1.run();
		t2.run();
	}
}
