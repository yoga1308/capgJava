package com.lab8;

public class Q2 implements Runnable {
	
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==11)
			{
				i=1;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 q = new Q2();
		Thread t = new Thread(q);
		t.start();
	}

}
