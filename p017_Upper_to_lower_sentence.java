package jdemos;

import java.util.Scanner;

public class p017_Upper_to_lower_sentence
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String sen;
		
		System.out.println("Enter sentence here-->");
		sen=sc.nextLine();
		
		int i,x;
		int uc=0,lc=0;
		
		x=sen.length();
		char ch;
		
		for(i=0; i<x; i++)
		{
			ch=sen.charAt(i);
			
			if(Character.isUpperCase(ch))
			{
				System.out.print(""+Character.toLowerCase(ch));
				uc++;
			}
			else if(Character.isLowerCase(ch))
			{
				System.out.print(""+Character.toUpperCase(ch));
				lc++;
			}
			else
			{
				System.out.print(""+ch);
			}
		}
		

		System.out.println("");
		System.out.println(" Total Uppercase is-->"+uc);
		System.out.println("Total Lowercase is-->"+lc);
	}
	

}
