package com.example.demo.java;

class AlternateNumber {
	private final int intmax = 10;
	private int count = 1;
	private final Object lock = new Object();

	public void Thread1() {
		synchronized (lock) {
			while (count <= intmax) {
				if (count % 3 == 1) {
					System.out.println("Thread1 " + count);
					count++;
					lock.notifyAll();
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void Thread2() {
		synchronized (lock) {
			while (count <= intmax) {
				if (count % 3 == 2) {
					System.out.println("Thread2 " + count);
					count++;
					lock.notifyAll();
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void Thread3() {
		synchronized (lock) {
			while (count <= intmax) {
				if (count % 3 == 0) {
					System.out.println("Thread3 " + count);
					count++;
					lock.notifyAll();
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}

public class Numbers{
public static void main(String args[]){
AlternateNumber alternateNumber  = new AlternateNumber();
Thread t1 = new Thread(alternateNumber::Thread1);
Thread t2 = new Thread(alternateNumber::Thread2);
Thread t3 = new Thread(alternateNumber::Thread3);
t1.start();
t2.start();
t3.start();
}
}
