package com.advancedFeatures.reference;

import java.util.List;

public class StreamMain {

	public static void main(String[] args) {
		
		System.out.println("Method reference in Stream ");
		List<Integer> integers = List.of(14, 125, 489, 789, 741, 895);
		
		System.out.println(integers);
		/*
		integers.stream().forEach((e) -> {
			System.out.println(e);
		}); 
		*/
		integers.stream().forEach(System.out::println);
		
	}

}
