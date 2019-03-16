package com.lab7;

import java.util.HashMap;

public class Coll3 {
	public HashMap<Integer,Integer> getSquares(int[] arr)
	{
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>(); 
		for(int i:arr)
		{
			m.put(i,i*i);
		}
		return m;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,5,6,78,90};
		Coll3 c = new Coll3();
		System.out.println(c.getSquares(arr));
	}

}
