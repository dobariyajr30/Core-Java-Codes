package jdemos;

import java.util.Scanner;

public class p023_For_loop_addition_of_Fraction {

	public static void main(String[] args)
	{
		int i,l;
		double sum=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter limit here-->");
		l=sc.nextInt();
		
		for(i=1; i<=l; i++)
		{
			System.out.print("1/"+i +"+");
			sum=sum+1.0/i;
		}
		
		System.out.println("Sum is -->"+sum);
		
		

	}

}
