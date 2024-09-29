package jDemo3;

import java.util.Scanner;

class polygone
{
	int h,b;
	
	public void getarea()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Value of Height-->");
		h=sc.nextInt();
		
		System.out.println("Enter Value of Base-->");
		b=sc.nextInt();
	}
}
class triangle extends polygone
{
	
	public void printtri()
	{
		System.out.println("Area of triangle-->"+(h*b*0.5));
	}
}
class rectangle extends polygone
{	
	public void printrect()
	{		
		System.out.println("Area of Rectangle-->"+(h*b));
	}
}

 

public class p057_Inherit_3 
{

	public static void main(String[] args)
	{
		rectangle r1=new rectangle();
		triangle t1=new triangle();
		
		r1.getarea();
		r1.printrect();
		System.out.println();
		t1.getarea();
		t1.printtri();
	}

}
