package jdemos;

import java.util.Scanner;

class bank
{
	int acc_no,acc_balance;
	String cust_name;
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Customer Name-->");
		cust_name=sc.nextLine();
		
		System.out.print("Enter Account Number-->");
		acc_no=sc.nextInt();
		
		System.out.print("Enter Account Balance-->");
		acc_balance=sc.nextInt();
	}
	void display()
	{
		System.out.println("Customer Name is "+cust_name+". His/Her AccountNo. is "+acc_no+".His/Her Account Balance is "+acc_balance);
	}	
}

public class p049_class_bank
{
	public static void main(String[] args) 
	{
		bank c1=new bank();
		bank c2=new bank();
		
		c1.getdata();
		System.out.println("");
		c2.getdata();
		System.out.println("");
		c2.display();
		c1.display();
		
	}
}
