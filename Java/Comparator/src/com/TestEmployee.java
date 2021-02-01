package com;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class TestEmployee
{
	public static void main(String args[]){ 
	Scanner sc=new Scanner(System.in);
	ArrayList<Employee> al=new ArrayList<>();  
	al.add(new Employee(111,"Jaya Sai",55800));  
	al.add(new Employee(444,"Keerthi",320000));  
	al.add(new Employee(333,"Seeta",334000));  
	al.add(new Employee(666,"Pavan" ,960000));
	System.out.println("Sort the document by \n 1.Id \n 2.Name \n 3.salary");
	int a=sc.nextInt(); 
	switch (a)
	{
		case 1:
		{
			System.out.println("Sort by Id in \n 1->Ascending Order \n 2->Descending Order");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
					System.out.println("Sorted by Id in Ascending Order:");  
					Collections.sort(al,new Id());
					for(Employee e: al)
					{
						System.out.println(e.id+" "+e.name+" "+e.salary);
					}
					break;
				}
				case 2:
				{
					List empList = (List) Arrays.asList(al);
					Collections.reverse(al);
					System.out.println("Sorted by Id in Descending Order:");
					printArrayList(al);
					for(Employee e: al)
					{
						System.out.println(e.id+" "+e.name+" "+e.salary);  			
					} 
					break;
				}
			}
		}
		case 2:
		{
			System.out.println("Sort by Name in \n 1->Ascending Order \n 2->Descending Order");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
					System.out.println("Sorted by Name in Ascending Order:");  
					Collections.sort(al,new Name());  
					for(Employee e: al)
					{  
						System.out.println(e.id+" "+e.name+" "+e.salary);  			
					} 
					break;
				}
				case 2:
				{
					List empList = (List) Arrays.asList(al);
					Collections.reverse(al);
					System.out.println("Sorted by Name in Descending Order:");
					printArrayList(al);
					for(Employee e: al)
					{  
						System.out.println(e.id+" "+e.name+" "+e.salary);  			
					} 
					break;
				}
			}
		}
		case 3:
		{
			System.out.println("Sort by Salary in\n 1->Ascending Order \n 2->Descending Order");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
					System.out.println("Sort by Salary in Ascending Order:");  
					Collections.sort(al,new Salary());  
					for(Employee e: al)
					{  
						System.out.println(e.id+" "+e.name+" "+e.salary);  			
					} 
					break;
				}
				case 2:
				{
					List empList = (List) Arrays.asList(al);
					Collections.reverse(al);
					System.out.println("Sort by Salary in Descending Order:");
					printArrayList(al);
					for(Employee e: al)
					{  
						System.out.println(e.id+" "+e.name+" "+e.salary);  			
					} 
					break;
				}
			}
		}
		default:
			break;
	}
  
}

private static void printArrayList(ArrayList<Employee> al) 
{
	// TODO Auto-generated method stub
	
}




}

 
