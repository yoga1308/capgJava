//Write a Java program that reads on file name from the user, 
//then displays information about whether the file exists, 
//whether the file is readable, whether the file is writable, 
//the type of file and the length of the file in bytes?  
package com.lab6;

import java.io.File;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		File f =new File("C:\\Capg\\Project1\\src\\com\\lab6\\Q2.java");
		if(f.canExecute())
		{
			System.out.println("File is Executable");
		}
		if(f.canRead())
		{
			System.out.println("File is Readable");
		}
		if(f.canWrite())
		{
			System.out.println("File is Writable");
		}
		if(f.isDirectory())
		{
			System.out.println("File is Directory");
		}
		else
		{
			System.out.println("File is Document");
		}
		System.out.println("File size is "+f.length()+" Bytes");
		sc.close();
	}
	

}
