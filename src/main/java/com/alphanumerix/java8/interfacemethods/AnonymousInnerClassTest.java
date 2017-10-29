package com.alphanumerix.java8.interfacemethods;

/** 
 * This is an example for Anonymous Inner classes.
 * This is a popular way to handle Single Abstract Method(SAM) interfaces
 * @author vasanth
 *
 */
public class AnonymousInnerClassTest {
	
	public static void main(String args[]) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread-A is created and running");
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread-B is created and running");
			}
		}).start();
	}

}
