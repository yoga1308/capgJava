package com.week3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Execut1 {
	public static void main(String[] args)
	{
		Runnable r=()->{System.out.println(Thread.currentThread().getName());};
		Executor e =Executors.newCachedThreadPool();
		for(int i=0;i<20;i++)
		{
			e.execute(r);
		}
	}

}
