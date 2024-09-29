package jdemos;

import java.util.Scanner;

public class p009_Odd_Even_user {

	public static void main(String[] args)
	{
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Digit here-->");
		n=sc.nextInt();
	
		if(n%2==0)
		{
			System.out.println("It's Even Number");
		}
		else
		{
			System.out.println("It's Odd Number");
		}
		
	}
	
}




