package jdemos;

import java.util.Scanner;

public class p038_string_Vowel 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String str;
		
		System.out.println("Enter sentence here-->");
		str=sc.nextLine();
		
		char ch;
		
		int x,i;
		x=str.length();
		
		for(i=0; i<x; i++)
		{
			ch=str.charAt(i);
			if(ch=='a' || ch=='A' || ch=='U' || ch=='u' || ch=='O' || ch=='o' || ch=='I' || ch=='i' || ch=='E' || ch=='e')
			{
				ch='7';
				System.out.print("7"+ch);
			}
			else
			{
				System.out.print(""+ch);
			}
		}
	}
}
