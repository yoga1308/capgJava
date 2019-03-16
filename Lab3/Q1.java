//Create a method which accepts an array of integer elements and return the second smallest element in the array
package com.lab3;

public class Q1 {

	public static int getSecondSmallest(int[] arr)
	{
		int f=Integer.MAX_VALUE;
		int s=Integer.MAX_VALUE;
		for(int a:arr)
		{
			if(a>f && a<s)
			{
				s=a;
			}
			else if(a<f)
			{
			
				s=f;
				f=a;
			}
				
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,12,34,546,323};
		System.out.println(getSecondSmallest(arr));
	}

}
