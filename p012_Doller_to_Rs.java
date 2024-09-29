package jdemos;

import java.util.Scanner;

public class p012_Doller_to_Rs {

	public static void main(String[] args) 
	{
		double dol;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Dollar Here-->");
		dol=sc.nextDouble();
		
		System.out.println("Indian Rs is "+dol*83.54);

	}

}