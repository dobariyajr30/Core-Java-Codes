package jdemos;

import java.util.Scanner;

public class p020_Table {

	public static void main(String[] args)
	{
		int l,i;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Table Number-->");
		l=sc.nextInt();
		
		for(i=1; i<=10; i++)
		{
			System.out.println(l+" X "+i+" = "+" "+(i*l));
		}
	}

}

