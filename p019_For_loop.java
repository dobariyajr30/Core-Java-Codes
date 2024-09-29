package jdemos;

import java.util.Scanner;

public class p019_For_loop {

	public static void main(String[] args) 
	{
		int l,i;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Limit here-->");
		l=sc.nextInt();
		
		for(i=0; i<=l; i++)
		{
			System.out.println("Hello It's me Index Number "+i);
		}
		
		
		
	}

}
