package jdemos;

import java.util.Scanner;

public class p028_Reverse_number {

	public static void main(String[] args) 
	{
		int no,rev=0,temp1=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter digit here-->");
		no=sc.nextInt();
		
		System.out.println("Enterd Digit is-->"+no);
		
		while(no>0)
		{
			temp1=no%10;
			rev=rev*10+temp1;
			no=no/10;			
		}
		System.out.println("Reverse Number is-->"+rev);

	}

}
