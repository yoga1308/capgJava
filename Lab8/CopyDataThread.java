package com.lab8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread implements Runnable
{
	private String f1;
	private String f2;
	public CopyDataThread(String f1, String f2)
	{
		this.f1=f1;
		this.f2=f2;
	}
	public void run()
	{
		FileReader fr;
		FileWriter fw;
		try {
			 fr= new FileReader(f1);
			 fw= new FileWriter(f2,true);
			int i=0;
			int count=0;
			System.out.println("Coping Started");
			while((i =fr.read())!=-1)
			{
				
				if(count<10)
				{
					count++;
					fw.write((char)i);
				}
				else
				{
				fw.flush();
				count=0;
				System.out.println("10 characters are copied");
				Thread.sleep(5000);
				}
			}
			System.out.println("Coping completed");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
}
