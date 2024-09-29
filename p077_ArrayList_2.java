package jDemo8;

import java.util.ArrayList;
import java.util.Scanner;

public class p077_ArrayList_2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList();
		int i,y=0,l=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Limit");
		l=sc.nextInt();
		
		for(i=1; i<=l; i++)
		{
			System.out.print("Enter Value here-->");
			y=sc.nextInt();
			
			a1.add(y);
		}
		
		System.out.println(a1);
		
	}

}
