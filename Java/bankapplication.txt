import java.util.Scanner;
package com.service;
import com.bean.Account;
abstract class InitAccount
{
	public static int acc_count=0,acc_count1=0,i=0,j=0;
	public static int acc_no=100; 
	public static int acc_no1=100;
	public String name;
	public int amount;
	public Account accounts[]=new Account[10];
	void acc_create()
	{
		if(acc_count<10)
		{
			name="Unknown";
			amount=500;
			accounts[i]=new Account(acc_no,name,amount);
			acc_no++;
			i++;
			acc_count++;
		}
		else
		{
			acc_count1=1;
			System.out.println("Account Limit exceed.");
		}
	}
	
	void acc_create(String name,int amount)
	{
		if(acc_count1<10)
		{
			if(amount>500)
			{
				this.name=name;
				this.amount=amount;
				accounts[j].setacc_no(this.acc_no1);
				accounts[j].setname(this.name);
				accounts[j].setamount(this.amount);
				System.out.println("Name="+accounts[j].getname());
				System.out.println("Account Number="+accounts[j].getacc_no());
				System.out.println("Amount="+accounts[j].getamount());
				acc_count1++;
				acc_no1++;
				j++;
			}
			else
			{
				System.out.println("Amount should be greater than 500.");
			}
		}
		else
		{
			System.out.println("Account Limit exceed.");
		}
	}
	abstract void transfer(int fromacc_no,int to_acc_no,int amount);
}


package com.service;
interface Bank
{
	void withdraw(int acc_no,int amount);
	void deposit(int acc_no,int amount);
	void check_bal(int acc_no);
}

package com.bean;
class Account
{
	private int acc_no;
	private String name;
	private int amount;
	public Account(int acc_no, String name, int amount)
	{
		this.acc_no=acc_no;
		this.name=name;
		this.amount=amount;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setacc_no(int acc_no)
	{
		this.acc_no=acc_no;
	}
	public void setamount(int amount)
	{
		this.amount=amount;
	}
	public String getname()
	{
		return name;
	}
	public int getacc_no()
	{
		return acc_no;
	}
	public int getamount()
	{
		return amount;
	}
	
}

class MyException extends Exception
{
	MyException()
	{
		super();
	}
	MyException(String msg)
	{
		super(msg);
	}
}

package com.service;
class MyBank extends InitAccount implements Bank
{	
	public void transfer(int fromacc_no, int to_acc_no,int amount)
	{
		if(acc_count!=0)
		{
			for(i=0;i<10;i++)
			{
				try
				{
				if(accounts[i].getacc_no()==fromacc_no)
				{
					for(int j=0;j<10;j++)
					{
						try
						{
						if(accounts[j].getacc_no()==to_acc_no)
						{
							if(accounts[i].getamount()-amount>500)
							{
								accounts[i].setamount(accounts[i].getamount()-amount);
								accounts[j].setamount(accounts[j].getamount()+amount);
								break;
							}
							else
							{
								System.out.println("Minimum balance 500 should be maintained.");
							}
						}
						throw new MyException("to account number not matched");
						}
						catch(MyException e)
						{
							System.out.println(e.toString());
							break;
						}
					}
					break;
				}
				throw new MyException("from account number not matched");
				}
				catch(MyException e){
					System.out.println(e.toString());
					break;
				}
			}
		}
		else
		{
			System.out.println("Account is not created. Create Your account first");
		}
	}
	
	public void withdraw(int acc_no1,int amount1)
	{
		if(acc_count!=0)
		{
			for(int i=0;i<10;i++)
			{
				try
				{
				if(accounts[i].getacc_no()==acc_no1)
				{
					if((accounts[i].getamount()-amount1)>500)
					{
						accounts[i].setamount(accounts[i].getamount()-amount1);
						System.out.println("Amount withdrawn successfully");
						break;
					}
					else
					{
						System.out.println("Minimum balance 500 should be maintained.");
					}
				}
				throw new MyException("Account mismatch");
				}
				catch(MyException e){
					System.out.println(e.toString());
					break;
				}
			}
		}
		else
		{
			System.out.println("Account is not Created. Create your account first.");
		}
	}
	public void deposit(int acc_no1, int amount1)
	{
		if(acc_count!=0)
		{
			for(int i=0;i<10;i++)
			{
				try
				{
				if(accounts[i].getacc_no()==acc_no1)
				{
					if(amount1<50000)
					{
						accounts[i].setamount(accounts[1].getamount()+amount1);
						System.out.println("Amount Deposited successfully.");
					}
					else
					{
						System.out.println("Amount is more than 50000. Pancard is compulsary.");
						break;
					}
				}
				throw new MyException("Account mismatch");
				}
				catch(MyException e){
					System.out.println(e.toString());
					break;
				}
			}
		}
		else
		{
			System.out.println("Account is not created. create your account first.");
		}
	}
	public void checkbalance(int acc_no1)
	{
		if(acc_count!=0)
		{
			for(int i=0;i<10;i++)
			{
				try
				{
				if(accounts[i].getacc_no()==acc_no1)
				{
					System.out.println("Available Balance:"+accounts[i].getamount());
					break;
				}
				throw new MyException("Account mismatch");
				}
				catch(MyException e){
					System.out.println(e.toString());
					break;
				}
			}
		}
		else
		{
			System.out.println("Account is not Created. Create your account first.");
		}
	}	
}


import com.service.MyBank;
class BankTestApp
{
public static void main(String args[])
{
	System.out.println("Welcome to Bank Application");
	Scanner sc=new Scanner(System.in);
	String name;
	boolean value=true;
	int accno, toaccno,amount;
	MyBank my_bank=new MyBank();
	do
	{
		System.out.println("Press 1 for Create Account\nPress 2 for check Account Balance\nPress 3 for withdraw the amount\nPress 4 for Deposit\nPress 5 for Transfer\nPress 6 for exit the Application: ");
		int choose= sc.nextInt();
		
		switch(choose)
		{
			case 1:
				System.out.println("Press 1 for Default details\nPress 2 for name and Amount pass:");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:	my_bank.accountcreate();
				break;
			case 2:	System.out.println("Enter Name:");
				name=sc.next();
				System.out.println("Enter amount:");
				amount=sc.nextInt();
				my_bank.accountcreate(name,amount);
				break;
			default:
				System.out.println("Invalied choice.");
				}
			case 2: System.out.println("For Check Balance");
				System.out.println("Enter Account Number:");
				acc_no=sc.nextInt();
				my_bank.checkbalance(accno);
				break;
			case 3: System.out.println("Withdraw Money");
				System.out.println("Enter Account Number:");
				acc_no=sc.nextInt();
				System.out.println("Enter Amount:");
				amount=sc.nextInt();
				my_bank.withdraw(accno,amount);
				break;
			case 4: System.out.println("Deposit Money");
				System.out.println("Enter Account Number:");
				acc_no=sc.nextInt();
				System.out.println("Enter Amount:");
				amunt=sc.nextInt();
				my_bank.deposit(acc_no,amount);
				break;
			case 5:	System.out.println("Money Transfer");
				System.out.println("Enter Your Account Number:");
				acc_no=sc.nextInt();
				System.out.println("Enter beneficiary Account Number:");
				toacc_no=sc.nextInt();
				System.out.println("Enter Amount to be transferred:");
				amount=sc.nextInt();
				my_bank.transfer(acc_no,toacc_no,amount);
				break;
			case 6:	System.out.println("Thank you for banking");
				value=false;
				break;
			default:
				System.out.println("Invalid choice.");
		}	}while(value);
}
}