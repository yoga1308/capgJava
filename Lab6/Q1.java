//Write a Java program that reads a line of integers and then displays each integer and the sum of all integers.
//(Use StringTokenizer class)?
package com.lab6;

import java.util.StringTokenizer;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer s =new StringTokenizer("23 34 56 7 8 54 90 45");
		int sum=0;
		while(s.hasMoreTokens())
		{
			int a = Integer.parseInt(s.nextToken());
			System.out.println(a);
			sum=sum+a;
		}
		System.out.println("Sum of the numbers is: "+sum);
	}

}
