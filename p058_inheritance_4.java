package jDemo4;

import java.util.Scanner;

class india
{
	int a;
	
	public void getindia()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Value for India-->");
		a=sc.nextInt();
		
	}
	public void printindia()
	{
		System.out.println("Value for India is "+a);
	}
}
class us extends india
{
	int a;
	
	public void getus()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value for US-->");
		a=sc.nextInt();
	}
	public void printus()
	{
		System.out.println("Value of US is"+a);
	}
	
	public void mul()
	{
		System.out.println("Multiplication is "+(a*super.a));
	}
}

public class p058_inheritance_4 
{
	public static void main(String[] args) 
	{
		us u1=new us();
		
		u1.getindia();
		u1.getus();
		u1.printindia();
		u1.printus();
		u1.mul();
			
	}

}
