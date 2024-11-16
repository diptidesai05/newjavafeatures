package com.advancedFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.advancedFeatures.functionalInterface.EvenOrOdd;
import com.advancedFeatures.functionalInterface.GenericFunctionalInterface;
import com.advancedFeatures.functionalInterface.ReverseString;
import com.advancedFeatures.functionalInterface.constantMathValues;
import com.advancedFeatures.streamapi.Process;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Functional Interface Demo");
        
        System.out.println("ConstantMathValue interface");
        constantMathValues obj;
        
        //lambda expression
        obj = () -> 3.1415;
        
        System.out.println("Value of Pi "+ obj.getPiValue());
        
        System.out.println("EvenOrOdd interface");
        
        EvenOrOdd obj1;
        
        obj1 = (n) -> { if(n%2==0) return true; else return false;};
        
        boolean even=obj1.isEven(10);
        
        System.out.println("even "+even);
        
        System.out.println("ReverseString interface");
        
        ReverseString obj2;
        
        obj2 = (str) -> {
        	  StringBuilder strBuild = new StringBuilder(str);
        	  return  strBuild.reverse().toString();
        };
        
        System.out.println("Reverse String "+obj2.reverseStr("Dipti Lazy"));
        
        System.out.println("GenericFunctional interface");
        
        GenericFunctionalInterface<String> obj3;
        
        obj3 = (str) -> {
        	int len = str.length();
        	return "Length"+len;
        };
        System.out.println("Length of String "+obj3.func("Dipti"));
        //System.out.println("Length of String "+obj3.func(null)); null pointerexception
        
        Process<List<String>> obj4;
        
        System.out.println("Stream API example with lambda expression");
        
        obj4 = (names) -> {
        	List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        	System.out.println("result "+result);
        	return result;
        };
 
        List<String >names = Arrays.asList("Reflection", "Collection", "Sorry"); 
        
        System.out.println("Strings starting with S"+obj4.process(names));
        
    }
}
