package com.Assignments;

import java.util.ArrayList;
import java.util.Scanner;





public class EmpReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> arr = new ArrayList<Employee>();
		System.out.println("Enter the Number of Employees");
		int val=sc.nextInt();
		String fname;
		String lname;
		long mobile;
		String email;
		String address;
		for(int i=0;i<val;i++)
		{
			System.out.println("Enter Employee "+(i+1)+" Details: ");
			System.out.println("Enter the Firstname");
			fname=sc.next();
			System.out.println("Enter the Lastname");
			lname=sc.next();
			System.out.println("Enter the Mobile");
			mobile=sc.nextLong();
			System.out.println("Enter the Email");
			email=sc.next();
			System.out.println("Enter the Address");
			address=sc.next();
			arr.add(new Employee(fname, lname, mobile, email, address));
		}
		arr.sort((e1,e2)->e1.getFname().compareTo(e2.getFname()));
		System.out.println("Employee List:");
		System.out.format("%-15s %-15s %-15s %-30s %15s\n","Firstname","Lastname","Mobile","Email","Address");
		for(Employee e:arr)
		{
			System.out.format("%-15s %-15s %-15s %-30s %15s\n",e.getFname(),e.getLname(),e.getMobile(),e.getEmail(),e.getAddress());
		}
	}

}
