package jdemos;

import java.util.Scanner;

public class p041_function2 
{
	static void sum(int a, int b)
	{
		System.out.println("Sum is "+(a+b));						
	}
	
	public static void main(String[] args) 
	{
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Digit-->");
		a=sc.nextInt();
		
		System.out.println("Enter 2nd Digit-->");
		b=sc.nextInt();
		
		sum(a,b); 
	}
}

