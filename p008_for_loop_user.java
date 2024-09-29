package jdemos;

import java.util.Scanner;

public class p008_for_loop_user {

	public static void main(String[] args) 
	{
		int i,n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no =>");
		n=sc.nextInt();
		
		for(i=0; i<=n; i++)
		{
			System.out.println("Hello It's me Index Number "+i);
		}

	}

}
