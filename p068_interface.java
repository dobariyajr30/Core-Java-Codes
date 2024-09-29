package jDemo8;

import java.security.AlgorithmConstraints;

interface polygone
{
	public void area(double a,int b);
}

//interface if1{
//	public void myrule();
//}

class triangle implements polygone
{

	@Override
	public void area(double a, int b)
	{
		System.out.println("Area of traingle is "+(a*b*0.5));
	}
}

class square implements polygone
{

	@Override
	public void area(double a, int b) 
	{
		System.out.println("Area of square is "+(4*a));
	}
	
}

public class p068_interface 
{
	public static void main(String[] args)
	{
		square s1=new square();
		triangle t1=new triangle();
		
		s1.area(4, 10);
		t1.area(56, 10);
	}

}
