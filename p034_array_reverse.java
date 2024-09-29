package jdemos;

import java.util.Scanner;

public class p034_array_reverse {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
					
		int a[]=new int[100];
		int i,lim;
		
		System.out.println("Enter Array limit-->");
		lim=sc.nextInt();
		
		for(i=1; i<=lim; i++)
		{
			System.out.print("Enter Array here-->");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Your Enterd Array is");
		
		for(i=1; i<=lim; i++)
		{
			System.out.println(" "+a[i]);
		}
		
		System.out.println("Reverse Array is");
		
		for(i=lim; i>=1; i--)
		{
			System.out.print(" "+a[i]);
		}

		
	}

}
