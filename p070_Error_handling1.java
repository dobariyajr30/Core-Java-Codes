package jDemo8;

import java.util.Scanner;

public class p070_Error_handling1 {

	public static void main(String[] args)
	{
		try {
			
			int a,b,c;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Entere A digit-->");
			a=sc.nextInt();
			
			System.out.println("Enter B Digit-->");
			b=sc.nextInt();
			
			c=a/b;
		
			System.out.println("C value is -->"+c);
			
		}catch(Exception ex)
		{
			System.out.println("Error " + ex.toString());
		}
	}

}
