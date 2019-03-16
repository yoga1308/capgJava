package com.lab5;

import java.util.Scanner;

class MyException extends Exception
{
	MyException()
	{
		System.out.println("enter first name and last name");
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first name");
		String f=sc.nextLine();
		System.out.println("Enter second name");
		String s=sc.nextLine();		
		try
		{
			if(f.isEmpty() || s.isEmpty())
			{
				throw new MyException();
			}
			else
			{
				System.out.println("valid name");
			}
		}
		catch(MyException e)
		{
		//	System.out.println("errorrrrrrr");
			//e.printStackTrace();
		}
		sc.close();

}
}
