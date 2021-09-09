package com.revature.app.threads;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread mainThread = Thread.currentThread();
		
		
		ThreadDemo thread1= new ThreadDemo();
		ThreadDemo thread2= new ThreadDemo();
		ThreadDemo thread3= new ThreadDemo();
		ThreadDemo thread4= new ThreadDemo();
		ThreadDemo thread5= new ThreadDemo();
	
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		thread1.join();
	
		thread2.join();
		thread3.join();
		thread4.join();
		thread5.join();
		
		System.out.println("Main(" + mainThread.getName()+") thread...");
		
		
		//ThreadDemo thread = new ThreadDemo();
		//thread.start();
		
		
		/*ThreadDemoRunnable runnable = new ThreadDemoRunnable();
		Thread threadRunnable = new Thread(runnable);
		threadRunnable.start();
		System.out.println("Main(" + mainThread.getName()+") thread...");
		*/
		

	}

}
