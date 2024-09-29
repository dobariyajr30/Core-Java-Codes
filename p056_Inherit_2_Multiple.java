package jDemo3;

import java.util.Scanner;

class student
{
	int roll;
	String name;
	
	public void getinfo()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name-->");
		name=sc.nextLine();
		
		System.out.println("Enter Student Roll Number-->");
		roll=sc.nextInt();
	}
	public void printinfo()
	{
		System.out.println("Student Name is "+name+". His/Her Roll Number is "+roll);
	}
}

class marks extends student
{
	int maths,guj,hindi;
		
	public void getmarks()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Maths Marks-->");
		maths=sc.nextInt();
		
		System.out.println("Enter Gujarati Marks-->");
		guj=sc.nextInt();
		
		System.out.println("Enter Hindi Makrs-->");
		hindi=sc.nextInt();
	}
	public void printmarks()
	{
		System.out.println("He/She Obtain "+maths+" Marks in Maths, "+guj+" Marks in Gujarati & "+hindi+" Marks in Hindi");
	}
}
class result extends marks
{
	public void printresult()
	{
		System.out.println("His/Her Total is "+(maths+guj+hindi));
	}
}

public class p056_Inherit_2_Multiple 
{
	public static void main(String[] args)
	{
		result s1=new result();
		
		s1.getinfo();
		s1.getmarks();
		s1.printinfo();
		s1.printmarks();
		s1.printresult();
	}

}
