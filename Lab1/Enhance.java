package com.capg.models;

public class Enhance
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}	
     public static void main(String []args)
     {
        Enhance en =new Enhance();
		System.out.println(en.add(10,23));
     }
}