package com.lab3;

import java.util.Arrays;

//Create a method that can accept an array of String objects and sort in alphabetical order. 
//The elements in the left half should be completely in uppercase and the elements in the right 
//half should be completely in lower case. Return the resulting array.
public class Q2 {
	public static String[] change(String[] a)
	{
		Arrays.sort(a);
		for(int i=0;i<=a.length/2;i++)
		{
			a[i]=a[i].toUpperCase();
		}
		for(int i=a.length/2;i<a.length;i++)
		{
			a[i]=a[i].toLowerCase();
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"aman","yoga","teja","gade","kv"};
		a=change(a);
		for(String z:a)
		{
			System.out.println(z);
		}
	}

}
