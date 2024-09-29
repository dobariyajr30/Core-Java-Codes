package jDemo8;

import java.util.Scanner;

class eng_error extends Exception
{
	public String toString()
	{
		return "Enter English Marks proparly";
	}
}
class hindi_error extends Exception
{
	public String toString()
	{
		return "Enter Hindi Marks proparly";
	}
}

public class p075_Error_handling6
{
	public static void main(String[] args) 
	{
		try 
		{
			int hindi,eng;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter English Marks-->");
			eng=sc.nextInt();
			
			System.out.println("Ente Hindi marks-->");
			hindi=sc.nextInt();
			
			if(eng<=0)
			{
				throw new eng_error();
			}
			else if(hindi<=0)
			{
				throw new hindi_error();
			}
			else
			{
				System.out.println("Hindi Marks="+hindi);
				System.out.println("English Marks="+eng);
				
				System.out.println("Your Total is "+(hindi+eng));
			}
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}

}
