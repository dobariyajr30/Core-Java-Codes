package jDemo8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class std
{
	int roll,maths;
	String name;

	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Roll Number-->");
		roll=sc.nextInt();
		
		System.out.println("Enter Student Name-->");
		sc.nextLine();
		name=sc.nextLine();
		
		System.out.println("Enter Maths Marks-->");
		maths=sc.nextInt();
	}
	public void printdata()
	{
		System.out.println("Student Name is "+roll+".His/Her Name is "+name+". His/Her Maths marks is "+maths);
	}
}

public class p080_ArrayList_Iterator_2
{
	public static void main(String[] args)
	{
        ArrayList<std> a1=new ArrayList();
		int i,n=5;
        
		for(i=0;i<n;i++)
		{
			std s1=new std();
			s1.getdata();
			a1.add(s1);
		}
		
		Iterator<std> itr = a1.iterator();
		
		while(itr.hasNext()) 
		{
			std s1=(std)itr.next();
			s1.printdata();
	    }
	}

}
