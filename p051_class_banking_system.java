package jdemos;

import java.util.Scanner;

class bank1
{
	int ac_no,ac_balance;
	String ac_holder;
	
	
	public void open_acc()
	{		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Account holder name-->");
		ac_holder=sc.nextLine();
		
		System.out.print("Enter Account number-->");
		ac_no=sc.nextInt();
		
		System.out.print("Enter Account Balance-->");
		ac_balance=sc.nextInt();
	}
	public void print_acc()
	{
		System.out.println("Name of Account holder is "+ac_holder+". His/Her Account Number is "+ac_no+". And His/Her Account Balance is "+ac_balance);
	}
	public void deposite()
	{
		Scanner sc=new Scanner(System.in);
		
		int ac_deposite;
		System.out.println("Enter Deposited Ammount-->");
		ac_deposite=sc.nextInt();
		
		ac_balance+=ac_deposite;	
	}
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		
		int ac_withdraw;
		System.out.println("Enter Withdrawel Ammount-->");
		ac_withdraw=sc.nextInt();
		
		ac_balance-=ac_withdraw;
	}
	
	
};
public class p051_class_banking_system
{
	public static void main(String[] args) 
    {
		bank1 c1=new bank1();
		
		c1.open_acc();
		c1.print_acc();
		c1.deposite();
		c1.print_acc();
		c1.withdraw();
		c1.print_acc();

    }
}
