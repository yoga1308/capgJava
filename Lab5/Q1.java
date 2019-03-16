package com.lab5;

public class Q1 {
	public int rec(int n)
	{
		if(n==1 || n==2)
			return 1;
		return rec(n-1)+rec(n-2);
	}

	public int nonRec(int n)
	{
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<n;i++)
		{
			a=b;
			b=c;
			c=a+b;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 q = new Q1();
		System.out.println(q.rec(9));
		System.out.println(q.nonRec(9));
	}

}
