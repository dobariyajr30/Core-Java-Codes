package jdemos;

import java.util.Scanner;

public class p027_Do_loop {

	public static void main(String[] args) 
	{
	
		int i=0,l;
		char opt;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("S for Square");
		System.out.println("C for Cube");
		System.out.println("E for Exit");
		
		do
		{
			System.out.print("Enter Option here-->");
			opt=sc.next().charAt(0);
			
			if(opt=='S' || opt=='s')
			{
				System.out.println("Enter Digit here-->");
				l=sc.nextInt();
				
				System.out.println("Square="+l*l);
				i++;
			}
			else if(opt=='c' || opt=='C')
			{
				System.out.println("Enter Digit here-->");
				l=sc.nextInt();
				
				System.out.println("Cube="+l*l*l);
				i++;
			}
			else
			{
				System.out.println("Invalid Option");
				i++;
			}
		}
		while(opt!='e' || opt!='E');
		
	
	}

}
