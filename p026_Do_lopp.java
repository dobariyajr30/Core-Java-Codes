package jdemos;

import java.util.Scanner;

public class p026_Do_lopp {

	public static void main(String[] args) 
	{
		int i,l;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Limit here-->");	
		l=sc.nextInt();
		
		i=1;
		
		do 
		{
			System.out.println(""+i);
			i++;
		}
		while(i<=l);
		
	}

}
