package com.advancedFeatures.streamapi;

@FunctionalInterface
public interface Process<T> {
	
	T process(T t);

}
