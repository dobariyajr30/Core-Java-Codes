package jdemos;

import java.util.Scanner;

public class p013_Switch_Case {

	public static void main(String[] args) 
	{
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Week Number-->");
		n=sc.nextInt();
		
		switch(n)
		{
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednsday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
			default:
				System.out.println("Wrong Option");
		
		}
		
		
	}

}
