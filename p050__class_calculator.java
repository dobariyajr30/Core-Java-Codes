package jdemos;

import java.util.Scanner;

class calci
{
	private int a,b;
	
	public void get()
	{		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Digit-->");
		a=sc.nextInt();
		
		System.out.println("Enter 2nd Digit-->");
		b=sc.nextInt();
	}
	public void add()
	{
		System.out.println("Addition is "+(a+b));
	}
	public void sub()
	{
		System.out.println("Subtraction is "+(a-b));
	}
	public void div()
	{
		System.out.println("Division is "+(a/b));
	}
	public void mul()
	{
		System.out.println("Multiplicatioon is "+(a*b));
	}	
}
public class p050__class_calculator
{

	public static void main(String[] args)
	{
	 calci c1=new calci();
	 
	 c1.get();
	 System.out.println();
	 c1.add();
	 c1.mul();
	 c1.div();
	 c1.sub();	 
	
	}

}
