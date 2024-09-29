package jDemo8;

import java.util.Scanner;

class myerror extends Exception 
{
	public String toString()
	{
		return "Error due to array";
	}
}

public class p073_Error_handling4 
{
	public static void main(String[] args) 
	{
		try
		{
			String add;
			int len;
			
			Scanner sc=new Scanner (System.in);
			
			System.out.println("Enter You Addres here-->");
			add=sc.nextLine();
			
			len=add.length();
			
			System.out.println("Lenght is "+len);
			
			if(add.length()<5)
			{
				throw new myerror();
			}
			else 
			{
				System.out.println("addres="+add);
			}

			
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		finally
		{
			System.out.println("\nArray Lengh is ok");
		}
	}
}
