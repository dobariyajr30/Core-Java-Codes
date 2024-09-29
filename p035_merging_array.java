package jdemos;

import java.util.Scanner;

public class p035_merging_array {

	public static void main(String[] args)
	{
		int a[]=new int[100];
		int b[]=new int[100];
		int c[]=new int[100];
		
		int i,l;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Limit of array");
		l=sc.nextInt();
		
		for(i=0; i<l; i++)
		{
			System.out.println("Enter 1st array of "+a[i]);
			a[i]=sc.nextInt();
		}
		for(i=0; i<l; i++)
		{
			System.out.println("Enter 2nd array of "+b[i]);
			b[i]=sc.nextInt();
		}
		
		System.out.println("Your 1st Enter Array is");
		
		for(i=0; i<l; i++)
		{
			System.out.println(" "+a[i]);
			System.out.println();
		}
		
		System.out.println("Your 2nd Enter Array is");
		
		for(i=0; i<l; i++)
		{
			System.out.println(" "+b[i]);
			System.out.println();
		}
		
		System.out.println("Adding to array");
		
		for(i=0; i<l; i++)
		{
			c[i]=a[i]+b[i];
		}
		for(i=0; i<l; i++)
		{
			System.out.println(" "+c[i]);
		}
		
	}

}
