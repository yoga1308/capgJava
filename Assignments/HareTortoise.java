package com.Assignments;


class Race implements Runnable
{
	public void run() {
		for(int i=0;i<100;i++)
		{
			if(Thread.currentThread().getName().equals("Hare")&& i==60)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" runs "+i+" meters");
		}
		System.out.println(Thread.currentThread().getName()+" wins");
		System.exit(0);
	}
}
public class HareTortoise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Race m = new Race();
		Thread t1= new Thread(m,"Hare");
		Thread t2= new Thread(m,"Tortoise");
		t1.setPriority(8);
		t1.start();
		t2.start();

	}

}
