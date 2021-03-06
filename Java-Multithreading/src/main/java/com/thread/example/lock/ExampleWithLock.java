package com.thread.example.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// TODO: Auto-generated Javadoc
/**
 * The Class ExampleWithLock.
 */
public class ExampleWithLock {

	/** The lock. */
	private static Lock lock = new ReentrantLock();

	/**
	 * Test thread.
	 *
	 * @throws InterruptedException the interrupted exception
	 */
	public static void testThread() throws InterruptedException {

		lock.lock();
		System.out.println("In Side Run Method Before Sleeping : " + Thread.currentThread().getName());
		Thread.sleep(5000);
		System.out.println("In Side Run Method After Sleeping : " + Thread.currentThread().getName());
		lock.unlock();
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			try {
				testThread();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.setName("Thread1");
		t1.start();

		Thread t2 = new Thread(() -> {
			try {
				testThread();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t2.setName("Thread2");
		t2.start();

		Thread t3 = new Thread(() -> {
			try {
				testThread();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t3.setName("Thread3");
		t3.start();

		Thread t4 = new Thread(() -> {
			try {
				testThread();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t4.setName("Thread4");
		t4.start();

	}

}
