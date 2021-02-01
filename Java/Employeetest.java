import java.util.Scanner;
class Employee{
	int id;
	String name;
	int sal;
	Scanner sc=new Scanner(System.in);
	Address a=new Address();
	void read()
	{	
		System.out.println("Enter id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter salary:");
		sal=sc.nextInt();
	}
	void calsal()
	{
		sal=sal+(int)((sal*.1)+(sal*.07)-(sal*.05));
	}
	void display()
	{
		System.out.println("Id:    	\t"+id);
		System.out.println("Name:    \t"+name);
		System.out.println("salary: 	\t"+sal);
	}
}
class Manager extends Employee{
	int noemp;
	Scanner sc=new Scanner(System.in);
	void readmgr()
	{
		System.out.println("Enter no of employees:");
		noemp=sc.nextInt();
		System.out.println("Enter address details:");
		a.readadd();
	}	
	void displaym()
	{
		System.out.println("No of employees->\t"+noemp);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~Address~~~~~~~~~~~~~~~~~~~~~");
		a.disadd();
	}
}
class Programmer extends Employee{
	String projname;
	Scanner sc=new Scanner(System.in);
	void readpro()
	{
		System.out.println("Enter project name:");	
		projname=sc.nextLine();
		System.out.println("Enter programmer address details:");
		a.readadd();
	}
	void displayp()
	{
		System.out.println("Project name is\t:"+projname);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~Address~~~~~~~~~~~~~~~~~~~~~");
		a.disadd();
	}
}
class Address{
	int pincode;
	String city,state;
	Scanner sc=new Scanner(System.in);
	void readadd()
	{
		System.out.println("Enter your city:");
		city=sc.nextLine();
		System.out.println("Enter your state:");
		state=sc.nextLine();
		System.out.println("Enter your pincode:");
		pincode=sc.nextInt();	
	}
        void disadd()
	{
	System.out.println("State:   	\t"+state);
	System.out.println("City:    	\t"+city);
	System.out.println("Pincode: 	\t"+pincode);
	}
}
class Employeetest{
	public static void main(String args[])
	{
		
		Manager m=new Manager();
		Programmer p=new Programmer();
		m.read();
		m.readmgr();
		m.calsal();
		p.read();
		p.readpro();
		p.calsal();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~Manager Details~~~~~~~~~~~~~~~~~~~~~");
		m.display();				
		m.displaym();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~Programmer Details~~~~~~~~~~~~~~~~~~~~~");
		p.display();
		p.displayp();
	}
}