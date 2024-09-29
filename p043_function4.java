package jdemos;

import java.util.Scanner;

public class p043_function4 
{
	static int sum(int a, int b)
	{
		return a+b ; 
	}
	
	public static void main(String[] args) 
	{
		
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Digit-->");
		a=sc.nextInt();
		
		System.out.println("Enter 2nd Digit-->");
		b=sc.nextInt();
		
		System.out.println("Sum is "+sum(a,b));
	}
}
