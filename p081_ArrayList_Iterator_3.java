package jDemo8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class emp
{
	int id,salary;
	String name;
	
	public void getdata()
	{	
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter Employ I'd-->");
		id=sc.nextInt();
		
		System.out.println("Enter Employ Name-->");
		sc.nextLine();
		
		name=sc.nextLine();
		
		System.out.println("Enter Employ Salary");
		salary=sc.nextInt();
	}
	public void printdata()
	{
		System.out.println("Employ Name="+name);
		System.out.println("Employ I'd="+id);
		System.out.println("Employ Salary="+salary);
	}
	
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public int getsalary()
	{
		return salary;
	}
	public String setname(String Name) 
	{
        return name=Name;
	}
    public int setsalary(int Salary)
    {
        return salary=Salary;
    }
   
}

public class p081_ArrayList_Iterator_3
{
	public static void main(String[] args) 
	{
		ArrayList<emp> a1=new ArrayList();
		
		int i,opt;
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("1 for Add Empoloy");
			System.out.println("2 for Display Empoloy");
			System.out.println("3 for Remove Empoloy Using I'd");
			System.out.println("4 for Remove Empoloy Using Name");
			System.out.println("5 for Remove Empoloy Using Salary");
			System.out.println("6 for Update Employee Name Using ID");
            System.out.println("7 for Update Employee Salary Using ID");
            System.out.println("8 for Search Employee by ID");
            System.out.println("9 for Search Employee by Name");
            System.out.println("10 for Search Employee by Salary");
			System.out.println("11 for exit manue");
			opt=sc.nextInt();
			
			
				if(opt==1)
				{
						emp e1=new emp();
						e1.getdata();
						a1.add(e1);
				}
				else if(opt==2)
				{
					Iterator<emp> itr = a1.iterator();
					
					while(itr.hasNext()) 
					{
						emp e1=(emp)itr.next();
						e1.printdata();
						System.out.println("\n");
				    }
				}
				else if(opt==3)
				{
					int rem_id;
						
					System.out.println("Enter Which Roll Number you want to remove-->");
					rem_id=sc.nextInt();
					
					Iterator<emp> itr = a1.iterator();
					
					while(itr.hasNext()) 
					{				
						emp e1=(emp)itr.next();
						if(e1.getid()==rem_id)
						{
							a1.remove(e1);
							break;
						}
					}
				}
				else if(opt==4)
				{
					String rem_name;
					int c=0;
					
					System.out.println("Enter Name Want to remove-->");
					sc.nextLine();
					rem_name=sc.nextLine();
					
					for(emp e1:a1)
					{
						if(e1.getname().equals(rem_name))
						{
						 a1.remove(e1);
						 c++;
						 break;
						}
					}
					
					if(c==0)
					{
						System.out.println("No Such Employe \n");
					}
				}
				else if(opt==5)
				{
					int rem_salary;
					
					System.out.println("Enter Salary. Want to remove-->");
					rem_salary=sc.nextInt();
					
					Iterator<emp> itr=a1.iterator();
					
					while(itr.hasNext())
					{
						emp e1=(emp)itr.next();
						if(e1.getsalary()==rem_salary)
						{
							a1.remove(e1);
							break;
						}
					}
				}
				else if(opt==6)
				{
					int sear_id;
					String new_name;
					
					System.out.println("Enter I'd Where want to change name-->");
					sear_id=sc.nextInt();
					
					System.out.println("Enter New Name here-->");
					sc.nextLine();
					new_name=sc.nextLine();
					
					 for(emp e1:a1) 
					 {
		                    if (e1.getid() == sear_id) 
		                    {
		                        e1.setname(new_name);
		                        break;
		                    }
		             }
				}
				else if(opt==7)
				{
					int ser_id,new_salary;
					
					System.out.println("Enter I'd of employ where you want to update salary-->");
					ser_id=sc.nextInt();
					
					System.out.println("Set New Salary here-->");
					new_salary=sc.nextInt();
					
					for(emp e1:a1)
					{
						if(e1.getid()==ser_id)
						{
							e1.setsalary(new_salary);
							break;
						}
					}

				}
				else if(opt==8)
				{
					int sear_id;
					
					System.out.println("Enter Enter Employ I'd--->");
					sear_id=sc.nextInt();
					
					for(emp e1:a1)
					{
		              if (e1.getid()==sear_id) 
		              {
		                e1.printdata();
		                break;
		              }
		            }
				}
				else if(opt==9)
				{
					String sear_name;
					int c=0;
					
					System.out.println("Enter Employ Name-->");
					sc.nextLine();
					sear_name=sc.nextLine();
					
					for(emp e1:a1)
					{
						if(e1.getname().equals(sear_name))
						{
							e1.printdata();
							c++;
							break;
						}
					}
					if(c==0)
					{
						System.out.println("No Such Employe \n");
					}
				}
				else if(opt==10)
				{
					int sear_salary;
					
					System.out.println("Enter Salry-->");
					sear_salary=sc.nextInt();
					
					for(emp e1:a1)
					{
						if(e1.getsalary()==sear_salary)
						{
							e1.printdata();
							
						}
					}
				}
				else if(opt==11)
				{
					break;
				}
				else
				{
					System.out.println("Wrong Option");
					
				}	
		}
	}
}
