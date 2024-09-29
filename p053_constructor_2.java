package jDemo2;

class student
{
	int roll,eng,hindi,guj;
	String sname;
	
	public student()
	{
		roll=0000;
		eng=00;
		hindi=00;
		guj=00;
		sname="XXXXXXXXX";
	}
	public student(int no,int e,int h,int g,String name)
	{
		roll=no;
		eng=e;
		guj=g;
		hindi=h;
		sname=name;
	}
	public void print()
	{
		System.out.println("Student name is "+sname+". His/Her Roll Number is "+roll+" He/She Obtain Marks"+guj+" in Gujarati "+hindi+" in Hindi and "+eng+" marks in English");
	}
}

public class p053_constructor_2
{
	public static void main(String[] args) 
	{
		student s1=new student();
		student s2=new student(95,45,56,24,"Khanjan");
		
		s1.print();
		System.out.println();
		
		s2.print();
		
	}

}
