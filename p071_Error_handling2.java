package jDemo8;

import java.util.Scanner;

public class p071_Error_handling2 
{

	public static void main(String[] args) 
	{
		try
		{
			int ar[]=new int [5];
			int i;
			
			Scanner sc=new Scanner(System.in);
			
			for(i=0; i<=4; i++)
			{
				System.out.println("Enter Digit here-->");
				ar[i]=sc.nextInt();		
			}
			
			for(i=0; i<=5; i++)
			{
				System.out.println("Entered Digit is-->"+ar[i]);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Arrrrrray Error " + ex.toString());
		}
		
	}

}
