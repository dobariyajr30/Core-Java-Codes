package jdemos;

import java.util.Scanner;

public class p014_1_for_square_2_for_cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,opt;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1 for Square");
		System.out.println("2 for Cube");
		System.out.println("Enter Option here--->");
		opt=sc.nextInt();
		
		if(opt==1)
		{
			System.out.println("ENter Digit here-->");
			n=sc.nextInt();
		
			System.out.println("Square is "+n*n);
		}
		else if(opt==2)
		{
			System.out.println("ENter Digit here-->");
			n=sc.nextInt();
		
			System.out.println("Cube is "+n*n*n);
			
		}

	}

}
