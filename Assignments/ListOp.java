package com.Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<String> l= new ArrayList<String>();
		int i=0;
		do
		{
			i=0;
			System.out.println("1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit ");
			i=sc.nextInt();
			if(i==1)
			{
				System.out.println("Enter the item to be inserted:");
				l.add(sc.next());
				System.out.println("Inserted successfully ");
			}
			else if(i==2)
			{
				System.out.println("Enter the item to search :");
				if(l.contains(sc.next()))
				{
					System.out.println("Item found in the list");
				}
				else
				{
					System.out.println("Item not found in the list");
				}
			}
			else if(i==3)
			{
				System.out.println("Enter the item to delete :");
				if(l.remove(sc.next()))
				{
					System.out.println("Deleted successfully ");
				}
				else
				{
					System.out.println("Item does not exist.");
				}
			}
			else if(i==4)
			{
				System.out.println(" The Items in the list are : ");
				Iterator<String> it=l.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				
			}
		}while(i!=5);
	}

}
