//Write a Java program that reads a file and displays the file on the screen, with 
//a line number before each line
package com.lab6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Capg\\Project1\\src\\com\\lab6\\Q2.java");
		try {
			FileReader in = new FileReader(f);
			BufferedReader b = new BufferedReader(in);
			int i=1;
			String line="";
			while((line = b.readLine())!=null)
				System.out.println((i++)+" "+line);
			in.close();
			b.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
