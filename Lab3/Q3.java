//Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
package com.lab3;

public class Q3 {

	public static int[] getSorted(int[] arr)
	{
		StringBuilder[] a=new StringBuilder[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			StringBuilder temp = new StringBuilder(arr[i]+"");
			a[i]=temp.reverse();
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(a[i].toString());
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,2,345,465,7,2,1,123};
		arr=getSorted(arr);
		for(int a:arr)
		{
			System.out.println(a);
		}
		
	}

}
