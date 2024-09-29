package jdemos;

import java.util.Scanner;

class student
{
	int roll,maths,guj,sci;
	String sname;
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Student Name-->");
		sname=sc.nextLine();
		
		System.out.print("Roll Number-->");
		roll=sc.nextInt();
		
		System.out.print("Enter His/Her Maths Marks-->");
		maths=sc.nextInt();
		
		System.out.print("Enter His/Her Scinece Marks");
		sci=sc.nextInt();
		
		System.out.print("Enter His/Her Gujarati Marks");
		guj=sc.nextInt();
	}
	void display()
	{
		System.out.println("Student Name is. "+sname+" His/Her RollNo. is "+roll+". He/she Obtain "+maths+" marks in Maths "+sci+" in Science and "+guj+" in Gujarati." );
	}
	
}

public class p048_class_student 
{
	public static void main(String[] args) 
	{
		student s1=new student();
		student s2=new student();
		
		s1.getdata();
		System.out.println();
		s2.getdata();
		System.out.println();
		s1.display();
		s2.display();
	}

}
