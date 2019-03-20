package com.week3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Execut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{System.out.println("Thread is running");};
		ScheduledThreadPoolExecutor s=(ScheduledThreadPoolExecutor)
				Executors.newScheduledThreadPool(1);
		s.scheduleAtFixedRate(r, 2, 2, TimeUnit.SECONDS);
		Runnable r1=()->{s.shutdown(); System.out.println("HAI");};
		s.schedule(r1, 11, TimeUnit.SECONDS);
	}

}
