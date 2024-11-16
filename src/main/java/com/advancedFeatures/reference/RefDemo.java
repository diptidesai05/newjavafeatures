package com.advancedFeatures.reference;

public class RefDemo {

	public static void main(String[] args) {

		System.out.println("Method Reference example");
		System.out.println("static method reference  example");
		// static method reference 
		// classname::staticmethodname
		WorkInterface workInterfaceObj = WorkList::doTask;
		/*WorkInterface workInterfaceObj = () -> {
			System.out.println("this is a new task method");
		};*/
		workInterfaceObj.doTask();	
		Runnable r1 = WorkList::threadTask;
		Thread d = new Thread(r1);
		d.start();
		System.out.println("non static method reference  example");
		//refering non static method
		WorkList ob1= new WorkList();
		Runnable r2 = ob1::printNumber;
		Thread d1 = new Thread(r2);
		d1.start();
	}

}
