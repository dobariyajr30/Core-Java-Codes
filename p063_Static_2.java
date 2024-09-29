package jDemo7;

import java.util.Scanner;

class student
{
	int roll;
	String sname;
	static int x;
	
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name-->");
		sname=sc.nextLine();
		
		x++;
		
		roll=x;
	}
	
	public void printdata()
	{
		System.out.println("Student Name is "+sname+" Student Roll Number is "+roll);
		
	}
	public static void printcnt()
	{
		System.out.println("Count = " + x);
	}
	
}

public class p063_Static_2
{
	public static void main(String[] args) 
	{
		student s1=new student();
		student s2=new student();
		student s3=new student();
		
		s1.getdata();
		s2.getdata();
		s3.getdata();
		System.out.println("");
		s1.printdata();
		s2.printdata();
		s3.printdata();	
		
		student.printcnt();
		
	}

}
