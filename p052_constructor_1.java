package jDemo2;

class emp
{
	int eno;
	String ename;
	int salary;

	public emp()
	{
		eno=5;
		ename="ram";
		salary=12000;
	}
	
	public emp(int x,String y,int z)
	{
		eno=x;
		ename=y;
		salary=z;
	}
	
	public void printdata()
	{
		System.out.println("Eno = " + eno + " Ename = " + ename + " Salary = " + salary);
	}
}


public class p052_constructor_1 
{

	public static void main(String[] args)
	{
   
		emp e1=new emp();
		emp e2=new emp();
		emp e3=new emp(22,"mahi",22000);
		emp e4=new emp();
		emp e5=new emp(33,"neha",32000);
		
		e1.printdata();
		e2.printdata();
		e3.printdata();
		e4.printdata();
		e5.printdata();
		
	}
}
