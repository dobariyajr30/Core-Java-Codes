package jDemo8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p072_Error_handling3 
{
	public static void main(String[] args)
	{
		try 
		{	
			int a,b,c;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Entere A digit-->");
			a=sc.nextInt();
			
			System.out.println("Enter B Digit-->");
			b=sc.nextInt();
			
			c=a/b;
		
			System.out.println("C value is -->"+c);	
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Why u enter string");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Why u enter 0");
		}
		catch(Exception ex)
		{
			System.out.println("Error " + ex.toString());
		}
		finally
		{
			System.out.println("Nothing Error");
		}
	}

}
