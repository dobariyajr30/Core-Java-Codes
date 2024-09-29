package jdemos;

import java.util.Scanner;

public class p011_Square_Cube {

	public static void main(String[] args)
	{
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number-->");
		a=sc.nextInt();
		
		System.out.println("Enter Digit's Square is "+ a*a);
		System.out.println("Enter Digit's Cube is "+ a*a*a);

	}

}