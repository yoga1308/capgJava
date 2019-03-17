//Username should always end with _job and there should be at least 
//minimum of 8 characters to the left of _job. Write a function to 
//validate the same. Return true in case the validation is passed. 
//In case of validation failure return false.
package com.lab6;


public class Q6 {

	public static boolean validate(String name)
	{
		if(name.length()<8)
		{
			return false;
		}
		char[] arr = name.toCharArray();
		int len=arr.length;
		String a="";
		for(int i=len-4;i<=len-1;i++)
		{
			a=a+arr[i];
		}
		if(a.equals("_job"))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Amaaaaaaaaaan_job";
		System.out.println(validate(name));
	}

}
