package jdemos;

import java.util.Scanner;

class employ
{
	int eno,salary;
	String ename;
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Employ Name-->");
		ename=sc.nextLine();
		
		System.out.print("Enter Employ Number-->");
		eno=sc.nextInt();
		
		System.out.print("Enter Emplloy Salary-->");
		salary=sc.nextInt();
	}
	void display()
	{
		System.out.println("Employ Name is"+ename+" his/her EmployNumber is "+eno+" and his/her salary is "+salary);
	}
}
public class p047_class_employ
{
	public static void main(String[] args) 
	{
		employ e1=new employ();
		employ e2=new employ();
		
		
		e1.getdata();
		System.out.println("");
		e2.getdata();
		
		e1.display();
		e2.display();
	 }
}
