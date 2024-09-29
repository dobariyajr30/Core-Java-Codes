package jDemo8;

import java.util.ArrayList;
import java.util.Scanner;

class student
{
	int roll,maths;
	String name;

	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Roll Number-->");
		roll=sc.nextInt();
		
		System.out.println("Enter Student Name-->");
		sc.nextLine();
		name=sc.nextLine();
		
		System.out.println("Enter Maths Marks-->");
		maths=sc.nextInt();
	}
	public void printdata()
	{
		System.out.println("Student Name is "+roll+".His/Her Name is "+name+". His/Her Maths marks is "+maths);
	}
}

public class p078_ArrayList__3 
{
	public static void main(String[] args) 
	{
		ArrayList<student> a1=new ArrayList();
		
		student s1=new student();
		student s2=new student();
		student s3=new student();
		
		s1.getdata();
		s2.getdata();
		s3.getdata();
		
		a1.add(s3);
		a1.add(s2);
		a1.add(s1);
		
		System.out.println(a1);
		
	
	}
}
