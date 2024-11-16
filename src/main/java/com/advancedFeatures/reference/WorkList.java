package com.advancedFeatures.reference;

public class WorkList {
	
	public static void doTask() {
		
		System.out.println("this is a new task method in class WorkList");
	}
	
	public static void threadTask() {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void printNumber() {
		
		for(int i=1; i<=10; i++) {
			System.out.println("Jai Shree Ram");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
