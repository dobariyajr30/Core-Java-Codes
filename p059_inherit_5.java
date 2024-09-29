package jDemo4;

import java.util.Scanner;

class info
{
	int roll;
	String sname;
	
	
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name-->");
		sname=sc.nextLine();
		
		System.out.println("Enter Student Roll Number-->");
		roll=sc.nextInt();
	}	
	
	public void printdata()
	{
		System.out.println("Student name is "+sname+". His/Her Roll Number is "+roll+".");
	}
}

class marks extends info
{
	int maths,guj,sci;
	
	public void getdata()
	{
		super.getdata();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Maths Marks-->");
		maths=sc.nextInt();
		
		System.out.println("Enter Gujarati Marks-->");
		guj=sc.nextInt();
		
		System.out.println("Enter Science Marks-->");
		sci=sc.nextInt();
	}
	public void printdata()
	{
		super.printdata();
		System.out.println("He/she got "+maths+" Marks in Maths, "+guj+" Marks in Gujarati and "+sci+" marks in Science.");
	}
}

class result extends marks
{
	int total;
	
	public void printdata()
	{ 
		super.printdata();
		total=guj+maths+sci;
		
		System.out.println("His/Her Total is "+total);		
	}
}

public class p059_inherit_5 
{
	public static void main(String[] args) 
	{
		
		result r1=new result();
		r1.getdata();
		r1.printdata();
		
	}

}
