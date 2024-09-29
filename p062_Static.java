package jDemo6;

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
		
		System.out.println("Enter Student Roll Number-->");
		roll=sc.nextInt();
		
		x++;
	}
	
	public void printdata()
	{
		System.out.println("Student Name is "+sname+" Student Roll Number is "+roll+" X value is"+x);
		
	}
	
}

public class p062_Static 
{
	public static void main(String[] args) 
	{
		student s1=new student();
		student s2=new student();
		student s3=new student();
		
		s1.getdata();
		s1.printdata();
		s2.printdata();
		s3.printdata();	
		System.out.println();
		System.out.println();		
		s2.getdata();
		s1.printdata();
		s2.printdata();
		s3.printdata();
		System.out.println();
		System.out.println();
		s3.getdata();
		s1.printdata();
		s2.printdata();
		s3.printdata();
		
	}

}
