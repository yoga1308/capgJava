package com.lab5;
import com.cg.eis.exception.*;
class Emplyoee
{
	int salary;
	Emplyoee(int sal)
	{
		try
		{
			if(sal<30000)
				throw new EmplyoeeException();
			else
			{
				System.out.println("Salary is in range");
			}
		}
		catch (EmplyoeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
	}
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Emplyoee e =new Emplyoee(250000);
	}

}
