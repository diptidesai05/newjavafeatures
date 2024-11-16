package com.advancedFeatures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App2 {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		FileInputStream inputStream = null;
		try {
			File file = new File("./tmp.txt");
			inputStream = new FileInputStream(file);
			
			// use the inputStream to read a file
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("in catch block");
			e.printStackTrace();
		} 
		finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		File file = new File("./tmp.txt");
		try (FileInputStream inputStream1 = new FileInputStream(file);) {
			// use the inputStream to read a file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileInputStream inputStream3 = null;
		File file1 = new File("./tmp.txt");
		inputStream = new FileInputStream(file);
		
		
	}

}
