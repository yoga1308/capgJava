package com.lab3;

public class Q4 {

	public static void count(char[] arr)
	{
		int count=0;
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			flag=true;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			for(int k=0;k<i;k++)
			{
				if(arr[k]==arr[i])
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("char "+arr[i]+" occurs "+count+" times");
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'a','a','a','b','d','c','b','d','A','A','B','1','2','2'};
		count(arr);
	}

}
