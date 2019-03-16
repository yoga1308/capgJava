package com.lab7;
import java.util.HashMap;
import java.util.Map;
public class coll2 {
	public HashMap<Character,Integer> countCharacter(char[] arr)
	{
		HashMap<Character,Integer> m = new HashMap<Character,Integer>(); 
		int count=0;
		for(char ch:arr)
		{
			for(char ch1:arr)
			{
				if(ch==ch1)
				{
					count++;
				}
			}
			m.put(ch,count);
			count=0;
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'a','a','a','b','c','c'};
		coll2 c = new coll2();
		System.out.println(c.countCharacter(arr));
	}

}
