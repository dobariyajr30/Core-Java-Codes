package jdemos;

import java.util.Scanner;

public class p036_goto {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		
		int n1;
		
		rohan:
		
		System.out.println("Enter Digit-->");
		n1=sc.nextInt();
		
		if(n1<0)
		{
			System.out.println("Nopee only positive value is allow");
			
		}
		else
		{
			System.out.println("your Enterd digit is "+n1);
		}
		
	}

}
