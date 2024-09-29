package jDemo2;

class book
{
	int book_id,book_price;
	String book_name;
	
	public book()
	{
		book_id=00000;
		book_price=00000;
		book_name="XXXXXXX";
		
	}
	public  book(int id,int price,String name)
	{
		book_id=id;
		book_price=price;
		book_name=name;
	}
	
	void print()
	{
		System.out.println("Book Name=>"+book_name+"\nBook Id=>"+book_id+"\nBook Price+=>"+book_price);
	}
}

public class p054_constructor_3 
{
	public static void main(String[] args)
	{
		book b1=new book();
		book b2=new book(3242,4500,"Percy");
		
		b1.print();
		System.out.println();
		b2.print();
	}

}
