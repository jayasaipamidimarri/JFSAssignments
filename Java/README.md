# Java Full Stack Training
           - Akash(Trainer)
## JFS Assignments



### [Java Assignment  1](https://github.com/jayasaipamidimarri/JFSAssignments/blob/main/Java/Onlineexam.java)
               -Onlineexam.java
do{
           Online Examination 
	1:English , 2 : Math 3 : GK 
	
	switch() {

	case 1 
		3 Q
	case 2	
		3 Q
	case 3 
		3 Q 
}

Do want to continue ?	
}while();

Result 		g_total > 70   
			Result + 10 
Result>=90 selected else try next time. 


### [Java Assignment 2](https://github.com/jayasaipamidimarri/JFSAssignments/blob/main/Java/Employeesalary.java)
                  -Employeesalary.java

Take n number records through keyboards as Id,Name,Salary,Desg  
(array id,name,salary,Desg).

Salary = salary + hra + da – pf;
	 Hra is 10% salary 
	Da is 7 % salary 
	Pf 5 % salary 

If desg is manager 				desg.equals(“Developer”)
		15% bonus
If developer  10% bonus 
Else 
		5 % bonus 

 
Id, name, salary( grossSalary +bonus ) and desg 

### [Java Assignment 3](https://github.com/jayasaipamidimarri/JFSAssignments/blob/main/Java/Employeesalaryf.java)
                    -Employeesalaryf.java

Create EmployeeDetails class with 4 instance array variables. 
EmployeeDetails() : memory size for array id,name,salary, desg must assign in constructor at run time. 
read() 
		read all employee id,name,salary,desg 
calSalary()
		hra, da, pf local variables. 
		calculate salary 
bonus() 
		apply bonus 
display() 
		display details 

EmployeeTest :
			Main methods 
			Object creation 
		And calling all methods 
			
Take n number records through keyboards as Id,Name,Salary,Desg  
(array id,name,salary,Desg).

Salary = salary + hra + da – pf;
	 Hra is 10% salary 
	Da is 7 % salary 
	Pf 5 % salary 
If desg is manager 
		15% bonus
If developer  10% bonus 
Else 
		5 % bonus 

 
Id, name, salary( grossSalary +bonus ) and desg 

### [Java Assignment 4](https://github.com/jayasaipamidimarri/JFSAssignments/blob/main/Java/Employeetest.java)
		    -Employeetest.java
		    
Manager / Programmer is a Employee

Employee has a Address 

class Employee {			super class must be generic 
	id,name,salary
	Scanner obj = new Scanner(System.in);
	Address add = new Address();
	methods 
	read()		id,name,salary

, calSalary()			: hra, da and pf 
dislay() 
}


class Manager extends Employee {	sub must be specific 
	numberOfEmp  : numbers 
	readMgr()		numberOfEmp
			add.readAdd();
	disMgr();
			numberOfEmp
				add.disAdd();
}
	class Programmer extends Employee{	sub must be specific 
		projectName:	string 
		readPrg()
				projectName
				add.readAdd();
		disPrg();
}
	
class Address {
			city, state, pinCode 
			Scanner obj = new Scanner();
			readAdd()
					read city,state and pincode 
			disAdd();
					city, state and pincode 
}
	
	EmployeeTest 
			Main 			Don’t create the Employee class object. 
	S.O.P(ManagerDetails);
Manager mgr
		mgr.read()		3 details 
		mgr.readMgr()	1 own details, 3 address details 
		
S.O.P(ProgramerDetails)
Programmer prg 
		prg.read()
		prg.readPrg()
		
	mgr.calSalary();
	prg.calSalary()


	Display Manager and Programmer details. 
	
### [Assignment 5:](https://github.com/jayasaipamidimarri/JFSAssignments/blob/main/Java/Studenttest.java)

Create Student class which contains sId,SName,Age,Marks[](PCMB) ,Grade(char)
Scanner obj 
read()		
		take 
		id, name,age 
		for(i=0;iM<marks.length;i++) 
		{
			marks[i]=obj.next();
		}	
calculateGrade()
		local variable total,avg;
avg > 90	A+
avg >80		A
avg >70		B	
avg >55		C
else 		D
			
display
		id,name,age,Grade

StudentTest 
	Create Student array object 
	How many student details do you want to store. 
	
	Student std[]=new Students[n];
	for(int i=0;i<n;i++) 
	{
		std[i]=new Student();
		std[i].read();
	}
	for(int i=0;i<i++)
	{
		std[i].calculateGrade();
	}
	for(int i=0;i<i++)
	{
		std[i].display();
	}

### [Assignment 6:](https://github.com/jayasaipamidimarri/JFSAssignments/blob/main/Java/bankapplication.txt)

First Change 

Create user-defined exception 

1.	MinimumAccountBalance
2.	InValidAccountNumber 	(Transfer, Withdraw, deposit) 

Second Changes :  	you have to use package concept. 
		Account		 bean package 
		AccountInitialization,  service package 
		Bank 			 service package 
		MyBank 		 service package 
		BankTest 		 main / test package 

###  [Assignment 7](https://github.com/jayasaipamidimarri/JFSAssignments/blob/main/Java/Stringsort.java)
Take n number of names through keywords and display those names in ascending or descending order. (Ignore case sensitive). 
String names[]={“Raj”,”ravi”,”Akash”,”ajay”};

		Akash, ajay, Raj, ravi 		Asc 
		ravi, Raj, ajay, Akash		Desc 

Hint : compareTo() methods or any other ways.

