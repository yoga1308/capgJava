package com.lab5;

import java.util.Scanner;
class MyException1 extends Exception
{
	public String getMessage()
	{
		return "Age of a person should be above 15";
	}
}
public class Q3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter age");
		int f=sc.nextInt();		
		try
		{
			if(f<=15)
			{
				throw new MyException1();
			}
			else
			{
				System.out.println("valid age");
			}
		}
		catch(MyException1 e)
		{
			System.out.println(e.getMessage());
		}
	}

}

