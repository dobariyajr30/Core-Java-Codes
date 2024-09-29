package jDemo7;

abstract class polygone
{
	abstract void area(double a,int b);
}

class circle extends polygone
{

	@Override
	void area(double a, int b) 
	{
		System.out.println("area of circle is "+(a*a*3.14));
	}
	
}

class triangle extends polygone
{

	@Override
	void area(double a, int b) 
	{
		System.out.println("area of triangle is "+(a*b*0.5));
	}
	
}

public class p067_abstract 
{
	public static void main(String[] args)
	{
		circle c1=new circle();
		triangle t1=new triangle();
		
		c1.area(45, 0);
		t1.area(45, 67);
	}

}
