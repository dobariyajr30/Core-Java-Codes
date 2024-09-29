package jdemos;

import java.util.Scanner;

public class p037_string {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String name;
		
		System.out.println("Enter your name-->");
		name=sc.nextLine();
		
		System.out.println("Ente name is-->"+name);
		
		int x,i;
		
		x=name.length();	
		
		System.out.println("Lenght of String-->"+x);
		
		char ch;
		
		for(i=0; i<x; i++)
		{
			ch=name.charAt(i);
			System.out.println(" "+ch);
		}
	}

}
