package jdemos;

import java.util.Scanner;

public class p018_Ternary_Operator
{

	public static void main(String[] args) 
	{
		// String ans=a>b? "no1 is greater" : "no2 is";
			
		// int ans=a>b?a:b;
		
		int a,no1,no2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("~Max Between 2~");
		System.out.println("Enter 1st Digiti here--->");
		no1=sc.nextInt();
		System.out.println("Enter 2nd Digit here--->");
		no2=sc.nextInt();
		
		String ans=no1>no2?"1st Digit is bigger":"2nd Digit is bigger";
				
		System.out.println(ans);
	}

}
