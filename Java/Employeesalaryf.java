import java.util.*;

class Employeedetails 
{
	int i,n;
	int emp_Id[];
	String emp_Name[];
	int emp_Salary[];
	String emp_Desg[];
	float bonus[];
	Scanner scan=new Scanner(System.in);
	
	
	void sizes(int n)
	{
		emp_Id=new int[n];
		emp_Name=new String[n];
		emp_Salary=new int[n];
		emp_Desg=new String[n];
		bonus=new float[n];
	}
	void read(int n)
	{
		for(i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" Employee Id");	
			emp_Id[i]=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter "+(i+1)+" Employee Name");
			emp_Name[i]=scan.nextLine();
			System.out.println("Enter "+(i+1)+" Employee Salary");
			emp_Salary[i]=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter "+(i+1)+" Employee Designantion(Developer/Manager/Others)");
			emp_Desg[i]=scan.nextLine();
		}
	}
	void calsalary(int n)
	{
		for(int i=0;i<n;i++)
		{
			emp_Salary[i]=(int)(emp_Salary[i]+(emp_Salary[i]*0.1)+(emp_Salary[i]*0.07)-(emp_Salary[i]*0.05));
		}
	}
	void bonus(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(emp_Desg[i].equals("Manager"))
			{
				emp_Salary[i]=emp_Salary[i]+(int)(emp_Salary[i]*0.15);
			}
			else if (emp_Desg[i].equals("Developer"))
			{
				emp_Salary[i]=emp_Salary[i]+(int)(emp_Salary[i]*0.1);
			}
			else
			{
				emp_Salary[i]=emp_Salary[i]+(int)(emp_Salary[i]*0.05);
			}
		}
	}
	void display(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("Employee id:\t"+emp_Id[i]+"\nEmployee Name\t"+emp_Name[i]+"\nEmployee Salary:\t"+emp_Salary[i]+"\nEmployee Designation\t"+emp_Desg[i]);	
		}
	}
}
class Employeesalaryf
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		System.out.println("Enter number Employees you wanna record:\r");
		Scanner scan=new Scanner(System.in);			
		int n=scan.nextInt();
		Employeedetails ed=new Employeedetails();
		ed.sizes(n);
		ed.read(n);
		ed.calsalary(n);
		ed.bonus(n);
		ed.display(n);
		scan.close();
	}
}