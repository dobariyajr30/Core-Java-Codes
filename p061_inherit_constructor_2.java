package jDemos5;

class std
{
	int roll;
	String sname;
	
	std(int number,String name)
	{
		roll=number;
		sname=name;
		
		System.out.println("in std constructor");
	}
	
	public void printinfo()
	{
		System.out.println("Student Name-->"+sname);
		System.out.println("Student Roll Number-->"+roll);
	}
}

class score extends std
{
	int guj,maths,sci;
	
	score(int number,String name,int m,int g,int s)
	{
		super(number,name);
		maths=m;
		sci=s;
		guj=g;
		
		System.out.println("in total constructor");
	}
	
	public void printscore()
	{
		System.out.println("Maths marks="+maths);
		System.out.println("Science marks="+sci);
		System.out.println("Gujarati marks="+guj);
	}
}

class total extends score
{	
	total(int number,String name,int m,int g,int s)
	{
		super(number,name,m,g,s);
		System.out.println("in total constructor");
	}
	
	public void printtotal()
	{
		int total;
		
		total=guj+sci+maths;
		
		System.out.println("Total is "+total);
	}
}

public class p061_inherit_constructor_2
{
	public static void main(String[] args) 
	{
		total t1=new total(95,"Meet",56,64,74);
		
		t1.printinfo();
		t1.printscore();
		t1.printtotal();
	  
	}

}
