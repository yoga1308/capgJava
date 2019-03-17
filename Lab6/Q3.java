//Write a Java program that displays the number of characters, 
//lines and words in a text? 
package com.lab6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f =new FileReader("C:\\\\Capg\\\\Project1\\\\src\\\\com\\\\lab6\\\\Q2.java");
			int  i=0;
			int count=0;
			int count1=0;
			int count2=0;
			while((i=f.read())!=-1)
			{
				count++;
				if((char)i==' ')
				{
					count1++;
				}
				if((char)i=='\n')
				{
					count1++;
					count2++;
				}
			}
			f.close();
			System.out.println("no of characters are :"+count);
			System.out.println("no of words are :"+count1);
			System.out.println("no of Lines are :"+count2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
}
}