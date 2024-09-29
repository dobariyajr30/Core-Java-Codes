package jdemos;

import java.util.Iterator;
import java.util.Scanner;

public class p032_Array_Odd_Even {

	public static void main(String[] args)
	{
		int ar[]=new int[100];
		int i,l;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter limit-->");
		l=sc.nextInt();
		
		for(i=1; i<=l; i++)
		{
			ar[i]=i;
			if(i%2==0)
			{
				System.out.println("Even-->"+ar[i]);
			}
			else
			{
				System.out.println("Odd-->"+ar[i]);
			}
		}
	}

}