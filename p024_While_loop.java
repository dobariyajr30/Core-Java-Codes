package jdemos;

import java.util.Scanner;

public class p024_While_loop {

	public static void main(String[] args) 
	{
		int i,l;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Limit-->");
		l=sc.nextInt();	
		
		i=l;
		
		while(i>=0)
		{
			System.out.print(" "+i);
			i--;
		}
	}

}
