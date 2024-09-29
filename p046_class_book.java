package jdemos;

import java.util.Scanner;

class book
{
	int id;
	String name;
	int price;
	
	
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
			
		System.out.print("Enter Book Name-->");
		name=sc.nextLine();
		
		System.out.print("Enter Book Number-->");
		id=sc.nextInt();
		
		System.out.print("Enter Book Price-->");
		price=sc.nextInt();
	}
	void display()
	{
		System.out.println("Book Name is "+name+" and it's number is "+id+" and it's Coast is "+price);
	}
	
}

public class p046_class_book 
{

	public static void main(String[] args) 
	{
		book b1=new book();
        book b2=new book();
        
        b1.setdata();
        System.out.print("\n");
        b2.setdata();
        System.out.print("\n");
        b1.display();
        b2.display();
	}

}
