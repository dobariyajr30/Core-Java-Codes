package jdemos;

import java.util.Scanner;

public class p033_Array_counting {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int ser,i,arr_lm,ser_c=0;
		int ent[]=new int[100];
		
		System.out.println("Enter how many element are there in array-->");
		arr_lm=sc.nextInt();
		
		for(i=1; i<=arr_lm; i++)
		{
			System.out.print("Enter "+i+" Digit-->");
			ent[i]=sc.nextInt();
		}
	    
		System.out.println("your enterd Array is");
		
		for(i=1; i<=arr_lm; i++)
		{
			System.out.println(" "+ent[i]);
		}
		
		System.out.println("Enter digit wants to search-->");
		ser=sc.nextInt();
		
		for(i=0; i<=arr_lm; i++)
		{
		  if(ser==ent[i])
		  {
			 ser_c++;
		  }
		}
		
		if(ser_c==0)
		{
			System.out.println("Entered Digit is not available");
		}
		else
		{
			System.out.println("Enter Digit is repeting "+ser_c+" Times");
		}
	}

}
