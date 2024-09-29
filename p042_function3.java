package jdemos;

import java.util.Scanner;

public class p042_function3 
{
	static int sum()
	{
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Digit-->");
		a=sc.nextInt();
		
		System.out.println("Enter 2nd Digit-->");
		b=sc.nextInt();
		
		return a+b; 
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Sum is " +sum());
	}
}
