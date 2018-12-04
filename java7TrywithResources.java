package com.java.version.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class java7TrywithResources {

	private static final String FILENAME = "D:\\testFile.txt";

	public static void main(String[] args) {
       // try-with-resources - introduced in java 7
		try(BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}

	}


}
