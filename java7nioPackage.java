package com.java.version.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class java7nioPackage {
	
	public static void main(String []args) {
		newBufferedReader();
		readAllLines();
	}
	public static void readAllLines() {
		System.out.println("readAllLines");
		Path path = Paths.get("D:\\testFile.txt");
		try {
			List<String>  contents = Files.readAllLines(path);
			for(String content:contents){//for each line of content in contents
				System.out.println(content);// print the line
			}
		} catch (IOException ex) {
			ex.printStackTrace();//handle exception here
		}
	}
	public static void newBufferedReader() {
		System.out.println("newBufferedReader");
		Path path = Paths.get("D:\\testFile.txt");
	    try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){
	      String currentLine = null;
	      while((currentLine = reader.readLine()) != null){//while there is content on the current line
	        System.out.println(currentLine); // print the current line
	      }
	    }catch(IOException ex){
	      ex.printStackTrace(); //handle an exception here
	    }
	}

}
