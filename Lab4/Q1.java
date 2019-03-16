//Create a method to find the sum of the cubes of the digits of an n digit number
package com.lab4;

public class Q1 {

	public static int cubes(int d)
	{
		int temp=d;
		int sum=0;
		while(temp!=0)
		{
			int i =temp%10;
			sum=sum+i*i*i;
			temp=temp/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println(cubes(123));
	}
}
