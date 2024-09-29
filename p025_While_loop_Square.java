package jdemos;

import java.util.Scanner;

public class p025_While_loop_Square {

	public static void main(String[] args) 
	{
		int i,l;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter limit here--->");
		l=sc.nextInt();
		
		i=0;
		
		while(i<=l)
		{
			System.out.println("Square of "+i+" is "+i*i);
			i++;
		}
		
		
		
	}

}
