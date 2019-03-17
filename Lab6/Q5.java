//Create a method that accepts a String and checks if it is a 
//positive string. A string is considered a positive string, 
//if on moving from left to right each character in the String 
//comes after the previous characters in the Alphabetical order. 
package com.lab6;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ANTA";
		s=s.toLowerCase();
		char[] arr=s.toCharArray();
		boolean flag=true;
		for(int i=0;i<s.length()-1;i++)
		{
			if(arr[i+1]<arr[i])
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Positive String");
		}
		else
		{
			System.out.println("Not Positive String");
		}
	}

}
