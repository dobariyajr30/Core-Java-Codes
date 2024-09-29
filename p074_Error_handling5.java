package jDemo8;

import java.util.Scanner;

class myerror1 extends Exception
{
	public String toString()
	{
		return "Enter Marks Correctly.....!";
	}
}
public class p074_Error_handling5
{
	public static void main(String[] args) 
	{
		try
		{
			int hindi,maths;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Hindi Marks-->");
			hindi=sc.nextInt();
			
			System.out.println("Enter Maths Marks-->");
			maths=sc.nextInt();	
			
			if(hindi<=0)
			{
				throw new myerror1();
			}
			else if(maths<=0)
			{
				throw new myerror1();
			}
			else
			{
				System.out.println("Hindi Marks-->"+hindi);
				System.out.println("Maths Marks-->"+maths);
				
				System.out.println("And Total is "+(hindi+maths));
				
			}		
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		finally
		{
			System.out.println("");
		}
		
	}

}
