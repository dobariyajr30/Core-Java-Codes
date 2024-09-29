package jdemos;

import java.util.Scanner;

public class p015_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1,no2;
		char ch;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter + for Addition");
		System.out.println("Enter - for Substation");
		System.out.println("Enter / for Division");
		System.out.println("Enter * for Multiplication");
		System.out.println("Enter your option here---->");
		ch=sc.next().charAt(0);
		
		
		if(ch=='+')
		{
			System.out.println("Enter 1st Number-->");
			no1=sc.nextInt();
			
			System.out.println("Enter 2nd Number-->");
			no2=sc.nextInt();
			
			System.out.println("Addition is "+ (no1+no2));
		}
		else if(ch=='-')
		{
			System.out.println("Enter 1st Number-->");
			no1=sc.nextInt();
			
			System.out.println("Enter 2nd Number-->");
			no2=sc.nextInt();
			
			System.out.println("Substraction is "+ (no1-no2));
		}
		else if(ch=='/')
		{
			System.out.println("Enter 1st Number-->");
			no1=sc.nextInt();
			
			System.out.println("Enter 2nd Number-->");
			no2=sc.nextInt();
			
			System.out.println("Division is "+ (no1/no2));
		}
		else if(ch=='*')
		{
			System.out.println("Enter 1st Number-->");
			no1=sc.nextInt();
			
			System.out.println("Enter 2nd Number-->");
			no2=sc.nextInt();
			
			System.out.println("Multiplication is "+ (no1*no2));
		}
		else
		{
			System.out.println("Invalid Commaond");
		}
		

	}

}
