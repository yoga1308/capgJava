package com.lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileProgramm {
	public static void main(String[] args)
	{
		CopyDataThread cp = new CopyDataThread("D:\\p1.txt","D:\\p2.txt");
		Thread t1 = new Thread(cp,"1st");
		t1.start();
	}

}
