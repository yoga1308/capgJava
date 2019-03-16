package com.wrapper;

import java.util.Scanner;

class Myexception extends Exception
{
	Myexception()
	{
		System.out.println("Please enter correct values");
	}
}

abstract class Account
{
	double interestRate;
	double amount;
	abstract double calculateInterest();
}
class SBAccount extends Account
{
	public double calculateInterest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the SB amount:");
		amount=sc.nextDouble();
		System.out.println("Enter type of account Normal or NRI");
		String type = sc.next();
		try
		{
		if(amount<1)
		{
			throw new Myexception();
		}
		if(!(type.toLowerCase()).equals("normal") || !(type.toLowerCase()).equals("nri")) 
		{
			throw new Myexception();
		}
		}
		catch(Myexception e)
		{
			
		}
		if((type.toLowerCase()).equals("normal"))
		{
			interestRate=4;
		}
		else if((type.toLowerCase()).equals("nri"))
		{
			interestRate=6;
		}
		return (amount*interestRate)/100; 
	}
}

class FDAccount extends Account
{
	public double calculateInterest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FD amount:");
		amount=sc.nextDouble();
		System.out.println("Enter the number of days:");
		int days=sc.nextInt();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try
		{
		if(amount<1)
		{
			throw new Myexception();
		}
		if(days<1)
		{
			throw new Myexception();
		}
		if(age<1)
		{
			throw new Myexception();
		}
		}
		catch(Myexception e)
		{
		}
		if(this.amount<10000000)
		{
			if(age<60)
			{
				if(days>=7 && days <=14)
				{
					interestRate=4.50;
				}
				else if(days>=15 && days <=29)
				{
					interestRate=4.75;
				}
				else if(days>=30 && days <=45)
				{
					interestRate=5.50;
				}
				else if(days>=46 && days <=60)
				{
					interestRate=7;
				}
				else if(days>=61 && days <=184)
				{
					interestRate=7.50;
				}
				else if(days>184)
				{
					interestRate=8.00;
				}
			}
			else
			{
				if(days>=7 && days <=14)
				{
					interestRate=5.00;
				}
				else if(days>=15 && days <=29)
				{
					interestRate=5.25;
				}
				else if(days>=30 && days <=45)
				{
					interestRate=6.00;
				}
				else if(days>=46 && days <=60)
				{
					interestRate=7.50;
				}
				else if(days>=61 && days <=184)
				{
					interestRate=8.00;
				}
				else
				{
					interestRate=8.50;
				}
			}		
		}
		else
		{
			if(days>=7 && days <=14)
			{
				interestRate=6.50;
			}
			else if(days>=15 && days <=29)
			{
				interestRate=6.75;
			}
			else if(days>=30 && days <=45)
			{
				interestRate=6.75;
			}
			else if(days>=46 && days <=60)
			{
				interestRate=8;
			}
			else if(days>=61 && days <=184)
			{
				interestRate=8.50;
			}
			else
			{
				interestRate=10.00;
			}
		}
		return (interestRate*amount)/100;
	}
	
}

class RDAccount extends Account
{
	public double calculateInterest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the RD amount:");
		amount=sc.nextDouble();
		System.out.println("Enter Maturity period:");
		int months=sc.nextInt();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try
		{
		if(amount<1)
		{
			throw new Myexception();
		}
		if(months!=6||months!=9||months!=12||months!=15||months!=18||months!=21)
		{
			throw new Myexception();
		}
		if(age<1)
		{
			throw new Myexception();
		}
		}
		catch(Myexception e)
		{
		}
		if(age<60)
		{
			if(months==6)
			{
				interestRate=7.50;
			}
			else if(months==9)
			{
				interestRate=7.75;
			}
			else if(months==12)
			{
				interestRate=8.00;
			}
			else if(months==15)
			{
				interestRate=8.25;
			}
			else if(months==18)
			{
				interestRate=8.50;
			}
			else if(months==21)
			{
				interestRate=8.75;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			if(months==6)
			{
				interestRate=8.00;
			}
			else if(months==9)
			{
				interestRate=8.25;
			}
			else if(months==12)
			{
				interestRate=8.50;
			}
			else if(months==15)
			{
				interestRate=8.75;
			}
			else if(months==18)
			{
				interestRate=9.00;
			}
			else if(months==21)
			{
				interestRate=9.25;
			}
		}
		return (months*30.5*interestRate*amount)/100;
	}
}


public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt=1;
		do
		{
			Scanner sc =new Scanner(System.in);
		System.out.println("Select the option:");
		System.out.println("\t\t1. Interest Calculator-SB");
		System.out.println("\t\t2. Interest Calculator-FD");
		System.out.println("\t\t3. Interest Calculator-RD");
		System.out.println("\t\t4. exit");
		opt=sc.nextInt();
		if(opt==2)
		{
			FDAccount fd =new FDAccount();
			double gain=fd.calculateInterest();
			System.out.println("Interest gained is "+gain);
		}
		else if(opt==3)
		{
			RDAccount fd =new RDAccount();
			double gain=fd.calculateInterest();
			System.out.println("Interest gained is "+gain);
		}
		else if(opt==1)
		{
			SBAccount sb = new SBAccount();
			double gain=sb.calculateInterest();
			System.out.println("Interest gained is "+gain);
		}
		}while(opt!=4);
	}
}

