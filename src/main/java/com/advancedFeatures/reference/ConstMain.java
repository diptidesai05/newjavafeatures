package com.advancedFeatures.reference;

public class ConstMain {

	public static void main(String[] args) {
		
		System.out.println("Learning constructor reference ");
		//using lambda
		StudentProvider provider=() -> {
			return new Student();
		};
		
		Student s = provider.getStudent();
		//using constructor reference
		StudentProvider provider1=Student::new;
		
		Student s1 = provider.getStudent();
	}

}
