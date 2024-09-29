package jDemo7;

abstract class  dadagiri
{
	abstract void add(int a,int b);
	abstract void hi();
}

class madhav extends dadagiri
{

	@Override
	void add(int a, int b)
	{
		System.out.println("Add = " + (a+b));
	}

	@Override
	void hi()
	{
		System.out.println("hello 2 ");
	}
	
}
class jash extends dadagiri
{

	@Override
	void add(int a, int b) 
	{
		System.out.println("add ="+(a+b));
	}

	@Override
	void hi() 
	{
		System.out.println("helllo 3");
	}
	
}
public class p066_abstr
{
	public static void main(String[] args)
	{
		madhav m1=new madhav();
		jash j1=new jash();

		m1.add(22,3);
		m1.hi();
		j1.add(45,67);
		j1.hi();
	}
}
