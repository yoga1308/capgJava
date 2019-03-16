package com.lab7;
import java.util.*;
public class Coll1 {
	public static List<String> getValues(HashMap<String,String> a)
	{
		Set<String> s = new TreeSet<String>(a.values());
		List<String> b=new ArrayList<String>(s);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> a = new HashMap<String,String>();
		a.put("a","aman");
		a.put("aa","aaman");
		a.put("y","yoga");
		a.put("s","sairam");
		List<String> b= getValues(a);
		System.out.println(b);
	}

}
