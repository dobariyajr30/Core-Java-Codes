package jDemo7;

class employ
{
	String emp_name;
	int emp_salary,emp_id;
	
	public employ(int emp_id,int emp_salary,String emp_name)
	{
		System.out.println("This = " + this);

		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
		this.emp_id=emp_id;
	}
	
	public void printdata()
	{
		System.out.println("this = " + this + " Employ Name is "+ emp_name+". His/Her I'd is "+emp_id+". HIs/Her Salary is"+emp_salary);
	}
		
}

public class p065_this_1 
{
	public static void main(String[] args) 
	{
		employ e1=new employ(1,2300,"meet");
		employ e2=new employ(2,3600,"jeet");
		employ e3=new employ(3,5600,"preet");
		
		e1.printdata();
		e3.printdata();
		e2.printdata();
		
		
	}

}
