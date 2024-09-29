package jdemos;

import java.util.Scanner;

public class p039_string_revere {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String sen;
		
		System.out.println("Enter Sentace here-->");
		sen=sc.nextLine();
		
		int x,i;
		char ch;
		
		x=sen.length();
		
		for(i=x-1; i>=0; i--)
		{
			ch=sen.charAt(i);
			System.out.print(ch);
		}
	}

}
