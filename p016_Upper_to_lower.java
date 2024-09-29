package jdemos;

import java.util.Scanner;

public class p016_Upper_to_lower
{

	public static void main(String[] args) 
	{
		char ch;
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter your Word here--->");
		ch=sc.next().charAt(0);

		
		if(Character.isUpperCase(ch))
		{
		  System.out.println(" "  + Character.toLowerCase(ch));
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println(" "  + Character.toUpperCase(ch));
		}

	}

}