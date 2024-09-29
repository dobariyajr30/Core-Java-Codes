package jDemos5;

class student
{
	int roll;
	String sname;
	
	student()
	{
		roll=5;
		sname="Khanjan";
		System.out.println("in student constructor");
		
	}
	
	public void printinfo()
	{
		System.out.println("Student Name is "+sname+". His/Her Roll Number is "+roll);
	}
}
class marks extends student
{
	int maths,sci,guj;
	
	marks()
	{
		maths=45;
		guj=65;
		sci=45;
		System.out.println("in marks constructor");
		
	}
	
	public void printmarks()
	{
		System.out.println("He/She got "+maths+" marks in maths, "+guj+" marks in gujarati and "+sci+" marks in science");
	}
}
class result extends marks
{
	int total;
	
	result()
	{
		total=guj+maths+sci;
		
		System.out.println("in result constructor");
		
	}
	
	public void printresult()
	{
		System.out.println("His/Her result is "+total);
	}
}
public class p060_inherit_constructor_1 
{
	public static void main(String[] args) 
	{
		result r1=new result();
		
		r1.printinfo();
		r1.printmarks();
		r1.printresult();
	
		
	}

}
