package jdemos;

import java.util.Scanner;

public class p021_For_loop_Sum {

	public static void main(String[] args) 
	{
		int i,l,sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Digit Limit here");
		l=sc.nextInt();
		
		for(i=0; i<=l; i++)
		{
			sum+=i;
		}
		System.out.println("Sum is "+sum);
		

	}

}
