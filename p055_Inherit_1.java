package jDemo2;

import java.util.Scanner;

class india
{
	protected int a;
	
	public void geti()
	{	
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("Enter India Value");
		a=sc.nextInt();		
	}
	public void printi()
	{
		System.out.println("India Value is "+a);
	}
}

class usa extends india
{
	int b;
	
	public void getu()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter USA value");
		b=sc.nextInt();			
	}
	public void printu()
	{
		System.out.println("USA value is "+b);
	}
	public void multi()
	{
		System.out.println("Multi = "+ (a*b));
	}
}

public class p055_Inherit_1 
{
	public static void main(String[] args) 
	{
		usa u1=new usa();
		
		u1.geti();
		u1.getu();
		
		u1.printi();
		u1.printu();
		
		u1.multi();
		
		
	}

}
