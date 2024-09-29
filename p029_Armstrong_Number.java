package jdemos;

import java.util.Scanner;

public class p029_Armstrong_Number {

	public static void main(String[] args) 
	{
		int no,temp1,temp2,arm=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Digit here-->");
		no=sc.nextInt();
		
		temp2=no;
		
		while(no>0)
		{
			temp1=no%10;
			arm=arm+temp1*temp1*temp1;
			no=no/10;
		}
		

		if(arm==temp2)
		{
			System.out.println("Entered Digit is Armstrong Number");
		}
		else
		{
			System.out.println("Entered Digit is not Armstrong Number");
		}

	}

}
