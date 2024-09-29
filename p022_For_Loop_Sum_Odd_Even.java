package jdemos;

import java.util.Scanner;

public class p022_For_Loop_Sum_Odd_Even 
{

	public static void main(String[] args)
	{

		int i,l,es=0,ec=0,oc=0,os=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Limit here--->");
		l=sc.nextInt();
		
		for(i=1; i<=l; i++)
		{
		  if(i%2==0)
		  {
			 System.out.println("Even"+i);
			 es+=i;
			 ec++;
		  }
		  else
		  {
			  System.out.println("Odd"+i);
			  os+=i;
			  oc++; 
		  }
		}
		
		System.out.println("Sum of Odd Number is " + os + " Sum of Even Number is " + es);
		System.out.println("Count of Odd is " + oc + " Count of Even Number is " + ec);

		


		
		
		
	}

}
