package com.Assignments;

import java.util.ArrayList;
import java.util.Iterator;

class myThread implements Runnable
{
	private ArrayList<String> Wall = new ArrayList<String>();
	public void run() {
		for(int i=0;i<100;i++)
		{
			synchronized (this)
			{
			if(Thread.currentThread().getName().equals("red"))
			{
					Wall.add(" RED ");
					//System.out.print(" RED ");
					notify();
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			else
			{
				Wall.add(" BLACK ");
				//System.out.print(" BLACK ");
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		}
	}

	public ArrayList<String> getWall() {
		return Wall;
	}
}



public class BrickWall {

	
	public static void main(String[] args) throws InterruptedException
	{
		myThread m = new myThread();
		Thread t1= new Thread(m,"red");
		Thread t2= new Thread(m,"black");
		t1.start();
		t2.start();
		t1.join();
		System.out.println("Wall Created");
		ArrayList<String> al = m.getWall();
		System.out.println(al.size());
		Iterator<String> it = al.iterator();
		int count =0;
		while(it.hasNext())
		{
			if(count<6)
			{
				count++;
				System.out.print(it.next());
			}
			else
			{
				System.out.println(it.next());
				System.out.println();
				count=0;
			}
		}

		
	}
	
}
