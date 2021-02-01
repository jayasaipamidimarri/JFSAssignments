import java.util.Scanner;
class Student
{
	Scanner s=new Scanner(System.in);
	int stid;		
	String stname ;
	int age;
	//int []marks=new int[4];
	int marks;
	int total=0;
	char grade ;
	void read()
	{
		System.out.println("Enter Student Details");
		System.out.println("Enter id of Student:");
		stid=s.nextInt();
		s.nextLine();
		System.out.println("Enter Name of Student ");
		stname=s.nextLine();
		System.out.println("Enter Age of Student:");
		age=s.nextInt();
		s.nextLine();
		System.out.println("Enter Marks of Student: ");
		System.out.println("Enter maths marks:");
		marks=s.nextInt();
		total=total+marks;
		System.out.println("Enter physics marks:");
		marks=s.nextInt();
		total=total+marks;
		System.out.println("Enter chemistry marks:");
		marks=s.nextInt();
		total=total+marks;
		System.out.println("Enter biology marks:");
		marks=s.nextInt();
		total=total+marks;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	}
	void calGrade()
	{
		float avg;
		avg=(total)/4;
		if(avg>=90)
		{
			//System.out.println("Grade is: A+");
			grade='A';
		}
		else if(avg>=80)
		{
			//System.out.println("Grade is: A");
			grade='B';
		}
		else if(avg>70)
		{
			//System.out.println("Grade is: B");
			grade='C';
		}
		else if(avg>55)
		{
			//System.out.println("Grade is: C");
			grade='D';
		}
	    	else
		{
			//System.out.println("Grade is: D");
			grade='E';
		}
	}
	void  display()
	{
		System.out.println("Details of Student:");
		System.out.println("Student id="+stid);
		System.out.println("Student Name ="+stname);
		System.out.println("Student Age="+age);
		System.out.println("Student Grade"+grade);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
class Studenttest
{
	public static void main(String args[]) 
	{
		int n;
		System.out.println("Hello World!");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of student records to be collected");
		n=s.nextInt();
		Student st[] =new Student[n];
		for(int l=0;l<n;l++)
		{
			st[l]=new Student();
			st[l].read();
		}
		for(int l=0;l<n;l++)
		{
			st[l].calGrade();
		}
		for(int l=0;l<n;l++)
		{
	        	st[l].display();
		}
	}
}