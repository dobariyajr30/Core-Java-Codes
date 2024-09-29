package jdemos;

import java.util.Scanner;

public class p030_Krishnamurty_number {

	public static void main(String[] args)
	{
		int i,no,krishna=0,temp1,temp2,f;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Digit here-->");
		no=sc.nextInt();
		
		temp2=no;
		
		while(no>0)
		{
			temp1=no%10;
			f=1;
			for(i=1; i<=temp1; i++)
			{
				f=f*i;
			}
			krishna=f+krishna;
			no=no/10;			
		}
		
		if(krishna==temp2)
		{
			System.out.println("Entered Digit is Krishunamurthy Number");
			
		}
		else
		{
			System.out.println("ENtered Digit is not Krishnamurthy Number");
		}
		
	}

}
