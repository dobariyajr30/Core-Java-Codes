package jDemo7;

class stu
{
	static
	{
		System.out.println("In Static s+1");
	}
	int sno;
	String sname;
		
	static
	{
		System.out.println("In Static s+2");
	}
	
	stu()
	{
		sno=5;
		sname="Jeet";
		System.out.println("In Constructor");
	}
	static
	{
		System.out.println("In Static s+3");
	}
	
	void print()
	{
		System.out.println("Student Name is "+sname+" Student roll number is "+sno);
	}
	
	static
	{
		System.out.println("In Static s+4");
	}	
}
public class p064_static_3
{
	public static void main(String[] args) 
	{
		stu s1=new stu();
		stu s2=new stu();
		stu s3=new stu();
		
		s1.print();	
		s2.print();	
		s3.print();	
		
	}

}
