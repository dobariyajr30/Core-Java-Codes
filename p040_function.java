package jdemos;

import java.util.Scanner;

public class p040_function 
{
	static void sum()
	{
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Digit-->");
		a=sc.nextInt();
		
		System.out.println("Enter 2nd Digit-->");
		b=sc.nextInt();
		
		System.out.println("Sum is "+(a+b));						
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		sum();
		
	}
}
