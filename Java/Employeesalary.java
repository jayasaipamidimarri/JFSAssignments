import java.util.*;

public class Employeesalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number Employees you wanna record:\r");
		n=scan.nextInt();
		int emp_Id[]=new int[n];
		String emp_Name[]=new String[n];
		int emp_Salary[]=new int[n];
		String emp_Desg[]=new String[n];
		float bonus[]=new float[n];
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
			if(emp_Desg[i].equals("Manager"))
			{
				bonus[i]=0.15f;
			}
			else if (emp_Desg[i].equals("Developer"))
			{
				bonus[i]=0.1f;
			}
			else
			{
				bonus[i]=0.05f;
			}
			}
		scan.close();
		for(i=0;i<n;i++)
		{
			int salary=(int)(emp_Salary[i]+(emp_Salary[i]*0.1)+(emp_Salary[i]*0.07)-(emp_Salary[i]*0.05));
			int tot_Salary=salary+(int)(salary*bonus[i]);
			System.out.println("Employee id:\t"+emp_Id[i]+"\nEmployee Name:\t"+emp_Name[i]+"\nEmployee Salary:\t"+tot_Salary+"\nEmployee Designation:\t"+emp_Desg[i]);
			System.out.println("----------------------------------");

		}
	}
}